package exercicio7;

public class Main {

    public static void main(String[] args) {

        // CASO 1
        ArvoreBinaria<Integer> arvore1 = new ArvoreBinaria<>();
        System.out.println("Caso 1: " + (arvore1.estaVazia() == true));

        // CASO 2
        ArvoreBinaria<Integer> arvore2 = new ArvoreBinaria<>();
        arvore2.setRaiz(new NoArvoreBinaria<>(5));
        System.out.println("Caso 2: " + (arvore2.estaVazia() == false));

        // Montando árvore do caso 3
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);

        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);

        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);

        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no1);

        // CASO 3
        String esperado = "<1<2<><4<><>>><3<5<><>><6<><>>>>";
        System.out.println("Caso 3: " + arvore.toString().equals(esperado));

        // CASO 4
        System.out.println("Caso 4: " + (arvore.pertence(1) == true));

        // CASO 5
        System.out.println("Caso 5: " + (arvore.pertence(3) == true));

        // CASO 6
        System.out.println("Caso 6: " + (arvore.pertence(6) == true));

        // CASO 7
        System.out.println("Caso 7: " + (arvore.pertence(10) == false));

        // CASO 8
        System.out.println("Caso 8: " + (arvore.contarNos() == 6));
    }
}