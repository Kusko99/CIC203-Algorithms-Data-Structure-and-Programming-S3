import java.util.Date;
import java.util.Random;

public class Recursao{
    static void geraVetor(int[] v){
        Random r = new Random();
        for(int i=0; i<v.length; i++){
            v[i] = r.nextInt(v.length * 10);
        }
    }
    static void exibeVetor(int[] v){
        System.out.println();
        for(int i=0; i<v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    static int soma(int[] v){
        int s=0;
        for(int i=0; i<v.length; i++){
            s = s + v[i];
        }
        return s;
    }
    static int somaRec(int[] v, int i){
        if(i == v.length - 1){
            return v[i];
        }
        return v[i] + somaRec(v, i+1);
    }
    static int maiorRec(int[] v, int i){
        if(i==0){
            return v[0];
        }
        int m = maiorRec(v, i-1);
        if(v[i] > m){
            return v[i];
        }
        return m;

        //return Math.max(v[i],maiorRec(v,i-1));  
    }
    static int fatorial(int n){
        if(n==0){
            return 1;
        }
        return n*fatorial(n-1);
    }
    static int fibonacci(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    static int partition(int[] v, int p, int r){
        int i = p - 1, j;
        int x = v[r];
        for(j=p; j<r; j++){
            if(v[j] <= x){
                i++;
                int aux = v[j];
                v[j] = v[i];
                v[i] = aux;
            }
        }
        i++;
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
        return i;
    }
    static void quickSort(int[] v, int p, int r){
        System.out.print("p = " + p + ", r = " + r);
        if(p<r){
            int q = partition(v, p, r);
            System.out.println(", q = " + q);
            quickSort(v, p, q-1);
            quickSort(v, q+1, r);
        }
    }
    public static void main(String[] args) {
        int[] v = new int[30];
        geraVetor(v);
        //exibeVetor(v);
        // System.out.println("soma = " + soma(v));
        // System.out.println("soma recursiva = " + somaRec(v, 0));
        // System.out.println("maior = " + maiorRec(v, v.length-1));
        // System.out.println("10 fatorial = " + fatorial(10));
        // System.out.println("fibonacci em 10: " + fibonacci(10));
        // System.out.println("Sequencia de fibonacci: ");
        // for(int n = 0; n<20; n++){
        //     System.out.print(fibonacci(n) + " ");
        // }
        long ini = new Date().getTime();
        quickSort(v, 0, v.length-1);
        long fim = new Date().getTime();
        System.out.println("tempo quick 1a vez: " + (fim-ini));
        //exibeVetor(v);
        ini = new Date().getTime();
        quickSort(v, 0, v.length-1);
        fim = new Date().getTime();
        System.out.println("tempo quick 2a vez: " + (fim-ini));
    }
}