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
        System.out.println(ldc.tamanhoDaLista());
        System.out.println("\n\n");
        System.out.println(ldc.removeDaPos(10));
        System.out.println(ldc);
        System.out.println(ldc.buscaX(4));
        System.out.println(ldc.removeX(10));
        System.out.println(ldc);
        System.out.println(ldc.inverteLista(ldc));

        ListaDuplaCircular mack = new ListaDuplaCircular();

        for (int i=20; i<=30; i++){
            if(i%2 == 0){
                mack.insereInicio(i);
                System.out.println("inicio");

            }
            else{
                mack.insereFim(i);
                System.out.println("fim");
            }
            System.out.println(mack);
            System.out.println(ldc);
        }

        ListaDuplaCircular maua = new ListaDuplaCircular();
        ListaDuplaCircular fei = new ListaDuplaCircular();
        for(int i = 1; i <= 5; i++){
            fei.insereFim(i);
        }
        for(int i = 6; i <= 12; i++){
            maua.insereFim(i);
        }
        
        System.out.println("Fei");
        System.out.println(fei);
        System.out.println("Mauá");
        System.out.println(maua);

        System.out.println("MauáXFei");
        System.out.println(maua.mescla(maua, fei));

        ListaDuplaCircular[] vetor = new ListaDuplaCircular[3];
        vetor[0] = maua;vetor[1] = fei;vetor[2] = mack;
        System.out.println("Mauá: " + vetor[0]);
        System.out.println("Fei: " + vetor[1]);

        ListaDuplaCircular[] paresImpares = new ListaDuplaCircular[2];
        paresImpares = maua.divideParesImpares(maua);
        System.out.println("Pares: " + paresImpares[0]);
        System.out.println("Impares: " + paresImpares[1]);
        

        // while(!ldc.estaVazia()){
        //     //fazer teste de vazia sempre
        //     System.out.println(ldc.removeInicio() + " foi removido do inicio");
        //     //fazer teste de vazia sempre
        //     System.out.println(ldc.removeFim() + " foi removido do final");
        //     System.out.println(ldc);
        // }
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
