package Ordenacao_e_pesquisa;

import java.util.*;
import java.io.*;

public class ManipuladorArquivo{
	
	public static String linha;
	public static int linha_num;
	public static ArrayList<Long> numeros = new ArrayList<Long>();
	
	public static void leitorInsertionSort(String path) throws IOException {
		//Insertion sort
		long j, x;
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		linha = buffRead.readLine();
				
		while (true) {
			if (linha != null) {
				linha_num = Integer.parseInt(linha);
				numeros.add(linha_num);
		        Arrays.toString(numeros.toArray());
			} else
				break;
				linha = buffRead.readLine();
			}
        
      		for (int i = 1; i < numeros.size(); i++) {
	       		x = numeros.get(i);
	        	j = i - 1;
	            	while (j >= 0 && numeros.get(j) > x) {
	                	numeros.set(j + 1, numeros.get(j));
	                	j = j - 1;
	            	}
	            	numeros.set(j + 1, x);
        	}
		for(int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
		Pesquisas.pesquisa(null);
		buffRead.close();
	}
	
	public static void leitorBubbleSort(String path) throws IOException {
		//Bubble sort
		
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		linha = buffRead.readLine();
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		while (true) {
				if (linha != null) {
					linha_num = Integer.parseInt(linha);
					numeros.add(linha_num);
			        Arrays.toString(numeros.toArray());
				} else
					break;
	        for(int i = 0; i < numeros.size() - 1; i++) {
	        	boolean estaOrdenado = true;
			    for(int j = 0; j < numeros.size() - 1 - i; j++) {
			    	if(numeros.get(j) > numeros.get(j + 1)) {
			    		int aux = numeros.get(j);
			    		numeros.set(j, numeros.get(j + 1));
			    		numeros.set(j + 1, aux);
			    		estaOrdenado = false;
			    	}
			    }
			    if(estaOrdenado)
			        break;
			}
	        
	        for (int i = 0; i < numeros.size(); i++) { 
	        	numeros.get(i);
	            if(numeros.get(i) > linha_num){
	                linha_num = numeros.get(i);
	            }
	        }
		linha = buffRead.readLine();
		}
        
        	for(int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
		// serve para chamar o metodo de pesquisa
		Pesquisas.pesquisa(null);
		buffRead.close();
	}
}
