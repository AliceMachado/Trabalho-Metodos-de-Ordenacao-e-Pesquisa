package Ordenacao_e_pesquisa;

import java.util.*;
import java.io.*;

public class ManipuladorArquivo{
	
	public static String linha = "";
	public static double linha_num;
	public static double linha_num2;
	
	public static void leitor(String path) throws IOException {
		
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		
		while (true) {
			if (linha != null) {
				linha_num = Double.parseDouble(linha);
				linha_num2 = Double.parseDouble(linha);
				System.out.println(linha);
			} else
				break;
				linha = buffRead.readLine();
			}
		buffRead.close();
	}
	
	public ManipuladorArquivo() {
		//Bubble sort
        ArrayList<Double> numeros = new ArrayList<> ();
        numeros.add(linha_num);
        Arrays.toString(numeros.toArray());
        
        ArrayList<Double> numeros2 = new ArrayList<> ();
        numeros2.add(linha_num2);
        Arrays.toString(numeros2.toArray() );
        
        for (int i = 0; i < numeros.size(); i++) {  
        	numeros.set(i, linha_num);
            numeros2.set(i, linha_num2);
        }
        for (int i = 0; i < numeros.size(); i++) { 
        	numeros.get(i);
            if(numeros.get(i) > linha_num){
                linha_num2 = linha_num;
                linha_num = numeros.get(i);
            }else{
                if((numeros.get(i) > linha_num2) && (numeros.get(i) != linha_num)) {
                	linha_num2 = numeros.get(i);
                }
            }
        }
	}
	
	
}
