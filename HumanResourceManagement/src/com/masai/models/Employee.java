package com.masai.models;

public class Employee {
private int empId;
private int deptId;
private String deptName;
private String empName;
private String password;
public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(int empId, int deptId, String deptName, String empName, String password) {
	
	this.empId = empId;
	this.deptId = deptId;
	this.deptName = deptName;
	this.empName = empName;
	this.password = password;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", deptId=" + deptId + ", deptName=" + deptName + ", empName=" + empName
			+ ", password=" + password + "]";
}

}
