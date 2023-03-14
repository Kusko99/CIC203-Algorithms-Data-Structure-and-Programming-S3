import java.util.Date;

public class TesteSort {
    public static void main(String[] args) {

        //ALTERAR SOMENTE ESSA VALORES
        int tamanhoVetor = 10000;
        int numeroTestes = 10;

        Sort sort = new Sort();
        Vetor criaVetor = new Vetor();

        int[] vetor = new int[tamanhoVetor];

        System.out.print("***********************\n");
        System.out.print("****COMEÇO DO TESTE****\n");
        System.out.print("***********************\n");
        System.out.print("\n\n");

        for(int i = 1; i <= numeroTestes; i++){
            criaVetor.geraVetor(vetor);
            long ini = new Date().getTime();

            //Chamada do Método Sort
            sort.bubbleSort(vetor);

            long fim = new Date().getTime();
            System.out.print("Teste: " + i + "  Tempo: " + (fim-ini) + " milissegundos\n");
        }

        System.out.print("\n\n");
        System.out.print("************************\n");
        System.out.print("******FIM DO TESTE******\n");
        System.out.print("************************\n");
        System.out.print("\n\n");
    }
}
