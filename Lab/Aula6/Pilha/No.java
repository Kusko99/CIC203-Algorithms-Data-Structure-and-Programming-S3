public class No {
    private char info;
    private No proximo;

    public No (char info){
        setInfo(info);
        setProximo(null);//por clareza
    }

    //metodos de acesso
    public char getInfo (){
        return this.info;
    }
    public No getProximo (){
        return this.proximo;
    }
    //metodos modificadores
    public void setInfo(char info){
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
