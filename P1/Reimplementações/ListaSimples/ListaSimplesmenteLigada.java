public class ListaSimplesmenteLigada {
    private NoSimples primeiro;
    private NoSimples ultimo;
    private int tamanho;

    public ListaSimplesmenteLigada(){
        this.tamanho = 0;
    }

    public NoSimples getPrimeiro(){
        return primeiro;
    }

    public NoSimples getUltimo(){
        return ultimo;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void setPrimeiro(NoSimples primeiro){
        this.primeiro = primeiro;
    }

    public void setUltimo(NoSimples ultimo){
        this.ultimo = ultimo;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor){
        NoSimples novo = new NoSimples(novoValor);
        if(this.primeiro == null && this.ultimo == null){
            this.primeiro = novo;
            this.ultimo = novo;
            this.tamanho ++;
        }else{
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
            this.tamanho ++;
        }

    }

    public void remover(String valorProcurado){
        NoSimples anterior = null; 
        NoSimples aux = primeiro;
        for(int i = 0; i< this.getTamanho(); i++){
            if(aux.getValor() == valorProcurado){
                if(this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }else if(aux == primeiro){
                    this.primeiro = aux.getProximo();
                    aux.setProximo(null);
                }else if(aux == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else{
                    anterior.setProximo(aux.getProximo());
                    aux = null;
                }
                this.tamanho--;
                break;
            }
            anterior = aux;
            aux = aux.getProximo();
        }
    }

    public NoSimples get(int posicao){
        NoSimples aux = this.primeiro;
        for(int i = 0; i < posicao; i++){
            if(aux.getProximo() != null){
                aux = aux.getProximo();
            }
        }
        return aux;
    }
}
