public class Ponteiros{
    public static void main(String[] args) {
        int m1[][] = new int[3][4];

        int m2[][];

        m2 = new int[3][];
        System.out.println("m2 = " + m2);
        for(int i=0; i<3; i++){
            m2[i] = new int[4];
            System.out.println("m2" + i + " = " + m2[i]);
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.println(m2[i][j] + " ");
            }
        }
    }
}