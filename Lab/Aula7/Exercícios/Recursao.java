public class Recursao {
    public int mult(int n1, int n2){
        int resultado = 0;
        for(int i = 0; i < n2; i++){
            resultado += n1;
        }
        return resultado;
    }
    public int multRec(int n1, int n2){
        if(n2 == 0){
            return 0;
        }
        if(n2 == 1){
            return n1;
        }return n1 + (multRec(n1, n2-1));
    }

    public void imprimiCresc(int n){
        if(n == 0){
            System.out.println(n);
        }else{
            imprimiCresc(n - 1);
            System.out.println(n);
        }
    }

    public void imprimiDesc(int n){
        if(n != 0){
            System.out.println(n);
            imprimiDesc(n-1);
        }else{
            System.out.println(n);
        }
    }

    public void imprimiParCresc(int n){
        if(n == 0){
            System.out.println(n);
        }else{
            imprimiParCresc(n-2);
            System.out.println(n);
        }
    }

    public void imprimiImparDesc(int n){
        if(n != 1){
            System.out.println(n);
            imprimiImparDesc(n-2);
        }else{
            System.out.println(1);
        }
    }

    public void imprimiArray(int[] v, int i){
        if(v.length-1 == i){
            System.out.print(v[i]);
        }else{
            System.out.print(v[i] + " ");
            imprimiArray(v, i+1);
        }
    }

    public int menorArray(int[] v, int i){
        if(v.length-1 == i){
            return v[i];
        }
        int menor = menorArray(v, i+1);
        if(v[i] < menor){
            return v[i];
        }return menor;        
    }

    public boolean pertenceArray(int[] v, int x, int i){
        if(i == v.length){
            return false;
        }if(v[i] == x){
            return true;
        }
        return pertenceArray(v, x, i+1);
    }

    public int Pell(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return 2* Pell(n-1) + Pell(n-2);
        }
    }

    public int MDC(int m, int n){
        if(n == 0){
            return m;
        }return MDC(n, m%n);
    }

    int calcula11 (int a, int b) {
        if (a < b) return 0;
        return 1 + calcula11(a - b, b);
    }

    int calcula12 (int a, int b) {
        if (b == 1) return a;
        return a * calcula12 (a, b - 1);
    }

    int calcula13 (int a, int b) {
        if (b == 1) return a;
        return a + calcula13 (a, b - 1);
    }
       
}
