package list6;
import java.util.ArrayList;

/** Representa um plano de treino com descrição, nivel e estado de ativação.
 * Permite desativar e ativar o plano, e alterar os valores dos planos
 */

public class PlanoTreino {
    /** Descrição do plano */
    private String descicao;

    /** Nivel do plano (basico, intermediario, avançado, etc)*/
    private String nivel;

    /** Estado de ativação do plano*/
    private boolean ativo;

    /**Exercicios do plano*/
     private ArrayList<Exercicio> exercicios;

    /**
     * Construtor que recebe a descrição e o nivel do plano
     * Aplica valores padrão caso a descricão tenha menos que 4 caracteres
     * @param descicao Descricao do plano
     * @param nivel Nivel do plano
     */
    public PlanoTreino(String descicao, String nivel) {
        if (descicao.length() <= 4) {
            System.out.println("Descrição insuficiente, valor padrão definido");
            this.descicao = "Treino Desconhecido";
        } else {
            this.descicao = descicao;
        }

        if (nivel.length() <= 4) {
            System.out.println("Nivel insuficiente, valor padrão definido");
            this.descicao = "Nivel Desconhecido";
        } else {
            this.descicao = descicao;
        }
        this.ativo = true;

        exercicios = new ArrayList<>();
    }

    /**
     * Construtor que recebe a apenas a descrição e
     * define o nivel como um valor padrão "Nivel Desconhecido"
     * @param descicao Descrição do plano
     */

    public PlanoTreino(String descicao) {
        if (descicao.length() <= 4) {
            System.out.println("Necessario descrição, valor padrão definido");
            this.descicao = "Treino Desconhecido";
        } else {
            this.descicao = descicao;
        }
        this.descicao = "Nivel Desconhecido";
        this.ativo = true;

        exercicios = new ArrayList<>();
    }

    /**
     * Construtor vazio, nenhum campo é iniciado
     */
    public PlanoTreino() {
        exercicios = new ArrayList<>();
    }

    /**
     * Ativa o plano
     */
    public void ativar() {
        this.ativo = true;
    }

    /**
     * Desativa o plano
     */
    public void desativar() {
        this.ativo = false;
    }

    /**
     * Retorna a descrição do plano
     * @return Descrição do plano
     */
    public String getDescicao() {
        return descicao;
    }

    /**
     * Define a descrição do plano
     * Caso o valor informado tenha menos que 4 caracteres, define um valor padrão
     * @param descicao Nova descrição do plano
     */
    public void setDescicao(String descicao) {
        if (descicao.length() <= 4) {
            System.out.println("Descrição insuficiente, valor padrão definido");
            this.descicao = "Treino Desconhecido";
        } else {
            this.descicao = descicao;
        }
    }

    /**
     * Retorna o nivel do plano
     * @return Nivel do Plano
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Define o nivel do plano
     * @param nivel Novo nivel do Plano
     */
    public void setNivel(String nivel) {
        if (nivel.length() <= 4) {
            System.out.println("Nivel insuficiente, valor padrão definido");
            this.descicao = "Nivel Desconhecido";
        } else {
            this.descicao = descicao;
        }
        this.nivel = nivel;
    }

    /**
     * Retorna o estado de ativação do plano
     * @return Estado de ativação
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Define o estado de ativação do plano
     * @param ativo Novo estado de ativação
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public ArrayList<Exercicio> getExercicios() {
        return exercicios;
    }

    public void adicionarExercicio(Exercicio exercicio) {
        exercicios.add(exercicio);
    }

    public void removerExercicio(Exercicio exercicio) {
        exercicios.remove(exercicio);
    }

    public String getResumo() {
        System.out.print("Exercicios{");
        for (Exercicio ex : exercicios) {
            System.out.print(ex.getNome() + ", ");
        }
        System.out.println("} ");
        return "PlanoTreino{" +
                "descicao='" + descicao + '\'' +
                ", nivel='" + nivel + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
