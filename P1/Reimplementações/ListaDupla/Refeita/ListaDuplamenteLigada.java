public class ListaDuplamenteLigada {
    protected NoDuplo header;
    protected NoDuplo trailer;
    protected int size;

    public ListaDuplamenteLigada(){
        header = new NoDuplo(null, null, null);
        trailer = new NoDuplo(null, null, null);
        header.setProximo(trailer);
        size = 0;
    }

    public void addFrist(NoDuplo no){
        NoDuplo w;

        w = header.getProximo();
        no.setProximo(w);
        no.setAnterior(header);
        w.setAnterior(no);
        header.setProximo(no);
        size = size + 1;
    }

    public int size(){
        return size;
    }

    public boolean estaVazia(){
        return(size == 0);
    }

    public NoDuplo getPrimeiro(){
        return header.getProximo();
    }

    public NoDuplo getUltimo(){
        return trailer.getAnterior();
    }
}
