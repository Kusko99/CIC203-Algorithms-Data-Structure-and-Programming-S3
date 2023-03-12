import java.util.Random;

public class Sort {
    public void geraVetor (int[]v) {
        Random r = new Random();
        for (int i = 0; i < v.length; i++){
            v[i] = r.nextInt(v.length*10);
        }
    }
    public void exibeVetor (int v[]){
        for(int i=0; i<v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    public void bubbleSort(int[] v){
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
    public void insertionSort(int[]v) {
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
    public void selectionSort(int v[]){
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
}
