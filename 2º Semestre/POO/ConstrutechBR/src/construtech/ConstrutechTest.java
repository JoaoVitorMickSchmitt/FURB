package construtech;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;

public class ConstrutechTest {

    @Test
    public void Teste01() { // PROF_001
        Profissional p1 = new Profissional();
        p1.setCpf("12345678900");
        p1.setNome("João Silva");
        assertEquals("12345678900", p1.getCpf());
        assertEquals("João Silva", p1.getNome());
    }

    @Test
    public void Teste02() { // PROF_002
        Profissional p1 = new Profissional();
        p1.setCpf(null);
        p1.setNome("");
        assertNull(p1.getCpf());
        assertEquals("", p1.getNome());
    }

    @Test
    public void Teste03() { // PROF_003
        Profissional p1 = new Profissional("Carlos", "111", "Engenheiro", 8000);
        ArrayList<Profissional> resp = new ArrayList<>();
        resp.add(p1);

        Projeto prj = new Projeto(LocalDate.now(), "Ponte Central", resp,
                LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 31));

        assertEquals(1, resp.size());
    }

    @Test
    public void Teste04() { // PPUB_001
        Profissional p1 = new Profissional("João", "222", "Fiscal", 5000);
        ArrayList<Profissional> resp = new ArrayList<>();
        resp.add(p1);

        Projeto p = new Projeto(LocalDate.now(), "Teste Duração", resp,
                LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 31));

        assertEquals("30 dias", p.calcularDuracao());
    }

    @Test
    public void Teste05() { // PPUB_002
        Empresa emp = new Empresa();
        Profissional p1 = new Profissional("Carlos", "111", "Engenheiro", 8000);
        emp.adicionarProfissional(p1);

        Profissional duplicado = new Profissional("Carlos", "111", "Engenheiro", 8000);
        emp.adicionarProfissional(duplicado);

        assertDoesNotThrow(() -> emp.adicionarProfissional(p1));
    }

    @Test
    public void Teste06() { // PPRIV_001
        Profissional p2 = new Profissional("Ana", "222", "Arquiteta", 7500);
        ArrayList<Profissional> resp = new ArrayList<>();
        resp.add(p2);

        Empreendimento e = new Empreendimento(LocalDate.now(), "Condomínio Alpha", resp,
                "Residencial", 150.5, "Centro");

        assertEquals(150.5, e.getMetragem());
        assertTrue(e.getResumo().contains("Residencial"));
    }

    @Test
    public void Teste07() { // PPRIV_002
        Profissional p2 = new Profissional("Ana", "222", "Arquiteta", 7500);
        ArrayList<Profissional> resp = new ArrayList<>();
        resp.add(p2);

        Empreendimento e = new Empreendimento(LocalDate.now(), "Casa Teste", resp,
                "Residencial", -10, "Centro");

        assertEquals(-10, e.getMetragem());
    }
}
