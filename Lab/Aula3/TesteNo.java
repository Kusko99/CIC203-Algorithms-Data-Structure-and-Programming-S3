public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No(10);
        No no2 = new No(20);
        
        System.out.println("no1: " + no1);
        System.out.println("no2: " + no2);

        no1.setProximo(no2);

        no2.setInfo(1);
        System.out.println("novo n02: " + no2);

        no1.setProximo(no2);
        no1.getProximo().setInfo(30);
        System.out.println("novo novo no2: " + no2);
    }
   
}
