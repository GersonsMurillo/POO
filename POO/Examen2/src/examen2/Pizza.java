package examen2;

/**
 *
 * @author Gerson Murillo
 */
public abstract class Pizza {
    public String nombre;
    public double porcentajeGanancia;
    public double costoInicial;
    
    public Pizza(String nombre, double porcentajeGanancia, double costoInicial){
        this.costoInicial=costoInicial;
        this.nombre=nombre;
        this.porcentajeGanancia=porcentajeGanancia;
    }
    
    public abstract double getCostoTotal();
    public abstract void imprimir();
    
    public double getGananciaTotal(){
        return getCostoTotal()*porcentajeGanancia;
    }
}
