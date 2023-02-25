public class BuscaSimples {
    static int buscaSimples (int[]v, int x){
        for(int i=0; i<v.length;i++){
            if(v[i] == x){
                return i;
            }
        }
        return -1;
    }
    static int buscaSimplesEx1 (int[]v, int x){
        int ocorrencias = 0;
        for(int i=0; i<v.length;i++){
            if(v[i] == x){
                ocorrencias += 1;
            }
        }
        return ocorrencias;
    }
    static int[] buscaSimplesEx2 (int[]v, int x){
        int[]posições = new int[v.length];
        int elemento = 0;
        for(int i=0; i<v.length;i++){
            if(v[i] == x){
                posições[elemento] = i;
                elemento += 1;
            }
        }
        return posições;
    }
}

//Para o lar: 
// 1.modificar o algoritimo da busca simples,para devolver o número de ocorrências do elemento x em v
// 2.modificar o algoritimo da busca simples,para devolver a lista de posições onde o elemento aparece 
