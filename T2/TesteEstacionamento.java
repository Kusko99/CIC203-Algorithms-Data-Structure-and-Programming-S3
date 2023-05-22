public class TesteEstacionamento {
        public static void main(String[] args) {
        ListaSimples EntradasSaidas = new ListaSimples();
        EntradasSaidas.insereFim("ABC1234", 'C');
        EntradasSaidas.insereFim("GFD4536", 'C');
        EntradasSaidas.insereFim("TYU7890", 'C');
        EntradasSaidas.insereFim("GKL8756", 'C');
        EntradasSaidas.insereFim("NBM7865", 'C');
        EntradasSaidas.insereFim("BVC2387", 'C');
        EntradasSaidas.insereFim("CXF3090", 'C');
        EntradasSaidas.insereFim("IKL0989", 'C');
        EntradasSaidas.insereFim("KLX5555", 'C');
        EntradasSaidas.insereFim("HJK5678", 'C');
        EntradasSaidas.insereFim("GHP9843", 'C');
        EntradasSaidas.insereFim("MNB8160", 'C');
        EntradasSaidas.insereFim("TGE5566", 'C');
        EntradasSaidas.insereFim("LPS0254", 'C');
        EntradasSaidas.insereFim("JYR8856", 'C');
        EntradasSaidas.insereFim("XXX0000", 'C');
        EntradasSaidas.insereFim("UWU9834", 'C');
        EntradasSaidas.insereFim("TRT2324", 'C');
        EntradasSaidas.insereFim("BVC1209", 'C');
        EntradasSaidas.insereFim("ABC1234", 'P');
        EntradasSaidas.insereFim("GKL8756", 'P');
        EntradasSaidas.insereFim("HJK5678", 'P');
        EntradasSaidas.insereFim("GFD4536", 'P');

        //Entrada de fim de lista para terminar o processo
        EntradasSaidas.insereFim("ZZZ0000", 'F');   
        
        Estacionamento queuePark = new Estacionamento();
        queuePark.manobrista(EntradasSaidas);        
    }
}
