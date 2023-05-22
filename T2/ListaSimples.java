public class ListaSimples {
    private NoSimples primeiro;

    //por clareza
    public ListaSimples(){
        setPrimeiro(null);
    }
    public NoSimples getPrimeiro(){
        return this.primeiro;
    }
    public void setPrimeiro(NoSimples primeiro){
        this.primeiro = primeiro;
    }

    public boolean estaVazia(){
        return this.primeiro==null;
    }
    public void insereInicio(String placa,char movimentação){
        NoSimples novo = new NoSimples(placa,movimentação);
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
            NoSimples aux = this.primeiro;
            while(aux != null){
                msg = msg + aux;
                aux = aux.getProximo();
            }
            msg += "//";
        }
        return msg;
    }
    public void insereFim(String placa,char movimentação){
        NoSimples novo = new  NoSimples(placa,movimentação);
        if(this.estaVazia()){
            this.primeiro = novo;
        }else{
            NoSimples aux = this.primeiro;
            while(aux.getProximo() != null){ //busca pelo final da lista
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }
    public String removeInicio(){
        String temp = this.primeiro.getPlaca();
        this.primeiro = this.primeiro.getProximo();
        return temp;
    }
    public String removeFim(){
        if (this.primeiro.getProximo() == null){
            String temp = this.primeiro.getPlaca();
            this.primeiro = null; //esvaziou a lista
            return temp;
        }else{
            NoSimples aux = this.primeiro;
            while(aux.getProximo().getProximo() != null){
                //busca o penúltimo
                aux = aux.getProximo();
            }
            String temp = aux.getProximo().getPlaca();
            aux.setProximo(null);
            return temp;
        }
    }
}
