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
    public int tamanhoLista(){
        int tamanho = 1;
        No aux = primeiro;
        if(primeiro == null){
            return tamanho = 0;
        }
        while(aux.getProximo() != null){
            aux = aux.getProximo();
            tamanho ++;
        }
        return tamanho;
    }
    public boolean buscaX(int x){
        if(estaVazia()){
            return false;
        }
        No aux = primeiro;
        while(primeiro.getProximo() != null){
            if(aux.getInfo() == x){
                return true;
            }
            aux = aux.getProximo();
        }
        return false;
    }
    public void insereNaPosicao(int i, int pos){
        if(primeiro == null){
            primeiro.setInfo(i);
        }
        if(tamanhoLista() - 1 < pos){
            insereFim(i);
        }
        No aux = primeiro;
        No novo = new No(i);
        for(int j = 0; j < pos; i++){
            aux = aux.getProximo();
        }
        No temp = aux.getProximo();
        aux.setProximo(novo);
        novo.setProximo(temp);        
    }
    public int removeDaPosicao(int pos){
        if(tamanhoLista() < pos){
            return -1;
        }
        No aux = primeiro;
        if(pos == 0){
            primeiro = aux.getProximo();
            return aux.getInfo();
        }
        for(int i = 0; i < pos; i++){
            aux = aux.getProximo();
        }
        No temp = aux.getProximo().getProximo();
        int info = aux.getProximo().getInfo();
        aux.setProximo(temp);
        return info;
    }
    public boolean removePrimeiroX(int x){
        if(primeiro.getInfo() == x){
            primeiro = primeiro.getProximo();
            return true;
        }
        No aux = primeiro.getProximo();
        No anterior = primeiro;
        while(aux.getProximo() != null){
            if(aux.getInfo() == x){
                anterior.setProximo(aux.getProximo());
                return true;
            }
            aux = aux.getProximo();
            anterior = anterior.getProximo();
        }
        return false;
    }
    public int removeTodosX (int x){
        int removidos = 0;
        No aux = primeiro;
        No anterior = null;
        while(aux != null){
            if(aux.getInfo() == x){
                if(anterior == null){
                    this.primeiro = aux.getProximo();
                    removidos += 1;
                }else{
                    anterior.setProximo(aux.getProximo());
                    removidos += 1;
                }
            }else{
                anterior = aux;
            }
            aux = aux.getProximo();
        }
        return removidos;
    }

}