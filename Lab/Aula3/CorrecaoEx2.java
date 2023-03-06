import java.util.Scanner;
import java.util.Random;

public class CorrecaoEx2 {
        
    static int[] buscaComLista (int[] v, int x) {
        int[] pos = new int[v.length+1];
        int i, j;
        for (i=0, j=0; i<v.length; i++) {
            if (v[i] == x) {
                pos[++j] = i;
            }
        }
        pos[0] = j;
        return pos;
    }
    
    static void geraVetor (int[] v) {
        Random random = new Random();
        for (int i=0; i < v.length; i++) 
            v[i] = random.nextInt(10*v.length);
    }
    static void exibeVetor (String msg, int[] v) {
        System.out.println("\n" + msg);
        for (int i=0; i<v.length; i++) 
            System.out.print (v[i] + " ");
        System.out.println();
    }
    
    
    public static void main (String[] args) {
        int v[], n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print ("\ndigite o tamanho do vetor: ");
            n = scanner.nextInt();
            if (n > 0) {
                System.out.print ("\ndigite o elemento para busca: ");
                int x = scanner.nextInt();
                v = new int[n];
                geraVetor(v);
                exibeVetor("vetor gerado:", v);
                int[] result = buscaComLista(v, x);

                if (result[0] == 0) {
                    System.out.println("elemento não encontrado na lista");
                }
                else {
                    System.out.println("posicoes em que " + x + " aparece");
                    for (int i=1; i<=result[0]; i++){
                        System.out.print(result[i] + " ");
                    }
                }           
            }
        } while (n>0);
        scanner.close();
    }
}