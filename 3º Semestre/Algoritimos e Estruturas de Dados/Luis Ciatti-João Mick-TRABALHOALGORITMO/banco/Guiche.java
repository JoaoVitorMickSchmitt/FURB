package banco;

import fila.FilaVetor;
import pilha.PilhaVetor;

public class Guiche {
    private int idGuiche;
    private String tipo; // "Preferencial" ou "Geral"
    private PilhaVetor<RegistroAtendimento> historico;
    private String ultimoTipoAtendido;
    private int horaFimAtendimento; // controla quando o guichê fica livre (em minutos simulados)

    public Guiche(int idGuiche, String tipo, int limiteHistorico) {
        this.idGuiche = idGuiche;
        this.tipo = tipo;
        this.historico = new PilhaVetor<>(limiteHistorico);
        this.ultimoTipoAtendido = null;
        this.horaFimAtendimento = 0;
    }

    // ✅ Getters adicionados
    public int getIdGuiche() {
        return idGuiche;
    }

    public String getTipo() {
        return tipo;
    }

    public PilhaVetor<RegistroAtendimento> getHistorico() {
        return historico;
    }

    public void atender(FilaVetor<RegistroAtendimento> filaNormal,
                        FilaVetor<RegistroAtendimento> filaPrioridade,
                        int horaAtual) {
        if (horaAtual < horaFimAtendimento) {
            return;
        }

        RegistroAtendimento cliente = null;

        if (tipo.equalsIgnoreCase("Preferencial")) {
            if (!filaPrioridade.estaVazia()) {
                cliente = filaPrioridade.retirar();
            } else if (!filaNormal.estaVazia()) {
                cliente = filaNormal.retirar();
            }
        } else { // Guichê Geral
            if (ultimoTipoAtendido == null) {
                if (!filaNormal.estaVazia()) {
                    cliente = filaNormal.retirar();
                } else if (!filaPrioridade.estaVazia()) {
                    cliente = filaPrioridade.retirar();
                }
            } else if ("Prioritario".equalsIgnoreCase(ultimoTipoAtendido) && !filaNormal.estaVazia()) {
                cliente = filaNormal.retirar();
            } else if ("Normal".equalsIgnoreCase(ultimoTipoAtendido) && !filaPrioridade.estaVazia()) {
                cliente = filaPrioridade.retirar();
            } else {
                if (!filaPrioridade.estaVazia()) {
                    cliente = filaPrioridade.retirar();
                } else if (!filaNormal.estaVazia()) {
                    cliente = filaNormal.retirar();
                }
            }
        }

        if (cliente != null) {
            int inicioAtendimento = (horaAtual < cliente.getHoraChegada())
                    ? cliente.getHoraChegada()
                    : horaAtual;

            cliente.iniciarAtendimento(inicioAtendimento);
            historico.push(cliente);
            ultimoTipoAtendido = cliente.getTipo();
            horaFimAtendimento = cliente.getHoraFim();
        }
    }

    public void consultarHistorico() {
        System.out.println("Histórico do guichê " + idGuiche + " (" + tipo + "): " + historico.toString());
    }
}
