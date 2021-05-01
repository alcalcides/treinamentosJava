package analiseDeJSON.solucaoGson;

public class Pessoa {
	private String primeiroNome;
	private Integer idade;
	
	public Pessoa(String primeiroNome, Integer idade) {
		super();
		this.primeiroNome = primeiroNome;
		this.idade = idade;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
