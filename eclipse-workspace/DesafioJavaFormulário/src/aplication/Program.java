package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter client data: ");
	System.out.print("name: ");
	String name = sc.nextLine();
	System.out.print("email: ");
	String email = sc.next();
	System.out.print("Enter date ex:(02/12/2024): ");
	Date birthDate = sdf.parse(sc.next());
	
	Client client = new Client(name,email,birthDate);
	
	System.out.println("Enter order data");
	System.out.print("Status: ");
	OrderStatus status = OrderStatus.valueOf(sc.next());
	System.out.print("How many items to this order: ");
	Integer n = sc.nextInt();
	
	for( int i =0 ; i < n; i++) {
		System.out.println();
		System.out.println("Enter #"+i+1+" item Data: ");
		System.out.print("Product name: ");
		sc.nextLine();
		String productname = sc.nextLine();
		System.out.print("Product price: ");
		Double productprice = sc.nextDouble();
		System.out.print("Quantity: ");
		Integer productquantity = sc.nextInt();
	}

	}

}
