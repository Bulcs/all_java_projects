import MaquinaRefrigeranteClass.MaquinaRefrigerante;
public class main{
	public static void main(String [] args) {
		MaquinaRefrigerante maquina = new MaquinaRefrigerante(17);
		System.out.println("O pre�o do refrigerante �: ");
		System.out.println(maquina.getPreco());
	}
}
