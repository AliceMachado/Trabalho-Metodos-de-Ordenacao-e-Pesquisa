package Ordenacao_e_pesquisa;

import java.util.*;
import java.io.*;

public class ManipuladorArquivo{
	
	public static String linha;
	public static long linha_num;
	static Scanner teclado = new Scanner(System.in);
	public static ArrayList<Long> numeros = new ArrayList<Long>();
	
	public static class leitorInsertionSort {
		public static void leitor(String path) throws IOException {
			//Insertion sort
			long tempoinicial = System.currentTimeMillis();

			int j;
			Long x;
			BufferedReader buffRead = new BufferedReader(new FileReader(path));
			linha = buffRead.readLine();

			while (true) {
				if (linha != null) {
					linha_num = Long.parseLong(linha);
					numeros.add(linha_num);
				Arrays.toString(numeros.toArray());
				} else
					break;
					linha = buffRead.readLine();
				}

			for (int i = 1; i < numeros.size(); i++) {
				x = numeros.get(i);
				j = (int) (i - 1);
				while (j >= 0 && numeros.get(j) > x) {
					numeros.set(j + 1, numeros.get(j));
					j = j - 1;
				}
				numeros.set(j + 1, x);
			}
			for(int i = 0; i < numeros.size(); i++) {
				System.out.println(numeros.get(i));
			}
			Pesquisas.pesquisa();

			long tempofinal = System.currentTimeMillis();
			long tempototal = tempofinal - tempoinicial;
			System.out.println("Tempo de Processamento de InsertionSort: " + tempototal + "ms");

			buffRead.close();
		}
	}
	
	public static class leitorBubbleSort {
		public static void leitor(String path) throws IOException {
			// Bubble sort
			long tempoinicial = System.currentTimeMillis();
			
			BufferedReader buffRead = new BufferedReader(new FileReader(path));
			linha = buffRead.readLine();


			while (true) {
				if (linha != null) {
					linha_num = Long.parseLong(linha);
					numeros.add(linha_num);
					Arrays.toString(numeros.toArray());
				} else
					break;
				
				for (int i = 0; i < numeros.size() - 1; i++) {
					boolean estaOrdenado = true;
					for (int j = 0; j < numeros.size() - 1 - i; j++) {
						if (numeros.get(j) > numeros.get(j + 1)) {
							long aux = numeros.get(j);
							numeros.set(j, numeros.get(j + 1));
							numeros.set(j + 1, aux);
							estaOrdenado = false;
						}
					}
					if (estaOrdenado)
						break;
				}
				for (int i = 0; i < numeros.size(); i++) {
					numeros.get(i);
					if (numeros.get(i) > linha_num) {
						linha_num = numeros.get(i);
					}
				}
				linha = buffRead.readLine();
			}
			for(int i = 0; i < numeros.size(); i++) {
				System.out.println(numeros.get(i));
			}
			Pesquisas.pesquisa();
			
			long tempofinal = System.currentTimeMillis();
	        	long tempototal = tempofinal - tempoinicial;
	        	System.out.println("Tempo de Processamento de BubbleSort: " + tempototal + "ms");
			
			buffRead.close();
		}
	}
	
	public static class leitorQuickSort{
		public static void leitor(int ini, int fim) {
		    int i = ini;
		    int f = fim;
		    Long pivo = numeros.get((int) ((i + f) / 2));
		    Long k;

		    while (i <= f) {
			while (numeros.get(i) < pivo) {
			    i = i + 1;
			}
			while (numeros.get(f) > pivo) {
			    f = f - 1;
			}
			if (i <= f) {
			    k = numeros.get(i);
			    numeros.set(i, numeros.get(f));
			    numeros.set(f, k);
			    i = i + 1;
			    f = f - 1;
			}
		    }
		    if (f > ini) {
			leitor(numeros, ini, f);
		    }
		    if (i < fim) {
			leitor(numeros, i, fim);
		    }

		    for(int j = 0; j < numeros.size(); j++) {
			System.out.println(numeros.get(j));
		    }
        }
        
        public static void leitor(String path) throws IOException {

		long tempoinicial = System.currentTimeMillis();

		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		linha = buffRead.readLine();

		while (true) {
			if (linha != null) {
				linha_num = Long.parseLong(linha);
				numeros.add(linha_num);
				Arrays.toString(numeros.toArray());
			} else
				break;
				linha = buffRead.readLine();
			}
		 leitor(numeros, 0, numeros.size() - 1);
		 Pesquisas.pesquisa();

		 long tempofinal = System.currentTimeMillis();
		 long tempototal = tempofinal - tempoinicial;
		 System.out.println("Tempo de Processamento de QuickSort: " + tempototal + "ms");

		 buffRead.close();
        }
    }
}
