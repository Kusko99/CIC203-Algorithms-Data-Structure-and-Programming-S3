import java.util.Scanner;
import java.util.Random;

public class InsertionSort {
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
    static void insertionSort(int[]v) {
        for(int i = 1; i < v.length; i++){
            int valorAtual = v[i];
            int j = i-1;
            while(j >= 0 && v[j] > valorAtual){
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = valorAtual;
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
        insertionSort(v);
        exibeVetor(v);

        scanner.close();
    }
}
