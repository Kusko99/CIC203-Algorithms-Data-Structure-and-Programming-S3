public class RecursaoCresecente {
    static void exibeIteratiov(int n){
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
    static void exibeRec1(int a, int b){
        if(a <= b){
            System.out.println(a);
            exibeRec1(a + 1, b);
        }
    }
    static void exibeRec2(int a){
        if(a > 1) exibeRec2(a - 1);
        System.out.println(a);
    }
    
    public static void main(String[] args) {
        exibeRec2(5);
    }
}