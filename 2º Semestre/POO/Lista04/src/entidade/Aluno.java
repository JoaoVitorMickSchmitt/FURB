package entidade;

/**
 * Representa um aluno com informações como nome, matrícula, idade, peso e altura.
 * 
 * <p>Permite a criação de objetos Aluno com diferentes níveis de detalhe 
 * (com ou sem idade, peso e altura) e fornece métodos para acessar e modificar seus atributos.</p>
 * 
 * <p>Nota: O construtor completo lança uma exceção se a idade informada for negativa.</p>
 * 
 */
public class Aluno {

    private String nome;
    private int matricula;
    private int idade;
    private double peso;
    private double altura;

    /**
     * Construtor que inicializa todos os atributos do aluno.
     * 
     * @param nome nome do aluno
     * @param matricula número de matrícula do aluno
     * @param idade idade do aluno (não pode ser negativa)
     * @param peso peso do aluno (em kg)
     * @param altura altura do aluno (em metros)
     * 
     * @throws IllegalArgumentException se a idade for negativa
     */
    public Aluno(String nome, int matricula, int idade, double peso, double altura) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        if (this.idade < 0) {
            throw new IllegalArgumentException("A idade está negativa");
        }
    }

    /**
     * Construtor que inicializa apenas o nome e a matrícula do aluno.
     * 
     * @param nome nome do aluno
     * @param matricula número de matrícula do aluno
     */
    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    /**
     * Retorna o nome do aluno.
     * 
     * @return nome do aluno
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do aluno.
     * 
     * @param nome novo nome do aluno
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a matrícula do aluno.
     * 
     * @return número de matrícula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * Define a matrícula do aluno.
     * 
     * @param matricula nova matrícula
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * Retorna a idade do aluno.
     * 
     * @return idade do aluno
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade do aluno.
     * 
     * @param idade nova idade do aluno
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Retorna o peso do aluno.
     * 
     * @return peso do aluno em kg
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Define o peso do aluno.
     * 
     * @param peso novo peso do aluno em kg
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Retorna a altura do aluno.
     * 
     * @return altura do aluno em metros
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Define a altura do aluno.
     * 
     * @param altura nova altura do aluno em metros
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

}
