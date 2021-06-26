package Ordenacao_e_pesquisa;

import java.util.*;
import java.io.*;

public class ManipuladorArquivo extends Principal{
	
	public double linha_num;
	public double linha_num2;
	public static String linha = "";
	
	public static void leitor(String path) throws IOException {
		
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		
		while (true) {
			if (linha != null) {
				System.out.println(linha);
			} else
				break;
				linha = buffRead.readLine();
			}
		buffRead.close();
	}
	
	
	
	
}
