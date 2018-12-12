package com.clonetab.rest.vo;

import java.util.Date;

public class GlobalParametersVo {
	
	private boolean ldapUser;
	private String host;
	private Integer port;
	private String dnOfTheLdapUser;
	private String password;
	private String confirmPassword;
	private String userBaseDn;
	private String userNameAttribute;
	private String groupBaseDN;
	private String dbaMailingList;
	private String clonetabTop;
	private boolean disasterRecoverSiteSetup;
	private String drSiteClonetabHostName;
	private Integer prvRetentionDays;
	private Integer oldRetentionDays;
	private String lastUpdateBy;
	private Date lastUpdatedDate;
	private Integer parameterID;
	private String clientServerTop;
	private String clonetabUnixUser;
	private String clonetabUnixUserPassword;
	private String ssAdminRole;
	private String servicesAdmin;
	private String ssUserRole;
	private String unixAdmin;
	private String passwordManager;
	private String ctAdmin;
	private String viewManager;
	private String refreshAdmin;
	private String complianceManager;
	private String viewComplianceManager;
	private String smtpUser;
	private String smtpHostName;
	private String createdBy;
	private String modifiedBy;
	private Date dateCreated;
	private Date modifiedOn;
	private String archiveBackupFrequency;
	private String drHostName;
	private String role;
	
	public boolean isLdapUser() {
		return ldapUser;
	}
	public void setLdapUser(boolean ldapUser) {
		this.ldapUser = ldapUser;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public String getDnOfTheLdapUser() {
		return dnOfTheLdapUser;
	}
	public void setDnOfTheLdapUser(String dnOfTheLdapUser) {
		this.dnOfTheLdapUser = dnOfTheLdapUser;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getUserBaseDn() {
		return userBaseDn;
	}
	public void setUserBaseDn(String userBaseDn) {
		this.userBaseDn = userBaseDn;
	}
	public String getUserNameAttribute() {
		return userNameAttribute;
	}
	public void setUserNameAttribute(String userNameAttribute) {
		this.userNameAttribute = userNameAttribute;
	}
	public String getGroupBaseDN() {
		return groupBaseDN;
	}
	public void setGroupBaseDN(String groupBaseDN) {
		this.groupBaseDN = groupBaseDN;
	}
	public String getDbaMailingList() {
		return dbaMailingList;
	}
	public void setDbaMailingList(String dbaMailingList) {
		this.dbaMailingList = dbaMailingList;
	}
	public String getClonetabTop() {
		return clonetabTop;
	}
	public void setClonetabTop(String clonetabTop) {
		this.clonetabTop = clonetabTop;
	}
	public boolean isDisasterRecoverSiteSetup() {
		return disasterRecoverSiteSetup;
	}
	public void setDisasterRecoverSiteSetup(boolean disasterRecoverSiteSetup) {
		this.disasterRecoverSiteSetup = disasterRecoverSiteSetup;
	}
	public String getDrSiteClonetabHostName() {
		return drSiteClonetabHostName;
	}
	public void setDrSiteClonetabHostName(String drSiteClonetabHostName) {
		this.drSiteClonetabHostName = drSiteClonetabHostName;
	}
	public Integer getPrvRetentionDays() {
		return prvRetentionDays;
	}
	public void setPrvRetentionDays(Integer prvRetentionDays) {
		this.prvRetentionDays = prvRetentionDays;
	}
	public Integer getOldRetentionDays() {
		return oldRetentionDays;
	}
	public void setOldRetentionDays(Integer oldRetentionDays) {
		this.oldRetentionDays = oldRetentionDays;
	}
	public String getLastUpdateBy() {
		return lastUpdateBy;
	}
	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public Integer getParameterID() {
		return parameterID;
	}
	public void setParameterID(Integer parameterID) {
		this.parameterID = parameterID;
	}
	public String getClientServerTop() {
		return clientServerTop;
	}
	public void setClientServerTop(String clientServerTop) {
		this.clientServerTop = clientServerTop;
	}
	public String getClonetabUnixUser() {
		return clonetabUnixUser;
	}
	public void setClonetabUnixUser(String clonetabUnixUser) {
		this.clonetabUnixUser = clonetabUnixUser;
	}
	public String getClonetabUnixUserPassword() {
		return clonetabUnixUserPassword;
	}
	public void setClonetabUnixUserPassword(String clonetabUnixUserPassword) {
		this.clonetabUnixUserPassword = clonetabUnixUserPassword;
	}
	public String getSsAdminRole() {
		return ssAdminRole;
	}
	public void setSsAdminRole(String ssAdminRole) {
		this.ssAdminRole = ssAdminRole;
	}
	public String getServicesAdmin() {
		return servicesAdmin;
	}
	public void setServicesAdmin(String servicesAdmin) {
		this.servicesAdmin = servicesAdmin;
	}
	public String getSsUserRole() {
		return ssUserRole;
	}
	public void setSsUserRole(String ssUserRole) {
		this.ssUserRole = ssUserRole;
	}
	public String getUnixAdmin() {
		return unixAdmin;
	}
	public void setUnixAdmin(String unixAdmin) {
		this.unixAdmin = unixAdmin;
	}
	public String getPasswordManager() {
		return passwordManager;
	}
	public void setPasswordManager(String passwordManager) {
		this.passwordManager = passwordManager;
	}
	public String getCtAdmin() {
		return ctAdmin;
	}
	public void setCtAdmin(String ctAdmin) {
		this.ctAdmin = ctAdmin;
	}
	public String getViewManager() {
		return viewManager;
	}
	public void setViewManager(String viewManager) {
		this.viewManager = viewManager;
	}
	public String getRefreshAdmin() {
		return refreshAdmin;
	}
	public void setRefreshAdmin(String refreshAdmin) {
		this.refreshAdmin = refreshAdmin;
	}
	public String getComplianceManager() {
		return complianceManager;
	}
	public void setComplianceManager(String complianceManager) {
		this.complianceManager = complianceManager;
	}
	public String getViewComplianceManager() {
		return viewComplianceManager;
	}
	public void setViewComplianceManager(String viewComplianceManager) {
		this.viewComplianceManager = viewComplianceManager;
	}
	public String getSmtpUser() {
		return smtpUser;
	}
	public void setSmtpUser(String smtpUser) {
		this.smtpUser = smtpUser;
	}
	public String getSmtpHostName() {
		return smtpHostName;
	}
	public void setSmtpHostName(String smtpHostName) {
		this.smtpHostName = smtpHostName;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public String getArchiveBackupFrequency() {
		return archiveBackupFrequency;
	}
	public void setArchiveBackupFrequency(String archiveBackupFrequency) {
		this.archiveBackupFrequency = archiveBackupFrequency;
	}
	public String getDrHostName() {
		return drHostName;
	}
	public void setDrHostName(String drHostName) {
		this.drHostName = drHostName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
