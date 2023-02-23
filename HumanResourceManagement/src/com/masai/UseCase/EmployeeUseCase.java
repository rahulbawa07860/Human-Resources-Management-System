package com.masai.UseCase;

import java.awt.Choice;
import java.util.Scanner;

import com.masai.dao.daoInterface;
import com.masai.dao.doaInterfaceImpl;
import com.masai.models.Employee;
import com.masai.models.EmployeeLeave;

import CustomColor.ConsoleColors;

public class EmployeeUseCase {
	public static final daoInterface doa = new doaInterfaceImpl();
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT +"-------------------------------------------|");
	System.out.println(ConsoleColors.GREEN_BOLD+"|| Please Choose Your Action :-            |");
	System.out.println(ConsoleColors.GREEN_BOLD+"-------------------------------------------|");
	System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 1 ] for View Employee Profile            |");
	System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 2 ] for Update Your Password             |");
	System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 3 ] for Update Your Name                 |");
	System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 4 ] for Apply Leave                      |");
	System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 5 ] for Your Leave Status                |");
	System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT +"-------------------------------------------|"+ConsoleColors.RESET);
	System.out.println(" ");
	int choice = scanner.nextInt();
	switch(choice) {
	case 1: {
		viewEmployee(scanner);
		break;
	}
	case 2: {
		updatePassword(scanner);
		break;
	}
	case 3: {
		updateEmpName(scanner);
		break;
	}
	case 4: {
		leaveApply(scanner);
		break;
	}
	case 5: {
		leaveById(scanner);
		break;
	}

	default:
		System.out.println("Invalid choice");
		break;
	}
	
}



public static void viewEmployee(Scanner scanner)
{
	System.out.println("Enter your name");
	String empNameString = scanner.next();
	System.out.println("Enter your password");
	String password = scanner.next();
	Employee employee = doa.viewEmployee(empNameString, password);
	if(employee==null)
	{
		System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT +"You Are Not A Registered Employee");
		System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-------------");
		System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed-------->");
	    System.out.println();
	}
	else {
		System.out.println(ConsoleColors.WHITE_BACKGROUND+"--------------------------------------");
		System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT +ConsoleColors.BLACK_BOLD+employee);
	}
	
}
public static void updatePassword(Scanner scanner)
{
	System.out.println("Enter your name");
	String empNameString = scanner.next();
	System.out.println("Enter your password");
	String password = scanner.next();
	System.out.println("Enter your new password");
	String newPassword = scanner.next();
	String message = doa.updateEmployeePass(empNameString, password, newPassword);
	System.out.println(message);
	
}

public static void updateEmpName(Scanner scanner)
{
	System.out.println("Enter your name");
	String empNameString = scanner.next();
	System.out.println("Enter your password");
	String password = scanner.next();
	System.out.println("Enter your new name");
	String newName = scanner.next();
	String message = doa.updateEmployeeName(empNameString, password, newName);
	System.out.println(message);
	
}

public static void leaveApply(Scanner scanner)
{
	System.out.println("Enter your name");
	String empNameString = scanner.next();
	System.out.println("Enter your password");
	String password = scanner.next();
	System.out.println("Enter leave days");
	int leaveDays = scanner.nextInt();
	String message = doa.leaveApply(password, leaveDays);
	System.out.println(message);
	
}

public static void leaveById(Scanner scanner)
{
	System.out.println("Enter your name");
	String empNameString = scanner.next();
	System.out.println("Enter your password");
	String password = scanner.next();
	
    EmployeeLeave leave = doa.getLeaveStatusById(password);
    if(leave==null)
	{
		System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT +"You haven't applied for null");
		System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-------------");
		System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed-------->");
	    System.out.println();
	}
	else {
		System.out.println(ConsoleColors.WHITE_BACKGROUND+"-----------------------------------------------------------------");
		System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT +ConsoleColors.BLACK_BOLD+leave);
	}
	
}

}
