public class TesteListaSimples {
    public static void main(String[] args) {
        ListaSimples l1 = new ListaSimples();
        System.out.println("Lista foi criada:\n" + l1);
        for(int i = 1; i <= 10; i+=2){
            l1.insereInicio(i);
        }
        System.out.println("\nLista depois das inserções de início: \n" + l1);
        for(int i=2; i<=10; i+=2){
            l1.insereFim(i);
        }
        System.out.println("\nLista depois das inserções de fim: \n" + l1);

        if(!l1.estaVazia()){
        System.out.println("\n" + l1.removeInicio() + " foi removido do inicio\n");
            System.out.println("\nlista depois da remoção de inicio: \n" + l1);
        }

        // while(!l1.estaVazia()){
        //     System.out.println(l1.removeInicio() + " saiu");
        // }

        if(!l1.estaVazia()){
            System.out.println("\n" + l1.removeFim() + " foi removido do final");
            System.out.println("lista depois da remoção de fim\n" + l1);            
        }
    }
}