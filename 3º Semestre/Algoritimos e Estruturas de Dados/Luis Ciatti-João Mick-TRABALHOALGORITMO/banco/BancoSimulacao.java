package banco;

import fila.FilaVetor;
import pilha.PilhaVetor;

public class BancoSimulacao {
    private FilaVetor<RegistroAtendimento> filaNormal;
    private FilaVetor<RegistroAtendimento> filaPrioridade;
    private Guiche[] guiches;

    public BancoSimulacao(int limiteFilaNormal, int limiteFilaPrioridade) {
        this.filaNormal = new FilaVetor<>(limiteFilaNormal);
        this.filaPrioridade = new FilaVetor<>(limiteFilaPrioridade);

        // Cria 3 guichês: 1 preferencial e 2 gerais
        this.guiches = new Guiche[3];
        guiches[0] = new Guiche(1, "Preferencial", 50);
        guiches[1] = new Guiche(2, "Geral", 50);
        guiches[2] = new Guiche(3, "Geral", 50);
    }

    public void adicionarCliente(RegistroAtendimento cliente) {
        if ("Prioritario".equalsIgnoreCase(cliente.getTipo())) {
            filaPrioridade.inserir(cliente);
        } else {
            filaNormal.inserir(cliente);
        }
    }

    public void chamarProximo(int idGuiche, int horaAtual) {
        if (idGuiche >= 1 && idGuiche <= 3) {
            Guiche g = guiches[idGuiche - 1];
            g.atender(filaNormal, filaPrioridade, horaAtual);
        }
    }

    public void imprimirRelatorio() {
        // Histórico por guichê
        for (Guiche g : guiches) {
            g.consultarHistorico();
        }

        // --- Métricas ---
        int totalAtendimentos = 0;
        int atendimentosNormais = 0;
        int atendimentosPrioritarios = 0;
        long somaEsperaTotal = 0;
        long somaEsperaNormais = 0;
        long somaEsperaPrioritarios = 0;

        // Contagem por guichê
        int[] atendimentosPorGuiche = new int[guiches.length];

        for (int i = 0; i < guiches.length; i++) {
            Guiche g = guiches[i];
            PilhaVetor<RegistroAtendimento> historico = g.getHistorico();
            atendimentosPorGuiche[i] = historico.getTamanho();

            for (int j = 0; j < historico.getTamanho(); j++) {
                RegistroAtendimento cliente = historico.getElement(j);
                totalAtendimentos++;
                somaEsperaTotal += cliente.calcularTempoEspera();

                if ("Prioritario".equalsIgnoreCase(cliente.getTipo())) {
                    atendimentosPrioritarios++;
                    somaEsperaPrioritarios += cliente.calcularTempoEspera();
                } else {
                    atendimentosNormais++;
                    somaEsperaNormais += cliente.calcularTempoEspera();
                }
            }
        }

        System.out.println("\n--- Métricas ---");
        System.out.println("Total de atendimentos: " + totalAtendimentos);
        System.out.println("Atendimentos prioritários: " + atendimentosPrioritarios);
        System.out.println("Atendimentos normais: " + atendimentosNormais);

        for (int i = 0; i < guiches.length; i++) {
            System.out.println("Guichê " + guiches[i].getIdGuiche() +
                               " (" + guiches[i].getTipo() + ") realizou " +
                               atendimentosPorGuiche[i] + " atendimentos.");
        }

        if (totalAtendimentos > 0) {
            double tempoMedioTotal = (double) somaEsperaTotal / totalAtendimentos;
            System.out.println("Tempo médio de espera total: " + tempoMedioTotal + " min");
        }
        if (atendimentosPrioritarios > 0) {
            double tempoMedioPrioritarios = (double) somaEsperaPrioritarios / atendimentosPrioritarios;
            System.out.println("Tempo médio de espera prioritários: " + tempoMedioPrioritarios + " min");
        }
        if (atendimentosNormais > 0) {
            double tempoMedioNormais = (double) somaEsperaNormais / atendimentosNormais;
            System.out.println("Tempo médio de espera normais: " + tempoMedioNormais + " min");
        }
    }

    public Guiche[] getGuiches() {
        return guiches;
    }
}
