public class ArvoreBinariaDeBusca {
    private class NoBin{
        private int info;
        private NoBin esq;
        private NoBin dir;
        public NoBin(int info){
            this.info = info;
        }
        public int getInfo() {
            return info;
        }
        public NoBin getEsq() {
            return esq;
        }
        public NoBin getDir() {
            return dir;
        }
        public void setInfo(int info) {
            this.info = info;
        }
        public void setEsq(NoBin esq) {
            this.esq = esq;
        }
        public void setDir(NoBin dir) {
            this.dir = dir;
        }
        @Override
        public String toString() {
            return "[" + info + "]";
        }
    }
    private NoBin raiz;
    //construtor padrão -> "zera" a raiz
    //get e set não são necessários, pois não é interressante informar a raiz
    public void insere (int info){
        NoBin novo = new NoBin(info);
        if(raiz == null){
            raiz = novo;
        }else{
            insereRec(novo,raiz);
        }
    }
    private void insereRec(NoBin novo, NoBin atual){
        if(novo.getInfo() <= atual.getInfo()){ //vai pra esquerda
            if(atual.getEsq() == null){
                atual.setEsq(novo);
            }else{
                insereRec(novo, atual.getEsq());
            }
        }else{//Vai pra direita
            if(atual.getDir() == null){
                atual.setDir(novo);
            }else{
                insereRec(novo, atual.getDir());
            }
        }
    }
    @Override
    public String toString(){
        if(raiz == null){
            return "arvóre vazia";
        }else{
            return toStringRec(raiz);
        }
    }
    public String toStringRec(NoBin atual){
        if(atual != null){
            return toStringRec(atual.getEsq()) + atual + toStringRec(atual.getDir());
        }else{
            return "";
        }
    }
}
