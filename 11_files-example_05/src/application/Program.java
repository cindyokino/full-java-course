// manipulating file folders

package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath); // uma variavel do tipo FILE pode ser um caminho de um ARQUIVO ou PASTA
		
		File[] folders = path.listFiles(File::isDirectory); //vai listar somente o que for PASTA
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile); //vai listar somente o que for ARQUIVO
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir(); // vai criar uma pasta chamada SUBDIR no endereco fornecido
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}
}
