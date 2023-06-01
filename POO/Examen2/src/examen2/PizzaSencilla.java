package examen2;

/**
 *
 * @author Gerson Murillo
 */
public class PizzaSencilla extends Pizza{
    public Ingrediente ingrediente1;

    public PizzaSencilla(Ingrediente ingrediente1) {
        super("Pizza sencilla", 1.1, 100);
        this.ingrediente1 = ingrediente1;
    }
    
    @Override
    public double getCostoTotal(){
        double costoTotal;
        if(ingrediente1!=null){
            costoTotal = costoInicial+this.ingrediente1.costo;
        }else{
            costoTotal=0;
        }
        if(costoTotal==0){
            costoTotal=costoInicial;
        }
        return costoTotal;
    }
    
    @Override
    public void imprimir(){
        System.out.println("\t Pizza Sencilla");
        System.out.println("***********************************");
        System.out.println("Costo inicial: " + this.costoInicial);
        System.out.println("Porcentaje de ganancia: " + this.porcentajeGanancia*100);
        if(ingrediente1!=null){
            System.out.println("Ingrediente 1: " + this.ingrediente1.nombre + "[Costo: " + this.ingrediente1.costo + " ]" );
        }else{
            System.out.println("La pizza no tiene ningun ingrediente");
        }
        System.out.println("Costo total: " + getCostoTotal());
        System.out.println("Ganancia total: " + getGananciaTotal());
    
    }
}
