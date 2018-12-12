package com.clonetab.rest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ct_passwords")
public class PasswordWalletModel {
	
	@Id
	@Column(name="PWD_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ct_passwords_s")
	@SequenceGenerator(name="ct_passwords_s", sequenceName="ct_passwords_s", allocationSize=1)
	private Integer walletId;
	@Column(name="PWD_TYPE")
	private String passwordType;
	@Column(name="TARGET_NAME")
	private String targetName;
	@Column(name="USERID")
	private String userName;
	@Column(name="PASSWORD")
	private String password;
	/*@Column(name="HIDE_PASSWORD")
	private String hidePassword;*/
	@Column(name="PRIVATE")
	private String isPrivate;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	@Column(name="DATE_CREATED")
	private Date CreatedOn;
	@Column(name="MODIFIED_BY")
	private String modifiedBy;
	@Column(name="MODIFIED_ON")
	private Date modifiedOn;
	
	public Integer getWalletId() {
		return walletId;
	}
	public void setWalletId(Integer walletId) {
		this.walletId = walletId;
	}
	public String getPasswordType() {
		return passwordType;
	}
	public void setPasswordType(String passwordType) {
		this.passwordType = passwordType;
	}
	public String getTargetName() {
		return targetName;
	}
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*public String getHidePassword() {
		return hidePassword;
	}
	public void setHidePassword(String hidePassword) {
		this.hidePassword = hidePassword;
	}
	public String getIsPrivate() {
		return isPrivate;
	}*/
	public void setIsPrivate(String isPrivate) {
		this.isPrivate = isPrivate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return CreatedOn;
	}
	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	
}
