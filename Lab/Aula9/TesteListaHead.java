public class TesteListaHead {
    public static void main(String[] args) {
        HeadList<Integer> l = new HeadList<>();

        l.insereInicio(Integer.valueOf(1));
        l.insereInicio(Integer.valueOf(2));
        l.insereInicio(Integer.valueOf(3));

        System.out.println(l);
    }
}
