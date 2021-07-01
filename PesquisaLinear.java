package Ordenação;

import java.util.Scanner;

public class PesquisaLinear {
	int[] teste = new int [8];
	boolean achou = false;		
	
	//apenas simulando o vetor do arquivo
	for(int i = 0; i < teste.length; i++) {
		teste[i] = (int) (Math.random() * 10);
		System.out.println(teste[i]);
	}
	//até aqui
	
	//a parti daqui é a função linear simples, 
	System.out.println("Qual é o número que você busca?");
	Scanner leitor = new Scanner(System.in);
	int buscado = leitor.nextInt();
	
	//percorre o vetor para ver se acha o que foi pedido
	for (int j = 0; j < teste.length; j++) {
		if (teste[j] == buscado) {
			//se caso o que procura foi achado ele torna a variavel para true
			achou = true;
		}
	}
	
	//indica se achou ou nao, pretendo melhorar essa parte, indicando qual foi o numero buscado
	if (achou == true) {
		System.out.println("Achou");
	}else {
		System.out.println("Não achou");
	}
	
	leitor.close();
 }
}
