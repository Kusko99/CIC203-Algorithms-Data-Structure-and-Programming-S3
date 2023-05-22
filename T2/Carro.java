public class Carro {
    String placa;
    int movimentos;

    public Carro (String placa){
        this.placa = placa;
        movimentos = 0;
    }

    public String getPlaca() {
        return placa;
    }

    public int getMovimentos() {
        return movimentos;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMovimentos(int movimentos) {
        this.movimentos = movimentos;
    }

    @Override
    public String toString() {
        return placa;
    }

    
}
