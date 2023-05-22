public class Estacionamento {

    Fila<Carro> queuePark = new Fila<>();
    int tamanho = 12;
    int ocupacao = 0;
    int esperando = 0;
    Fila<Carro> espera = new Fila<>();

    public void manobrista(ListaSimples carros){
        NoSimples atual = carros.getPrimeiro();
        while(atual.getMovimentação() != 'F'){
            if(atual.getMovimentação() == 'C'){
                String placa = atual.getPlaca();
                Carro chegando = new Carro(placa);
                System.out.println();
                System.out.println("Chegou carro: " + placa );
                if(ocupacao == tamanho){
                    espera.enfilera(chegando);
                    esperando++;
                    System.out.println("Estacionamento lotado " + placa + " entrou na fila de espera");
                    System.out.println("Fila da espera com: " + esperando);
                    System.out.println(espera);
                }else{
                    queuePark.enfilera(chegando);
                    ocupacao++;
                    System.out.println("Estacionamento com " + ocupacao + " carros");
                    System.out.println(queuePark);
                }
            }else if(atual.getMovimentação() == 'P'){
                System.out.println();
                boolean saiu = false;
                while(saiu == false){
                    if(atual.getPlaca() != queuePark.consultaPrimeiro().getPlaca()){
                        Carro temp = queuePark.desenfilera();
                        temp.setMovimentos(temp.getMovimentos()+1);
                        queuePark.enfilera(temp);
                    }else{
                        Carro exit = queuePark.desenfilera();
                        int movi2 = exit.getMovimentos();
                        ocupacao--;
                        System.out.println();
                        System.out.println(atual.getPlaca() + " está saindo, foi movimentado " + ++movi2 + " vezes");
                        System.out.println("Estacionamento com " + ocupacao + " carros");
                        System.out.println(queuePark); 
                        saiu = true;
                    }
                }
                if(!espera.estaVazia()){
                    boolean vendoEspera = true;
                    while(vendoEspera == true){
                        if(espera.estaVazia()){
                            vendoEspera = false;
                        }else if(ocupacao < tamanho){
                            Carro temp = espera.desenfilera();
                            queuePark.enfilera(temp);
                            ocupacao++;
                            System.out.println();
                            System.out.println("Espaço disponivél no estacionamento carro " + temp.getPlaca() + " entrando");
                            System.out.println("Estacionamento com " + ocupacao + " carros");
                            System.out.println(queuePark);
                            esperando--;
                            
                        }if(ocupacao == tamanho){
                            System.out.println();
                            System.out.println("Estacionamento lotado ");
                            System.out.println("Fila da espera com: " + esperando);
                            System.out.print(espera);
                            vendoEspera = false;
                        }
                        
                    }
                }
            }
            atual = atual.getProximo();
        }  
    }
}
