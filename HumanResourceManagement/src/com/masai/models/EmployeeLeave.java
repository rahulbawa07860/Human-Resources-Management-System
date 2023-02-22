package com.masai.models;

public class EmployeeLeave {
private int empId;
private String empName;
private String leaveDay;
private String status;
public EmployeeLeave() {

	// TODO Auto-generated constructor stub
}
public EmployeeLeave(int empId, String empName, String leaveDay, String status) {
	
	this.empId = empId;
	this.empName = empName;
	this.leaveDay = leaveDay;
	this.status = status;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getLeaveDay() {
	return leaveDay;
}
public void setLeaveDay(String leaveDay) {
	this.leaveDay = leaveDay;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "EmployeeLeave [empId=" + empId + ", empName=" + empName + ", leaveDay=" + leaveDay + ", status=" + status
			+ "]";
}

}
