package pilha_ligada;
public class Pilha {
    private No primeiro;

    //por clareza
    public Pilha () {
        setPrimeiro(null);
    }
    public No getPrimeiro(){
        return this.primeiro;
    }
    public void setPrimeiro (No primeiro) {
        this.primeiro = primeiro;
    }
    public boolean estaVazia(){
        return this.primeiro==null;
    }
    public void push (char i) {
        No novo = new No(i);
        if (!this.estaVazia()) {
            novo.setProximo(this.primeiro);
        }
        setPrimeiro(novo);
    }
    @Override
    public String toString () {
        String msg = "";
        if (this.estaVazia()) {
            msg = msg + "pilha vazia";
        }
        else {
            No aux = this.primeiro;
            while (aux != null) { //busca pelo final da lista
                msg = msg + aux  + "\n";
                aux = aux.getProximo();
            }
        }
        return msg;
    }
    
    public char pop() {
        char temp = this.primeiro.getInfo();
        this.primeiro = this.primeiro.getProximo();
        return temp;
    }
}