public class TesteArvore {
    public static void main(String[] args) {
        ArvoreBinariaDeBusca carioca = new ArvoreBinariaDeBusca();
        carioca.insere(4);
        carioca.insere(2);
        carioca.insere(1);
        carioca.insere(3);
        carioca.insere(6);
        carioca.insere(5);
        carioca.insere(10);
        carioca.insere(8);

        ArvoreBinariaDeBusca caliope = new ArvoreBinariaDeBusca();
        caliope.insere(4);
        caliope.insere(2);
        caliope.insere(1);
        caliope.insere(3);
        caliope.insere(6);
        caliope.insere(5);
        caliope.insere(10);
        caliope.insere(8);
        
        System.out.println(caliope.ehGemas(carioca));
        System.out.println(carioca.menor());
    }
}
