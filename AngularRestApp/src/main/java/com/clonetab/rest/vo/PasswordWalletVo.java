package com.clonetab.rest.vo;

public class PasswordWalletVo 
{
	private Integer passwordId;
	private String passwordType;
	private String targetName;
	private String userName;
	private String password;
	private String confirmPassword; 
	private boolean hidePassword;
	private boolean isPrivate;
	
	public Integer getPasswordId() {
		return passwordId;
	}
	public void setPasswordId(Integer passwordId) {
		this.passwordId = passwordId;
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public boolean isHidePassword() {
		return hidePassword;
	}
	public void setHidePassword(boolean hidePassword) {
		this.hidePassword = hidePassword;
	}
	public boolean isPrivate() {
		return isPrivate;
	}
	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
	
}
