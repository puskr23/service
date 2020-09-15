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
	int totalSend;

	public UmeService() {
		map.put(1, "5815044032551KDS");
		map.put(2, "8991132354851KDS");
		map.put(3, "2762212814451KDS");
		map.put(4, "0654095798651KDS");
		map.put(5, "7891132354851KDS");
		map2.put("5815044032551KDS", 5);
		map2.put("8991132354851KDS", 2);
		map2.put("2762212814451KDS", 1);
		map2.put("0654095798651KDS", 1);
		map2.put("7891132354851KDS", 2);

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

	public List<User> getUserByaClubUnique(String aClubUnique) {
		int n;

		System.out.println(map);
		System.out.println(map2);

		for (Map.Entry m : map.entrySet()) {// Traversing service map

			for (Map.Entry m2 : map2.entrySet()) {// Traversing Limit map

				if (((String) m.getValue()).equalsIgnoreCase((String) m2.getKey())) {// Comparing the service map index
																						// with limit map
					aClubUnique = (String) m.getValue();// getting club code
					user = repository.findAllByaClubUnique(aClubUnique);
					
					if ((int) m2.getValue() <= user.size()) {
						n = (int) m2.getValue();

					} else {
						n = user.size();

					}
					Collections.shuffle(user);// Shuffling the user for random select
					while (totalSend < n) {

						Random rand = new Random();
						int rnd = rand.nextInt(1000);
						if (rnd % 2 == 0) {
							User u = user.get(totalSend);
							System.out.println("Club=" + aClubUnique);
							System.out.println("Number=" + u.getaUnique());

							totalSend++;
							System.out.println("Total Send=" + totalSend);

							// send what ever you like

						}

					}
					totalSend = 0;

				}

			}

		}

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
