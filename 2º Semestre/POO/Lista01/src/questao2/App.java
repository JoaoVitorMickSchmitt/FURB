package questao2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		double altura;
		double peso;
		
		
		System.out.println("qual a sua altura");
		p1.altura = input.nextDouble();
		System.out.println("qual o seu peso");
		p1.peso = input.nextDouble();
		
	
		
		
		double imc = p1.calcularImc();
		System.out.printf("O IMC da pessoa é: %.2f%n", imc);
		
	}
	
}
