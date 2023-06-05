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
    private String toStringRec(NoBin atual){
        if(atual != null){
            return toStringRec(atual.getEsq()) + atual + toStringRec(atual.getDir());
        }else{
            return "";
        }
    }

    public int contaNos() {
        if(raiz == null){
            return 0;
        }return contaNosRec(raiz);
    }
    private int contaNosRec(NoBin atual){
        if(atual != null){
            return contaNosRec(atual.getEsq()) + 1 + contaNosRec(atual.getDir());
        }return 0;
    }

    public int contaNaoFolha(){
        if(raiz == null){
            return 0;
        }
        return contaNaoFolhaRec(raiz);
    }

    private int contaNaoFolhaRec(NoBin atual){
        if(atual.getDir() == null && atual.getEsq() == null){
            return 0;
        }else{
            if(atual.getDir() == null){
                return contaNaoFolhaRec(atual.getEsq()) + 1;
            }else if(atual.getEsq() ==  null){
                return 1 + contaNaoFolhaRec(atual.getDir());
            }else{
                return contaNaoFolhaRec(atual.getEsq()) + 1 + contaNaoFolhaRec(atual.getDir());
            }
        }
    }

    public int contaFolha(){
        if(raiz == null){
            return 0;
        }else{
            return contaFolhaRec(raiz);
        }
    }

    private int contaFolhaRec(NoBin atual){
        int contagem = 0;
        if(atual.getDir() == null && atual.getEsq() == null){
            return 1;
        }else{
            if(atual.getDir() != null){
                contagem += contaFolhaRec(atual.getDir());
            }if(atual.getEsq() != null){
                contagem += contaFolhaRec(atual.getEsq());
            }
        }
        return contagem;
    }

    public int maior(){
        if(raiz == null){
            return -1;
        }
        return maiorRec(raiz);
    }

    private int maiorRec(NoBin atual){
        if(atual.getDir() == null){
            return atual.getInfo();
        }
        return maiorRec(atual.getDir());
    }

    public void inverte(){
        if(raiz != null){
            inverteRec(raiz);
        }
    }

    private void inverteRec(NoBin atual){
        if(atual.getDir() != null && atual.getEsq() != null){
            NoBin aux = atual.getDir();
            atual.setDir(atual.getEsq());
            atual.setEsq(aux);
        }else if(atual.getEsq() != null){
            atual.setDir(atual.getEsq());
            atual.setEsq(null);
        }else if(atual.getDir() != null){
            atual.setEsq(atual.getDir());
            atual.setDir(null);
        }
        if(atual.getDir() != null){
            inverteRec(atual.getDir());
        }
        if(atual.getEsq() != null){
            inverteRec(atual.getEsq());
        }
    }

    public boolean ehGemas(ArvoreBinariaDeBusca outraArvore){
        if(raiz == null && outraArvore.raiz == null){
            return true;
        }else if(raiz.getInfo() == outraArvore.raiz.getInfo()){
            return ehGemasRec(raiz, outraArvore.raiz);
        }else{
            return false;
        }
    }

    private boolean ehGemasRec(NoBin atualA, NoBin atualB){
        if(atualA == null && atualB == null){
            return true;
        }
        if(atualA != null && atualB != null){
            return (atualA.getInfo() == atualB.getInfo()) &&
            ehGemasRec(atualA.getDir(), atualB.getDir()) && 
            ehGemasRec(atualA.getEsq(),atualB.getEsq());
        }
        return false;
    }

    public boolean ehBinaria(){
        if(raiz == null){
            return true;
        }else{
            return ehBinariaRec(raiz);
        }
    }

    private boolean ehBinariaRec(NoBin atual){
        if(atual.getDir() == null && atual.getEsq() == null){
            return true;
        }else if((atual.getDir() != null && atual.getEsq() == null) || (atual.getDir() == null && atual.getEsq() != null)){
            return false;
        }else{
            return ehBinariaRec(atual.getDir()) && ehBinariaRec(atual.getEsq());
        }
    }

    public int menor(){
        if(raiz == null){
            return -1;
        }
        NoBin aux = raiz;
        while(aux.getEsq() != null){
            aux = aux.getEsq();
        }
        return aux.getInfo();
    }
}

