public class BuscaSimples {
    static int buscaSimples (int[]v, int x){
        for(int i=0; i<v.length;i++){
            if(v[i] == x){
                return i;
            }
        }
        return -1;
    }
}

//Para o lar: 
// 1.modificar o algoritimo da busca simples,para devolver o número de ocorrências do elemento x em v
// 2.modificar o algoritimo da busca simples,para devolver a lista de posições onde o elemento aparece 