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

    public int tamanhoDaLista(){
        int tamanho = 0;
        NoDuplo aux = primeiro;
        if(estaVazia()){
            return tamanho;
        }
        do{
            tamanho ++;
            aux = aux.getProx();
        }while(aux != primeiro);
        return tamanho;
    }

    public int removeDaPos(int pos){
        int contador = 1;
        NoDuplo aux = primeiro;
        if(estaVazia()){
            return -1;
        }
        if(pos == 1){
            return removeInicio();
        }
        while(contador != pos){
            if(aux.getProx() == primeiro){
                return -1;
            }
            aux = aux.getProx();
            contador ++;
        }
        aux.getProx().setAnt(aux.getAnt());  
        aux.getAnt().setProx(aux.getProx());
        return aux.getInfo(); 
    }

    public boolean buscaX(int x){
        NoDuplo aux = primeiro;
        do{
            if(aux.getInfo() == x){
                return true;
            }
            aux = aux.getProx();
        }while(aux != primeiro);
        return false;
    }

    public boolean removeX(int x){
        if(estaVazia()){
            return false;
        }
        if(primeiro.getInfo() == x){
            primeiro.getAnt().setProx(primeiro.getProx());
            primeiro.getProx().setAnt(primeiro.getAnt());
            primeiro = primeiro.getProx();
            return true;
        }
        if (primeiro == primeiro.getProx()){
            if(primeiro.getInfo() == x){
                primeiro = null;
                return true;
            }
            else{
                return false;
            }
        }
        NoDuplo aux = primeiro.getProx();
        boolean achei = false;
        do{
            if(aux.getInfo() == x){
                achei = true;
            }
            aux = aux.getProx();
        }while(aux != primeiro && !achei);
        if(!achei){
            return false;
        }
        aux.getAnt().setProx(aux.getProx());
        aux.getProx().setAnt(aux.getAnt());
        if(aux == primeiro){
            primeiro = primeiro.getProx();
        }
        return true;
    }

    public ListaDuplaCircular inverteLista(ListaDuplaCircular l1){
        if(estaVazia()){
            return l1;
        }
        if(l1.primeiro == l1.primeiro.getProx()){
            return l1;
        }
        NoDuplo aux = l1.primeiro.getAnt();
        ListaDuplaCircular l2 = new ListaDuplaCircular();
        do{
            l2.insereFim(aux.getInfo());
            aux = aux.getAnt();
        }while(aux != l1.primeiro.getAnt());
        return l2;
    }

    public ListaDuplaCircular[] divideParesImpares(ListaDuplaCircular l1){
        ListaDuplaCircular retorno[] = new ListaDuplaCircular[2];
        if(estaVazia()){
            return retorno;
        }
        NoDuplo aux = primeiro;
        ListaDuplaCircular listaPares = new ListaDuplaCircular();
        ListaDuplaCircular listaImpares = new ListaDuplaCircular();
        do{
            if(aux.getInfo()%2 != 0){
                listaImpares.insereFim(aux.getInfo());
            }else{
                listaPares.insereFim(aux.getInfo());
            }
            aux = aux.getProx();
        }while(aux != primeiro);
        retorno[0] = listaPares;
        retorno[1] = listaImpares;
        return retorno;
    }

    public ListaDuplaCircular mescla(ListaDuplaCircular l1, ListaDuplaCircular l2){
        if(l1.estaVazia()){
            return l2;
        }
        if(l2.estaVazia()){
            return l1;
        }
        ListaDuplaCircular listaMesclada = new ListaDuplaCircular();
        NoDuplo auxl1 = l1.primeiro;
        NoDuplo auxl2 = l2.primeiro;
        boolean mescla = false;
        do{
            listaMesclada.insereFim(auxl1.getInfo());
            listaMesclada.insereFim(auxl2.getInfo());
            auxl1 = auxl1.getProx();
            if(auxl1.getInfo() == l1.primeiro.getInfo()){
                mescla = true;
            }
            auxl2 = auxl2.getProx();
            if(auxl2.getInfo() == l2.primeiro.getInfo()){
                mescla = true;
            }
        }while(mescla == false);
        if(auxl1 == l1.primeiro){
            do{
                listaMesclada.insereFim(auxl2.getInfo());
                auxl2 = auxl2.getProx();
            }while(auxl2 != l2.primeiro);
        }else if(auxl2 == l2.primeiro){
            do{
                listaMesclada.insereFim(auxl1.getInfo());
                auxl1 = auxl1.getProx();
            }while(auxl1 != l1.primeiro);
        }
        return listaMesclada;
    }

    public void paresImparesMachion(ListaDuplaCircular listaPares, ListaDuplaCircular listaImpares){
        NoDuplo aux = primeiro;
        do{
            if(aux.getInfo()%2 !=0){
                listaImpares.insereFim(aux.getInfo());
            }else{
                listaPares.insereFim(aux.getInfo());
            }
            aux = aux.getProx();
        }while(aux != primeiro);
    }
    public ListaDuplaCircular mesclaMachion(ListaDuplaCircular l1, ListaDuplaCircular l2){
        if(l1.estaVazia()){
            return l2;
        }
        if(l2.estaVazia()){
            return l1;
        }
        ListaDuplaCircular listaMesclada = new ListaDuplaCircular();

        while(!l1.estaVazia() && !l2.estaVazia()){
            listaMesclada.insereFim(l1.removeFim());
            listaMesclada.insereFim(l2.removeFim());
        }
        while(!l1.estaVazia()){
            listaMesclada.insereFim(l1.removeFim());
        }
        while(!l2.estaVazia()){
            listaMesclada.insereFim(l2.removeFim());
        }
        return listaMesclada;
    }   
}