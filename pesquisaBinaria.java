package intro3;

import java.util.ArrayList;

public class pesquisaBinaria {

	public static void binaria(final ArrayList<Long> numeros) {

		long inicio = 0;
		long meio = 0;
		long fim = numeros.length - 1;
		long x = 0;

		while (inicio <= fim) {
			meio = (fim + inicio) / 2;

			System.out.println("Inicio: " + numeros[inicio] + " - Meio: " + numeros[meio] + " - Fim: " + numeros[fim]);
			System.out.println("Inicio: " + inicio + " - Meio: " + meio + " - Fim: " + fim);

			if (numeros[meio] == x) {
				System.out.println("Encontrou o número " + x);
				break;
			}
			if (numeros[meio] < x) {
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
