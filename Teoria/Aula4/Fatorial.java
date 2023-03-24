public class Fatorial{
    static int fat (int n){
        int f = 1;
        while(n > 1 ){
            f = f * n;
            n--;
        }
        return f;
    }
    public static void main(String[]args){
        for(int i=0; i < 14; i++){
            System.out.println("Fatorial de " + i + " = " + fat(i))
        }
    }
}