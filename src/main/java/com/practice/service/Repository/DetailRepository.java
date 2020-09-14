package com.practice.service.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.practice.service.DTO.Mobileclubillingplans;



//public interface LoginRepository  extends JpaRepository<User, String>{
//
//}
public interface DetailRepository  extends CrudRepository<Mobileclubillingplans, String>{
	@Query(value = "SELECT aUnique  FROM mobileclubbillingplans WHERE      aParsedMobile LIKE '45%' AND   aClubUnique IN ('5815044032551KDS','8991132354851KDS','2762212814451KDS','0654095798651KDS)','7891132354851KDS') AND aActiveForBilling=1",nativeQuery = true )
    List<String> getUsers();
	
	@Query(value = "SELECT aUnique,aclubunique  FROM mobileclubbillingplans WHERE      aParsedMobile LIKE '45%' AND   aClubUnique IN ('5815044032551KDS','8991132354851KDS','2762212814451KDS','0654095798651KDS)','7891132354851KDS') AND aActiveForBilling=1",nativeQuery = true )
    List<Mobileclubillingplans> getMobileAndClubs();

}
