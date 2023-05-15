public class ListaLigadaGenerica <T>{
    private class No <T>{
        private T info;
        private No<T> proximo;
        public  No (T info){
            this.info = info;
            this.proximo = null;
        }
        public T getInfo(){
            return info;
        }
        public void setInfo(T info){
            this.info = info;
        }
        public No<T> getProximo(){
            return proximo;
        }
        public void setProximo(No<T> proximo){
            this.proximo = proximo;
        }
        @Override
        public String toString(){
            return "[" + info + "]->";
        }
    }
    private No<T> primeiro;
    private No<T> ultimo;
    private int tamanho;
    //construtor padrão - "zera tudo"
    public No<T> getPrimeiro(){
        return primeiro;
    }
    public void setPrimeiro(No<T> primeiro){
        this.primeiro = primeiro;
    }
    public No<T> getUltimo(){
        return ultimo;
    }
    public void setUltimo(No<T> ultimo){
        this.ultimo = ultimo;
    }
    public boolean estaVazia(){
        // return primeiro==null;
        // return ultimo==null;
        return tamanho==0;
    }
    public void insereInicio (T info){
        No<T> novo = new No<T>(info);
        if (estaVazia()){
            ultimo = novo;
        }else{
            ultimo.setProximo(novo);
            novo.setProximo(primeiro);
        }
        primeiro = novo;
        tamanho ++;
    }
    public T removeInicio(){
        T info = primeiro.getInfo();
        if (tamanho == 1){
            ultimo = null;
        }else{
            ultimo.setProximo(primeiro);
        }
        tamanho--;
        primeiro = primeiro.getProximo();
        return info;
    }
}