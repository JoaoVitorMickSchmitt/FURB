package questao2;

public class Produto {
	 
    private String nome;
    private double preco;
    private int estoque;

    
    public boolean vender(int quantidade) {
        if (quantidade > 0 && quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("venda realizada: " + quantidade + " unidades");
            return true;
        } else {
            System.out.println("venda não realizada. estoque insuficiente ou quantidade inválida");
            return false;
        }
    }

   
    public void repor(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
            System.out.println("reposto: " + quantidade + " unidades.");
        } else {
            System.out.println("quantidade inválida para reposição.");
        }
    }

   
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("preço inválido tem que ser positivo.");
        }
    }

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("nome inválido");
        }
    }

  
    public int getEstoque() {
        return estoque;
    }
}
