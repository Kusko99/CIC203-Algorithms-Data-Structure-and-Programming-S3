import java.util.Random;

public class TesteFila {
    public static void main(String[] args) {
        Fila f = new Fila();
        System.out.println(f);
        Random r = new Random();
        do{
            if(r.nextBoolean()){ //true: enfileira
                f.enfilera(r.nextInt(10));
            }else{//false: desenfileira
                if(!f.estaVazia()){
                    System.out.println(f.desenfilera() + " foi atendido");
                }
            }
            System.out.println(f);
        }while(!f.estaVazia());
    }
}
