package com.masai.models;

public class Department {
private int deptId;
private String dname;
public Department() {
	
	// TODO Auto-generated constructor stub
}
public Department(int deptId, String dname) {

	this.deptId = deptId;
	this.dname = dname;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
@Override
public String toString() {
	return "     |-----------------------------|"+'\n'+
			"     | Department Id    = " + deptId   +'\n'+
			"     | Department dname = " + dname ;
}

}
