package com.masai.UseCase;

import java.util.List;
import java.util.Scanner;

import javax.imageio.spi.RegisterableService;

import com.masai.dao.daoInterface;
import com.masai.dao.doaInterfaceImpl;
import com.masai.models.Department;
import com.masai.models.Employee;
import com.masai.models.EmployeeLeave;

import CustomColor.ConsoleColors;

public class AdminUseCase {
	public static final daoInterface doa = new doaInterfaceImpl();
	public static boolean flag = true;
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	
	while(flag)
	{
	System.out.println(ConsoleColors.WHITE_BACKGROUND +"-------------------------------------------|");
	System.out.println(ConsoleColors.GREEN_BOLD+"|| Please Choose Your Action :-            |");
	System.out.println(ConsoleColors.GREEN_BOLD+"-------------------------------------------|");
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 1 ] Add Department                       |");
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 2 ] View All Department                  |");
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 3 ] Register New Employee                |");
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 4 ] Transfer Employee To New Department  |");
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 5 ] View All Leave Details               |");
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 6 ] Update Leave Status                  |");
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 7 ] Update Department                    |");
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 8 ] View All Employee Details            |");
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +"-------------------------------------------|"+ConsoleColors.RESET);
	System.out.println(" ");
	System.out.println(ConsoleColors.YELLOW_UNDERLINED+"Please Enter Your Choice..");
	int choice = scanner.nextInt();
	
	
	switch(choice) {
	case 1: {
		addDept(scanner);
		break;
	}
	case 2: {
		getAllDept(scanner);
		break;
	}
	case 3: {
		registerEmp(scanner);
		break;
	}
	case 4: {
		transferEmp(scanner);
		break;
	}
	case 5: {
		viewAllLeave(scanner);
		break;
	}
	case 6: {
		leavePermit(scanner);
		break;
	}
	case 7: {
		updateDepartment(scanner);
		break;
	}
	case 8: {
		getAllEmployee(scanner);
		break;
	}
	default:
		System.out.println("Invalid choice");
		break;
	}

	
	
	
	
}
}
public static void addDept(Scanner scanner)
{
	
	System.out.println(ConsoleColors.YELLOW_UNDERLINED + "Enter Department Name");
	String dname = scanner.next();
	
	String meString = doa.addnewdepartment(dname);
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD +meString);
	System.out.println("  ");
	System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
	  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
	  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
	  ;
	int input = scanner.nextInt();
	if(input == 0) {
		flag = true;
	}else {
		flag = false;
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
		System.out.println("  ");
	}
}



public static void registerEmp(Scanner scanner){
	System.out.println(ConsoleColors.YELLOW_UNDERLINED + "Enter Employee name");
	String ename = scanner.next();
	System.out.println(ConsoleColors.YELLOW_UNDERLINED + "Create Password");
	String password = scanner.next();
	System.out.println(ConsoleColors.YELLOW_UNDERLINED + "Enter Department Id");
	int deptId = scanner.nextInt();
	String meString = doa.registerEmp(ename, password, deptId);
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD +meString);
	System.out.println("  ");
	System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
	  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
	  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
	int input = scanner.nextInt();
	if(input == 0) {
		flag = true;
	}else {
		flag = false;
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
		System.out.println("  ");
	}
}
public static void getAllDept(Scanner scanner){
	List<Department> departments = doa.viewDepartment();
	if(departments.size()==0)
	{
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +ConsoleColors.BLACK_BOLD+"No department Exist");
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +ConsoleColors.BLACK_BOLD+"Choose 1 from menu to create department");
		System.out.println("  ");
	}
	else {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +ConsoleColors.BLACK_BOLD+"   :: Department Details are as Followed  ::");
		departments.forEach(i-> System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +ConsoleColors.BLACK_BOLD+i));
		System.out.println("  ");
	}
	System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
	  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
	  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
	int input = scanner.nextInt();
	if(input == 0) {
		flag = true;
	}else {
		flag = false;
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
		System.out.println("  ");
	}
	}

public static void transferEmp(Scanner scanner){
	System.out.println(ConsoleColors.YELLOW_UNDERLINED + "Enter Employee id");
	int empId = scanner.nextInt();
	System.out.println(ConsoleColors.YELLOW_UNDERLINED + "Enter Department Id");
	int deptId = scanner.nextInt();
	String msgString = doa.transferDept(empId, deptId);
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +ConsoleColors.BLACK_BOLD+msgString);
	System.out.println("  ");
	System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
	  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
	  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
	int input = scanner.nextInt();
	if(input == 0) {
		flag = true;
	}else {
		flag = false;
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
		System.out.println("  ");
	}
	}

public static void viewAllLeave(Scanner scanner){
	List<EmployeeLeave> employeeLeaves = doa.viewEmployeeLeaves();
	if(employeeLeaves.size()==0)
	{
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +ConsoleColors.BLACK_BOLD+"No one has applied for leave");
		
	}
	else {
		
		employeeLeaves.forEach(i-> System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +ConsoleColors.BLACK_BOLD+i));
		System.out.println("  ");
	}
	System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
	  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
	  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
	int input = scanner.nextInt();
	if(input == 0) {
		flag = true;
	}else {
		flag = false;
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
		System.out.println("  ");
	}
	}
public static void leavePermit(Scanner scanner){
	System.out.println(ConsoleColors.YELLOW_UNDERLINED + "Enter Employee id");
	int empId = scanner.nextInt();
	System.out.println(ConsoleColors.YELLOW_UNDERLINED + "Enter leave status type Deny or Grant for leave application");
	String  status = scanner.next();
	String messString =doa.leavePermission(empId, status);
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD +messString);
	System.out.println("  ");
	System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
	  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
	  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
	int input = scanner.nextInt();
	if(input == 0) {
		flag = true;
	}else {
		flag = false;
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
		System.out.println("  ");
	}
	}

public static void updateDepartment(Scanner scanner){
	System.out.println(ConsoleColors.YELLOW_UNDERLINED + "Enter Department id");
	int deptId = scanner.nextInt();
	System.out.println(ConsoleColors.YELLOW_UNDERLINED + "Enter new department Name");
	String  deptName = scanner.next();
	String mssString = doa.updateDepartment(deptId, deptName);
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD +mssString);
	System.out.println("  ");
	System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
	  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
	  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
	int input = scanner.nextInt();
	if(input == 0) {
		flag = true;
	}else {
		flag = false;
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
		System.out.println("  ");
	}
	}
public static void getAllEmployee(Scanner scanner)
{
	List<Employee> employees = doa.getAllEmployeeDetails();
	if(employees.size()==0)
	{
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +ConsoleColors.BLACK_BOLD+"No Employee Exist");
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +ConsoleColors.BLACK_BOLD+"Choose 3 from menu to register new  Employee");
	}
	else {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +ConsoleColors.BLACK_BOLD+"             :: Employee Details are as Followed  ::");
		employees.forEach(i-> System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +ConsoleColors.BLACK_BOLD+i));
		System.out.println("  ");
	}
	System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
	  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
	  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
	int input = scanner.nextInt();
	if(input == 0) {
		flag = true;
	}else {
		flag = false;
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
		System.out.println("  ");
	}


}
}
