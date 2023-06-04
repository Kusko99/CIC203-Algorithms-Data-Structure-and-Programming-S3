public class Fila {
    class No{
        int info;
        No proximo;

        public No (int i){
            info = i;
            proximo = null;
        }

        public int getInfo() {
            return info;
        }

        public No getProximo() {
            return proximo;
        }

        public void setInfo(int info) {
            this.info = info;
        }

        public void setProximo(No proximo) {
            this.proximo = proximo;
        }

    }
    private int tamanho;
    private No primeiro;
    private No ultimo;
    public Fila(){
        tamanho = 0;
        primeiro = null;
        ultimo = null;
    }
    public int getTamanho(){
        return tamanho;
    }
    public int consultaPrimeiro(){//elemento da primeira posição
        return primeiro.info;
    }
    public int consultaUltimo(){//elemento da ultima posição
        return ultimo.info;
    }
    public boolean estaVazia(){
        return tamanho == 0;
    }
    public void enfilera(int i){
        No novo = new No(i);
        if(estaVazia()){
            primeiro =  novo;
        }else{
            ultimo.proximo = novo;
        }
        ultimo = novo;
        tamanho ++;
    }
    public int desenfilera(){
        int temp = primeiro.info;
        primeiro = primeiro.proximo;
        if(tamanho == 1){
            ultimo = null;
        }
        tamanho--;
        return temp;
    }

    public int menor(){
        No aux = primeiro.getProximo();
        int menor = primeiro.getInfo();
        while(aux != null){
            if(menor > aux.getInfo()){
                menor = aux.getInfo();
            }
            aux = aux.getProximo();
        }
        popMenor(menor);
        return menor;
    }

    private void popMenor(int menor){
        No aux = primeiro;
        No aux2 = primeiro.getProximo();
        tamanho--;
        if(primeiro.getInfo() == menor){
            primeiro = primeiro.getProximo();
        }else{
            boolean achado = false;
            while(!achado){
                if(aux2.getInfo() == menor){
                    achado = true;
                }else{
                    aux = aux.getProximo();
                    aux2 = aux2.getProximo();
                }
            }
            if(aux2 == ultimo){
                aux = ultimo;
                aux.setProximo(null);
            }else{
                aux.setProximo(aux2.getProximo());
                aux2.setProximo(null);
            }
        }
    }

    public int encontrePosicao(int elemento){
        int pos = 1;
        boolean achado = false;
        No aux = primeiro;
        while(!achado && aux != null){
            if(aux.getInfo() == elemento){
                achado = true;
            }else{
                aux = aux.getProximo();
                pos++;
            }
        }
        if(!achado){
            return -1;
        }else{
            return pos;
        }
    }

    public Fila merge(Fila outraFila){
        No aux1 = primeiro;
        No aux2 = outraFila.primeiro;
        Fila merge = new Fila();
        while(aux1 != null && aux2 != null){
            merge.enfilera(aux1.getInfo());
            merge.enfilera(aux2.getInfo());
            aux1 = aux1.getProximo();
            aux2 = aux2.getProximo();
        }
        while(aux1 != null){
            merge.enfilera(aux1.getInfo());
            aux1 = aux1.getProximo();
        }
        while(aux2 != null){
            merge.enfilera(aux2.getInfo());
            aux2 = aux2.getProximo();
        }
        return merge;
    }

    public void furarFila(int elemento){
        No novo = new No(elemento);
        novo.setProximo(primeiro);
        primeiro = novo;
        tamanho++;
    }

    public void inverter(){
        Pilha pilha = new Pilha(tamanho);
        while(!estaVazia()){
            pilha.push(desenfilera());
        }
        while(!pilha.estaVazia()){
            enfilera(pilha.pop());
        }

    }

    @Override
    public String toString(){
        String s = "Fila: ";
        if(estaVazia()){
            s += "vazia";
        }else{
            No runner = primeiro;
            while(runner != null){
                s += runner.info + " ";
                runner = runner.proximo;
            }
        }
        return s;
    }
    @Override
    public boolean equals(Object obj){
        Fila filaComparacao = (Fila)obj;
        if (this == filaComparacao){
            return true;
        }if (this.tamanho != filaComparacao.tamanho){
            return false;
        }
        No runnerThis = this.primeiro;
        No runnerComparacao = filaComparacao.primeiro;
        while(runnerThis != null){
            if(runnerThis.info != runnerComparacao.info){
                return false;
            }
        }
        return true;
    }
}