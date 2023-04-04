public class Ordination {
    public static void insertionSort(char[] a){
        int n = a.length;
        for(int i=1; i<n;i++){                  //indice do segundo caracter em a
            char cur = a[i];                    //o caracter correte a ser inserido 
            int j = i - 1;                      //inicia comparando a célula a esquerda de i
            while((j >=0) && a[j] > cur){       //enquanto a[j] está fora de ordem em relação a cur
                a[j+1] = a[j--];                //move a[j] para direita e decrementa j
            }
            a[j+1] = cur;                       //este é o local correto de cur
        }
    }
}
