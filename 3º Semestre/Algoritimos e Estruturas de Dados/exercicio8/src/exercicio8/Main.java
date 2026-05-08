package exercicio8;

public class Main {

    public static void main(String[] args) {

        Arvore<Integer> arvore = new Arvore<>();

        NoArvore<Integer> n1 = new NoArvore<>(1);
        NoArvore<Integer> n2 = new NoArvore<>(2);
        NoArvore<Integer> n3 = new NoArvore<>(3);
        NoArvore<Integer> n4 = new NoArvore<>(4);
        NoArvore<Integer> n5 = new NoArvore<>(5);
        NoArvore<Integer> n6 = new NoArvore<>(6);
        NoArvore<Integer> n7 = new NoArvore<>(7);
        NoArvore<Integer> n8 = new NoArvore<>(8);
        NoArvore<Integer> n9 = new NoArvore<>(9);
        NoArvore<Integer> n10 = new NoArvore<>(10);

        // filhos de 2
        n2.inserirFilho(n7);
        n2.inserirFilho(n6);
        n2.inserirFilho(n5);

        // filho de 3
        n3.inserirFilho(n8);

        // filhos de 4
        n4.inserirFilho(n10);
        n4.inserirFilho(n9);

        // filhos da raiz 1
        n1.inserirFilho(n4);
        n1.inserirFilho(n3);
        n1.inserirFilho(n2);

        arvore.setRaiz(n1);

        // Caso 1
        System.out.println(arvore.toString());

        // Caso 2
        System.out.println(arvore.pertence(7));

        // Caso 3
        System.out.println(arvore.pertence(55));

        // Caso 4
        System.out.println(arvore.contarNos());
    }
}