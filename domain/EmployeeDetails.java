package com.mindgate.main.domain;

import org.springframework.stereotype.Component;

@Component("employeeDetails")
public class EmployeeDetails {
private int employeeId;
private String firstName;
private String lastName;
private String loginId;
private String password;
private String role;
private String email;
private long contactNo;
private int managerId;
//private int SLAB_ID;
private Slab slab;

public EmployeeDetails() {
	// TODO Auto-generated constructor stub
}

public EmployeeDetails(int employeeId, String firstName, String lastName, String loginId, String password, String role,
		String email, long contactNo, int managerId, Slab slab) {
	super();
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.loginId = loginId;
	this.password = password;
	this.role = role;
	this.email = email;
	this.contactNo = contactNo;
	this.managerId = managerId;
	this.slab = slab;
}

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getLoginId() {
	return loginId;
}

public void setLoginId(String loginId) {
	this.loginId = loginId;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getContactNo() {
	return contactNo;
}

public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}

public int getManagerId() {
	return managerId;
}

public void setManagerId(int managerId) {
	this.managerId = managerId;
}

public Slab getSlab() {
	return slab;
}

public void setSlab(Slab slab) {
	this.slab = slab;
}

@Override
public String toString() {
	return "EmployeeDetails [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", loginId=" + loginId + ", password=" + password + ", role=" + role + ", email=" + email + ", contactNo="
			+ contactNo + ", managerId=" + managerId + ", slab=" + slab + "]";
}

}
