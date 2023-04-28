public class RecursaoDescrente {
    static void exibeIteratio(int n){
        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }
    }
    static void exibeRec1(int a, int b){
        if(a >= b){
            System.out.println(a);
            exibeRec1(a - 1, b);
        }
    }
    static void exibeRec2(int a){
        System.out.println(a);
        if(a > 1){
            exibeRec2(a - 1);
        }
        
    }

    public static void main(String[] args) {
        // exibeIteratio(5);
        // exibeRec1(15, 1);
        exibeRec2(10);
    }
}

