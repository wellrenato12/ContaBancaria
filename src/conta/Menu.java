package conta;

import java.util.Scanner;

import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
		while(true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			
			System.out.println("*****************************************************");
			System.out.println("");
			System.out.println("\t\tBANCO DO BAZIL COM Z\t\t");
			System.out.println("");
			System.out.println("*****************************************************");
			System.out.println("");
			System.out.println("\t\t1 - Criar conta\t\t");
			System.out.println("\t\t2 - Listar todas as contas\t\t");
			System.out.println("\t\t3 - Buscar conta por número\t\t");
			System.out.println("\t\t4 - Atualizar dados da conta\t\t");
			System.out.println("\t\t5 - Apagar conta\t\t");
			System.out.println("\t\t6 - Sacar\t\t");
			System.out.println("\t\t7 - Depositar\t\t");
			System.out.println("\t\t8 - Transferir valores entre contas\t\t");
			System.out.println("\t\t9 - Sair\t\t");
			System.out.println("");
			System.out.println("*****************************************************");
			System.out.println("\t\tEntre com a opção desejada: \t\t");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			opcao = scanner.nextInt();
			
			if(opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu futuro começa aqui!");
				sobre();
				scanner.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar conta \n\n");
				break;
			case 2: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as contas \n\n");
				break;
			case 3: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da conta - por número \n\n");
				break;
			case 4: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da conta \n\n");
				break;
			case 5: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a conta \n\n");
				break;
			case 6: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque \n\n");
				break;
			case 7: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito \n\n");
				break;
			case 8: 
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre contas \n\n");
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção inválida!" + Cores.TEXT_RESET);
				break;
			}
		}
	}
	
	public static void sobre() {
		System.out.println("\n*****************************************************");
		System.out.println("Projeto desenvolvidor por: ");
		System.out.println("Wellington Albino - well.renato@hotmail.com");
		System.out.println("github.com/wellrenato12");
		System.out.println("*****************************************************");
	}

}
