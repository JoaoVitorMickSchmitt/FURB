package lista02;

public class Main {
    public static void main(String[] args) {
        
        ListaEstatica<Integer> lista = new ListaEstatica();
        
        System.out.println("Está vazia? " + lista.estaVazia());
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.inserir(25);

        
        lista.inverter();
        
    }
}