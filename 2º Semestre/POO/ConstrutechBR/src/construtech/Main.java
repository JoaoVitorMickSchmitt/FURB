package construtech;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Profissional p1 = new Profissional("Carlos", "111", "Engenheiro", 8000);
        Profissional p2 = new Profissional("Ana", "222", "Arquiteta", 7500);

        empresa.adicionarProfissional(p1);
        empresa.adicionarProfissional(p2);

        ArrayList<Profissional> resp1 = new ArrayList<>();
        resp1.add(p1);

        ArrayList<Profissional> resp2 = new ArrayList<>();
        resp2.add(p2);

        Projeto pr1 = new Projeto(LocalDate.now(), "Ponte Central", resp1,
                LocalDate.of(2024, 1, 10), LocalDate.of(2024, 3, 20));

        Empreendimento em1 = new Empreendimento(LocalDate.now(), "Condomínio Alpha", resp2,
                "Urbana", 12000, "Rua das Flores");

        empresa.adicionarObra(pr1);
        empresa.adicionarObra(em1);

        empresa.relatorioCompleto();
        empresa.relatorioPorTipo("Projeto");
        empresa.relatorioResumido();
    }
}
