import java.util.Scanner;

public class Fatorial {
    static double fat1 (int n){
        double f = 1;
        for (int i=2; i<=n; i++){
            f = f*i;
        }
        return f;
    }

    public static void main (String args[]){
        Scanner scanner =  new Scanner(System.in);
        int n;
        do{
            System.out.print("Digite um valor maior que 1: ");
            n = scanner.nextInt();
        }while(n < 0);
        for (int i=0; i <=n; i++){
            System.out.println("fatorial de " + i + " = " + fat1(i));
        }
        scanner.close();
    }
}
