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
}
