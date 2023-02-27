import java.util.Random;
import java.util.Scanner;
import java.util.Date;
public class TesteVetores{
    static void geraVetor(int[] v){
        Random random = new Random();
        for (int i=0; i < v.length;i++){
            v[i] = random.nextInt(10*v.length);
        }
    }
    static void exibirVetor(String msg,int[] v){
        System.out.println("\n" + msg);
        for(int i=0; i<v.length;i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    static void bubbleSort(int[] v){
        for(int i=1; i<v.length; i++){
            for(int j=0;j<v.length-i; j++){
                if(v[j] > v[j+1]){
                    int temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }
        }
    }
    //adaptar as buscas para devolver o contador de iterações também
    //teremos um vetor de resultados:
    // ->posição 0 contém o resultado da busca
    // ->posição 1 contém o resultado de iterações
    static int[] buscaSimples(int x, int[] v){
        int[] result = new int[2];
        result[1]=0;
        for(int i=0; i<v.length; i++){
            result[1] ++;
            if( x== v[i]){
                result[0] = i;
                return result;
            }
        }   
        result[0] = -1;
        return result;
    }
    static int[] buscaBinaria(int x, int[] v){
        int ini = 0;
        int fim = v.length - 1;
        int[] result = new int[2];
        result[1] = 0;
        while(ini <= fim){
            result[1]++;
            int meio = (fim - ini) /2;
            if(x == v[meio]){
                result[0] = meio;
                return result;
            }
            if( x > v[meio]){
                ini = meio + 1;
            }else{
                fim = meio - 1;
            }
        }
        result[0] = -1;
        return result;
    }
    public static void main(String[] args) {
        int v[], n;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("\nDigite o tamanho do vetor: ");
            n = scanner.nextInt();
            if(n > 0){
                v = new int[n];
                geraVetor(v);
                exibirVetor("vetor gerado:",v);
                System.out.print("\nDigite o elemento para busca: ");
                int x = scanner.nextInt();
                int[] result = buscaSimples(x, v);
                if(result[0] == -1){
                    System.out.println("\n" + x + " não foi encontrado pelo busca simples");
                }else{
                    System.out.println("\n" + x + " encontrado pela busca simples na posição " + result[0]);
                }
                System.out.println("\nA busca simples realizou " + result[1] + " iterações");
                long inicio = new Date().getTime();
                bubbleSort(v);
                long fim = new Date().getTime();
                System.out.println("Demorou " + (fim-inicio) + " milissegundos");
                exibirVetor("vetor ordenado pelo bubble:",v);
                result = buscaBinaria(x, v);
                if(result[0] == -1){
                    System.out.println("\n" + x + " não foi encontrado pelo busca binária");
                }else{
                    System.out.println("\n" + x + "encontrado pela busca  binária na posição " + result[0]);
                }
                System.out.println("\nA busca binária realizou " + result[1] + " iterações");
            }
        }while(n>0);
        scanner.close();
    }
}
