package questao4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);

	        Pessoa[] pessoas = new Pessoa[3];

	       
	   for (int i = 0; i < pessoas.length; i++) {
	      pessoas[i] = new Pessoa();

	      System.out.printf("Digite o nome da pessoa %d: ", i + 1);
	      pessoas[i].nome = input.next();

	      System.out.printf("Digite a altura da pessoa %d (em metros): ", i + 1);
	      pessoas[i].altura = input.nextDouble();

	      System.out.printf("Digite o peso da pessoa %d (em kg): ", i + 1);
	       pessoas[i].peso = input.nextDouble();

	      
	       System.out.println();
	        }

	     
	        System.out.println("ordem inversa");
	        for (int i = pessoas.length - 1; i >= 0; i--) {
	            double imc = pessoas[i].calcularImc();
	            System.out.printf(
	                "Nome: %s | Peso: %.2f kg | Altura: %.2f m | IMC: %.2f%n",
	                pessoas[i].nome, pessoas[i].peso, pessoas[i].altura, imc
	            );
	        }
	    }
	}