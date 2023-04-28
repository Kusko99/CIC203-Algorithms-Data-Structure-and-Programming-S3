import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua palavra para descobrir se ela é palíndrome: ");
        String palavra = scanner.next();

        Pilha p = new Pilha();
        for(int i = 0; i < palavra.length(); i++){
            p.push(palavra.charAt(i));
        }
        boolean notIgual = false;
        int j = 0;
        while(!notIgual && j< palavra.length()){
            char temp = p.pop();
            if(temp != palavra.charAt(j)){
                notIgual = true;
            }
            j++;
        }
        if(p.estaVazia()){
            System.out.println("É palíndrome");
        }else{
            System.out.println("Não é palíndrome");
        }
        scanner.close();
    }
}
