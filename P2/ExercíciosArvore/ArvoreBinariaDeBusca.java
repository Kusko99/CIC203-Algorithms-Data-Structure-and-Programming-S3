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
    // in ordem
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
    //pré-ordem
    // public String toString(){
    //     if(raiz == null){
    //         return "arvóre vazia";
    //     }else{
    //         return toStringRec(raiz);
    //     }
    // }
    // private String toStringRec(NoBin atual){
    //     if(atual != null){
    //         return atual + toStringRec(atual.getEsq()) + toStringRec(atual.getDir());
    //     }else{
    //         return "";
    //     }
    // }
    //pós-ordem
    // public String toString(){
    //     if(raiz == null){
    //         return "arvóre vazia";
    //     }else{
    //         return toStringRec(raiz);
    //     }
    // }
    // private String toStringRec(NoBin atual){
    //     if(atual != null){
    //         return toStringRec(atual.getEsq()) + toStringRec(atual.getDir()) + atual;
    //     }else{
    //         return "";
    //     }
    // }
    public int contaNos(){
        if(raiz == null){
            return 0;
        }else{
            return contaNosRec(raiz);
        }
    }
    private int contaNosRec(NoBin atual){
        if(atual != null){
            return contaNosRec(atual.getDir()) + 1 + contaNosRec(atual.getEsq());
        }else{
            return 0;
        }
    }
    public int contaNaoFolha(){
        if(raiz == null){
            return 0;
        }else{
            return contaNaoFolhaRec(raiz);
        }
    }
    private int contaNaoFolhaRec(NoBin atual){
        int contagem = 0;
        if(atual.getDir() != null || atual.getEsq() != null){
            contagem ++;
            if(atual.getDir() != null){
                contagem += contaNaoFolhaRec(atual.getDir());
            }
            if(atual.getEsq() != null){
                contagem += contaNaoFolhaRec(atual.getEsq());
            }
            return contagem;
        }else{
            return 0;
        }
    }
    public int contaFolhas(){
        if(raiz == null){
            return 0;
        }if(raiz.getDir() == null && raiz.getEsq() == null){
            return 1;
        }else{
            return contaFolhasRec(raiz);
        }
    }
    private int contaFolhasRec(NoBin atual){
        int contagem = 0;
        if(atual.getDir() == null && atual.getEsq() == null){
            return 1;
        }else{
            if(atual.getDir() != null){
                contagem += contaFolhasRec(atual.getDir());
            }if(atual.getEsq() != null){
                contagem += contaFolhasRec(atual.getEsq());
            }
        }
        return contagem;
    }
    public int maior(){
        if(raiz == null){
            return -1;
        }
        NoBin atual = raiz.getDir();
        while(atual.getDir() != null){
            atual = atual.getDir();
        }

        return atual.getInfo();
    }
    public void espelho(){
        if(raiz != null){
            espelhoRec(raiz);
        }
    }
    private void espelhoRec(NoBin atual){
        NoBin aux = atual.getDir();
        atual.setDir(atual.getEsq());
        atual.setEsq(aux);
        if(atual.getDir() != null){
            espelhoRec(atual.getDir());
        }if(atual.getEsq() != null){
            espelhoRec(atual.getEsq());
        }
    }
    public boolean iguais(ArvoreBinariaDeBusca outraArvore) {
        return iguaisRec(raiz, outraArvore.raiz);
    }
    
    private boolean iguaisRec(NoBin atual1, NoBin atual2) {
        if (atual1 == null && atual2 == null) {
            return true; // Ambos os nós são nulos, portanto são iguais
        }
        if (atual1 != null && atual2 != null) {
            // Verifica se os valores são iguais e continua a comparação recursivamente
            return (atual1.getInfo() == atual2.getInfo()) &&
                    iguaisRec(atual1.getEsq(), atual2.getEsq()) &&
                    iguaisRec(atual1.getDir(), atual2.getDir());
        }
        return false; // Um dos nós é nulo, portanto são diferentes
    }
    public boolean ehBinaria(){
        if(raiz.getDir() != null || raiz.getEsq() != null){
            return ehBinariaRec(raiz);
        }else{
            return true;
        }
    }
    private boolean ehBinariaRec(NoBin atual){
        if(atual.getDir() == null && atual.getEsq() == null){
            return true;
        }if((atual.getDir() != null && atual.getEsq() == null) || (atual.getDir() == null && atual.getEsq() != null)){
            return false;
        }
            return ehBinariaRec(atual.getDir()) && ehBinariaRec(atual.getEsq());
    }
    public int menor(){
        if(raiz == null){
            return -1;
        }
        NoBin atual = raiz.getEsq();
        while(atual.getEsq() != null){
            atual = atual.getEsq();
        }

        return atual.getInfo();
    }
}

