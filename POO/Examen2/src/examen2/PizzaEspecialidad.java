package examen2;

/**
 *
 * @author Gerson Murillo
 */
public class PizzaEspecialidad extends Pizza {
    
    public Ingrediente ingrediente1;
    public Ingrediente ingrediente2;
    
    public PizzaEspecialidad(Ingrediente ingrediente1, Ingrediente ingrediente2){
        super("Pizza especialidad", 1.2, 110);
        this.ingrediente1=ingrediente1;
        this.ingrediente2=ingrediente2;
    }
    @Override
    public double getCostoTotal() {
        double costoTotal=0;
        if(ingrediente1!=null ){
            costoTotal = costoTotal+this.ingrediente1.costo;
        }
        if(ingrediente2!=null){
            costoTotal = costoTotal+this.ingrediente2.costo;
        }
        if(costoTotal==0){
            costoTotal=costoInicial;
        }else{
            costoTotal=costoTotal+costoInicial;
        }
        return costoTotal;
    }

    @Override
    public void imprimir() {
        System.out.println("\t Pizza especialidad");
        System.out.println("***********************************");
        System.out.println("Costo inicial: " + this.costoInicial);
        System.out.println("Porcentaje de ganancia: " + this.porcentajeGanancia*100);
        if(ingrediente1!=null){
            System.out.println("Ingrediente 1: " + this.ingrediente1.nombre + "[Costo: " + this.ingrediente1.costo + " ]" );
        }else{
            System.out.println("Ingrediente 1: No tiene");
        }
        if(ingrediente2!=null){
            System.out.println("Ingrediente 2: " + this.ingrediente2.nombre + "[Costo: " + this.ingrediente2.costo + " ]" );
        }else{
            System.out.println("Ingrediente 2: no tiene");
        }
        System.out.println("Costo total: " + getCostoTotal());
        System.out.println("Ganancia total: " + getGananciaTotal());
    }
    
}
