package client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fileprocessors.StockFileData;
import fileprocessors.StockFileReader;

public class StockFileApplication {
	
	public static void main(String args[]) throws IOException{
		StockFileReader fr = new StockFileReader("table.csv");
		
		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
		StockFileData fileData = new StockFileData();
		fileData.addData(dataResult);
		fileData.printData();
		
	}
	/**
	 * Complete the method body so that it returns the given structure needed to 
	 * populate the data field in the StockFileData class. 
	 * @param headers
	 * @param lines
	 * @return List
	 */
	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
		List<HashMap<String, Double>> dataResult = new ArrayList<>();
		
		for(String line : lines) {
			//split the line by commas
			String [] values = line.split(",");
			//counter variable for headers
			int cnt = 0;		
			//Define the hashmap
			HashMap<String, Double>	headerValueMap = new HashMap<>();	
			//iterate over the values array	
			for(String value : values) {
				//convert string to double
				double dval = Double.parseDouble(value);
				//populate the map with key and values
				headerValueMap.put(headers.get(cnt), dval);
				cnt++;
				
			}
			dataResult.add(headerValueMap);
		}
		return dataResult;
	}
	
}
