public class Fila <T>{
    private int tamanho;
    private No<T> primeiro;
    private No<T> ultimo;
    public Fila(){
        tamanho = 0;
        primeiro = null;
        ultimo = null;
    }
    public int getTamanho(){
        return tamanho;
    }
    public T consultaPrimeiro(){//elemento na primeira posição
        return primeiro.getInfo();
    }
    public T consultaUltimo(){//elemento na ultima posição
        return ultimo.getInfo();
    }
    public boolean estaVazia(){
        return tamanho == 0;
    }
    public void enfilera(T i){
        No<T> novo = new No<T>(i);
        if(estaVazia()){
            primeiro = novo;
        }else{
            ultimo.setProximo(novo);
        }
        ultimo = novo;
        tamanho ++;
    }
    public T desenfilera(){
        T temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if(tamanho == 1){
            ultimo = null;
        }
        tamanho--;
        return temp;
    }
    
    @Override
    public String toString(){
        String s = "Fila";
        if(estaVazia()){
            s += "vazia";
        }else{
            No<T> runner = primeiro;
            while(runner != null){
                s += runner.getInfo() + " ";
                runner = runner.getProximo();
            }
        }
        return s;
    }
}

