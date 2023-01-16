package modulo1.bloco3.praticando33e34;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestaException {
	
	public static void main(String[] args) {
		
		
		String caminhoArquivo = "C:\\tmp\\arquivo.txt";
		Path path = Paths.get(caminhoArquivo);
		
		try {
			String conteudo = Files.readString(path);
			
			System.out.println(conteudo);
			
			
		} catch (IOException e) {
			System.out.println("Erro na leitura do arquivo " + caminhoArquivo);
			
		}
		
		
	}
	
}
