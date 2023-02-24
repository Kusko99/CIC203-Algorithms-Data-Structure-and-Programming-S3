import java.util.Scanner;

public class Soma1aN {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        double n;
        do{
            System.out.print("digite um valor maior que 1: ");
            n = scanner.nextDouble(); 
        }while (n <= 0);
        int i;
        double soma;
        // for (i=2, soma=1.0; i<=n; soma += i++);
        // System.out.println("\nsoma = " + soma);
        soma = (1+n) * (n/2);
        System.out.println("\nsoma = " + soma);
        scanner.close();
    }
}
