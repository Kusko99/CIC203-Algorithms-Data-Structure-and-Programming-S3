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

    public int encontraPosicao(int elemento){
        int pos = 1;
        int atual = prim;
        boolean achado = false;
        while(!achado && pos<=tamanho){
            if(dados[atual] == elemento){
                achado = true;
            }else{
                pos++;
                atual++;
            }
        }
        if(!achado){
            return -1;
        }else{
            return pos;
        }
    }

    public Fila merge(Fila fila1, Fila fila2){
        int aux1 = fila1.prim;
        int aux2 = fila2.prim;
        Fila merge = new Fila(fila1.tamanho + fila2.tamanho);
        while(aux1< fila1.tamanho && aux2< fila2.tamanho){
            merge.enfilera(fila1.dados[aux1]);
            merge.enfilera(fila2.dados[aux2]);
            aux1++;
            aux2++;
        }
        if(aux1< fila1.tamanho){
            while(aux1< fila1.tamanho){
                merge.enfilera(fila1.dados[aux1]);
                aux1++;
            }
        }else if(aux2 < fila2.tamanho){
            while(aux2< fila2.tamanho){
                merge.enfilera(fila2.dados[aux2]);
                aux2++;
            }
        }
        return merge;
    }

    public void furarFila(int elemento){
        if(estaCheia()){
            System.out.println("Fila Cheia");
        }else{
            if(estaVazia()){
                enfilera(elemento);
            }else{
                int pos;
                if(prim == 0){
                    pos = tamanho;
                }else{
                    pos = prim-1;
                }
                dados[pos] = elemento;
                prim = pos;
            }
        }
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

    public int menor(){
        int menor = dados[prim];
        int i = 1;
        while(i<= tamanho){
            if(menor>dados[i]){
                menor = dados[i];
            }
            i++;
        }
        removeMenor(menor);
        tamanho--;
        return menor;
    }

    private void removeMenor(int menor){
        if(menor == dados[prim]){
            prim = dados[prim+1];
        }else{
            int i = prim+1;
            while(i != ult){
                if(menor == dados[i]){
                    while(i != ult){
                        dados[i] = dados[i+1];
                        i = (i+1)%dados.length;
                    }
                    ult = (ult-1)%dados.length;
                    i = ult;
                }else{
                    i = (i+1)%dados.length;
                }
            }
        }
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