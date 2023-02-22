package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.models.Department;
import com.masai.models.Employee;
import com.masai.models.EmployeeLeave;
import com.masai.utility.DBUtil;
import com.mysql.cj.xdevapi.PreparableStatement;

public class doaInterfaceImpl implements daoInterface{


	
	@Override
	public String registerEmp(String empName, String password, int deptId) {
		// TODO Auto-generated method stub
		String msgString = "Employee not added yet";
		try(Connection connection = DBUtil.provideConnection()) {

				PreparedStatement statement1 = connection.prepareStatement("insert into Employee(empName, password, deptId) values (?,?,?)");
			    statement1.setString(1, empName);
			    statement1.setString(2, password);
			    statement1.setInt(3, deptId);
			    int x = statement1.executeUpdate();
			    if(x>0)
			    {
			    	msgString = "Employee added successfully";
			    }
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			msgString = e.getMessage();
		}
		return msgString;
	}

	@Override
	public String addnewdepartment(String dname) {
		// TODO Auto-generated method stub
		String mString = "Deaprtment Not added Yet";
		try(Connection connection = DBUtil.provideConnection()) {
			PreparedStatement statement1 = connection.prepareStatement("insert into department(DEPTNAME) values (?)");
		   
		    statement1.setString(1, dname);
		    int x = statement1.executeUpdate();
		    if(x>0)
		    {
		    	mString = "department added successfully";
		    }
		} catch (SQLException e) {
			// TODO: handle exception
			mString = e.getMessage();
		}
		return mString;
	}

	@Override
	public List<Department> viewDepartment() {
		// TODO Auto-generated method stub
		List<Department> departments = new ArrayList<>();
		try(Connection connection = DBUtil.provideConnection()) {
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM DEPARTMENT");
			ResultSet rSet = statement.executeQuery();
			while(rSet.next())
				
			{
				int deptId = rSet.getInt("deptId");
				String deptName = rSet.getString("deptName");
				Department department = new Department(deptId, deptName);
				departments.add(department);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return departments;
	}

	@Override
	public String transferDept(int empId, int deptId) {
		// TODO Auto-generated method stub
		String msgString = "Employee transfer unsuccessful";
		try(Connection connection = DBUtil.provideConnection()) {

			PreparedStatement statement1 = connection.prepareStatement("update employee set deptId = ? where empId = ?");
		    statement1.setInt(1, deptId);
		    statement1.setInt(2, empId);
		    int x = statement1.executeUpdate();
		    if(x>0)
		    {
		    	msgString = "Department transferred successfully";
		    }
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return msgString;
	}

	@Override
	public List<EmployeeLeave> viewEmployeeLeaves() {
		// TODO Auto-generated method stub
		List<EmployeeLeave> employeeLeaves = new ArrayList<>();
		try(Connection connection = DBUtil.provideConnection()) {
			PreparedStatement statement = connection.prepareStatement("select e.empId, e.empName, l.leaveDay, l.status from employee e inner join leave_application l on e.empId = l.empId");
			ResultSet rSet = statement.executeQuery();
			while(rSet.next())
				
			{
				int empId = rSet.getInt("empId");
				String empName = rSet.getString("empName");
				String leaveDay = rSet.getString("leaveDay");
				String status = rSet.getString("status");
				
				EmployeeLeave employeeLeave = new EmployeeLeave(empId, empName, leaveDay, status);
				
				employeeLeaves.add(employeeLeave);
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.getMessage();
		}
		return employeeLeaves;
	}

	@Override
	public String leavePermission(int empId, String status) {
		// TODO Auto-generated method stub
		String msgString = "Something went wrong";
		try (Connection connection = DBUtil.provideConnection()){
			PreparedStatement statement1 = connection.prepareStatement("update leave_application set status = ? where empId = ?");
			statement1.setString(1, status);
			statement1.setInt(2, empId);
		    
		    int x = statement1.executeUpdate();
		    if(x>0)
		    {
		    	msgString = "leave status updated";
		    } 
		    else {
				msgString= "no leave application found";
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return msgString;
	}

	@Override
	public String updateDepartment(int deptId, String deptName) {
		// TODO Auto-generated method stub
		String msgString = "Department not updated yet";
		try(Connection connection = DBUtil.provideConnection()){
			PreparedStatement statement1 = connection.prepareStatement("update Department set deptName =? where deptId =?");
			statement1.setString(1, deptName);
			statement1.setInt(2, deptId);
			int x = statement1.executeUpdate();
		    if(x>0)
		    {
		    	msgString = "Department updated successfully";
		    } 
		   
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return msgString;
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<>();
		try(Connection connection = DBUtil.provideConnection()){
			PreparedStatement statement = connection.prepareStatement("select e.empId, e.empName, e.password, e.deptId, d.deptname from employee e inner join department d on e.deptId = d.deptId");
			ResultSet rSet = statement.executeQuery();
			while(rSet.next())
				
			{
				int empId = rSet.getInt("empId");
				String empName = rSet.getString("empName");
				String password = rSet.getString("password");
				int deptId = rSet.getInt("deptId");
				String deptName = rSet.getString("deptname");
				
				Employee employee = new Employee(empId, deptId, deptName, empName, password);
				employees.add(employee);
				
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.getMessage();
		}
		return employees;
	}


	

	

}
