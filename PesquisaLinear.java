package Ordenação;

import java.util.Scanner;

public class PesquisaLinear {
	int[] teste = new int [8];
	boolean achou = false;		
	
	for(int i = 0; i < teste.length; i++) {
		teste[i] = (int) (Math.random() * 10);
		System.out.println(teste[i]);
	}
	System.out.println("Qual é o número que você busca?");
	Scanner leitor = new Scanner(System.in);
	int buscado = leitor.nextInt();
	
	
	for (int j = 0; j < teste.length; j++) {
		if (teste[j] == buscado) {
			achou = true;
		}
	}
	if (achou == true) {
		System.out.println("Achou");
	}else {
		System.out.println("Não achou");
	}
	
	leitor.close();
 }
}
