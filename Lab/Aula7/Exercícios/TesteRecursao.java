public class TesteRecursao {
    public static void main(String[] args) {
        Recursao recursao = new Recursao();

        //Exercício 1
        System.out.println("**Exercício 1**");
        System.out.println(recursao.mult(5, 10));
        System.out.println(recursao.multRec(5, 10));
        System.out.println();

        //Exercício 2
        System.out.println("**Exercício 2**");
        recursao.imprimiCresc(10);
        System.out.println();

        //Exercício 3
        System.out.println("**Exercício 3**");
        recursao.imprimiDesc(10);
        System.out.println();

        //Exercício 4
        System.out.println("**Exercício 4**");
        recursao.imprimiParCresc(10);
        System.out.println();

        //Exercício 5
        System.out.println("**Exercício 5**");
        recursao.imprimiImparDesc(11);
        System.out.println();

        //Exercício 6
        System.out.println("**Exercício 6**");
        int[]v = {1,2,3,4,5};
        recursao.imprimiArray(v, 0);
        System.out.println();
        System.out.println();

        //Exercício 7
        System.out.println("**Exercício 7**");
        System.out.println(recursao.menorArray(v, 0));
        System.out.println();

        //Exercício 8
        System.out.println("**Exercício 8**");
        System.out.println(recursao.pertenceArray(v, 2, 0));
        System.out.println(recursao.pertenceArray(v, 10, 0));
        System.out.println();

        //Exercício 9
        System.out.println("**Exercício 9**");
        System.out.println(recursao.Pell(10));
        System.out.println();

        //Exercício 10
        System.out.println("**Exercício 10**");
        System.out.println(recursao.MDC(45, 23));
        System.out.println(recursao.MDC(40, 20));
        System.out.println();

        //Exercício 11
        System.out.println("**Exercício 11**");
        System.out.println(recursao.calcula11(2, 3));
        System.out.println();

        //Exercício 12
        System.out.println("**Exercício 12**");
        System.out.println(recursao.calcula12(2, 3));
        System.out.println();

        //Exercício 13
        System.out.println("**Exercício 13**");
        System.out.println(recursao.calcula13(2, 3));
        System.out.println();
    }
}
