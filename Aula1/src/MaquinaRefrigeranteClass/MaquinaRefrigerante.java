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
	//Retorna Pre�o
	public int getPreco() {
		return preco;
	}
	//Retorna Balan�o
	public int getBalanco() {
		return balanco;
	}
}