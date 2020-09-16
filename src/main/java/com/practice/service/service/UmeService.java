package com.practice.service.service;

import com.practice.service.dao.UserRepository;
import com.practice.service.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UmeService {
    @Value("${run.dk.movihub:5}")
    int mobihub;
    @Value("${run.dk.getvid:3}")
    int getvid;
    @Value("${run.dk.dodwnloadhub:3}")
    int downloadhub;
    @Value("${run.dk.planet:2}")
    int planet;
    @Value("${run.dk.zone:4}")
    int zone;

    List<User> user = new ArrayList<User>();
    Map<Integer, String> map = new HashMap<Integer, String>();
    Map<String, Integer> map2 = new HashMap<String, Integer>();
    int totalSend = 0;
    @Autowired
    private UserRepository repository;

    public UmeService() {


    }

    /*
     * public User saveUser(User user) { // use for saving single user return
     * repository.save(user); }
     *
     * public List<User> saveUsers(List<User> users){ // to save multiple users
     * return repository.saveAll(users); }
     */


    public void dotask() {
        findAllByOrder();
    }

    public void findAllByOrder() {
        map.put(1, "5815044032551KDS");
        map.put(2, "8991132354851KDS");
        map.put(3, "2762212814451KDS");
        map.put(4, "0654095798651KDS");
        map.put(5, "7891132354851KDS");
        map2.put("5815044032551KDS", mobihub);
        map2.put("8991132354851KDS", getvid);
        map2.put("2762212814451KDS", downloadhub);
        map2.put("0654095798651KDS", planet);
        map2.put("7891132354851KDS", zone);

        user = repository.findAll();
        System.out.println(map);
        System.out.println(map2);
        user = repository.findAllByOrder();
        // first for loop ends here
        String resp = doProcess();
        System.out.println(resp);
    }

    String doProcess() {
        String res = null;
        List<String> proc = new ArrayList<>();
        for (Map.Entry m : map.entrySet()) {  // Traversing service map

            for (Map.Entry m2 : map2.entrySet()) {// Traversing Limit map

                if (((String) m.getValue()).equalsIgnoreCase((String) m2.getKey())) {// Comparing the service map index	with limit map
                    System.out.println("---------------------------CLUB -----" + m.getValue() + "------------------------------------------------------------");
                    for (User u : user) {
                        if (((String) m.getValue()).equalsIgnoreCase(u.getaClubUnique())) {

                            if (totalSend < (Integer) m2.getValue()) {


                                System.out.println("Club=" + u.getaClubUnique());
                                System.out.println("Number=" + u.getaUnique());
                                if (check(u)) {
                                    totalSend++;
                                }

                                System.out.println("Total Send=" + totalSend);

                                if (totalSend == (Integer) m2.getValue()) {
                                    proc.add("Club:" + m.getValue() + " Processed :" + totalSend + " Limit:" + (Integer) m2.getValue());
                                }

                            }


                        }

                    }

                }

            } // second for loop ends here
            totalSend = 0;
            //System.out.println("new Club is printing ");
        }
        res = "" + proc;
        return res;
    }

    public boolean check(User u) {
        long checkid = Long.parseLong(u.getaParsedMobile());

        return checkid % 2 == 0;
    }
    /*
     * public void check() { for (Map.Entry m : map.entrySet()) { for (Map.Entry m2
     * : map2.entrySet()) { if (m.getKey().equals(m2.getKey())) {
     *
     *
     * Collections.shuffle(user);
     *
     *
     * int n = (int) m2.getValue(); for (int i = 0; i >= n; i++) { Random rand = new
     * Random(); int rnd = rand.nextInt(1000); if (rnd % 2 == 0) { totalSend++;
     *
     * //send what ever you like
     *
     * }
     *
     * } }
     *
     * }
     *
     * }
     */

}
