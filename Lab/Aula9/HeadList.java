public class HeadList <T>{
    class No<T>{
        private T info;
        private No<T> proximo;
        public No(T info){
            this.info = info;
            this.proximo = null;
        }
        public T getInfo() {
            return info;
        }
        public void setInfo(T info) {
            this.info = info;
        }
        public No<T> getProximo() {
            return proximo;
        }
        public void setProximo(No<T> proximo) {
            this.proximo = proximo;
        }
        @Override
        public String toString() {
            return "No [info=" + info + "]";
        }
    }
    private No<T> head;
    public HeadList (){
        No<T> head = new No<T>(null);
    }
    public boolean estaVazia(){
        return head.getProximo() == null;
    }
    public void insereInicio(T info){
        No<T> novo = new No<T> (info);
        novo.setProximo(head.getProximo());
        head.setProximo(novo);
    }
    public T removeInicio(){
        T aux = head.getProximo().getInfo();
        head.setProximo(head.getProximo().getProximo());
        return aux;
    }
    @Override
    public String toString(){
        if(estaVazia()) return "lista vazia";
        String s = "";
        No<T> runner = head.getProximo();
        while(runner != null){
            s += runner.getInfo();
            runner = runner.getProximo();
        }
        return s;
    }
}
