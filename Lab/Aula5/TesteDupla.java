public class TesteDupla{
    public static void main(String[] args) {
        ListaDuplaCircular ldc = new ListaDuplaCircular();
        for (int i=1; i<=10; i++){
            if(i%2 == 0){
                ldc.insereInicio(i);
                System.out.println("inicio");

            }
            else{
                ldc.insereFim(i);
                System.out.println("fim");
            }
            System.out.println(ldc);
        }

        System.out.println(ldc.consultarPrimeiro());
        System.out.println(ldc.consultarUltimo());
        

        while(!ldc.estaVazia()){
            //fazer teste de vazia sempre
            System.out.println(ldc.removeInicio() + " foi removido do inicio");
            //fazer teste de vazia sempre
            System.out.println(ldc.removeFim() + " foi removido do final");
            System.out.println(ldc);
        }
    }

    //Divertimentos!!
    //um método para
    //devolver o tamanho da lista
    //remover um elemento de uma posição pos
    //verificar se um elemento aparece ou não na lista
    //remover um elemento espscífico da lista
    //consultar primeiro
    //consultar ultimo

    //novos métodos para as duas listas:
    //inverter uma lista
    //a partir de uma lista gerar outras duas: uma de pares, uma de impares
    //a partir de duas listas, criar uma uúnica mesclando seus elementos
}