package ejercicio4;

/**
 *
 * @author Gerson Murillo
 */
public class TanqueAgua {
    public float capacidadMaxima;
    public float diametroTanque=1000;
    public String Fabricante;
    public String material;
    private float cantidadActual;
    
    //Constructores
    public TanqueAgua(){
        this.capacidadMaxima = 1000;
        this.diametroTanque = 1000;
        this.Fabricante = "Sin informacion";
        this.material = "Sin informacion";
        this.cantidadActual = 0; 
    }
    public TanqueAgua(float capacidadMaxima, float diametroTanque, String Fabricante, String material) {
        this.capacidadMaxima = capacidadMaxima;
        this.diametroTanque = 1000;
        this.Fabricante = Fabricante;
        this.material = material;
        this.cantidadActual = 0;
    }
    //Funciones
    /**
     * Se asigna una suma de agua a la total almacenada ya en el tanque de agua 
     * @param aguaSumar se debe asignar un numero que sea menor que la capacidad maxima del tanque y no mas que la cantidad restante para que se llene el tanque y que sea positivo
     */
    public void setSumarAgua(float aguaSumar){
        if(this.capacidadMaxima==0){
            throw new IllegalArgumentException("No es posible agregar o quitar agua en un tanque con capacidad 0.");
        }else{
            if(aguaSumar+this.cantidadActual>this.capacidadMaxima && aguaSumar<0){
                throw new IllegalArgumentException("No se puede rebasar la capacidad maxima del tanque y no se pueden ingresar valores negativos.");
            }else{
                this.cantidadActual=this.cantidadActual+aguaSumar;
            }
        }    
    }
    /**
     * Se asigna una resta de agua a la total almacenada ya en el tamque de agua
     * @param aguaRestar Se debe asignar un numero que sea menor que la cantidad actual de agua en el tanque y que sea mayor que 0
     */
    public void setRestarAgua(float aguaRestar){
        if(this.capacidadMaxima==0){
            throw new IllegalArgumentException("No es posible agregar o quitar agua en un tanque con capacidad 0.");
        }else{
            if(aguaRestar>this.cantidadActual && aguaRestar<0){
                throw new IllegalArgumentException("No se puede restar mas de la capacidad maxima del tanque y no se pueden ingresar valores negativos.");
            }else{
                this.cantidadActual=this.cantidadActual-aguaRestar;
            }
        }
    }
    /**
     * Imprime la cantidad total de agua almacenada en litros en el tanque de agua
     */
    public void aguaAlmacenada(){
        if(this.capacidadMaxima==0){
            throw new IllegalArgumentException("No se puede almacenar agua en un tanque con capacidad 0");
          
        }else{
        System.out.println("El tanque de agua tiene un total de " + this.cantidadActual + " litros de agua almacenada.");
        }
    }
    /**
     * Imprime en porcentaje la cantidad de agua total almacenada en el tanque de agua
     */
    public void porcentajeAgua(){
         if(this.capacidadMaxima==0){
            throw new IllegalArgumentException("No se puede almacenar agua en un tanque con capacidad 0");
         }else{
            double porcentaje= (this.cantidadActual / (this.capacidadMaxima))*(100);
            System.out.println("El porcentaje de litros de agua almacenada en el tanque es del " + porcentaje + " %.");
        }
    }
}
