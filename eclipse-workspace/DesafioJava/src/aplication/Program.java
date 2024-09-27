package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("how many employees will be registered? ");
		int n = sc.nextInt();
		List<Employee> lista = new ArrayList<>();
		
		for (int i =0; i < n; i++) {
			System.out.println("Employee #"+(i+1)+":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id,name,salary);
			
			lista.add(emp);
			System.out.println("");
		}
		
		System.out.print("Enter the employee id that will have increase: ");
		int idemp = sc.nextInt();
		
		Integer pos = positionId(lista,idemp);
		if (pos == null) {
			System.out.println("not exist employee");
		}else {
			System.out.print("Enter the percentege: ");
			Double per = sc.nextDouble();
			
			System.out.println("List of Employee");
			lista.get(pos).increaseSalary(per);
		for (Employee emp:lista) {
			System.out.println(emp);
		}
			
			
			
			
		}
		
		
		
		
		
		
		
		sc.close();
	}
	
	public static Integer positionId(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() ==id) {
				return i;
			}
			
		}
		return null;
	}

}
