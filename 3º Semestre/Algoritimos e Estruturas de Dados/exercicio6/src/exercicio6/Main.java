package exercicio6;

public class Main {

    public static void main(String[] args) {

        // CASO 1
        System.out.println("Caso 1:");
        FilaVetor<Integer> fila1 = new FilaVetor<>(5);
        System.out.println("Fila vazia? " + fila1.estaVazia()); // true


        // CASO 2
        System.out.println("\nCaso 2:");
        FilaVetor<Integer> fila2 = new FilaVetor<>(5);
        fila2.inserir(10);
        System.out.println("Fila vazia? " + fila2.estaVazia()); // false


        // CASO 3
        System.out.println("\nCaso 3:");
        FilaVetor<Integer> fila3 = new FilaVetor<>(10);
        fila3.inserir(10);
        fila3.inserir(20);
        fila3.inserir(30);

        System.out.println(fila3.retirar()); // 10
        System.out.println(fila3.retirar()); // 20
        System.out.println(fila3.retirar()); // 30
        System.out.println("Fila vazia? " + fila3.estaVazia()); // true


        // CASO 4
        System.out.println("\nCaso 4:");
        try {
            FilaVetor<Integer> fila4 = new FilaVetor<>(3);
            fila4.inserir(10);
            fila4.inserir(20);
            fila4.inserir(30);
            fila4.inserir(40); // deve lançar exceção
        } catch (FilaCheiaException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }


        // CASO 5
        System.out.println("\nCaso 5:");
        try {
            FilaVetor<Integer> fila5 = new FilaVetor<>(5);
            fila5.retirar(); // deve lançar exceção
        } catch (FilaVaziaException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }


        // CASO 6
        System.out.println("\nCaso 6:");
        FilaVetor<Integer> fila6 = new FilaVetor<>(5);
        fila6.inserir(10);
        fila6.inserir(20);
        fila6.inserir(30);

        System.out.println("Peek: " + fila6.peek()); // 10
        System.out.println("Retirar: " + fila6.retirar()); // 10


        // CASO 7
        System.out.println("\nCaso 7:");
        FilaVetor<Integer> fila7 = new FilaVetor<>(5);
        fila7.inserir(10);
        fila7.inserir(20);
        fila7.inserir(30);

        fila7.liberar();
        System.out.println("Fila vazia? " + fila7.estaVazia()); // true


        // CASO 8
        System.out.println("\nCaso 8:");
        FilaVetor<Integer> f1 = new FilaVetor<>(5);
        f1.inserir(10);
        f1.inserir(20);
        f1.inserir(30);

        FilaVetor<Integer> f2 = new FilaVetor<>(3);
        f2.inserir(40);
        f2.inserir(50);

        FilaVetor<Integer> f3 = f1.criarFilaConcatenada(f2);

        System.out.println("Fila concatenada: " + f3.toString()); // 10, 20, 30, 40, 50
        System.out.println("Fila 1 original: " + f1.toString());   // 10, 20, 30
        System.out.println("Fila 2 original: " + f2.toString());   // 40, 50
        System.out.println("Capacidade    f3: " + f3.getLimite());    // 5
    }
}