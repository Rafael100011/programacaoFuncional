package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter Full file path: ");
		String diretorio = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(diretorio))){
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				Double salary = Double.parseDouble(fields[2]);
				list.add(new Employee(name,email,salary));
				
				line = br.readLine();
				
				
			}
			System.out.println("Enter salary: ");
			Double sla = sc.nextDouble();
			
			//usado para comparar os dados.
			Comparator<String> comp = (x1,x2) -> x1.toUpperCase().compareTo(x2.toUpperCase()); 
			
			//sorted serve para listar o dados em order crescente. Se usar como parâmentro sorted(comp.reversed()) vai aparecer na order descrecente.
			
			List<String> em = list.stream().filter(x -> x.getSalary() > sla).map(p -> p.getEmail()).sorted(comp).collect(Collectors.toList());
			
			//logo depois de pegar o nome do cliente, uso o charAt para pegar a primeira letra do nome do mesmo e testar se começa com 'M'
			//se sim, uso reduce para somar os salarios
			
			Double sun = list.stream().filter(x -> x.getName().charAt(0)== 'M').map(p -> p.getSalary()).reduce(0.0,(x,y) -> x + y);
			
			
			System.out.println("Email o people whose salary is more than "+ sla+":");
			
			
			
			
			em.forEach(System.out::println);
			System.out.println("Sun of salary of people whose name starts with 'M': "+ sun);
			
			
		}
		catch(IOException e) {
			 System.out.println("ERROR!"+e.getMessage());
			
		}
		catch( ArrayIndexOutOfBoundsException e ) {
			System.out.println("ERROR! "+ e.getMessage());
		}
		sc.close();
		
	}

}
