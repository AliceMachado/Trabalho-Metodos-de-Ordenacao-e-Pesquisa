package Ordenacao_e_pesquisa;

import java.util.Scanner;

public class Pesquisas {

	public static void pesquisa(String[] args) {
		//isso aqui define qual pesquisa o usuaro deseja realizar
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		
		System.out.println("Por favor, selecione o tipo de pesquisa desejada: "
				+ "\n 1 - Pesquisa Binária " + "\n 2 - Pequisa Linear" );
		opcao = teclado.nextInt();
		
		
		switch(opcao) {
		 	case 1: 
		 		//chama metodo pesquisa binaria
				//precisa ser adicionado
		 		break;
		 	case 2:
				//chama o metodo de pesquisa linear
		 		PesquisaLinear.pesquisaLinear(ManipuladorArquivo.numeros);
		 		break;
		}		
	}
}
