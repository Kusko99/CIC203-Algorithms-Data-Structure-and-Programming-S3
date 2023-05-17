// import java.util.Random;

public class TesteFila {
    public static void main(String[] args) {
        Fila f = new Fila();
        Fila g = new Fila();
        Fila merge = new Fila();
        System.out.println(f);
        // Random r = new Random();
        // do{
        //     if(r.nextBoolean()){ //true: enfileira
        //         f.enfilera(r.nextInt(10));
        //     }else{//false: desenfileira
        //         if(!f.estaVazia()){
        //             System.out.println(f.desenfilera() + " foi atendido");
        //         }
        //     }
        //     System.out.println(f);
        // }while(!f.estaVazia());
        f.enfilera(1);
        f.enfilera(2);
        f.enfilera(3);
        f.enfilera(4);
        f.enfilera(5);
        System.out.println(f);
        System.out.println(f.achaPosicao(3));
        System.out.println(f.achaPosicao(6));
        g.enfilera(6);
        g.enfilera(7);
        g.enfilera(8);
        g.enfilera(9);
        g.enfilera(10);
        System.out.println(g);
        merge = merge.merge(f,g);
        System.out.println(merge);
        merge.furar(99);
        System.out.println(merge);
        Pilha pilha = new Pilha(10);
        pilha.push(0);
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(6);
        pilha.push(7);
        pilha.push(8);
        pilha.push(9);
        System.out.println(pilha);
        merge.inverterFila();
        System.out.println(merge);
    }
}
