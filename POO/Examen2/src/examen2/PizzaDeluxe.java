package examen2;

/**
 *
 * @author Gerson Murillo
 */
public class PizzaDeluxe extends Pizza {
    public Ingrediente ingrediente1;
    public Ingrediente ingrediente2;
    public Ingrediente ingrediente3;
    public Ingrediente ingrediente4;
    
    public PizzaDeluxe(Ingrediente ingrediente1, Ingrediente ingrediente2, Ingrediente ingrediente3, Ingrediente ingrediente4){
        super("Pizza deluxe", 1.3, 120);
        this.ingrediente1=ingrediente1;
        this.ingrediente2=ingrediente2;
        this.ingrediente3=ingrediente3;
        this.ingrediente4=ingrediente4;
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
        if(ingrediente3!=null){
            costoTotal= costoTotal+this.ingrediente3.costo;
        }
        if(ingrediente4!=null){
            costoTotal = costoTotal+this.ingrediente4.costo;
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
         System.out.println("\t Pizza deluxe");
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
        if(ingrediente3!=null){
            System.out.println("Ingrediente 3: " + this.ingrediente3.nombre + "[Costo: " + this.ingrediente3.costo + " ]" );
        }else{
            System.out.println("Ingrediente 3: No tiene");
        }
        if(ingrediente4!=null){
            System.out.println("Ingrediente 4: " + this.ingrediente4.nombre + "[Costo: " + this.ingrediente4.costo + " ]" );
        }else{
            System.out.println("Ingrediente 4: no tiene");
        }
        System.out.println("Costo total: " + getCostoTotal());
        System.out.println("Ganancia total: " + getGananciaTotal());
    }
    
    
}
