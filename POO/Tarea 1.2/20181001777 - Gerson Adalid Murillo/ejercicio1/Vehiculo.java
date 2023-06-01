package tarea2;

/**
 *
 * @author Gerson Murillo
 */
public class Vehiculo {
    public String marca;
    public String color;
    public String modelo;
    public String placa;
    public int anio;
    private String estado;
    //Constructores
    /**
     * Estos generan objetos de tipo Vehiculo
     */
    public Vehiculo(){
        this.estado="Detenido";
        this.marca="Sin informacion";
        this.color="Sin informacion";
        this.modelo="Sin informacion";
        this.placa="Sin informacion";
        this.anio=0;
    }
    public Vehiculo(String marca, String modelo, String color, String placa, int anio){
        this.estado="Detenido";
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.placa=placa;
        this.anio=anio;
    }
    //Metododos
    /**
     * Cambia el estado del vehiculo a "En marcha"
     */
    public void acelerar(){
        estado="En marcha";
    }
    /**
     * Cambia el estado del vehiculo a "Detenido"
     */
    public void frenar(){
        estado="Detenido";
    }
    /**
     * 
     * @return El estado del vehiculo 
     */
    public String getEstado(){
        return this.estado;
    }
}
