package Ordenação;

import java.util.Scanner;

public class PesquisaLinear {
		boolean achou = false;	
	int lugar = 0;
	
	
	//a parti daqui Ã© a funÃ§Ã£o linear simples, 
	System.out.println("Qual Ã© o nÃºmero que vocÃª busca?");
	Scanner leitor = new Scanner(System.in);
	int buscado = leitor.nextInt();
	
	
	
	//percorre o vetor para ver se acha o que foi pedido
	for (int j = 0; j < numeros.size(); j++) {
		if (numeros.get(j) == buscado) {
			//se caso o que procura foi achado ele torna a variavel para true
			achou = true;
			lugar = i - 1;
		}
	}
	
	//indica se achou ou nao, pretendo melhorar essa parte, indicando qual foi o numero buscado
	if (achou == true) {
		System.out.println("Achou e está na posição "  + lugar);
	}else {
		System.out.println("NÃ£o achou");
	}
	
	leitor.close();
 }
}
