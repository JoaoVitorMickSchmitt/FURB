package construtech;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Obra {
    private static int contador = 1;
    private int id;
    private LocalDate dataInclusao;
    private String descricao;
    private ArrayList<Profissional> responsaveis;

    public Obra(LocalDate dataInclusao, String descricao, ArrayList<Profissional> responsaveis) {
        this.id = contador++;
        this.dataInclusao = dataInclusao;
        this.descricao = descricao;
        this.responsaveis = responsaveis;
    }

    public int getId() { return id; }
    public String getDescricao() { return descricao; }

    public abstract String getResumo();
    public abstract String getResumoReduzido();
}
