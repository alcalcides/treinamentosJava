package analiseDeJSON.solucaoGson;

import java.lang.reflect.Type;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

public class TratarComGson {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("AN", 31);
		Gson gsonSupport = new Gson();
		System.out.println(gsonSupport.toJson(p1));
		
		String p2JSON = "{\"primeiroNome\":\"LQ\",\"idade\":19}";
		Pessoa p2 = gsonSupport.fromJson(p2JSON, Pessoa.class);
		System.out.println(p2.getPrimeiroNome());
		System.out.println(p2.getIdade());
		
		String json = "{\n"
				+ "		\"linkorigem\": \"http://www.portaltransparencia.gov.br/download-de-dados/cepim\",\n"
				+ "		\"origem\": \"PORTAL DA TRANSPARÊNCIA\"\n"
				+ "	}";
		
		JsonObject obj = gsonSupport.fromJson(json, JsonObject.class);
		System.out.println(obj.get("origem").getAsString());
		
		Type empMapType = new TypeToken<Map<String, Object>>() {}.getType();
		Map<String, String> temp = gsonSupport.fromJson(json, empMapType);
		System.out.println(gsonSupport.toJson(temp));
		
		
	}
}
