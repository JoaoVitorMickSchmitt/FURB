package entidade;

/**
 * Classe principal para testar as entidades da academia.
 */
public class Main {

    public static void main(String[] args) {

        // Criar instrutores
        Instrutor i1 = new Instrutor("Carlos Silva", "12345-G", "Musculação");
        Instrutor i2 = new Instrutor("Ana Souza", "67890-H", "Crossfit");
        i1.setMentor(i2);

        // Criar alunos
        Aluno a1 = new Aluno("José", 1, 18, 75, 1.80);
        Aluno a2 = new Aluno("André", 2, 22, 70, 1.75);

        // Associar alunos a instrutor
        i1.adicionarAluno(a1);
        i1.adicionarAluno(a2);

        // Criar plano de treino para José
        PlanoTreino t1 = new PlanoTreino("Treino de hipertrofia", 3, true, a1);
        a1.setPlanoTreino(t1);

        // Adicionar exercícios ao plano
        Exercicio e1 = new Exercicio("Supino Reto", 3, 12, 30.5);
        Exercicio e2 = new Exercicio("Agachamento Livre", 4, 10, 40);

        t1.adicionarExercicio(e1);
        t1.adicionarExercicio(e2);

        // Exibir informações
        System.out.println(i1.getResumo());
        System.out.println("Mentor: " + i1.getMentor().getNome());

        System.out.println("Aluno: " + a1.getNome() + " -> Instrutor: " + a1.getInstrutor().getNome());
        System.out.println("Plano de treino: " + t1.getDescricao());

        for (Exercicio ex : t1.getExercicios()) {
            System.out.println(" - " + ex.getResumo());
        }
    }
}
