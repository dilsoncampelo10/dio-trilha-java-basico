package com.dilson.contabanco;

import java.util.Scanner;

import com.dilson.contabanco.model.Conta;
import com.dilson.contabanco.util.AppUtil;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		AppUtil.exibirMenu();
		
		Conta conta = new Conta();
		
		System.out.println("Por Favor, informe seu nome: ");
		conta.setNomeCliente(scanner.next());
		
		System.out.println("Informe o número: ");
		conta.setNumero(scanner.nextInt());
		
		System.out.println("Agora a agência: ");
		conta.setAgencia(scanner.next());
		
		System.out.println("E por fim, informe o saldo:: ");
		conta.setSaldo(scanner.nextDouble());
		
		System.out.println(conta.toString());

	}

}
