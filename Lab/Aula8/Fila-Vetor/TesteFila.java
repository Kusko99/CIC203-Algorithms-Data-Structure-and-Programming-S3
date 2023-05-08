import java.util.Random;

public class TesteFila {
    public static void main(String[] args) {
        Random r = new Random();
        Fila f = new Fila();
        // while(!f.estaCheia()){
        //     f.enfilera(r.nextInt(10));
        //     System.out.println(f);
        // }

        do{
            if(r.nextInt(2) == 0){ //par: enfilera
                if(!f.estaCheia()){
                    f.enfilera(r.nextInt(10));
                }
            }else{ //impar: desenfilera
                if(!f.estaVazia()){
                    System.out.println(f.desenfilera() + " foi atendido");
                }
            }
            System.out.print((f + " // "));
            System.out.println(f.oVetor());
        }while(!f.estaVazia());
    }
}
