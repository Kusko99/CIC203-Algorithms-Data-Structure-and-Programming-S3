import java.lang.Math;
import java.util.Scanner;
public class BuscaSimples{
    public static void main(String[]args){
        int[] vetor = new int[100];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 10);
            System.out.println(vetor[i]);
        }

        System.out.println("Qual número você busca? ");
        Scanner scanner = new Scanner(System.in);
        int buscado = scanner.nextInt();
        scanner.close();
        boolean achado = false;
        int ocorrencias = 0;
        int posicoes[] = new int[vetor.length];

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == buscado){
                achado = true;
                posicoes[ocorrencias] = i;
                ocorrencias ++;
            }
        }

        int[] chaves = new int[ocorrencias];
        for(int i = 0; i < ocorrencias; i++){
            chaves[i] = posicoes[i];
        }

        if(achado){
            System.out.println("Achou");
            for(int i = 0; i < ocorrencias; i++){
                System.out.println(ocorrencias);
                System.out.println(chaves[i]);
            }
        }else{
            System.out.println("Não Achou");
        }

        
    }
}