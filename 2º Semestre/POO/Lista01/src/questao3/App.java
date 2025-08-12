package questao3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		 for (int i = 1; i <= 3; i++) {
	            Pessoa p = new Pessoa();

	            System.out.printf("Digite a altura da pessoa %d (em metros): ", i);
	            p.altura = input.nextDouble();

	            System.out.printf("Digite o peso da pessoa %d (em kg): ", i);
	            p.peso = input.nextDouble();

	            double imc = p.calcularImc();
	            System.out.printf("O IMC da pessoa %d é: %.2f%n", i, imc);
	            System.out.println("----------------------------");
	        }
		

	}

}
