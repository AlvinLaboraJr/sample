package sample2.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.Scanner;

import sample2.dao.EmplDao;
import sample2.dao.EmplImplementation;
import sample2.entities.Employee;

public class Main {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static Scanner scanner = new Scanner(System.in);
	private static EmplDao employeeDao = new EmplImplementation();

	public static void addEmployee() {
		System.out.println("ADD EMPLOYEE");
		System.out.print("Enter id: ");
		int id = scanner.nextInt();
		System.out.print("Enter name: ");
		String name = scanner.next();
		employeeDao.addEmpl(new Employee(id, name));
	}

	public static void viewAllEmployees() {
		System.out.println("PRINT ALL EMPLOYEEs");
		for (Entry<Integer, Employee> str : employeeDao.getAllEmpl().entrySet()) {
			System.out
					.println("Employee ID: " + str.getValue().getId() + " Employee Name: " + str.getValue().getName());

		}
	}

	public static void viewEmployeeById() {
		System.out.println("SEARCH BY ID");
		System.out.println("Enter id");
		int id = scanner.nextInt();
		System.out.println(employeeDao.getEmplById(id));
	}

	public static void updateEmployee() throws IOException {
		System.out.println("UPDATE EMPLOYEE");
		System.out.println("Enter Id: ");
		int id = scanner.nextInt();
		System.out.println(employeeDao.getEmplById(id));
		Employee employee = employeeDao.getEmplById(id);
		System.out.println("Enter New Name: ");
		String name = reader.readLine();
		employee.setName(name);
		employeeDao.updateEmpl(employee);
		System.out.println(employee);
	}

	public static void deleteEmployee() {
		System.out.println("DELETE EMPLOYEE");
		System.out.println("Enter ID: ");
		int id = scanner.nextInt();
		System.out.println(employeeDao.getEmplById(id));
		Employee employee = employeeDao.getEmplById(id);
		employeeDao.deleteEmpl(employee);
	}

}
