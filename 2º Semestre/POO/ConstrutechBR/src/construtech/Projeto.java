package construtech;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Projeto extends Obra {
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Projeto(LocalDate dataInclusao, String descricao, ArrayList<Profissional> responsaveis,
                   LocalDate dataInicio, LocalDate dataFim) {
        super(dataInclusao, descricao, responsaveis);
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String calcularDuracao() {
        if (dataInicio != null && dataFim != null) {
            long dias = ChronoUnit.DAYS.between(dataInicio, dataFim);
            return dias + " dias";
        }
        return "Sem datas definidas";
    }

    public String getResumo() {
        return "Projeto ID " + getId() + ": " + getDescricao() +
               " | Duração: " + calcularDuracao();
    }

    public String getResumoReduzido() {
        return "Projeto " + getId() + ": " + getDescricao();
    }
}
