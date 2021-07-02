package Ordenacao_e_pesquisa;

import java.util.Scanner;

public class Pesquisas {

	public static void pesquisa(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		
		System.out.println("Por favor, selecione o tipo de pesquisa desejada: "
				+ "\n 1 - Pesquisa Binária " + "\n 2 - Pequisa Linear" );
		opcao = teclado.nextInt();
		
		
		switch(opcao) {
		 	case 1: 
		 		pesquisaBinaria.binaria(ManipuladorArquivo.numeros);
		 		break;
		 	case 2:
		 		PesquisaLinear.pesquisaLinear(ManipuladorArquivo.numeros);
		 		break;
		 	default:
		 		System.out.println("Opção incorreta!");
		 		break;
		}		
	teclado.close();
	}
}
