package Banco;

import java.util.Scanner;

public class BancoLogin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double saldo = 2024.78;
		
		System.out.println("Bem-vindo de volta ao banco Mersken, vamos entrar na sua conta? \n");
		System.out.printf("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.printf("Digite sua agência: ");
		int agencia = sc.nextInt();
		
		System.out.println("Digite sua conta: ");
		int conta = sc.nextInt();
		
		System.out.println("Bem-vindo "+nome+"! Sua conta é "+conta+", sua agência é "+agencia+", e o saldo disponível é "+saldo);
		
		
	}
	
}
