public class NoSimples {
    private String valor;
    private NoSimples proximo;

    public NoSimples(String novoValor){
        this.valor = novoValor;
    }

    public String getValor(){
        return valor;
    }

    public NoSimples getProximo(){
        return proximo;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public void setProximo(NoSimples proximo){
        this.proximo = proximo;
    }
}
