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
			Double saldo= sc.nextDouble();
			System.out.print("Limite de saque: ");
			Double limiteSaque = sc.nextDouble();
			
			Accont accont = new Accont(numero,name,saldo,limiteSaque);
			
			System.out.println();
			
			System.out.print("Insira uma quantia para saque: ");
			Double quantia2 = sc.nextDouble();
			accont.saque(quantia2);
			System.out.print("Novo saldo: "+accont.getSaldo());
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
