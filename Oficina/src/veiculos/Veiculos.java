package veiculos;

public class Veiculos {
	private String marca;
	protected int ano;
	protected int km;
	protected float preco;
	protected int prestacoes;
	protected float performance;
	
	//GETTERS
	public String getMarca() {
		return marca;
	}
	public int getAno() {
		return ano;
	}
	public int getKm() {
		return km;
	}
	public float getPreco() {
		return km;
	}
	public float getPerformance() {
		return performance;
	}
	
	
	//SETTERS
	public void setMarca(String m) {
		this.marca = m;
	}
	public void setAno(int a) {
		this.ano = a;
	}
	public void setKm(int k) {
		this.km = k;
	}
	public void setPreco(float p) {
		this.preco = p;
	}
	public void setPerformance(float p) {
		this.performance = p;
	}
}













