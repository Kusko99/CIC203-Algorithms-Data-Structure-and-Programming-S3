public class ListaDuplaCircular {
    private NoDuplo primeiro;
    //por clareza
    public ListaDuplaCircular(){
        primeiro = null;
    }
    
    public void insereInicio(int info){
        NoDuplo novo = new NoDuplo(info);
        if(!estaVazia()){
            novo.setProx(primeiro);
            novo.setAnt(primeiro.getAnt());
            novo.getProx().setAnt(novo);
            novo.getAnt().setProx(novo);
        }  
        primeiro = novo;
        
    }

    public boolean estaVazia(){
        return primeiro == null;
    }

    public void insereFim(int info){
        NoDuplo novo = new NoDuplo(info);
        if(estaVazia()){
            primeiro = novo;
        }else{
            novo.setProx(primeiro);
            novo.setAnt(primeiro.getAnt());
            novo.getProx().setAnt(novo);
            novo.getAnt().setProx(novo);
        }
    }

    @Override
    public String toString(){
        String msg = "lista: ";
        if(estaVazia()){
            msg += "vazia";
        }else{
            NoDuplo aux = primeiro;
            do{
                msg += aux;
                aux = aux.getProx();
            }while(aux != primeiro);
        }
        return msg;
    }

    public int removeInicio(){
        int temp = primeiro.getInfo();
        if(primeiro == primeiro.getProx()){ //tem um só
            primeiro = null;//esvazindo a lista
        }else{
            NoDuplo segundo = primeiro.getProx();
            NoDuplo ultimo = primeiro.getAnt();
            segundo.setAnt(primeiro.getAnt());
            ultimo.setProx(segundo);
            primeiro = segundo;
        }
        return temp;
    }
    public int removeFim(){
        int temp = primeiro.getAnt().getInfo();
        if(primeiro == primeiro.getAnt()){
            primeiro = null;
        }else{
            NoDuplo penultimo = primeiro.getAnt().getAnt();
            primeiro.setAnt(penultimo);
            penultimo.setProx(primeiro);
        }
        return temp;
    }

    public int consultarPrimeiro(){
        return primeiro.getInfo();
    }

    public int consultarUltimo(){
        return primeiro.getAnt().getInfo();
    }
}