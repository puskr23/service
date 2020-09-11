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
List<User> user=new ArrayList<User>();
	@Autowired
	private UserRepository repository;
	
	Map<Integer, String> map = new HashMap<Integer, String>();
	Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
	int totalSend = 0;
	
	public UmeService() {
		
		map.put(1, "5815044032551KDS");
		map.put(2, "8991132354851KDS");
		map.put(3, "2762212814451KDS");
		map.put(4, "0654095798651KDS");
		map.put(5, "7891132354851KDS");
		map2.put(1, 20);
		map2.put(2, 12);
		map2.put(3, 10);
		map2.put(4, 11);
		map2.put(5, 22);
		
		
	}
	

	
	
	/*public User saveUser(User user) {
		// use for saving single user
		return repository.save(user);
	}
	
	public List<User> saveUsers(List<User> users){
		// to save multiple users
		return repository.saveAll(users);
	}*/
	
	public List<User> getUsers(){
		//to fetch the data from database 
		return repository.findAll();
		
	}
	public List<User> getUserByaClubUnique(String aClubUnique){
		

            System.out.println(map); 
            System.out.println(map2);
		
		for (Map.Entry m : map.entrySet()) {// Travesing service map
			for (Map.Entry m2 : map2.entrySet()) {// Travesing Limit map
				if (m.getKey().equals(m2.getKey())) {//compairing the servce map index with limit map 
					aClubUnique=(String) m.getValue();//getting club code
					user=repository.findByaClubUnique(aClubUnique);
					Collections.shuffle(user);//shuffeling the user for random select 
										
					int n = (int) m2.getValue(); //83
					
					
					while (totalSend<n) {
						
						Random rand = new Random();
						int rnd = rand.nextInt(1000);
						if (rnd % 2 == 0) {
							User u=user.get(totalSend);
							System.out.println(u);
							
							
							totalSend++;
							System.out.println("Total Send="+totalSend);
							
							//send what ever you like 

						}

						
					}
					
					
				}

			}

		}
		
		return user;
	}
	

	


	/*public void check() {
		for (Map.Entry m : map.entrySet()) {
			for (Map.Entry m2 : map2.entrySet()) {
				if (m.getKey().equals(m2.getKey())) {
				
					
					Collections.shuffle(user);
					
					
					int n = (int) m2.getValue();
					for (int i = 0; i >= n; i++) {
						Random rand = new Random();
						int rnd = rand.nextInt(1000);
						if (rnd % 2 == 0) {
							totalSend++;

							//send what ever you like 

						}

					}
				}

			}

		}*/

	}


