package entidade;

/**
 * Classe principal que contém o método main.
 * Responsável por instanciar objetos das classes Aluno e PlanoTreino.
 * 
 * <pre>{@code
 * Aluno a1 = new Aluno("josé", 1, -18, 75, 1.80);
 * PlanoTreino t1 = new PlanoTreino("josé esta usando bomba", 3 ,true);
 * }</pre>
 * 
 * <p>Nota: Alguns dados de entrada (como idade negativa ou nome nulo) 
 * podem causar problemas dependendo das validações nas classes Aluno e PlanoTreino.</p>
 * 
 * @author Joao Mick
 */
public class main {

    /**
     * Método principal responsável por executar a aplicação.
     * Aqui são criados alguns objetos das classes Aluno e PlanoTreino para teste.
     * 
     * @param args argumentos de linha de comando (não utilizados aqui)
     */
    public static void main(String[] args) {

        Aluno a1 = new Aluno("josé", 1, -18, 75, 1.80);
        Aluno a2 = new Aluno("André", 2, 18, 35, 2.30);

        PlanoTreino t1 = new PlanoTreino("josé esta usando bomba", 3, true);
        PlanoTreino t2 = new PlanoTreino(null, 1, true);

    }
}
