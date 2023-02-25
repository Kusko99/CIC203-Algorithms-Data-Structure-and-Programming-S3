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
    
    static int buscaBinariaEx1(int[]v,int x){
        int ini = 0, ocorrencias = 0;
        int fim = v.length-1;
        while(ini <= fim){
            int meio=(ini+fim)/2;
            if(x == v[meio]){
                ocorrencias +=1;
                int achado = meio;
                while(x == v[meio+1]){
                    ocorrencias += 1;
                    meio += 1;
                }
                while(x == v[achado-1]){
                    ocorrencias +=1;
                    achado -= 1;
                }
                return ocorrencias;
            }
            if(x<v[meio]){
                fim = meio - 1;
            }else{
                ini = meio+1;
            }
        }
        return ocorrencias;  
    }
}
//Para o lar:
//3. Construa uma adaptação na busca binária para devolver o número de ocorrências do elemento procurado
