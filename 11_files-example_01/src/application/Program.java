// Reading files with File and Scanner classes

package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\temp\\ws-eclipse\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) { // verifica se existe uma proxima linha no arquivo
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Ërror: " + e.getMessage());
		}
		finally {
			if (sc != null) {
			sc.close();
			}
		}
	}
}
