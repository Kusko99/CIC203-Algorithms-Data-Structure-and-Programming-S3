public class Fibonnacci{
    static int fib(int n){
        if(n<3){
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }
    public static void main(String[]args){
        for(int i = 1; i<47; i++){
            System.out.println("Fibonnacci " + i + " = " + fib(i));
        }
    }
}