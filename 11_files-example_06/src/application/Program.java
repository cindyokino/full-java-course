// informations about the file path

package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName()); //getName pega apenas o nome do caminho, e despreza o caminho
		System.out.println("getParent: " + path.getParent()); //getParent pega somente o caminho
		System.out.println("getPath: " + path.getPath()); // getPath pega o caminho completo

		sc.close();
	}
}
