package analiseDeJSON.solucaoGson;

import com.google.gson.Gson;

public class TratarComGson {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("AN", 31);
		Gson gsonSupport = new Gson();
		System.out.println(gsonSupport.toJson(p1));
		
		String p2JSON = "{\"primeiroNome\":\"LQ\",\"idade\":19}";
		Pessoa p2 = gsonSupport.fromJson(p2JSON, Pessoa.class);
		System.out.println(p2.getPrimeiroNome());
		System.out.println(p2.getIdade());
		
		
	}
}
