package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import model_entities.Accont;
import model_entities.DomainException;

public class Program {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Insira os dados da conta:");
			System.out.print("numero: ");
			Integer numero = sc.nextInt();
			System.out.print("Titular: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Deposito inicial: ");
			Double quantia= sc.nextDouble();
			System.out.print("Limite de saque: ");
			Double limiteSaque = sc.nextDouble();
			
			Accont accont = new Accont(numero,name,quantia,limiteSaque);
			
			System.out.println();
			
			System.out.print("Insira uma quantia para saque: ");
			Double quantia2 = sc.nextDouble();
			System.out.print("Novo saldo: "+ accont.saque(quantia2));
		}
		catch(DomainException p) {
			System.out.println(p);
		}
		catch(InputMismatchException e){
			System.out.println("ERROR! dados inseridos incorretamente: InputMismatchException");
		}
		
	
		sc.close();
	}
}
