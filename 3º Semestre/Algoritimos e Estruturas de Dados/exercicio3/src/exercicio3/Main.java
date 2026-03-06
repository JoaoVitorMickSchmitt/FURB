package exercicio3;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        // TESTE 1
        System.out.println("Teste 1 - Lista vazia:");
        System.out.println(lista.estaVazia()); // true


        // TESTE 2
        System.out.println("\nTeste 2 - Lista não vazia:");
        lista.inserir(5);
        System.out.println(lista.estaVazia()); // false


        // TESTE 3
        System.out.println("\nTeste 3 - Inserção de 1 número:");
        System.out.println(lista.obterNo(0).getInfo()); // deve ser 5


        // TESTE 4
        System.out.println("\nTeste 4 - Inserção de 3 números:");
        ListaEncadeada<Integer> lista2 = new ListaEncadeada<>();

        lista2.inserir(5);
        lista2.inserir(10);
        lista2.inserir(15);

        for(int i = 0; i < lista2.obterComprimento(); i++) {
            System.out.println(lista2.obterNo(i).getInfo());
        }


        // TESTE 5
        System.out.println("\nTeste 5 - Buscar primeiro:");
        lista2.inserir(20);
        System.out.println(lista2.buscar(20).getInfo());


        // TESTE 6
        System.out.println("\nTeste 6 - Buscar no meio:");
        System.out.println(lista2.buscar(15).getInfo());


        // TESTE 7
        System.out.println("\nTeste 7 - Buscar inexistente:");
        System.out.println(lista2.buscar(50)); // null


        // TESTE 8
        System.out.println("\nTeste 8 - Remover primeiro:");
        lista2.retirar(20);

        for(int i = 0; i < lista2.obterComprimento(); i++) {
            System.out.println(lista2.obterNo(i).getInfo());
        }


        // TESTE 9
        System.out.println("\nTeste 9 - Remover elemento do meio:");

        ListaEncadeada<Integer> listaTeste9 = new ListaEncadeada<>();

        listaTeste9.inserir(5);
        listaTeste9.inserir(10);
        listaTeste9.inserir(15);
        listaTeste9.inserir(20);

        listaTeste9.retirar(15);

        for(int i = 0; i < listaTeste9.obterComprimento(); i++) {
            System.out.println(listaTeste9.obterNo(i).getInfo());
        }


        // TESTE 10
        System.out.println("\nTeste 10 - obterNo posição 0:");
        ListaEncadeada<Integer> lista3 = new ListaEncadeada<>();

        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);
        lista3.inserir(20);

        System.out.println(lista3.obterNo(0).getInfo()); // 20


        // TESTE 11
        System.out.println("\nTeste 11 - obterNo última posição:");
        System.out.println(lista3.obterNo(3).getInfo()); // 5


        // TESTE 12
        System.out.println("\nTeste 12 - posição inválida:");

        try {
            lista3.obterNo(10);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Exceção capturada!");
        }


        // TESTE 13
        System.out.println("\nTeste 13 - Comprimento lista vazia:");
        ListaEncadeada<Integer> lista4 = new ListaEncadeada<>();
        System.out.println(lista4.obterComprimento()); // 0


        // TESTE 14
        System.out.println("\nTeste 14 - Comprimento lista com elementos:");
        lista4.inserir(5);
        lista4.inserir(10);
        lista4.inserir(15);
        lista4.inserir(20);

        System.out.println(lista4.obterComprimento()); // 4
    }
}