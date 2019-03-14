package prova;


public class Prova {
	protected double notaParte1;
	protected double notaParte2;
	
	//GETTER
		public double calcularNotaTotal() {
			return this.notaParte1 + this.notaParte2;
		}
	//SETTER
		public void setNota1(int n1){
			this.notaParte1 = n1;
		}
		public void setNota2(int n2) {
			this.notaParte2 = n2;
		}	
}
