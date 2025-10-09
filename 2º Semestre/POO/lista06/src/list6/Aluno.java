package list6;/**
 * Representa um aluno com nome, matricula, idade, peso e altura
 * Permite alterar os dados do aluno
 */
public class Aluno extends Pessoa {
    /** Nome do aluno */
   

    /** Numero de matricula do aluno */
    private String matricula;

    /** Idade do alumo */
    private int idade;

    /** Peso do aluno */
    private double peso;

    /** Altura do aluno */
    private double altura;

    /**Instrutor do aluno*/
    private Instrutor instrutor;

    /**Plano de Treino*/
    private PlanoTreino planoTreino;

    /**
     * Construtor que recebe, nome, matricula, idade, peso, altura
     * Caso receba valores negativos em idade, peso ou altura define um valor padrão
     * @param nome Nome do aluno
     * @param matricula Matricula do aluno
     * @param idade Idade do aluno
     * @param peso Peso do aluno
     * @param altura Altura do aluno
     */
    public Aluno(String nome,String cpf, String matricula, int idade, double peso, double altura) {
    	super(nome, cpf);
        this.matricula = matricula;
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade invalida, valor padrão definido");
            this.idade = 0;
        }
        if (peso >= 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso invalido, valor padrão definido");
        }

        if (altura >= 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura invalida, valor padrão definido");
        }
    }

    /**
     * Construtor que recebe nome e matricula
     * E define os outros dados como matricula, idade, peso e altura com valores padrões
     * @param nome Nome do aluno
     * @param matricula Matricula do aluno
     */
    public Aluno(String nome, String cpf, String matricula) {
    	super(nome, cpf);
        this.matricula = matricula;
    }
    

	/**
     * Construtor vazio, nenhum campo é iniciado
     */
    public Aluno() {
    	super(null, null);
    }

    


    public Aluno(String nome, String matricula) {
		super(nome);
		this.matricula = matricula;
	}

	/**
     * Retorna a matricula do aluno
     * @return Matricula do aluno
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define a matricula do aluno
     * @param matricula Nova matricula do aluno
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Retorna a idade do aluno
     * @return Idade do aluno
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade do aluno
     * @param idade Nova idade do aluno
     */
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade invalida, valor padrão definido");
        } else {
            this.idade = idade;
        }
    }

    /**
     * Retorna o peso do aluno
     * @return Peso do aluno
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Define o pesdo do aluno
     * @param peso Novo peso do aluno
     */
    public void setPeso(double peso) {
        if (peso < 0) {
            System.out.println("Peso Invalido, valor padrão definido");
        } else {
            this.peso = peso;
        }
    }

    /**
     * Retorna a altura do aluno
     * @return Altura do aluno
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Define a altura do aluno
     * @param altura Nova altura do aluno
     */
    public void setAltura(double altura) {
        if (altura < 0) {
            System.out.println("Altura invalida, valor padrão definido");
        } else {
            this.altura = altura;
        }
    }

    /**
     * Retorna o instrutor do aluno
     * @return Instrutor do aluno
     */
    public Instrutor getInstrutor() {
        return instrutor;
    }

    /**
            * Define o instrutor do aluno
     * @param instrutor Novo instrutor do aluno
     */
    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public PlanoTreino getPlanoTreino() {
        return planoTreino;
    }

    public void setPlanoTreino(PlanoTreino planoTreino) {
        if (planoTreino.isAtivo()) {
            this.planoTreino = planoTreino;
            planoTreino.desativar();
        } else {
            System.out.println("Plano ja utilizado");
        }
    }

	
	
    @Override
    public String toString() {
        return getResumo();
    }
    @Override
	public String getResumo() {
		return "Aluno [nome=" + getNome() + ", matricula=" + matricula + ", idade=" + idade + ", peso=" + peso + ", altura="
				+ altura + ", instrutor=" + instrutor + ", planoTreino=" + planoTreino + "]";
	}
    
    
    
    
}
