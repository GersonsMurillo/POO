package tarea2;

/**
 *
 * @author Gerson Murillo
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.acelerar();
        System.out.println(vehiculo1.getEstado());
        vehiculo1.frenar();
        System.out.println(vehiculo1.getEstado()+ '\n');
        
        Vehiculo vehiculo2 = new Vehiculo("Toyota", "Hilux", "Blanca", "123cq53", 2022);
        vehiculo2.acelerar();
        System.out.println(vehiculo2.getEstado());
        vehiculo2.frenar();
        System.out.println(vehiculo2.getEstado());
    }
    
}
