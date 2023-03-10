package com.form.main.entities;


import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginData {
	@NotBlank(message = "User name cannot reamin blank")
	@Size(min = 3, max = 12, message ="The name should contain atleast 3-12 characters")
	private String userName;
	
	@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email Id field cannot remain blank")
	private String userEmail;
	
	@AssertTrue(message = "Accept the terms and conditions.")
	private boolean agreed;
	
	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginData(String userName, String userEmail) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", userEmail=" + userEmail + ", agreed=" + agreed + "]";
	}
	
}
