package banco;

public class Main {
    public static void main(String[] args) {
        BancoSimulacao banco = new BancoSimulacao(10, 10);

        // Clientes entram nas filas com hora de chegada definida
        banco.adicionarCliente(new RegistroAtendimento(1, "Normal", 0, 6));       // chegou no minuto 0
        banco.adicionarCliente(new RegistroAtendimento(2, "Prioritario", 0, 7));  // chegou no minuto 0
        banco.adicionarCliente(new RegistroAtendimento(3, "Normal", 0, 5));       // chegou no minuto 0
        banco.adicionarCliente(new RegistroAtendimento(4, "Prioritario", 4, 4));  // chegou no minuto 4

        // Simulação: percorre o tempo de 0 até 20 minutos
        for (int horaAtual = 0; horaAtual <= 20; horaAtual++) {
            banco.chamarProximo(1, horaAtual);
            banco.chamarProximo(2, horaAtual);
            banco.chamarProximo(3, horaAtual);
        }

        // Relatório completo (histórico + métricas)
        banco.imprimirRelatorio();
    }
}
 