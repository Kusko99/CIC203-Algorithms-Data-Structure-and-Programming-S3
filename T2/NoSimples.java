public class NoSimples {
    private String placa;
    private char movimentação;
    private NoSimples proximo;

    public NoSimples(String placa, char movimentação) {
        this.placa = placa;
        this.movimentação = movimentação;
        proximo = null;
    }
    //metodos de acesso

    
    @Override
    public String toString(){
        return "|" + placa + " |->";
    }


    public String getPlaca() {
        return placa;
    }


    public char getMovimentação() {
        return movimentação;
    }


    public NoSimples getProximo() {
        return proximo;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public void setMovimentação(char movimentação) {
        this.movimentação = movimentação;
    }


    public void setProximo(NoSimples proximo) {
        this.proximo = proximo;
    }

    
}
