package ejercicio4;

/**
 *
 * @author Gerson Murillo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TanqueAgua tanque1 = new TanqueAgua();
        tanque1.setSumarAgua(500);
        tanque1.setRestarAgua(300);
        tanque1.aguaAlmacenada();
        tanque1.porcentajeAgua();
        
        System.out.println('\n');
        
        TanqueAgua tanque2 = new TanqueAgua(1225, 200, "Rotoplas", "Acero");
        tanque2.setSumarAgua(500);
        tanque2.setRestarAgua(300);
        tanque2.aguaAlmacenada();
        tanque2.porcentajeAgua();
        tanque2.setRestarAgua(400);
    }
    
}
