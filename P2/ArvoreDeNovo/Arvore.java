public class Arvore<TIPO extends Comparable>{
    private Elemento<TIPO> raiz;
    public Arvore(){
        this.raiz = null;
    }
    
    public Elemento<TIPO> getRaiz() {
        return raiz;
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
    public void emOrdem(Elemento<TIPO> atual){
        if(atual != null){
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getValor());
            emOrdem(atual.getDireita());
        }
    }

    public void preOrdem(Elemento<TIPO> atual){
        if(atual != null){
            System.out.println(atual.getValor());
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
        }
    }

    public void posOrdem(Elemento<TIPO> atual){
        if(atual != null){
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.println(atual.getValor());
        }
    }
}