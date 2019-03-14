package MaquinaRefrigeranteClass;
public class MaquinaRefrigerante {
	
	private int preco;
	private int balanco;
	private int total;
	
	public MaquinaRefrigerante(int valor) {
		preco = valor;
		balanco = 0;
		total = 0;
	}
	//Retorna Preço
	public int getPreco() {
		return preco;
	}
	//Retorna Balanço
	public int getBalanco() {
		return balanco;
	}
}