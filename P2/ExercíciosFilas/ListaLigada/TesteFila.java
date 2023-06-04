import javax.print.attribute.standard.Media;

public class TesteFila {
    public static void main(String[] args) {
        Fila kusko = new Fila();
        kusko.enfilera(0);
        kusko.enfilera(1);
        kusko.enfilera(2);
        kusko.enfilera(3);
        kusko.enfilera(4);
        kusko.enfilera(5);
        kusko.enfilera(6);

        Fila gabriel = new Fila();
        gabriel.enfilera(0);
        gabriel.enfilera(1);
        gabriel.enfilera(2);
        gabriel.enfilera(3);
        gabriel.enfilera(4);

        // System.out.println(kusko.encontrePosicao(0));//1
        // System.out.println(kusko.encontrePosicao(2));//3
        // System.out.println(kusko.encontrePosicao(4));//5
        // System.out.println(kusko.encontrePosicao(5));//-1
        // Fila merge = kusko.merge(gabriel);
        // System.out.println(merge);

        // System.out.println(kusko);
        // kusko.furarFila(99);
        // System.out.println(kusko);
        // kusko.inverter();

        System.out.println(kusko.menor());
        System.out.println(kusko);
    }
}
