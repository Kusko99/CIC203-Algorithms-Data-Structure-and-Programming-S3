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
