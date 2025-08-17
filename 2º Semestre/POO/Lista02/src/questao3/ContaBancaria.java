package questao3;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

   
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("deposito: " + valor);
        } else {
            System.out.println("valor errado");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("valor errado");
        } else if (valor > saldo) {
            System.out.println("sem saldo");
        } else {
            saldo -= valor;
            System.out.println("saque: " + valor);
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor <= 0) {
            System.out.println("valor errado");
        } else if (valor > saldo) {
            System.out.println("sem saldo pra transferir");
        } else {
            saldo -= valor;
            contaDestino.saldo += valor; 
            System.out.println("transfer: " + valor + " pra " + contaDestino.getTitular());
        }
    }
}

