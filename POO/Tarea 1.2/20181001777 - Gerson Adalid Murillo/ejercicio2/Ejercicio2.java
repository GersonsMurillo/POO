package ejercicio2;

/**
 *
 * @author Gerson Murillo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Producto producto1 = new Producto();   
        producto1.setExistencias(20);
        System.out.println("Cantidad de exitencias del producto ** "+ producto1.nombre+" ** es de: "+ producto1.getExistencias());
        producto1.setExistencias(5);
        System.out.println("Cantidad de exitencias del producto ** "+ producto1.nombre+" ** es de: "+ producto1.getExistencias());
        producto1.setExistencias(-10);
        System.out.println("Cantidad de exitencias del producto ** "+ producto1.nombre+" ** es de: "+ producto1.getExistencias());
    Producto producto2 = new Producto("001","Refrescos", (float) 18.3,(float)25 );
        producto2.setExistencias(20);
        System.out.println("Cantidad de exitencias del producto ** "+ producto2.nombre+" ** es de: "+ producto2.getExistencias());
        producto2.setExistencias(5);
        System.out.println("Cantidad de exitencias del producto ** "+ producto2.nombre+" ** es de: "+ producto2.getExistencias());
        producto2.setExistencias(-10);
        System.out.println("Cantidad de exitencias del producto ** "+ producto2.nombre+" ** es de: "+ producto2.getExistencias());
    }
}
