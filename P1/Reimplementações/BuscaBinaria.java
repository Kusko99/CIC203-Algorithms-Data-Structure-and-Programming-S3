import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args){
        int[] vetor = new int[8];

        for(int i=0; i<vetor.length; i++){
            vetor[i] =  (int) ((Math.random() * vetor.length)*10);
        }

        
        for(int i = 0; i<vetor.length;i++){
            for(int j = i + 1; j<vetor.length;j++){
                if(vetor[i] > vetor[j]){
                    int temp = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = temp;
                }
            }   
        }

        for(int i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }

        System.out.println("Qual número você busca?");
        Scanner scanner = new Scanner(System.in);
        int buscado = scanner.nextInt();

        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio = 0;
        int posicaoAchada = 0;
        int ocorrencias = 0;
        while(inicio <= fim && !achou){
            meio = (int) ((inicio + fim)/ 2);
            if(vetor[meio] == buscado){
                achou = true;
                posicaoAchada = meio;
                ocorrencias ++;
            }else if(vetor[meio] < buscado){
                inicio = meio + 1;
            }else{ //só pode ser maior
                fim = meio - 1;
            }
        }

        while(vetor[meio] == buscado){
            if(vetor[meio-1] ==  buscado){
                ocorrencias++;
            }
            meio --;
        }
        while(vetor[posicaoAchada] == buscado){
            if(vetor[posicaoAchada+1] == buscado ){
                ocorrencias++;
            }
            posicaoAchada ++;
        }

        if(achou == true){
            System.out.println("Achou");
            System.out.println(ocorrencias);
        }else{
            System.out.println("Não Achou");
        }

        scanner.close();
    }
}
