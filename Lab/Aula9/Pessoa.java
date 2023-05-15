public class Pessoa {
    private int id;
    private String nome;
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public Pessoa() {}
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "[id=" + id + ", nome=" + nome + "]";
    }
    
}
