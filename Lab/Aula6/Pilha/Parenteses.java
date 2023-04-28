import java.util.Scanner;

public class Parenteses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua expressão: ");
        String expressao = scanner.next();

        Pilha p = new Pilha();
        int i=0;
        boolean erro = false;
        while(!erro && i<expressao.length()){
            if(expressao.charAt(i) == '('){
                p.push('(');
            }else if(!p.estaVazia()){
                p.pop();
            }else{
                erro = true;
            }
            i++;
        }
        if(!erro && p.estaVazia()){
            System.out.println("expressão correta");
        }else{
            System.out.println("expressão não correta");
        }
        scanner.close();
    }
}
