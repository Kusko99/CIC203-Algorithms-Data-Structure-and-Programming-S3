public class BubbleSort {
    public static void main (String[] args){
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        System.out.println("Fim do vetor original");

        //BUBBLE SORT
        for(int i = 0; i<vetor.length;i++){
            for(int j = i + 1; j<vetor.length;j++){
                if(vetor[i] > vetor[j]){
                    int temp = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = temp;
                }
            }   
        }

        System.out.println("Vetor ordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
