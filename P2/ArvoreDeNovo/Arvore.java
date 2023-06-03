public class Arvore<TIPO extends Comparable>{
    private Elemento<TIPO> raiz;
    public Arvore(){
        this.raiz = null;
    }
    public void adicionar(TIPO valor){
        Elemento<TIPO> novElemento = new Elemento<TIPO>(valor);
        if(raiz == null){
            this.raiz = novElemento;
        }else{
            Elemento<TIPO> atual = this.raiz;
            while(true){
                if(novElemento.getValor().compareTo(atual.getValor()) == -1){
                    if(atual.getEsquerda() != null){
                        atual = atual.getEsquerda();
                    }else{
                        atual.setEsquerda(novElemento);
                        break;
                    }
                }else{
                    if(atual.getDireita() != null){
                        atual = atual.getDireita();
                    }else{
                        atual.setDireita(novElemento);
                        break;
                    }
                }
            }
        }
    }
}