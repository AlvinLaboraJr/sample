package sample2.main;

import java.io.IOException;
import java.util.Scanner;

public class AccessMethod {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int opt;
		do {
			System.out.println("*Option*");
			System.out.println("1: Print All Employees");
			System.out.println("2: Search Employee by ID");
			System.out.println("3: Add Employee");
			System.out.println("4: Update Employee");
			System.out.println("5: Remove Employee");
			System.out.println("0: Exit");
			opt = scanner.nextInt();
			switch (opt) {
			case 1:
				Main.viewAllEmployees();
				break;
			case 2:
				Main.viewEmployeeById();
				break;
			case 3:
				Main.addEmployee();
				break;
			case 4:
				Main.updateEmployee();
				break;
			case 5:
				Main.deleteEmployee();
				break;
			default:
				break;
			}
		} while (opt != 0);
		scanner.close();
	}

}
