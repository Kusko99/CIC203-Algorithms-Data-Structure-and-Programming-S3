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
        int tamanho = 0;
        No aux = this.primeiro;
        if(aux == null){
            return tamanho;
        }else{
            while(aux != null){
                aux = aux.getProximo();
                tamanho += 1;
            }
        }
        return tamanho;
    }
    public boolean buscaX(int x){
        No aux = this.primeiro;
        while(aux != null){
            if(aux.getInfo() == x){
                return true;
            }
            aux = aux.getProximo();
        }
        return false;
    }
    public void insereNaPosicao(int i, int pos){
        No aux = this.primeiro;
        No novo = new No(i);
        int contador = 1;
        boolean trocado = false;
        while(trocado == false){
            if(aux.getProximo() == null){
                aux.setProximo(novo);
                trocado = true;
            }else if(pos-1 == contador){
                No aux2 = aux.getProximo();
                aux.setProximo(novo);
                aux.getProximo().setProximo(aux2);
                trocado = true;
            }
            aux = aux.getProximo();
            contador ++;
        }
    }
    public int removeDaPosicao(int pos){
        No aux = this.primeiro;
        int contador = 1, info = -1;
        while(aux != null){
            if(contador == pos-1){
                No aux2 = aux.getProximo().getProximo();
                info = aux.getProximo().getInfo();
                aux.setProximo(aux2);
                return info;             
            }
            aux = aux.getProximo();
            contador ++;
        }
        return -1;
    }
    public boolean removePrimeiroX(int x){
        No aux = this.primeiro;
        while(aux != null){
            if(aux.getInfo() == x){
                No anterior = this.primeiro;
                while(anterior.getProximo() != aux){
                    anterior = anterior.getProximo();
                }
                anterior.setProximo(aux.getProximo());
                return true;
            }
            aux = aux.getProximo();
        }
        return false;
    }
    public int removeTodosX (int x){
        No aux = this.primeiro;
        No anterior = null;
        int removidos = 0;
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