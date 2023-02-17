import java.util.Random;
import java.util.Scanner;

public class BubbleSort{  
    static void geraVetor (int[]v) {
        Random r = new Random();
        for (int i = 0; i < v.length; i++){
            v[i] = r.nextInt(v.length*10);
        }
    }
    static void exibeVetor (int v[]){
        for(int i=0; i<v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    static void bubbleSort(int[] v){
        for(int i=1;i<v.length; i++){
            for(int j=0;j<v.length-1;j++){
                if(v[j] > v[j+1]){
                    int temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        n = scanner.nextInt();
        int[] v = new int[n];
        geraVetor(v);
        exibeVetor(v);
        bubbleSort(v);
        exibeVetor(v);

        scanner.close();
    }
}
