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
    public NoDuplo getAnt(){
        return ant;
    }
    public NoDuplo getProx(){
        return prox;
    }
    //métodos modificadores
    public void setInfo(int info){
        this.info = info;
    }
    public void setAnt(NoDuplo ant){
        this.ant = ant;
    }
    public void setProx(NoDuplo prox){
        this.prox = prox;
    }
    @Override
    public String toString(){
        return "-|" + info + "|-";
    }
}