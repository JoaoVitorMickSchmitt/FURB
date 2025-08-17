package questao2;

public class Main {
	public static void main(String[] args) {
        Produto p1 = new Produto();

        
        p1.setNome("Camiseta");
        p1.setPreco(50.0);
        p1.repor(10); 

        System.out.println("Produto: " + p1.getNome());
        System.out.println("Preço: R$" + p1.getPreco());
        System.out.println("Estoque inicial: " + p1.getEstoque());

        
        p1.vender(3);   // funcionando
        p1.vender(20);  // nao funcionando

       
        p1.repor(5);   // funcionando
        p1.repor(-2);  // nao funcionando

        
        p1.setPreco(80.0);   // funcionando
        p1.setPreco(-10.0);  // nao funcionando

        
        System.out.println("\n resultado final ");
        System.out.println("Produto: " + p1.getNome());
        System.out.println("Preço: R$" + p1.getPreco());
        System.out.println("Estoque: " + p1.getEstoque());
    }
}
