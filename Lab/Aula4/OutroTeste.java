import java.util.Random;
public class OutroTeste {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        Random random = new Random();
        do{
            if(random.nextInt(2) == 0){
                if(random.nextInt(2) == 0){
                    lista.insereInicio(random.nextInt(10));
                }else{
                    lista.insereFim(random.nextInt(10));
                }
            }else{
                if(!lista.estaVazia()){
                    if(random.nextInt(2) == 0){
                        System.out.println(lista.removeInicio() + " saiu do inicio");
                    }else{
                        System.out.println(lista.removeFim() + " saiu do fim");
                    }
                }            
            }
            System.out.println(lista);
        }while(!lista.estaVazia());
        
        
    }
}
