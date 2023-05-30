import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class Beecrowd1861 {
    static class ArvoreBinariaDeBusca {
        private class NoBinario{
            private String info;
            private int contador = 1;
            private NoBinario esq;
            private NoBinario dir;
            private Boolean vivo = true;
            
            
            public NoBinario(String info) {
                this.info = info;
            }
    
            public String getInfo() {
                return info;
            }
    
            public void setInfo(String info) {
                this.info = info;
            }
    
            public NoBinario getEsq() {
                return esq;
            }
    
            public void setEsq(NoBinario esq) {
                this.esq = esq;
            }
    
            public NoBinario getDir() {
                return dir;
            }
    
            public void setDir(NoBinario dir) {
                this.dir = dir;
            }
            public int getContador() {
                return contador;
            }
    
            public void setContador(int contador) {
                this.contador = contador;
            }
    
            @Override
            public String toString() {
                if(getVivo()==true) return "\n"+info + " "+ contador;
                return "";
            }
    
            public Boolean getVivo() {
                return vivo;
            }
    
            public void setVivo(Boolean vivo) {
                this.vivo = vivo;
            }
    
        }
        private NoBinario raiz;
        //construtor padrão -> zera a raiz/torna nulo
        //get e set não são necessarios pois não é de interesse informar a raiz
        public  void insere(String info){
            NoBinario novo = new NoBinario(info);
            if (raiz == null){
                raiz = novo;
            }
            else{
                insereRec(novo, raiz);
            }
        }
    
        public  void insereMorto(String info){
            NoBinario novo = new NoBinario(info);
            novo.setVivo(false);
            if (raiz == null){
                raiz = novo;
            }
            else{
                insereRecMorto(novo, raiz);
            }
        }
        private void insereRecMorto(NoBinario novo, NoBinario atual){
            int comparado = novo.getInfo().compareTo(atual.getInfo());
            if (comparado<0){
                if(atual.getEsq()==null){
                    atual.setEsq(novo);
                }
                else{
                    insereRecMorto(novo, atual.getEsq());
                }
            }
            else{
                if(comparado>0){
                    if(atual.getDir()==null){
                        atual.setDir(novo);
                    }
                    else{
                        insereRecMorto(novo, atual.getDir());
                    }
                }
                else{
                    atual.setContador(atual.getContador()+1);
                    atual.setVivo(false);
                }
            }
            
        }
        private void insereRec(NoBinario novo, NoBinario atual){
            int comparado = novo.getInfo().compareTo(atual.getInfo());
            if (comparado<0){
                if(atual.getEsq()==null){
                    atual.setEsq(novo);
                }
                else{
                    insereRec(novo, atual.getEsq());
                }
            }
            else{
                if(comparado>0){
                    if(atual.getDir()==null){
                        atual.setDir(novo);
                    }
                    else{
                        insereRec(novo, atual.getDir());
                    }
                }
                else{
                    atual.setContador(atual.getContador()+1);
                }
            }
        }
        @Override
        public String toString(){
            if(raiz==null){
                return "Arvore vazia";
            }
            else{
                return toStringRec(raiz);
            }
        }
        private String toStringRec (NoBinario atual){
            if(atual!=null){
                return toStringRec(atual.getEsq()) + atual + toStringRec(atual.getDir());
            }
            else{
                return "";
            }
        }
        public int contaNo(){
            if(raiz!=null){
                return contaNoRec(raiz);
            }
            else{
                return 0;
            }
        }
        private int contaNoRec(NoBinario atual){
            if(atual!=null){
                return contaNoRec(atual.getEsq()) + 1 + contaNoRec(atual.getDir());
            }
            else{
                return 0;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;
        Scanner sc;
        ArvoreBinariaDeBusca assasinos = new ArvoreBinariaDeBusca();

        while ((linha = br.readLine()) != null) {
            sc = new Scanner(linha);
            String s1 = sc.next();
            assasinos.insere(s1);
            String s2 = sc.next();
            assasinos.insereMorto(s2);
        }
        System.out.print("HALL OF MURDERERS");
        System.out.print(assasinos);
        System.out.println();
    }
}
