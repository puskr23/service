package com.practice.service.service;

import com.practice.service.dao.UserRepository;
import com.practice.service.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SerceWithThread {


    List<User> user = new ArrayList<User>();
    int totalSend = 0;
    @Autowired
    private UserRepository repository;

    public SerceWithThread() {


    }

    public void dotask() {
        findAllByOrder();
    }

    public void findAllByOrder() {


        user = repository.findAll();

        user = repository.findAllByOrder();
        String resp = doProcess();
        System.out.println(resp);
    }

    String doProcess() {
        String res = null;
        int messagetosend = 3;
        List<String> proc = new ArrayList<>();

        for (User u : user) {
            int sent = 0;

            if (totalSend < 10) {

                if (sent < messagetosend) {
                    System.out.println("Club=" + u.getaClubUnique());
                    System.out.println("Number=" + u.getaUnique());
                    if (check(u)) {
                        totalSend++;
                        try {
                            System.out.println("Delay 9sec");
                            Thread.sleep(9000);
                        } catch (Exception exception) {
                            System.out.println("Total Send=" + totalSend);
                        }
                    }

                }
            }

        }
        if (totalSend == 10) {
            proc.add(" Processed :" + totalSend + " Limit:10");
        }
        res = "" + proc;
        return res;
    }

    public boolean check(User u) {
        long checkid = Long.parseLong(u.getaParsedMobile());

        return checkid % 2 == 0;
    }

}
