package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> lp = new ArrayList<>();
		List<ImportedProduct> ip = new ArrayList<>();
		List<UsedProduct> lup = new ArrayList<>();
		
		
		
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
	
		for(int i =1; i <= n ; i++) {
			System.out.print("camon,used or imported (c/u/i): ");
			char forma = sc.next().charAt(0);
			
			if (forma == 'c' ) {
				System.out.println();
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				Product product = new Product(name,price);
				lp.add(product);
				
			}
			else if(forma == 'u') {
				System.out.println();
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Manufature date: ");
				Date manufatureDate = sdf.parse(sc.next());
				
				Product up= new UsedProduct(name,price,manufatureDate);
				lup.add((UsedProduct)up);
			}
			else {
				System.out.println();
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("custom fee: ");
				Double customFee = sc.nextDouble();
				
				Product ipd = new ImportedProduct(name,price,customFee);
				ip.add((ImportedProduct)ipd);
				
				
			}
			
			
		}
		System.out.println();
		
		System.out.println("Cammon product: ");
		for(Product obj: lp ) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("imported product");
		for(ImportedProduct obg: ip) {
			System.out.println(obg);
		}
		System.out.println();
		
		System.out.println("Used product: ");
		for(UsedProduct obf: lup) {
			System.out.println(obf);
		}
		
		
		sc.close();

	}

}
