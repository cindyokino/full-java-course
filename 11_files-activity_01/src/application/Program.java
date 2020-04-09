package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter file path: ");
		String path = sc.nextLine(); // C:\\temp\\ws-eclipse\\11_files-activity_01\\in.csv

		File sourceFile = new File(path);
		String sourceFolder = sourceFile.getParent(); // obtem o caminho sem o nome do arquivo

		boolean success = new File(sourceFolder + "\\out").mkdir();

		String targetFile = sourceFolder + "\\out\\summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine(); // ler primeira linha
			while (line != null) {

				String[] item = line.split(", "); // criar um array chamado item, cada elemento do array sera uma parte do string dividido por ", "
				String name = item[0];
				double price = Double.parseDouble(item[1]);
				int quantity = Integer.parseInt(item[2]);

				list.add(new Product(name, price, quantity));

				line = br.readLine(); // ler proxima linha
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {

				for (Product item : list) { // para cada array(chamado item) do tipo produto, contido no array chamado list
					bw.write(item.getName() + ", " + String.format("%.2f", item.totalPrice()));

					bw.newLine(); // ler proxima linha de arrays da lista
				}

				System.out.println(targetFile + " CREATED!");

			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		sc.close();
	}
}
