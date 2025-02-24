package desafioBancoTerminal;

import java.util.Scanner;

public class BancoTerminal {

	public static void main(String[] args) {
		// TODO: conhecer e importar a classe Scanner
		// TODO: Exibir as mensagens para o usuario
		// TODO: Obter pela classe Scanner os valores digitados no terminal
		// TODO: Exibir a mensagem final
		
		Scanner sc = new Scanner(System.in);
				
		
		int num1; // numero da conta
		System.out.println("Digite o número da conta: ");
		num1 = sc.nextInt();
		System.out.println("O número selecionado foi: " + num1);
		sc.nextLine(); // limpa o buffer o enter
			
		
		String agencia; // numero da agencia
		System.out.println("Por favor, digite o numero da Agencia: ");
		agencia = sc.nextLine();
		System.out.println("O número da agência selecionada foi: " + agencia); 
			
				
		
		String nomeCliente; // nome do cliente
		System.out.println("Por favor, insira seu nome: ");
		nomeCliente = sc.nextLine();
		System.out.println("Nome Inserido: " + nomeCliente);
	
		
		double saldo = 1570.68; // saldo fixo da conta
		System.out.println("Seu saldo atual: " + saldo);
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + num1 + ", conta " + agencia + " e seu saldo R$" + saldo + " já está disponível para saque.");
		
		sc.close();
	}

}
