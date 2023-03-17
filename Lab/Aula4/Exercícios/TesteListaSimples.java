public class TesteListaSimples {
    public static void main(String[] args) {
        ListaSimples l1 = new ListaSimples();
        System.out.println("Lista foi criada:\n" + l1);
        System.out.println(l1.tamanhoLista());
        for(int i = 1; i <= 10; i+=2){
            l1.insereInicio(i);
        }
        System.out.println("\nLista depois das inserções de início: \n" + l1);
        for(int i=2; i<=10; i+=2){
            l1.insereFim(i);
        }
        System.out.println("\nLista depois das inserções de fim: \n" + l1);

        System.out.println(l1.tamanhoLista());
        System.out.println(l1.buscaX(2));
        l1.insereNaPosicao(15, 3);

        System.out.println("\nLista depois das inserção de 15: \n" + l1);

        System.out.println(l1.removeDaPosicao(80));

        System.out.println(l1.removePrimeiroX(20));

        for(int i = 0; i <= 3; i++){
            l1.insereFim(3);
        }

        System.out.println(l1.removePrimeiroX(3));
        System.out.println("\nLista depois da remoção: \n" + l1);

        l1.insereInicio(3);

        System.out.println(l1);
        System.out.println(l1.removeTodosX(3));
        System.out.println(l1);

    }
}