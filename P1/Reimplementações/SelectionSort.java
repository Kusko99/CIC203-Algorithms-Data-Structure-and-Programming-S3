public class SelectionSort {
    public static void main(String[] args){

        int[]vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random()*vetor.length);
        }

        //Selection Sort
        for(int i=0; i<vetor.length;i++){
            int posicao_menor = i;
            for(int j=i+1; j<vetor.length;j++){
                if(vetor[j] < vetor[posicao_menor]){
                    posicao_menor = j;
                }
            }
            int temp = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = temp;
        }

        for(int x = 0 ; x < vetor.length; x++){
            System.out.println(vetor[x]);
        }
    }
}
