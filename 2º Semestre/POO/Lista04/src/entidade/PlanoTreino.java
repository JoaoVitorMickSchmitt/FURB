package entidade;

/**
 * Representa um plano de treino com uma descrição, nível de dificuldade e status (ativo ou inativo).
 * 
 * <p>Esta classe permite criar planos de treino com diferentes níveis e definir se o plano está ativo.</p>
 * 
 * <p>Nota: O construtor que recebe a descrição lança uma exceção se a descrição estiver em branco.</p>
 * 
 */
public class PlanoTreino {

    private String descricao;
    private int nivel;
    private boolean ativo;

    /**
     * Construtor que inicializa um plano de treino com descrição, nível e status.
     * 
     * @param descricao descrição do plano de treino
     * @param nivel nível de dificuldade do plano
     * @param ativo status do plano (true se ativo)
     * 
     * @throws IllegalArgumentException se a descrição estiver em branco
     */
    public PlanoTreino(String descricao, int nivel, boolean ativo) {
        this.descricao = descricao;
        this.nivel = nivel;
        this.ativo = ativo;
        if (this.descricao.isBlank()) {
            throw new IllegalArgumentException("A descrição se encontra vazia");
        }
    }

    /**
     * Construtor que inicializa um plano de treino com nível e status, sem descrição.
     * 
     * @param nivel nível de dificuldade do plano
     * @param ativo status do plano (true se ativo)
     */
    public PlanoTreino(int nivel, boolean ativo) {
        this.nivel = nivel;
        this.ativo = ativo;
    }

    /**
     * Retorna a descrição do plano de treino.
     * 
     * @return descrição do plano
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do plano de treino.
     * 
     * @param descricao nova descrição do plano
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna o nível de dificuldade do plano.
     * 
     * @return nível do plano
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Define o nível de dificuldade do plano.
     * 
     * @param nivel novo nível do plano
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Verifica se o plano está ativo.
     * 
     * @return true se o plano estiver ativo, false caso contrário
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Define o status do plano (ativo ou inativo).
     * 
     * @param ativo novo status do plano
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * Ativa o plano de treino.
     */
    public void ativar() {
        this.ativo = true;
    }

    /**
     * Desativa o plano de treino.
     */
    public void desativar() {
        this.ativo = false;
    }

}
