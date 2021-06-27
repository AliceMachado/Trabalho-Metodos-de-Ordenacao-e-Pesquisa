package intro3;

public class pesquisaBinaria {

	public static void main(String[] args) {

		int[] numeros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int inicio = 0;
		int meio = 0;
		int fim = numeros.length - 1;
		int x = 0;

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
