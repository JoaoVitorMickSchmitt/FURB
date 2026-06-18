package banco;

public class RegistroAtendimento {
    private int idCliente;
    private String tipo; // "Normal" ou "Prioritario"
    private int horaChegada; // em minutos simulados
    private int tempoAtendimento; // entre 2 e 30
    private int horaInicio; // definido quando começa
    private int horaFim; // calculado

    public RegistroAtendimento(int idCliente, String tipo, int horaChegada, int tempoAtendimento) {
        this.idCliente = idCliente;
        this.tipo = tipo;
        this.horaChegada = horaChegada;
        this.tempoAtendimento = tempoAtendimento;
        this.horaInicio = -1;
        this.horaFim = -1;
    }

    public int calcularTempoEspera() {
        if (horaInicio == -1) return 0;
        return horaInicio - horaChegada;
    }

    public void iniciarAtendimento(int horaAtual) {
        this.horaInicio = horaAtual;
        this.horaFim = horaAtual + tempoAtendimento;
    }

    @Override
    public String toString() {
        return "\nCliente " + idCliente + " (" + tipo + ") - Chegada: " + horaChegada +
               " - Início: " + horaInicio +
               " - Saída: " + horaFim +
               " - Espera: " + calcularTempoEspera() + " min";
    }


    public int getHoraFim() { return horaFim; }
    public int getHoraInicio() { return horaInicio; }
    public int getHoraChegada() { return horaChegada; }
    public int getTempoAtendimento() { return tempoAtendimento; }
    public String getTipo() { return tipo; }
}
