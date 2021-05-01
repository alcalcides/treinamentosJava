package app;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Referências bibliográficas:
 * https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html
 * 
 * @author Alcides Augusto Bezerra Neto
 *
 */
public class DataEngine {
	public static void main(String[] args) throws Exception {
		String apiURL = "https://apisidra.ibge.gov.br/values/t/5919/n6/all/v/606/p/201904/c1568/120704";		
		URL source = new URL(apiURL);
		
		System.out.println("Downloading...");
		InputStream dataStream = source.openStream();
		InputStreamReader inputStreamReader = new InputStreamReader(dataStream);
		BufferedReader buffer = new BufferedReader(inputStreamReader);

		String line;
		String dataSet = "";
		while ((line = buffer.readLine()) != null) {
			dataSet = dataSet + line;
		}
		buffer.close();

		ObjectMapper objectMapper = new ObjectMapper();
		List<Map<String, Object>> docs = objectMapper.readValue(dataSet,
				new TypeReference<List<Map<String, Object>>>() {});

		docs.forEach(doc -> {
			System.out.println(doc);
		});
	}
}
