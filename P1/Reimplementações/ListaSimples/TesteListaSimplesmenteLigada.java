public class TesteListaSimplesmenteLigada {
    public static void main(String[]args){
        ListaSimplesmenteLigada listaLigada = new ListaSimplesmenteLigada();
        listaLigada.adicionar("AC");
        listaLigada.adicionar("BA");
        listaLigada.adicionar("CE");
        listaLigada.adicionar("DF");
        System.out.println("Tamanho" + listaLigada.getTamanho());
        System.out.println("Primeiro" + listaLigada.getPrimeiro().getValor());
        System.out.println("Ultimo: "+ listaLigada.getUltimo().getValor()) ;
        System.out.println(listaLigada.get(0).getValor());
        System.out.println(listaLigada.get(1).getValor());
        System.out.println(listaLigada.get(2).getValor());
        System.out.println(listaLigada.get(3).getValor());


        //remover estado CE
        listaLigada.remover("CE");
    }
}
