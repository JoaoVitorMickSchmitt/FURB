package exercicio6Encadeada;
public class TesteFila {
    public static void main(String[] args) {

        // Caso 1
        FilaLista<Integer> fila = new FilaLista<>();
        System.out.println(fila.estaVazia()); // true

        // Caso 2
        fila.inserir(10);
        System.out.println(fila.estaVazia()); // false

        // Caso 3
        fila.inserir(20);
        fila.inserir(30);

        System.out.println(fila.retirar()); // 10
        System.out.println(fila.retirar()); // 20
        System.out.println(fila.retirar()); // 30
        System.out.println(fila.estaVazia()); // true

        // Caso 4
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        System.out.println(fila.peek()); // 10
        System.out.println(fila.retirar()); // 10

        // Caso 5
        fila.liberar();
        System.out.println(fila.estaVazia()); // true
    }
}