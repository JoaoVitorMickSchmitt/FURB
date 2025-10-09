package list6;
import java.util.ArrayList;

public class Instrutor extends Pessoa {
    
    private String cref;
    private String especialidade;
    private ArrayList<Aluno> alunos;
    private Instrutor mentor;

    
    public Instrutor(String nome, String cpf, String cref, String especialidade) {
    	super(nome, cpf);
        this.cref = cref;
        this.especialidade = especialidade;
        alunos = new ArrayList<>();
    }

    public Instrutor() {
    	super(null,null);
        alunos = new ArrayList<>();
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

    @Override
	public String getResumo() {
        System.out.print("Alunos{");
        for (Aluno a : alunos) {
            System.out.print(a.getNome() + ", ");
        }
        System.out.print("}\n");
        try {
            return "Instrutor{" +
                    "nome='" + getNome() + '\'' +
                    ", cref='" + cref + '\'' +
                    ", especialidade='" + especialidade + '\'' +
                    ", mentor=" + mentor.getNome() +
                    '}';
        } catch (NullPointerException ex) {
            return "Instrutor{" +
                    "nome='" + getNome() + '\'' +
                    ", cref='" + cref + '\'' +
                    ", especialidade='" + especialidade + '\'' +
                    ", mentor= Sem mentor" +
                    '}';
        }
    }
}
