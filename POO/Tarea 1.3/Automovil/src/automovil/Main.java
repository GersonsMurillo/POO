package automovil;

/**
 *
 * @author Gerson Murillo
 */
public class Main {

    public static void main(String[] args) {
        //Fabricante de ruedas
        Fabricante michelin = new Fabricante("Michelin", "USA", "+1 800 32847", "14k");
        
        //Fabricante motor
        Fabricante BMW = new Fabricante("BMW motors", "Alemania", "1398742", "2JZ");
        //Fabricante Coche
        Fabricante Toyota = new Fabricante("Toyota", "Japon", "7582934", "Supra");
        
        //Motor
        Motor jdm = new Motor(BMW, 6, 6, 700, 5800, "Combustion", "Super");
        
        //Ruedas
        Ruedas llantas = new Ruedas(michelin, 14f, 6f, 260);
                
        //Autos
        Coche auto1 = new Coche(null, null, null, 0, "No tiene", "Sin informacion", 0);
        
        auto1.imprimir();
        
        Coche auto2 = new Coche(jdm, llantas, Toyota, 2022, "Gris", "deportivo", 0);
        
        auto2.imprimir();
    }
    
}
