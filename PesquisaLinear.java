package Ordenacao_e_pesquisa;

import java.util.ArrayList;
import java.util.Scanner;

public class PesquisaLinear {
	public static void pesquisaLinear(ArrayList<Long> numeros) {
		// TODO Auto-generated method stub
		boolean achou = false;	
		int lugar = 0;
		
		
		//a parti daqui Ã© a funÃ§Ã£o linear simples, 
		System.out.println("Qual é o número que você busca?");
		Scanner leitor = new Scanner(System.in);
		long buscado = leitor.nextLong();
		
		
		
		//percorre o vetor para ver se acha o que foi pedido
		for (int j = 0; j < numeros.size(); j++) {
			if (numeros.get(j) == buscado) {
				//se caso o que procura foi achado ele torna a variavel para true
				achou = true;
				lugar = j + 1;
			}
		}
		
		//indica se achou ou nao, pretendo melhorar essa parte, indicando qual foi o numero buscado
		if (achou == true) {
			System.out.println("O número foi encontrado na posição "  + lugar);
		}else {
			System.out.println("O número não foi encontrado");
		}
		
		leitor.close();
	 }
	}

