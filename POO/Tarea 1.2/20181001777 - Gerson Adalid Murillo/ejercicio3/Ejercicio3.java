package ejercicio3;

/**
 *
 * @author Gerson Murillo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println("El area del rectangulo es igual a: " +rectangulo1.areaRectangulo(rectangulo1));
        System.out.println("El perimetro del rectangulo es igual a: " +rectangulo1.perimetroRectangulo(rectangulo1));
        System.out.println("El valor de la diagonal del rectangulo es igual a: " +rectangulo1.diagonalRectangulo(rectangulo1));
        
        System.out.println('\n');
        
        Rectangulo rectangulo2 = new Rectangulo((float)3.5,(float)7.6,(float)0.3,(float)-6.9);
        System.out.println("El area del rectangulo es igual a: " +rectangulo2.areaRectangulo(rectangulo2));
        System.out.println("El perimetro del rectangulo es igual a: " +rectangulo2.perimetroRectangulo(rectangulo2));
        System.out.println("El valor de la diagonal del rectangulo es igual a: " +rectangulo2.diagonalRectangulo(rectangulo2));
        
    }
    
}
