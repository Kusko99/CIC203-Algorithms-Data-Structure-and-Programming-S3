public class Elemento<TIPO> {
    private TIPO valor;
    private Elemento<TIPO> esquerda;
    private Elemento<TIPO> direita;

    public Elemento(TIPO novoValor){
        this.valor = novoValor;
    }

    public TIPO getValor() {
        return valor;
    }
    

    public Elemento<TIPO> getEsquerda() {
        return esquerda;
    }

    public Elemento<TIPO> getDireita() {
        return direita;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }

    public void setEsquerda(Elemento<TIPO> esquerda) {
        this.esquerda = esquerda;
    }

    public void setDireita(Elemento<TIPO> direita) {
        this.direita = direita;
    }
    
    
}
