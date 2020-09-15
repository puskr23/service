package com.practice.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobileclubbillingplans")
public class User {
	@Id
	@Column(name="aunique")
	private String aUnique;

	@Column(name="aclubunique")
	private String aClubUnique;


    public User() {
		
	}


    public String getaUnique() {
		return aUnique;
	}

    public void setaUnique(String aUnique) {
		this.aUnique = aUnique;
	}

    public String getaClubUnique() {
		return aClubUnique;
	}

    public void setaClubUnique(String aClubUnique) {
		this.aClubUnique = aClubUnique;
	}
}
