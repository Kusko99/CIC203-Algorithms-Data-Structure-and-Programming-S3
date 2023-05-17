public class Fila {
    class No{
        int info;
        No proximo;

        public No (int i){
            info = i;
            proximo = null;
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
    public int achaPosicao(int n){
        No busca = primeiro;
        for(int i = 1; i<=tamanho; i++){
            if(busca.info == n){
                return i;
            }
            busca = busca.proximo;
        }
        return -1;
    }
    public Fila merge(Fila a, Fila b){
        No aux_a = a.primeiro;
        No aux_b = b.primeiro;
        Fila nova = new Fila();
        while (aux_a != null){
            nova.enfilera(aux_a.info);
            aux_a = aux_a.proximo;
        }while(aux_b != null){
            nova.enfilera(aux_b.info);
            aux_b = aux_b.proximo;
        }
        return nova;
    }
    public void furar(int n){
        No novo = new No(n);
        novo.proximo = primeiro;
        primeiro = novo;
    }
    public void inverterFila(){
        Pilha pilha = new Pilha(tamanho);
        while(!pilha.estaCheia()){
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
