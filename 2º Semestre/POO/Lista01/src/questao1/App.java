package questao1;

public class App {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.altura = 1.75;
		p1.peso = 78.0;
		
		double imc = p1.calcularImc();
		System.out.printf("O IMC da pessoa é: %.2f%n", imc);
	}
	
}
