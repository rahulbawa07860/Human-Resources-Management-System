package com.masai.dao;

import java.security.PublicKey;
import java.util.List;

import com.masai.models.Department;
import com.masai.models.Employee;
import com.masai.models.EmployeeLeave;

public interface daoInterface {
	public String addnewdepartment(String dname);
	public String registerEmp(String empName, String password, int deptId);
	public List<Department> viewDepartment();
	public String transferDept(int empId, int deptId);
	public List<EmployeeLeave> viewEmployeeLeaves();
	public String updateDepartment(int deptId, String deptName);
	public String leavePermission(int empId, String status);
	public List<Employee> getAllEmployeeDetails();
//	public String updateEmployeeName(String empName, String password, String newName);
//	public String updateEmployeePass(String empName, String password, String newPassword);
//	public Employee viewEmployee(String empName, String password);



//	public String leaveApply(String password);
//	

//	public EmployeeLeave getLeaveStatusById(String password);
//	public int validateAdmin(String adminName);

//	public int validateEmployee(String empName);
	
	
}
