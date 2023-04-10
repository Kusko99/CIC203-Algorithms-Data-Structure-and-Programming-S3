public class NoDuplo{
    private int info;
    private NoDuplo ant;
    private NoDuplo prox;

    public NoDuplo (int info){
        this.info = info;
        this.ant = this;
        this.prox = this;
    }

    //métodos de acesso
    public int getInfo(){
        return info;
    }
    public NoDuplo getAnterior(){
        return ant;
    }
    public NoDuplo getProximo(){
        return prox;
    }
    //métodos modificadores
    public void setInfo(int info){
        this.info = info;
    }
    public void setAnterior(NoDuplo ant){
        this.ant = ant;
    }
    public void setProximo(NoDuplo prox){
        this.prox = prox;
    }
    @Override
    public String toString(){
        return "-|" + info + "|-";
    }
}
