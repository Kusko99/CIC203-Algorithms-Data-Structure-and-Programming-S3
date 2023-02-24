public class BuscaBinaria {
    static int buscaBinaria(int[]v,int x){
        int ini = 0;
        int fim = v.length-1;
        while(ini <= fim){
            int meio=(ini+fim)/2;
            if(x == v[meio]){
                return meio;
            }
            if(x<v[meio]){
                fim = meio - 1;
            }else{
                ini = meio+1;
            }
        }
        return -1;  
    }
}
//Para o lar:
//3. Construa uma adaptação na busca binária para devolver o número de ocorrências do elemento procurado