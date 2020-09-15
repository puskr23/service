package com.practice.service.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.service.dao.UserRepository;
import com.practice.service.entity.User;

@Service
public class UmeService {
	List<User> user = new ArrayList<User>();

	@Autowired
	private UserRepository repository;

	Map<Integer, String> map = new HashMap<Integer, String>();
	Map<String, Integer> map2 = new HashMap<String, Integer>();
	int totalSend = 0;

	public UmeService() {
		map.put(1, "5815044032551KDS");
		map.put(2, "8991132354851KDS");
		map.put(3, "2762212814451KDS");
		map.put(4, "0654095798651KDS");
		map.put(5, "7891132354851KDS");
		map2.put("5815044032551KDS", 50);
		map2.put("8991132354851KDS", 20);
		map2.put("2762212814451KDS", 10);
		map2.put("0654095798651KDS", 19);
		map2.put("7891132354851KDS", 28);

	}

	/*
	 * public User saveUser(User user) { // use for saving single user return
	 * repository.save(user); }
	 * 
	 * public List<User> saveUsers(List<User> users){ // to save multiple users
	 * return repository.saveAll(users); }
	 */

	public List<User> getUsers() {
		// to fetch the data from database
		return repository.findAll();
	}

	public List<User> findAllByOrder() {

		user = repository.findAll();
		System.out.println(map);
		System.out.println(map2);
		user = repository.findAllByOrder();
		for (Map.Entry m : map.entrySet()) {// Traversing service map

			for (Map.Entry m2 : map2.entrySet()) {// Traversing Limit map

				if (((String) m.getValue()).equalsIgnoreCase((String) m2.getKey())) {// Comparing the service map index	with limit map
					System.out.println("---------------------------CLUB -----"+m.getValue()+"------------------------------------------------------------");	
					for (User u : user) {
						if (((String) m.getValue()).equalsIgnoreCase(u.getaClubUnique())) {

							if (totalSend < (Integer) m2.getValue()) {

								long check = Long.parseLong(u.getaParsedMobile());

								if (check % 2 == 0) {
									System.out.println("Club=" + u.getaClubUnique());
									System.out.println("Number=" + u.getaUnique());

									totalSend++;
									System.out.println("Total Send=" + totalSend);

									// send what ever you like

								}
								

							}

						}

					}

				}

			} // second for loop ends here
			totalSend = 0;
			//System.out.println("new Club is printing ");
		} // first for loop ends here

		return user;
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
