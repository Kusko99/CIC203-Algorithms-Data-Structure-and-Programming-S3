/**Nodo de uma lista duplamente encadeade de strings */
public class DNode {
    protected String element;   //String armazenada pelo nodo
    protected DNode next, prev;       //Ponetiros paro no seguinte e anterior 
    public DNode(String e, DNode p, DNode n){
        element = e;
        prev = p;
        next = n;
    }
    /**Retorna o elemento deste nodo */
    public String getElement(){
        return element;
    }
    /**Retorna o nodo anterior a este */
    public DNode getPrev(){
        return prev;
    }
    /**Retorna o nodo seguinte a este */
    public DNode getNext(){
        return next;
    }
    /**Atribui elemento deste nodo */
    public void setElement(String newElem){
        element = newElem;
    }
    /**Atribui o nodo anterior deste nodo */
    public void setPrev(DNode newPrev){
        prev = newPrev;
    }
    /**Atribui o nodo seguinte a este nodo */
    public void setNext(DNode newNext){
        next = newNext;
    }
}
