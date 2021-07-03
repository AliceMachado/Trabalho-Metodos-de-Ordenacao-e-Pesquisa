package Ordenacao_e_pesquisa;

import java.util.ArrayList;

public class pesquisaBinaria {

	public static void binaria(ArrayList<Long> numeros) {

		long inicio = 0;
		long meio = 0;
		long fim = numeros.size() - 1;
		long x = 0;

		while (inicio <= fim) {
			meio = (fim + inicio) / 2;

			System.out.println("Inicio: " + numeros.get((int) inicio) + " - Meio: " + numeros.get((int) meio) + " - Fim: " + numeros.get((int) fim));
			System.out.println("Inicio: " + inicio + " - Meio: " + meio + " - Fim: " + fim);

			if (numeros.get((int) meio) == x) {
				System.out.println("Encontrou o número " + x);
				break;
			}
			if (numeros.get((int) meio) < x) {
				inicio = meio + 1;
			} else {

				fim = meio - 1;

				if (inicio > fim) {
					System.out.println("Não encontrou o número " + x);

				}

			}
		}
	}
}
