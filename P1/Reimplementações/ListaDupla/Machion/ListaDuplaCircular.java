public class ListaDuplaCircular {
    private NoDuplo primeiro;
    // por clareza
    public ListaDuplaCircular () {
        setPrimeiro(null);
    }
    public NoDuplo getPrimeiro() {
        return this.primeiro;
    }
    public void setPrimeiro(NoDuplo primeiro) {
        this.primeiro = primeiro;
    }
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio(int info) {
        NoDuplo novo = new NoDuplo(info);
        if (!estaVazia()) {
            novo.setProximo(primeiro);
            novo.setAnterior(primeiro.getAnterior());
            // primeiro.getAnterior().setProximo(novo);
            // primeiro.setAnterior(novo);
            novo.getAnterior().setProximo(novo);
            NoDuplo proximo = (NoDuplo) novo.getProximo(); //casting
            proximo.setAnterior(novo);
        }
        primeiro = novo;
    }
    public void insereFim(int info) {
        NoDuplo novo = new NoDuplo(info);
        if (estaVazia()) {
            setPrimeiro(novo);
        }
        else {
            NoDuplo ultimo = primeiro.getAnterior();
            novo.setAnterior(ultimo);
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
            ultimo.setProximo(novo);
        }
    }
    @Override
    public String toString() {
        String msg = "lista: ";
        if (estaVazia()) {
            msg += "esta vazia";
        }
        else {
            NoDuplo aux = primeiro;
            do {
                msg += aux;
                aux = (NoDuplo)aux.getProximo();
            } while (aux != primeiro);
        }
        return msg;
    }
    public int removeInicio () {
        int temp = primeiro.getInfo();
        if (primeiro == (NoDuplo)primeiro.getProximo()) {//tem um elemento só
            primeiro = null; //esvaziou a lista
        }
        else { //tem pelo menos 2 elementos
            NoDuplo segundo = (NoDuplo)primeiro.getProximo();
            NoDuplo ultimo = primeiro.getAnterior();
            ultimo.setProximo(segundo);
            segundo.setAnterior(ultimo);
            primeiro = segundo;
        }
        return temp;
    }
    public int removeFim () {
        int temp = primeiro.getAnterior().getInfo();
        if (primeiro == (NoDuplo)primeiro.getProximo()) {//tem um elemento só
            primeiro = null; //esvaziou a lista
        }
        else { //tem pelo menos 2 elementos
            NoDuplo penultimo = primeiro.getAnterior().getAnterior();
            penultimo.setProximo(primeiro);
            primeiro.setAnterior(penultimo);
        }
        return temp;
    }

    public int tamanho(){
        NoDuplo aux = primeiro;
        int tamanho = 0;
        if(primeiro == null){
            return 0;
        }
        while(aux.getProximo() != primeiro){
            tamanho ++;
        }
        return tamanho;
    }

    public int removePos(int pos){
        if(tamanho() < pos){
            return -1;
        }
        NoDuplo aux = primeiro;
        for(int i = 0; i < pos; i++){
            aux = aux.getProximo();
        }
        aux.getProximo().setAnterior(aux.getAnterior());
        aux.getAnterior().setProximo(aux.getProximo());
        return aux.getInfo();
    }
    
    public boolean achaX(int x){
        NoDuplo aux = primeiro;
        while(aux.getProximo() != primeiro){
            if(aux.getInfo() == x){
                return true;
            }
        }
        return false;
    }
    
    public int removeX(int x){
        if(primeiro == null){
            return -1;
        }
        NoDuplo aux = primeiro;
        while(aux.getProximo() != primeiro){
            if(aux.getInfo() == x){
                aux.getProximo().setAnterior(aux.getAnterior());
                aux.getAnterior().setProximo(aux.getProximo());
                return aux.getInfo();
            }
        }
        return -1;
    }

    public int consultarPrimeiro(){
        return primeiro.getInfo();
    }
    
    public int consultarUltimo(){
        return primeiro.getAnterior().getInfo();
    }

}