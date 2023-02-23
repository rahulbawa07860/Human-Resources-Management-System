package com.masai.dao;


import java.util.List;

import com.masai.models.Department;
import com.masai.models.Employee;
import com.masai.models.EmployeeLeave;

public interface daoInterface {
	public boolean validateAdmin(String adminName, String password);
	public boolean validateEmployee(String empName, String password);
	public String addnewdepartment(String dname);
	public String registerEmp(String empName, String password, int deptId);
	public List<Department> viewDepartment();
	public String transferDept(int empId, int deptId);
	public List<EmployeeLeave> viewEmployeeLeaves();
	public String updateDepartment(int deptId, String deptName);
	public String leavePermission(int empId, String status);
	public List<Employee> getAllEmployeeDetails();
	public Employee viewEmployee(String empName, String password);
	public String updateEmployeePass(String empName, String password, String newPassword);
	public String updateEmployeeName(String empName, String password, String newName);
	public String leaveApply(String password, int leaveDay);
	public EmployeeLeave getLeaveStatusById(String password);
	


	





	
	
}
