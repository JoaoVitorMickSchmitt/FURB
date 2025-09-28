package list6;/**
 * Classe principal que executa testes com as classes Aluno e PlanoTreino
 * @author Carlos Alfredo Isensee
 */
public class Main {

    /**
     * Metodo principal que executa o programa
     * @param args argumento padrao
     */
    public static void main(String[] args) {
        /**
         * Criação de alunos com dados validos
         */
        Aluno aluno1 = new Aluno("Carlos", "0001", 18, 60, 1.80);
        Aluno aluno2 = new Aluno("Farinha", "0002", 18, 150, 1.80);

        /**
         * Cria instrutores validos
         */
        Instrutor instrutor1 = new Instrutor("Farinha", "123456", "Musculação");

        instrutor1.adicionarAluno(aluno1);
        instrutor1.adicionarAluno(aluno2);

        System.out.println("Resumo instrutor 1:");
        System.out.println(instrutor1.getResumo() + "\n");

        /**
         * Cria planos de treinos validos
         */
        PlanoTreino plano1 = new PlanoTreino("BodyBuilder", "Avançado");

        Exercicio ex1 = new Exercicio("Supino Reto", 3, 12, 30);
        Exercicio ex2 = new Exercicio("Agachamento Livre", 4, 10, 60);
        Exercicio ex3 = new Exercicio("Puxada Frontal", 3, 12, 40);
        Exercicio ex4 = new Exercicio("Leg Press", 4, 15, 100);
        Exercicio ex5 = new Exercicio("Elevação Lateral", 3, 15, 10);
        Exercicio ex6 = new Exercicio("Remada Curvada", 4, 10, 50);

        plano1.adicionarExercicio(ex1);
        plano1.adicionarExercicio(ex2);
        plano1.adicionarExercicio(ex3);
        plano1.adicionarExercicio(ex4);
        plano1.adicionarExercicio(ex5);
        plano1.adicionarExercicio(ex6);

        System.out.println("Testes de atribuição de Planos");
        aluno1.setPlanoTreino(plano1);
        aluno2.setPlanoTreino(plano1);
        System.out.println(aluno2.getPlanoTreino());
        System.out.println();


        Instrutor instrutor2 = new Instrutor("Josito", "234567", "Pilates");

        System.out.println("Testes de mentor");
        instrutor1.setMentor(instrutor1);
        instrutor1.setMentor(instrutor2);
        instrutor2.setMentor(instrutor1);
        System.out.println();

        System.out.println(instrutor1.getResumo());
        System.out.println(instrutor2.getResumo());
        System.out.println(plano1.getResumo());

        
        InstrutorMusculacao im1 = new InstrutorMusculacao("kakak", "3333", "musculaçao");
        InstrutorPilates ip1 = new InstrutorPilates("cleito", "5435", "pilates");
        
       System.out.println(instrutor1); 
       System.out.println(im1);
       System.out.println(ip1);
       
      AlunoVip av1 = new AlunoVip("caca", "0002", 25);
      
      System.out.println(aluno1);
      System.out.println(av1.getResumo());
       System.out.println(av1.getDescontoMensalidade());
    }
}