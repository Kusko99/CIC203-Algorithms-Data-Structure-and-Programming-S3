public class Atendimento {
    public static void main(String[] args) {
        ListaLigadaGenerica<Pessoa> l = new ListaLigadaGenerica();

        Pessoa p1 = new Pessoa(1, "Joao");
        Pessoa p2 = new Pessoa(2, "Lia");
        Pessoa p3 = new Pessoa(3, "Gil");

        l.insereInicio(p1);
        l.insereInicio(p2);
        l.insereInicio(p3);

        System.out.println(l);
    }
}
