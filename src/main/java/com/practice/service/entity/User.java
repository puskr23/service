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

    @Column(name = "aparsedmobile")
    private String aParsedMobile;
	@Column(name="aclubunique")
	private String aClubUnique;

    public String getaUnique() {
        return aUnique;
    }

    public void setaUnique(String aUnique) {
        this.aUnique = aUnique;
    }

    public String getaParsedMobile() {
        return aParsedMobile;
    }

    public void setaParsedMobile(String aParsedMobile) {
        this.aParsedMobile = aParsedMobile;
    }

    public String getaClubUnique() {
        return aClubUnique;
    }

    public void setaClubUnique(String aClubUnique) {
        this.aClubUnique = aClubUnique;
    }


    @Override
    public String toString() {
        return "User{" +
                "aUnique='" + aUnique + '\'' +
                ", aParsedMobile='" + aParsedMobile + '\'' +
                ", aClubUnique='" + aClubUnique + '\'' +
                '}';
    }
}
