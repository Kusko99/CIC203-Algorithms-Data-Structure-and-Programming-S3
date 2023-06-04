public class TesteFila {
    public static void main(String[] args) {
        Fila gabriel = new Fila(6);
        gabriel.enfilera(0);
        gabriel.enfilera(1);
        gabriel.enfilera(2);
        gabriel.enfilera(3);
        gabriel.enfilera(4);
        Fila kusko = new Fila();
        kusko.enfilera(0);
        kusko.enfilera(1);
        kusko.enfilera(2);
        kusko.enfilera(3);
        kusko.enfilera(4);
        kusko.enfilera(5);
        kusko.enfilera(6);
        // System.out.println(gabriel.encontraPosicao(0));//1
        // System.out.println(gabriel.encontraPosicao(2));//3
        // System.out.println(gabriel.encontraPosicao(4));//5
        // System.out.println(gabriel.encontraPosicao(5));//-1
        // Fila merge = gabriel.merge(gabriel, kusko);
        // System.out.println(merge);

        // System.out.println(gabriel);
        // gabriel.furarFila(99);
        // System.out.println(gabriel);
        // gabriel.inverter();
        System.out.println(gabriel);
        gabriel.menor();
        System.out.println(gabriel);
    }
}
