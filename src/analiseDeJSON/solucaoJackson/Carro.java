package analiseDeJSON.solucaoJackson;

public class Carro {
	private String cor;
	private Integer anoDeFabricacao;

	public Carro() {
		
	}
	
	public Carro(String cor, Integer anoDeFabricacao) {
		super();
		this.cor = cor;
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(Integer anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

}
