package com.masai.UseCase;

import java.util.Scanner;

import com.masai.dao.daoInterface;
import com.masai.dao.doaInterfaceImpl;

import CustomColor.ConsoleColors;

public class Main {
	public static final daoInterface doa = new doaInterfaceImpl();
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	
	
	System.out.println(ConsoleColors.WHITE_BACKGROUND +"-------------------------------------------|");
	System.out.println(ConsoleColors.GREEN_BOLD+"|| Please Choose Your Action :-            |");
	System.out.println(ConsoleColors.GREEN_BOLD+"-------------------------------------------|");
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 1 ] Admin                                |");
	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 2 ] Employee                             |");

	System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT +"-------------------------------------------|"+ConsoleColors.RESET);
	System.out.println(" ");
	System.out.println(ConsoleColors.YELLOW_UNDERLINED+"Please Enter Your Choice..");
	int choice = scanner.nextInt();
	
	
	switch(choice) {
	case 1: {
		admin(scanner);
		break;
	}
	case 2: {
		Employee(scanner);
		break;
	}
	default:
		System.out.println("Invalid choice");
		break;
	}
}
public static void admin(Scanner scanner)
{
	
	System.out.println(ConsoleColors.YELLOW_UNDERLINED + "Enter Your Name");
	String AdminName = scanner.next();
	System.out.println(ConsoleColors.YELLOW_UNDERLINED + "Enter Your password");
	String password = scanner.next();
	boolean value = doa.validateAdmin(AdminName, password);
	if(value==true)
	{
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD +"Welcome "+AdminName);
		AdminUseCase.main(null);
	}
	else {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD +"Your credential are wrong ");
	}
	
}
public static void Employee(Scanner scanner)
{
	
	System.out.println(ConsoleColors.YELLOW_UNDERLINED + "Enter Your Name");
	String empName = scanner.next();
	System.out.println(ConsoleColors.YELLOW_UNDERLINED + "Enter Your password");
	String password = scanner.next();
	boolean value = doa.validateEmployee(empName, password);
	if(value==true)
	{
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD +"Welcome "+empName);
		EmployeeUseCase.main(null);
	}
	else {
		System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+ConsoleColors.BLACK_BOLD +"Your credential are wrong ");
	}
	
}
}
