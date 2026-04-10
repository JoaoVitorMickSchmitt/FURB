package exercicio5;

public class Main {

    public static void main(String[] args) {

        // CASO 1
        System.out.println("CASO 1");
        PilhaVetor<Integer> p1 = new PilhaVetor<>(5);
        System.out.println(p1.estaVazia()); // true

        // CASO 2
        System.out.println("\nCASO 2");
        PilhaVetor<Integer> p2 = new PilhaVetor<>(5);
        p2.push(10);
        System.out.println(p2.estaVazia()); // false

        // CASO 3
        System.out.println("\nCASO 3");
        PilhaVetor<Integer> p3 = new PilhaVetor<>(10);
        p3.push(10);
        p3.push(20);
        p3.push(30);

        System.out.println(p3.pop()); // 30
        System.out.println(p3.pop()); // 20
        System.out.println(p3.pop()); // 10
        System.out.println(p3.estaVazia()); // true

        // CASO 4
        System.out.println("\nCASO 4");
        try {
            PilhaVetor<Integer> p4 = new PilhaVetor<>(3);
            p4.push(10);
            p4.push(20);
            p4.push(30);
            p4.push(40); // erro
        } catch (PilhaCheiaException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        // CASO 5
        System.out.println("\nCASO 5");
        try {
            PilhaVetor<Integer> p5 = new PilhaVetor<>(5);
            p5.pop(); // erro
        } catch (PilhaVaziaException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        // CASO 6
        System.out.println("\nCASO 6");
        PilhaVetor<Integer> p6 = new PilhaVetor<>(5);
        p6.push(10);
        p6.push(20);
        p6.push(30);

        System.out.println(p6.peek()); // 30
        System.out.println(p6.pop());  // 30

        // CASO 7
        System.out.println("\nCASO 7");
        PilhaVetor<Integer> p7 = new PilhaVetor<>(5);
        p7.push(10);
        p7.push(20);
        p7.push(30);

        p7.liberar();
        System.out.println(p7.estaVazia()); // true

        // CASO 8
        System.out.println("\nCASO 8");
        PilhaVetor<Integer> p8a = new PilhaVetor<>(10);
        p8a.push(10);
        p8a.push(20);
        p8a.push(30);

        PilhaVetor<Integer> p8b = new PilhaVetor<>(10);
        p8b.push(40);
        p8b.push(50);

        p8a.concatenar(p8b);

        System.out.println(p8a.toString()); // 50,40,30,20,10
    }
}