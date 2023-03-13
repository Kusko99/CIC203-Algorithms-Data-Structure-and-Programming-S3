public class No {
    private int info;
    private No proximo;

    public No (int info){
        setInfo(info);
        setProximo(null);//por clareza
    }

    //metodos de acesso
    public int getInfo (){
        return this.info;
    }
    public No getProximo (){
        return this.proximo;
    }
    //metodos modificadores
    public void setInfo(int info){
        this.info = info;
    }
    public void setProximo(No proximo){
        this.proximo = proximo;
    }
    @Override
    public String toString(){
        return "|" + info + " |->";
    }
}