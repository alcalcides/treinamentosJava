package analiseDeJSON.solucaoJackson;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Referência bibliográfica:
 * https://www.baeldung.com/jackson-object-mapper-tutorial
 * 
 * @author Alcides Augusto Bezerra Neto
 */
public class TratarComJackson {
	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			Carro meuCarro = new Carro("vermelho", 2015);
			String string = objectMapper.writeValueAsString(meuCarro);
			System.out.println(string);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		objectJSONBuiltIn(objectMapper);

		objectUnknownJSONBuiltIn(objectMapper);

		objectLocalFile(objectMapper);

		objectLocalFileWithMap(objectMapper);

		dataSetJSONBuiltIn(objectMapper);

		dataSetLocalFileDB(objectMapper);

	}

	private static void objectJSONBuiltIn(ObjectMapper objectMapper) {
		try {
			String car2 = "{\"cor\":\"preto\",\"anoDeFabricacao\":2040}";
			Carro meuCarro2 = objectMapper.readValue(car2, Carro.class);
			System.out.println(meuCarro2.getCor());
			System.out.println(meuCarro2.getAnoDeFabricacao());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	private static void objectUnknownJSONBuiltIn(ObjectMapper objectMapper) {
		try {
			String json = "{ \"titulo\" : \"Os Miseráveis\", \"autor\" : \"Victor Hugo\" , \"anoEd1\": 1862}";
			JsonNode jsonNode = objectMapper.readTree(json);
			String titulo = jsonNode.get("titulo").asText();
			System.out.println(titulo);
			Integer anoEd1 = jsonNode.get("anoEd1").asInt();
			System.out.println(anoEd1);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	} 

	private static void objectLocalFile(ObjectMapper objectMapper) {
		try {
			Carro carro3 = objectMapper.readValue(new File("resources/myCar.json"), Carro.class);
			System.out.println(carro3.getCor());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void objectLocalFileWithMap(ObjectMapper objectMapper) {
		try {
			Map<String, Object> doc = objectMapper.readValue(new File("resources/myCar.json"),
					new TypeReference<Map<String, Object>>() {});
			System.out.println(doc.get("cor"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void dataSetJSONBuiltIn(ObjectMapper objectMapper) {
		try {
			String jsonCarArray = "[" 
					+ "{ \"color\" : \"Black\", \"year\" : 1990 }, "
					+ "{ \"color\" : \"Red\", \"year\" : 2000 }" 
					+ "]";

			List<Map<String, Object>> listCar = objectMapper.readValue(
					jsonCarArray,
					new TypeReference<List<Map<String, Object>>>() {});

			listCar.forEach(item -> {
				System.out.println(item);
			});

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	private static void dataSetLocalFileDB(ObjectMapper objectMapper) {
		try {
			List<Map<String, Object>> docs = objectMapper.readValue(new File("resources/dataSet.json"),
					new TypeReference<List<Map<String, Object>>>() {});

			docs.forEach(doc -> {
				System.out.println(doc);
			});

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
