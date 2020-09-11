package com.practice.service.entity;

import java.sql.Date;

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
	@Column(name="asubunique")
	private String aSubUnique;
	@Column(name="aexternalid")
	private String aExternalId;
	@Column(name="aparsedmobile")
	private String aParsedMobile;
	@Column(name="aclubunique")
	private String aClubUnique;
	@Column(name="aactiveforbilling")
	private int aActiveForBilling;
	@Column(name="aactiveforadvancement")
	private int aActiveForAdvancement;
	@Column(name="atariffclass")
	private Double aTariffClass;
	@Column(name="asubscribed")
	private Date aSubscribed;  
	@Column(name="alastpaid")
	private Date aLastPaid;
	@Column(name="abillingend")
	private Date aBillingEnd;
	@Column(name="apartivalsrequired")
	private Double aPartialsRequired;
	@Column(name="apartialspaid")
	private Double aPartialsPaid;
	@Column(name="aservicedate")
	private Date aServiceDate;
	@Column(name="aservicedatebillsremaining")
	private Double aServiceDateBillsRemaining;
	@Column(name="aadhocsremaining")
	private int aAdhocsRemaining;
	@Column(name="alastpush")
	private Date aLastPush;
	@Column(name="apushcount")
	private  int aPushCount;
	@Column(name="alastsuccess")
	private Date aLastSuccess;
	@Column(name="anextpush")
	private Date aNextPush;
	@Column(name="adynamicbillingends")
	private Date aDynamicBillingEnds;
	@Column(name="anetworkcode")
	private String aNetworkCode;
	@Column(name="acontracttype")
	private String aContractType;
	@Column(name="abillingstate")
	private String aBillingState;
	@Column(name="aprevioussuccess")
	private Date aPreviousSuccess;
	@Column(name="apreviouspush")
	private Date aPreviousPush;
	@Column(name="acampaign")
	private String aCampaign;
	@Column(name="aparam1")
	private String aParam1;
	@Column(name="aparam2")
	private String aParam2;
	@Column(name="apubid")
	private String aPubId;
	@Column(name="aregioncode")
	private String aRegionCode;
	@Column(name="arejectedcount")
	private int aRejectedCount;
	
	public User() {
		
	}
	public String getaUnique() {
		return aUnique;
	}
	public void setaUnique(String aUnique) {
		this.aUnique = aUnique;
	}
	public String getaSubUnique() {
		return aSubUnique;
	}
	public void setaSubUnique(String aSubUnique) {
		this.aSubUnique = aSubUnique;
	}
	public String getaExternalId() {
		return aExternalId;
	}
	public void setaExternalId(String aExternalId) {
		this.aExternalId = aExternalId;
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
	public int getaActiveForBilling() {
		return aActiveForBilling;
	}
	public void setaActiveForBilling(int aActiveForBilling) {
		this.aActiveForBilling = aActiveForBilling;
	}
	public int getaActiveForAdvancement() {
		return aActiveForAdvancement;
	}
	public void setaActiveForAdvancement(int aActiveForAdvancement) {
		this.aActiveForAdvancement = aActiveForAdvancement;
	}
	public Double getaTariffClass() {
		return aTariffClass;
	}
	public void setaTariffClass(Double aTariffClass) {
		this.aTariffClass = aTariffClass;
	}
	public Date getaSubscribed() {
		return aSubscribed;
	}
	public void setaSubscribed(Date aSubscribed) {
		this.aSubscribed = aSubscribed;
	}
	public Date getaLastPaid() {
		return aLastPaid;
	}
	public void setaLastPaid(Date aLastPaid) {
		this.aLastPaid = aLastPaid;
	}
	public Date getaBillingEnd() {
		return aBillingEnd;
	}
	public void setaBillingEnd(Date aBillingEnd) {
		this.aBillingEnd = aBillingEnd;
	}
	public Double getaPartialsRequired() {
		return aPartialsRequired;
	}
	public void setaPartialsRequired(Double aPartialsRequired) {
		this.aPartialsRequired = aPartialsRequired;
	}
	public Double getaPartialsPaid() {
		return aPartialsPaid;
	}
	public void setaPartialsPaid(Double aPartialsPaid) {
		this.aPartialsPaid = aPartialsPaid;
	}
	public Date getaServiceDate() {
		return aServiceDate;
	}
	public void setaServiceDate(Date aServiceDate) {
		this.aServiceDate = aServiceDate;
	}
	public Double getaServiceDateBillsRemaining() {
		return aServiceDateBillsRemaining;
	}
	public void setaServiceDateBillsRemaining(Double aServiceDateBillsRemaining) {
		this.aServiceDateBillsRemaining = aServiceDateBillsRemaining;
	}
	public int getaAdhocsRemaining() {
		return aAdhocsRemaining;
	}
	public void setaAdhocsRemaining(int aAdhocsRemaining) {
		this.aAdhocsRemaining = aAdhocsRemaining;
	}
	public Date getaLastPush() {
		return aLastPush;
	}
	public void setaLastPush(Date aLastPush) {
		this.aLastPush = aLastPush;
	}
	public int getaPushCount() {
		return aPushCount;
	}
	public void setaPushCount(int aPushCount) {
		this.aPushCount = aPushCount;
	}
	public Date getaLastSuccess() {
		return aLastSuccess;
	}
	public void setaLastSuccess(Date aLastSuccess) {
		this.aLastSuccess = aLastSuccess;
	}
	public Date getaNextPush() {
		return aNextPush;
	}
	public void setaNextPush(Date aNextPush) {
		this.aNextPush = aNextPush;
	}
	public Date getaDynamicBillingEnds() {
		return aDynamicBillingEnds;
	}
	public void setaDynamicBillingEnds(Date aDynamicBillingEnds) {
		this.aDynamicBillingEnds = aDynamicBillingEnds;
	}
	public String getaNetworkCode() {
		return aNetworkCode;
	}
	public void setaNetworkCode(String aNetworkCode) {
		this.aNetworkCode = aNetworkCode;
	}
	public String getaContractType() {
		return aContractType;
	}
	public void setaContractType(String aContractType) {
		this.aContractType = aContractType;
	}
	public String getaBillingState() {
		return aBillingState;
	}
	public void setaBillingState(String aBillingState) {
		this.aBillingState = aBillingState;
	}
	public Date getaPreviousSuccess() {
		return aPreviousSuccess;
	}
	public void setaPreviousSuccess(Date aPreviousSuccess) {
		this.aPreviousSuccess = aPreviousSuccess;
	}
	public Date getaPreviousPush() {
		return aPreviousPush;
	}
	public void setaPreviousPush(Date aPreviousPush) {
		this.aPreviousPush = aPreviousPush;
	}
	public String getaCampaign() {
		return aCampaign;
	}
	public void setaCampaign(String aCampaign) {
		this.aCampaign = aCampaign;
	}
	public String getaParam1() {
		return aParam1;
	}
	public void setaParam1(String aParam1) {
		this.aParam1 = aParam1;
	}
	public String getaParam2() {
		return aParam2;
	}
	public void setaParam2(String aParam2) {
		this.aParam2 = aParam2;
	}
	public String getaPubId() {
		return aPubId;
	}
	public void setaPubId(String aPubId) {
		this.aPubId = aPubId;
	}
	public String getaRegionCode() {
		return aRegionCode;
	}
	public void setaRegionCode(String aRegionCode) {
		this.aRegionCode = aRegionCode;
	}
	public int getaRejectedCount() {
		return aRejectedCount;
	}
	public void setaRejectedCount(int aRejectedCount) {
		this.aRejectedCount = aRejectedCount;
	}
	@Override
	public String toString() {
		return "User [aUnique=" + aUnique + ", aSubUnique=" + aSubUnique + ", aExternalId=" + aExternalId
				+ ", aParsedMobile=" + aParsedMobile + ", aClubUnique=" + aClubUnique + ", aActiveForBilling="
				+ aActiveForBilling + ", aActiveForAdvancement=" + aActiveForAdvancement + ", aTariffClass="
				+ aTariffClass + ", aSubscribed=" + aSubscribed + ", aLastPaid=" + aLastPaid + ", aBillingEnd="
				+ aBillingEnd + ", aPartialsRequired=" + aPartialsRequired + ", aPartialsPaid=" + aPartialsPaid
				+ ", aServiceDate=" + aServiceDate + ", aServiceDateBillsRemaining=" + aServiceDateBillsRemaining
				+ ", aAdhocsRemaining=" + aAdhocsRemaining + ", aLastPush=" + aLastPush + ", aPushCount=" + aPushCount
				+ ", aLastSuccess=" + aLastSuccess + ", aNextPush=" + aNextPush + ", aDynamicBillingEnds="
				+ aDynamicBillingEnds + ", aNetworkCode=" + aNetworkCode + ", aContractType=" + aContractType
				+ ", aBillingState=" + aBillingState + ", aPreviousSuccess=" + aPreviousSuccess + ", aPreviousPush="
				+ aPreviousPush + ", aCampaign=" + aCampaign + ", aParam1=" + aParam1 + ", aParam2=" + aParam2
				+ ", aPubId=" + aPubId + ", aRegionCode=" + aRegionCode + ", aRejectedCount=" + aRejectedCount + "]";
	}
	public User(String aUnique, String aSubUnique, String aExternalId, String aParsedMobile, String aClubUnique,
			int aActiveForBilling, int aActiveForAdvancement, Double aTariffClass, Date aSubscribed, Date aLastPaid,
			Date aBillingEnd, Double aPartialsRequired, Double aPartialsPaid, Date aServiceDate,
			Double aServiceDateBillsRemaining, int aAdhocsRemaining, Date aLastPush, int aPushCount, Date aLastSuccess,
			Date aNextPush, Date aDynamicBillingEnds, String aNetworkCode, String aContractType, String aBillingState,
			Date aPreviousSuccess, Date aPreviousPush, String aCampaign, String aParam1, String aParam2, String aPubId,
			String aRegionCode, int aRejectedCount) {
		super();
		this.aUnique = aUnique;
		this.aSubUnique = aSubUnique;
		this.aExternalId = aExternalId;
		this.aParsedMobile = aParsedMobile;
		this.aClubUnique = aClubUnique;
		this.aActiveForBilling = aActiveForBilling;
		this.aActiveForAdvancement = aActiveForAdvancement;
		this.aTariffClass = aTariffClass;
		this.aSubscribed = aSubscribed;
		this.aLastPaid = aLastPaid;
		this.aBillingEnd = aBillingEnd;
		this.aPartialsRequired = aPartialsRequired;
		this.aPartialsPaid = aPartialsPaid;
		this.aServiceDate = aServiceDate;
		this.aServiceDateBillsRemaining = aServiceDateBillsRemaining;
		this.aAdhocsRemaining = aAdhocsRemaining;
		this.aLastPush = aLastPush;
		this.aPushCount = aPushCount;
		this.aLastSuccess = aLastSuccess;
		this.aNextPush = aNextPush;
		this.aDynamicBillingEnds = aDynamicBillingEnds;
		this.aNetworkCode = aNetworkCode;
		this.aContractType = aContractType;
		this.aBillingState = aBillingState;
		this.aPreviousSuccess = aPreviousSuccess;
		this.aPreviousPush = aPreviousPush;
		this.aCampaign = aCampaign;
		this.aParam1 = aParam1;
		this.aParam2 = aParam2;
		this.aPubId = aPubId;
		this.aRegionCode = aRegionCode;
		this.aRejectedCount = aRejectedCount;
	}
	
	
	
	
	
	
}
