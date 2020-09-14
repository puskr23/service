package com.practice.service.utill;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
@Component
public class ClubDetails {
	public Map<String, String> ServicesMap() {
        Map<String, String> tempMap = new HashMap<>();
        tempMap.put("5815044032551KDS", "DownloadHub");
        tempMap.put("8991132354851KDS", "GetVidi");
        tempMap.put("2762212814451KDS", "Mobihub");
        tempMap.put("0654095798651KDS", "Mobiplanet");
        tempMap.put("7891132354851KDS", "Mobizone");
       
        return Collections.unmodifiableMap(tempMap);
    }
	

  public  Map<String, Integer> AttemptsMap() {

        Map<String, Integer> tempMap = new HashMap<>();
        tempMap.put("5815044032551KDS", 80);
        tempMap.put("8991132354851KDS", 120);
        tempMap.put("2762212814451KDS", 80);
        tempMap.put("0654095798651KDS", 120);
        tempMap.put("7891132354851KDS", 120);
        
        return tempMap ;

       

        
    }

   
}
