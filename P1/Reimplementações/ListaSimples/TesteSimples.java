public class TesteSimples {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        for(int i = 1; i < 5; i++){
            lista.insereFim(i);
        }
        System.out.println(lista.toString());
        System.out.println(lista.tamanhoLista());
        System.out.println(lista.buscaX(4));
    }
   
}
