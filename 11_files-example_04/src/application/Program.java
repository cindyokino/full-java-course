// FileWriter and BufferedWriter

package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	
	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
	
		String path = "C:\\temp\\ws-eclipse\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path/*, true*/))) { // com TRUE ele acrescenta as linhas no final do arquivo, ao inves de criar /recriar o arquivo
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
