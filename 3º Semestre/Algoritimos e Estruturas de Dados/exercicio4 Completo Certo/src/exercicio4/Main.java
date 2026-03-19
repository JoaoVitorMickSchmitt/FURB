package exercicio4;

public class Main {

    public static void main(String[] args) {

        // CASO 1
        System.out.println("===== CASO 1 =====");
        ListaDupla<Integer> lista1 = criarLista();

        System.out.println("Resultado (início -> fim):");
        lista1.exibir();
        System.out.println("Esperado:");
        System.out.println("20\n15\n10\n5");

        System.out.println("\nResultado (fim -> início):");
        lista1.exibirOrdemInversa();
        System.out.println("Esperado:");
        System.out.println("5\n10\n15\n20");


        // CASO 2
        System.out.println("\n===== CASO 2 =====");
        ListaDupla<Integer> lista2 = criarLista();

        System.out.println("Resultado:");
        System.out.println(lista2.buscar(20).getInfo());
        System.out.println("Esperado:");
        System.out.println("20");


        // CASO 3
        System.out.println("\n===== CASO 3 =====");
        ListaDupla<Integer> lista3 = criarLista();

        System.out.println("Resultado:");
        System.out.println(lista3.buscar(10).getInfo());
        System.out.println("Esperado:");
        System.out.println("10");


        // CASO 4
        System.out.println("\n===== CASO 4 =====");
        ListaDupla<Integer> lista4 = criarLista();
        lista4.retirar(20);

        System.out.println("Resultado (início -> fim):");
        lista4.exibir();
        System.out.println("Esperado:");
        System.out.println("15\n10\n5");

        System.out.println("\nResultado (fim -> início):");
        lista4.exibirOrdemInversa();
        System.out.println("Esperado:");
        System.out.println("5\n10\n15");


        // CASO 5
        System.out.println("\n===== CASO 5 =====");
        ListaDupla<Integer> lista5 = criarLista();
        lista5.retirar(10);

        System.out.println("Resultado (início -> fim):");
        lista5.exibir();
        System.out.println("Esperado:");
        System.out.println("20\n15\n5");

        System.out.println("\nResultado (fim -> início):");
        lista5.exibirOrdemInversa();
        System.out.println("Esperado:");
        System.out.println("5\n15\n20");


        // CASO 6
        System.out.println("\n===== CASO 6 =====");
        ListaDupla<Integer> lista6 = criarLista();
        lista6.retirar(5);

        System.out.println("Resultado (início -> fim):");
        lista6.exibir();
        System.out.println("Esperado:");
        System.out.println("20\n15\n10");

        System.out.println("\nResultado (fim -> início):");
        lista6.exibirOrdemInversa();
        System.out.println("Esperado:");
        System.out.println("10\n15\n20");


        // CASO 7
        System.out.println("\n===== CASO 7 =====");
        ListaDupla<Integer> lista7 = criarLista();

        NoListaDupla<Integer> n5 = lista7.buscar(5);
        NoListaDupla<Integer> n10 = lista7.buscar(10);
        NoListaDupla<Integer> n15 = lista7.buscar(15);
        NoListaDupla<Integer> n20 = lista7.buscar(20);

        lista7.liberar();

        System.out.println("Resultado nó 5:");
        imprimirNo(n5);

        System.out.println("Resultado nó 10:");
        imprimirNo(n10);

        System.out.println("Resultado nó 15:");
        imprimirNo(n15);

        System.out.println("Resultado nó 20:");
        imprimirNo(n20);

        System.out.println("Esperado para todos:");
        System.out.println("Info: null");
        System.out.println("Proximo: null");
        System.out.println("Anterior: null");
    }

    public static ListaDupla<Integer> criarLista() {
        ListaDupla<Integer> lista = new ListaDupla<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        return lista;
    }

    public static void imprimirNo(NoListaDupla<Integer> no) {
        System.out.println("Info: " + no.getInfo());
        System.out.println("Proximo: " + no.getProximo());
        System.out.println("Anterior: " + no.getAnterior());
    }
}