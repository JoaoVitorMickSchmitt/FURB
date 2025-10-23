package construtech;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class ConstrutechTest {

    @Test // PROF_001
    public void testPROF_001() {
        Profissional p1 = new Profissional();
        p1.setCpf("12345678900");
        p1.setNome("João Silva");

        assertEquals("12345678900", p1.getCpf());
        assertEquals("João Silva", p1.getNome());
    }

    @Test // PROF_002
    public void testPROF_002() {
        Profissional p1 = new Profissional();
        p1.setCpf(null);
        p1.setNome("");

        assertNull(p1.getCpf());
        assertEquals("", p1.getNome());
    }

    @Test // PROF_003
    public void testPROF_003() {
        Empresa empresa = new Empresa();

        ArrayList<Profissional> resp = new ArrayList<>();
        resp.add(new Profissional("Carlos", "111", "Engenheiro", 8000));

        Projeto prj = new Projeto(LocalDate.now(), "Ponte Central", resp,
                LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 31));

        empresa.adicionarObra(prj);

        String resumo = prj.getResumo();
        assertTrue(resumo.contains("Projeto ID"));
        assertTrue(resumo.contains("Duração"));
    }

    @Test // PPUB_001
    public void testPPUB_001() {
        ArrayList<Profissional> resp = new ArrayList<>();
        resp.add(new Profissional("João", "123", "Engenheiro", 5000));

        Projeto p = new Projeto(LocalDate.now(), "Ponte Nova", resp,
                LocalDate.of(2023, 1, 1), LocalDate.of(2023, 1, 31));

        String duracao = p.calcularDuracao();
        assertTrue(duracao.contains("30"));
        assertTrue(p.getResumo().contains("30 dias"));
    }

    @Test // PPUB_002
    public void testPPUB_002() {
        ArrayList<Profissional> resp = new ArrayList<>();
        Profissional prof1 = new Profissional("Carlos", "111", "Engenheiro", 8000);
        resp.add(prof1);
        resp.add(prof1);

        Projeto p = new Projeto(LocalDate.now(), "Duplicado", resp,
                LocalDate.of(2023, 1, 1), LocalDate.of(2023, 2, 1));

        assertEquals(2, resp.size());
        assertTrue(p.getResumo().contains("Duplicado"));
    }

    @Test // PPRIV_001
    public void testPPRIV_001() {
        ArrayList<Profissional> resp = new ArrayList<>();
        resp.add(new Profissional("Ana", "222", "Arquiteta", 7500));

        Empreendimento emp = new Empreendimento(LocalDate.now(), "Condomínio Alpha", resp,
                "RESIDENCIAL", 150.5, "Rua das Flores");

        assertTrue(emp.getResumo().contains("RESIDENCIAL"));
        assertTrue(emp.getResumo().contains("150.5"));
    }

    @Test // PPRIV_002
    public void testPPRIV_002() {
        ArrayList<Profissional> resp = new ArrayList<>();
        resp.add(new Profissional("João", "333", "Engenheiro", 8000));

        Empreendimento emp = new Empreendimento(LocalDate.now(), "Teste", resp,
                "RESIDENCIAL", -10.0, "Rua B");

        assertEquals(-10.0, emp.getResumo().contains("-10") ? -10.0 : -1.0);
    }
}
