package questao1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[5];

        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = new Funcionario();

            System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
            String nome = input.next(); 
            funcionarios[i].setNome(nome);

            System.out.print("Digite o salário de " + funcionarios[i].getNome() + ": ");
            double salario = input.nextDouble();
            funcionarios[i].setSalario(salario);
        }

        System.out.println("\n lista de funcionários");
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.printf("Nome: %s | Salário: R$ %.2f | IRPF: R$ %.2f%n",
                    funcionarios[i].getNome(),
                    funcionarios[i].getSalario(),
                    funcionarios[i].calcularIrpf());
        }

	}

}
