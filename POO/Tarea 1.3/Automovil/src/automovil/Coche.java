package automovil;

/**
 *
 * @author Gerson Murillo
 */
public class Coche {
    Motor motor;
    Ruedas rueda;
    Fabricante marca;
    int anio;
    String color;
    String tipoCoche;
    double kilometraje;

    public Coche(Motor motor, Ruedas rueda, Fabricante marca, int anio, String color, String tipoCoche, double kilometraje) {
        this.motor = motor;
        this.rueda = rueda;
        this.marca = marca;
        this.anio = anio;
        this.color = color;
        this.tipoCoche = tipoCoche;
        this.kilometraje = kilometraje;
    }
    
    public void imprimir(){
        System.out.println("******Resumen Coche******\n");
        if(marca!=null){
            System.out.println("Marca: " + this.marca.nombreFabricante);
            System.out.println("Modelo: " + this.marca.modelo);
            System.out.println("Anio: " + this.anio);
            System.out.println("Color: " + this.color );
            System.out.println("Tipo de coche: "+ this.tipoCoche);
            System.out.println("Kilometraje: "+ this.kilometraje + '\n');
            System.out.println("\n******Resumen motor******\n");
            if(motor!= null){
                if(this.motor.tipo=="Electrico"){
                    System.out.println("Fabircante: " + this.motor.marca.nombreFabricante);
                    System.out.println("Tipo de motor: Electrico");
                    System.out.println("Caballos de fuerza: "+ this.motor.caballos);
                    System.out.println("Rpm: "+ this.motor.maximasRevoluciones);
                    System.out.println("Numero de marchas: " + this.motor.marchas);
                }else{
                    System.out.println("Fabircante: " + this.motor.marca.nombreFabricante);
                    System.out.println("Tipo de motor: de combustion");
                    System.out.println("Cilindros: " + this.motor.cilindros);
                    System.out.println("Caballos de fuerza: "+ this.motor.caballos);
                    System.out.println("Rpm: "+ this.motor.maximasRevoluciones);
                    System.out.println("Numero de marchas: " + this.motor.marchas);
                    System.out.println("Tipo de combustible: "+ this.motor.combustible);
                }       
            }else{
                System.out.println("El coche no cuenta con ningun motor. \n");
            }
            System.out.println("\n******Resumen Ruedas******");
            if(this.rueda!=null){
                System.out.println("Fabricante: "+ this.rueda.marca.nombreFabricante);
                System.out.println("Diametro: " + this.rueda.diametro);
                System.out.println("Ancho: " + this.rueda.ancho);
                System.out.println("Velocidad Maxima soportada: "+ this.rueda.velMax);
            }else{
                System.out.println("El auto no cuenta con ruedas.");
            }
        }else{
            System.out.println("No existe ningun coche");
        }
        System.out.println("\n");
    }
}
