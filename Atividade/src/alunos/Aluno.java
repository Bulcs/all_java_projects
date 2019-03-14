package alunos;

import prova.Prova;

public class Aluno {
	protected double prova1_;
	protected double prova2_;
	
	Prova prova1 = new Prova();
	Prova prova2 = new Prova();
	//SETTERS
	public void setProva1() {
		prova1 = new Prova();
		prova1.setNota1(7);
		prova1.setNota2(8);
		this.prova1_ = prova1.calcularNotaTotal();
	}
	public void setProva2() {
		prova2 = new Prova();
		prova2.setNota1(5);
		prova2.setNota2(7);
		this.prova2_ = prova2.calcularNotaTotal();
	}
	//GETTERS
	public double calcularMedia() {
		return ((prova1_ + prova2_)/2);
	}
}
