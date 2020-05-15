package application;


import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

import entities.EmployeeArray;

public class Exercicio94_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered ? ");
		int n = sc.nextInt();
		
		List <EmployeeArray> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i +":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken. Try again: ");
				id = sc.nextInt();
				
			}	
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new EmployeeArray(id, name, salary));

		}
		//PART 2 - UPDATINGSALAR OF GIVEN EMPLOYEE
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		EmployeeArray emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percenage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
	
		
		//PART 3 - LISTING EMPLOYEES:
		System.out.println();
		System.out.println("List of employee:");
		for (EmployeeArray obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<EmployeeArray> list, int id) {
		EmployeeArray emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}



}
