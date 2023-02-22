package com.masai.models;

public class Admin {
private String adminName;

public Admin() {
	
	// TODO Auto-generated constructor stub
}

public Admin(String adminName) {
	
	this.adminName = adminName;
}

public String getAdminName() {
	return adminName;
}

public void setAdminName(String adminName) {
	this.adminName = adminName;
}

@Override
public String toString() {
	return "Admin [adminName=" + adminName + "]";
}

}
