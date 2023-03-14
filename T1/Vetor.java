import java.util.Random;

public class Vetor {
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
}
