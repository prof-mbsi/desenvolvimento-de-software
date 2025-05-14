package aula1305exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeArquivos {
	
	public static void lerArquivo() throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("texto.txt"));
			String linha = br.readLine();
			System.out.println("Conteúdo da linha: " + linha);
		}finally {
			if(br != null) {
				br.close();
				System.out.println("Arquivo fechado!");
			}
		}
	}

}
