public class Fila{
    private int prim;
    private int ult;
    private int tamanho;
    private int[] dados;

    public Fila(int capacidade){
        //por clareza
        prim = 0;
        ult = 0;
        tamanho = 0;
        dados = new int[capacidade];
    }

    public Fila(){
        this(10);
    }

    int prox(int pos){
        return (pos+1) % dados.length;
    }

    public void enfilera(int i){
        dados[ult] = i;
        ult = prox(ult);
        tamanho ++;
    }

    public boolean estaCheia(){
        return tamanho == dados.length;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public int desenfilera(){
        int temp = dados[prim];
        prim = prox(prim);
        tamanho--;
        return temp;
    }

    @Override
    public String toString() {
        String s = "Fila: ";
        if(estaVazia()){
            s+= "vazia";
        }else{
            int i = prim;
            do{
                s+= dados[i] + " ";
                i = prox(i);
            }while(i != ult);
        }
        return s;
    }

    public String oVetor () {
        String s = "o vetor";
        if(estaVazia()){
            for(int i=0; i<dados.length; i++){
                s += "_ ";
            }
        }else if(estaCheia()){
            for(int i=0; i<dados.length; i++){
                s += dados[i] + " ";
            }
        }else if(prim < ult){
            for(int i=0; i<prim; i++){
                s += "_ ";
            }
            for(int i=prim; i<ult;i++){
                s += dados[i] + " ";
            }
            for(int i=ult; i<dados.length; i++){
                s += "_ ";
            }
        }else{
            for(int i = 0; i<ult; i++){
                s+= dados[i] + " ";
            }
            for(int i = ult; i < prim; i++){
                s+= "_ ";
            }
            for(int i = prim; i<dados.length;i++){
                s+= dados[i] + " ";
            }
        }
        return s;
    }
}