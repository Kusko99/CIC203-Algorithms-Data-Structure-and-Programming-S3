import java.util.Scanner;
import java.util.Random;

public class SelectionSort {
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
    static void selectionSort(int v[]){
        for(int i = 0; i<v.length; i++){
            for(int j = 0; j<v.length; j++){
                if(v[i] < v[j]){
                    int temp = v[j];
                    v[j] = v[i];
                    v[i] = temp;
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
        selectionSort(v);
        exibeVetor(v);

        scanner.close();
    }
}
