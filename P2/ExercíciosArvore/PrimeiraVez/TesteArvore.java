public class TesteArvore {
    public static void main(String[] args) {
        ArvoreBinariaDeBusca arvore1 = new ArvoreBinariaDeBusca();
        arvore1.insere(10);
        arvore1.insere(15);
        arvore1.insere(5);
        arvore1.insere(13);
        arvore1.insere(51);
        arvore1.insere(2);
        arvore1.insere(1);
        arvore1.insere(7);
        arvore1.insere(99);

        ArvoreBinariaDeBusca arvore2 = new ArvoreBinariaDeBusca();

        arvore2.insere(10);
        arvore2.insere(15);
        arvore2.insere(5);
        arvore2.insere(13);
        arvore2.insere(51);
        arvore2.insere(2);
        arvore2.insere(1);
        arvore2.insere(7);
        arvore2.insere(99);
        arvore2.insere(99);

        ArvoreBinariaDeBusca arvore3 = new ArvoreBinariaDeBusca();
        arvore3.insere(10);
        arvore3.insere(5);
        arvore3.insere(15);
        arvore3.insere(1);
        arvore3.insere(7);
        arvore3.insere(13);
        arvore3.insere(22);


        // System.out.println(arvore1.contaNos());
        // // System.out.println(arvore.contaNaoFolha());
        // System.out.println(arvore1.contaFolhas());
        // System.out.println(arvore1.Maior());
        // arvore1.espelho();

        // System.out.println(arvore1.iguais(arvore2));

        // System.out.println(arvore1.ehBinaria());
        // System.out.println(arvore2.ehBinaria());
        // System.out.println(arvore3.ehBinaria());

        System.out.println(arvore1.menor());
        System.out.println(arvore1.maior());
    }
}
