public class NoDuplo {
    protected String element;
    protected NoDuplo next, prev; /*Ponteiro para o próximo nó e para o nó anterior */

    /*Construtor que cria um nó com os campos fornecidos */
    public NoDuplo(String e, NoDuplo p, NoDuplo n){
        this.element = e;
        this.prev = p;
        this.next = n;
    }

    public String getElement(){
        return element;
    }

    public NoDuplo getAnterior(){
        return prev;
    }

    public NoDuplo getProximo(){
        return next;
    }

    public void setElement(String e){
        this.element = e;
    }

    public void setAnterior(NoDuplo prev){
        this.prev = prev;
    }

    public void setProximo(NoDuplo next){
        this.next = next;
    }
}
