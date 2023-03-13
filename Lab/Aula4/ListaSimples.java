public class ListaSimples {
    private No primeiro;

    //por clareza
    public ListaSimples(){
        setPrimeiro(null);
    }
    public No getPrimeiro(){
        return this.primeiro;
    }
    public void setPrimeiro(No primeiro){
        this.primeiro = primeiro;
    }

    public boolean estaVazia(){
        return this.primeiro==null;
    }
    public void insereInicio(int i){
        No novo = new No(i);
        if(!this.estaVazia()){
            novo.setProximo(this.primeiro);
        }  
            setPrimeiro(novo);
    }
    @Override
    public String toString(){
        String msg = "lista: ";
        if(this.estaVazia()){
            msg = msg + "vazia";
        }
        else{
            No aux = this.primeiro;
            while(aux != null){
                msg = msg + aux;
                aux = aux.getProximo();
            }
            msg += "//";
        }
        return msg;
    }
    public void insereFim(int i){
        No novo = new No(i);
        if(this.estaVazia()){
            this.primeiro = novo;
        }else{
            No aux = this.primeiro;
            while(aux.getProximo() != null){ //busca pelo final da lista
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }
    public int removeInicio(){
        int temp = this.primeiro.getInfo();
        this.primeiro = this.primeiro.getProximo();
        return temp;
    }
    public int removeFim(){
        if (this.primeiro.getProximo() == null){
            int temp = this.primeiro.getInfo();
            this.primeiro = null; //esvaziou a lista
            return temp;
        }else{
            No aux = this.primeiro;
            while(aux.getProximo().getProximo() != null){
                //busca o penúltimo
                aux = aux.getProximo();
            }
            int temp = aux.getProximo().getInfo();
            aux.setProximo(null);
            return temp;
        }
    }
    public int tamanhoLista(){}
    public boolean buscaX(int x){}
    public void insereNaPosicao(int i, int pos){}
    public int removeDaPosicao(int pos){}
    public boolean removePrimeiroX(int x){}
    public int removeTodosX (int x){}

    //implementar nova lista simplesmente ligada,acresentando tamanho da lista
}
