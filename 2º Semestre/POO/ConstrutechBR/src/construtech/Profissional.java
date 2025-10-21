package construtech;
public class Profissional {
    private int id;
    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private static int control;

    public Profissional(String nome, String cpf, String cargo, double salario) {
        this.id = control;
        control++;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Profissional() {
        this.id = control;
        control++;
    }
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
