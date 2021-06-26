package Ordenacao_e_pesquisa;

import java.util.*;
import java.io.*;

public class ManipuladorArquivo{
	
	public static String linha;
	public static double linha_num;
	
	public static void leitorBubbleSort(String path) throws IOException {
		//Bubble sort
		
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		linha = buffRead.readLine();
		
		ArrayList<Double> numeros = new ArrayList<>();
		
		while (true) {
			if (linha != null) {
				linha_num = Double.parseDouble(linha);
				numeros.add(linha_num);
		        Arrays.toString(numeros.toArray());
			} else
				break;
				linha = buffRead.readLine();
			}
        
        for (int i = 0; i < numeros.size(); i++) {  
        	numeros.set(i, linha_num);
        }
        for (int i = 0; i < numeros.size(); i++) { 
        	numeros.get(i);
            if(numeros.get(i) > linha_num){
                linha_num = numeros.get(i);
            }
        }
        System.out.println(numeros);
		buffRead.close();
	}
}
