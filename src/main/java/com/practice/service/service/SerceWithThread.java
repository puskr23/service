package com.practice.service.service;

import com.practice.service.dao.UserRepository;
import com.practice.service.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Component
@EnableAsync
@EnableScheduling
public class SerceWithThread {

    private final Logger logger = LogManager.getLogger(SerceWithThread.class.getName());
    Executor executor = Executors.newFixedThreadPool(10);
    List<User> user = new ArrayList<>();
    int totalSend = 0;
    String res = null;

    @Autowired
    private UserRepository repository;

    public SerceWithThread() {
    }


    @Scheduled(initialDelay = 2000, fixedDelay = 600000)
    public void dotask() {
        System.out.println("Start Time :" + new Date());
        logger.info("Start Time :{}", new Date());
        findAllByOrder();

    }

    public String findAllByOrder() {

        user = repository.findAllByOrder();
        String resp = doProcess();
        logger.info("Response :{}", resp);
        return resp;
    }


    String doProcess() {

        int messagetosend = 3;

        int sent = 0;

        System.out.println("Total Size--" + user.size());
        for (User u : user) {

//            if (Long.parseLong(u.getaParsedMobile())%2==0){
//            //    System.out.println("Not processing This User"+u.getaParsedMobile()+" Test 1");
//            //    logger.info("Not processing This User :{}-Test 1 ", u.getaParsedMobile());
//                continue;
//            }
//            if (Long.parseLong(u.getaParsedMobile())%5==0){
//             //   System.out.println("Not processing This User"+u.getaParsedMobile()+" Test 2");
//             //   logger.info("Not processing This User :{}-Test 2 ", u.getaParsedMobile());
//                continue;
//            }


                // method call or code to be asynch.
            if (doContinue(u, messagetosend) == 1) {
                sent++;
                System.out.println("Total sent-" + sent);
                logger.info("Total Sent : {} ", sent);
            }


        }

        return res;
    }

    @Async
    public int doContinue(User u, int messagetosend) {


        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {

            //if (totalSend < 10) {


            for (int i = 1; i <= messagetosend; i++) {


                // if (check(u)) {
                totalSend++;

                try {
//
                    //   System.out.println(new Date() + "----User Delayed" + u + "Delay 60sec For " + i + "-Message");
                    logger.info(" User Delayed :{}- Delay For 60sec {} --message", u.getaParsedMobile(), i);
                    if (i < messagetosend) {
                        TimeUnit.SECONDS.sleep(5);
                    }
                } catch (Exception exception) {

                }
                System.out.println("Total Send=" + totalSend);
                logger.info("Total Send ", totalSend);

                // }else{
                // System.out.println("Not processing This User"+u.getaParsedMobile()+" Test 3");
                // logger.info("Not processing This User :{}-Test 3 ", u.getaParsedMobile());
                //  }
            }
            return 1;
        }, executor).exceptionally(ex -> {
            System.out.println("Oops! We have an exception - " + ex.getMessage());
            return 0;
        });
//        if (totalSend == 10) {
//            sent = totalSend;
//        }
        return future.getNumberOfDependents();
    }

    public boolean check(User u) {
        long checkid = Long.parseLong(u.getaParsedMobile());

        return checkid % 3 == 0;
    }
}
