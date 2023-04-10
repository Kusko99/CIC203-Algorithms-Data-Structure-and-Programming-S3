public class Pilha {
    private ListaSimples lista;

    public Pilha(){
        this.lista = new ListaSimples();
    }

    public void adicionar(int novoValor){
        lista.insereInicio(novoValor);
    }

    public void remover(){
        lista.removeInicio();
    }

    public int get(){
        return lista.removeInicio();
    }
}
