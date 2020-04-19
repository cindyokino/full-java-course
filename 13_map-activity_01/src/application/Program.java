package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program {
	
	public static void main(String[] args) {
		
		Map<String, Integer> votesMap = new HashMap<>();
		
		String filePath = "C:\\temp\\ws-eclipse\\13_map-activity_01//in.csv";
				
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			
			String line = br.readLine(); // ler primeira linha		
			
			while (line != null) {		
				
				String[] fields = line.split(","); // criar um array chamado item, cada elemento do array sera uma parte do string dividido por ", "
				String name = fields[0];
				int votes = Integer.parseInt(fields[1]);
				
				if (!votesMap.containsKey(name)) {					
					votesMap.put(name, votes);
				} else {
					int totalVotes = votesMap.get(name);
					totalVotes += votes;
					votesMap.put(name, totalVotes);
				}
				line = br.readLine();
			}	

			for (String key : votesMap.keySet()) {
				System.out.println(key + ": " + votesMap.get(key));
			}
				
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 		
	}	
}