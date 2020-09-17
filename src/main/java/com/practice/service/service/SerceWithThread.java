package com.practice.service.service;

import com.practice.service.dao.UserRepository;
import com.practice.service.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Component
@EnableAsync
@EnableScheduling
public class SerceWithThread {


    List<User> user = new ArrayList<User>();
    int totalSend = 0;
    String res = null;

    @Autowired
    private UserRepository repository;

    public SerceWithThread() {
    }


    @Scheduled(initialDelay = 2000, fixedDelay = 20000000)
    public void dotask() {
        System.out.println("Start Time :" + new Date());
        findAllByOrder();
        System.out.println("End Time" + new Date());

    }

    public String findAllByOrder() {

        user = repository.findAllByOrder();
        String resp = doProcess();
        return resp;
    }


    String doProcess() {

        int messagetosend = 3;

        int sent = 0;

        System.out.println("Total Size--" + user.size());
        for (User u : user) {
            CompletableFuture.runAsync(() -> {
                // method call or code to be asynch.
                doContinue(u, messagetosend);
            });

            sent++;

        }
        System.out.println("Total sent-" + sent);
        return res;
    }

    @Async
    public int doContinue(User u, int messagetosend) {
        int sent = 0;

        //if (totalSend < 10) {

            for (int i = 1; i <= messagetosend; i++) {


                //if (check(u)) {
                    totalSend++;

                    try {
//
                        System.out.println(new Date() + "----User Delayed" + u + "Delay 60sec For " + i + "-Message");
                        Thread.sleep(60000);
                    } catch (Exception exception) {

                        //  }

                }
                System.out.println("Total Send=" + totalSend);

            }
        // }
//        if (totalSend == 10) {
//            sent = totalSend;
//        }
        return sent;
    }

    public boolean check(User u) {
        long checkid = Long.parseLong(u.getaParsedMobile());

        return checkid % 3 == 0;
    }
}
