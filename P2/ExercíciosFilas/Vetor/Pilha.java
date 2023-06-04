public class Pilha {
    private int[] dados;
    private int topo;
    public Pilha(int capacidade){
        dados = new int[capacidade];
        //por clareza
        topo = 0;
    }
    public boolean estaVazia(){
        return topo == 0;
    }
    public boolean estaCheia(){
        return topo == dados.length;
    }
    public int espiaTopo (){
        return dados[topo-1];
    }
    public int pop(){
        return dados[--topo];
    }
    public void push(int c){
        dados[topo++] = c;
    }
    @Override
    public String toString(){
        String s = "pilha: ";
        if(estaVazia()){
            s += "esta vazia";
        }else{
            for(int i=topo-1; i>=0; i--){
                s += dados[i] + "\n";
            }
        }
        return s; 
    }
    public int fakePop(){
        if(topo == 2){
            return pop();
        }
        int aux = pop();
        int fakePop = pop();
        push(aux);
        return fakePop;
    }
}


