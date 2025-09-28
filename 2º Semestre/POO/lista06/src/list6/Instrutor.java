package list6;
import java.util.ArrayList;

public class Instrutor {
    private String nome;
    private String cref;
    private String especialidade;
    private ArrayList<Aluno> alunos;
    private Instrutor mentor;

    public Instrutor(String nome, String cref, String especialidade) {
        this.nome = nome;
        this.cref = cref;
        this.especialidade = especialidade;
        alunos = new ArrayList<>();
    }

    public Instrutor() {
        alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Instrutor getMentor() {
        return mentor;
    }

    public void setMentor(Instrutor mentor) {
        if (mentor.equals(this)) {
            System.out.println("Mentor invalido");
        } else {
            this.mentor = mentor;
        }
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        aluno.setInstrutor(this);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
        aluno.setInstrutor(null);
    }

    @Override
    public String toString() {
        return getResumo();
    }

   
	public String getResumo() {
        System.out.print("Alunos{");
        for (Aluno a : alunos) {
            System.out.print(a.getNome() + ", ");
        }
        System.out.print("}\n");
        try {
            return "Instrutor{" +
                    "nome='" + nome + '\'' +
                    ", cref='" + cref + '\'' +
                    ", especialidade='" + especialidade + '\'' +
                    ", mentor=" + mentor.getNome() +
                    '}';
        } catch (NullPointerException ex) {
            return "Instrutor{" +
                    "nome='" + nome + '\'' +
                    ", cref='" + cref + '\'' +
                    ", especialidade='" + especialidade + '\'' +
                    ", mentor= Sem mentor" +
                    '}';
        }
    }
}
