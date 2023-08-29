package DataDrivenTesting;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ReadDataFromCSV {
	public static void main(String[] args) throws IOException, CsvException {
		// Create A FileReader Object
		// Assign the Object Reference Of Type Reader Because CSVReader accept (Reader reader) as a Argument.
		FileReader reader = new FileReader("./src/test/resources/data.csv");
		// Create CSVReader Object From OpenCSV Library
		CSVReader csvReader = new CSVReader(reader);
		// Call The ReadAll() From The CSVReader Class
		List<String[]> data = csvReader.readAll();
		// Iterate The String Array From The List
		for (String[] string : data) {
			// Iterate The String Data From String Array
			for (String rawData : string) {
				System.out.println(rawData);
			}
		}
		
	}
}
