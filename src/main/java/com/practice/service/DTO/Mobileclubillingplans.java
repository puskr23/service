package com.practice.service.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobileclubbillingplans")
public class Mobileclubillingplans {
	@Id
	@Column(name="aunique")
	private String aunique;
	@Column(name = "aclubunique")
    private String aclubunique;
	public String getAunique() {
		return aunique;
	}
	public void setAunique(String aunique) {
		this.aunique = aunique;
	}
	public String getAclubunique() {
		return aclubunique;
	}
	public void setAclubunique(String aclubunique) {
		this.aclubunique = aclubunique;
	}
	
	
	
}
	
	



