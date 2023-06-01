package ejercicio2;

/**
 *
 * @author Gerson Murillo
 */
public class Producto {
    public String codigo;
    public String nombre;
    public float costoCompra;
    public float precioVenta;
    private int existencias;
    
    //Constructores
    public Producto() {
         this.codigo = "Sin informacion";
        this.nombre = "Sin informacion";
        this.costoCompra = 0;
        this.precioVenta = 0;
        this.existencias=0;
    }
    public Producto(String codigo, String nombre, float costoCompra, float precioVenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costoCompra = costoCompra;
        this.precioVenta = precioVenta;
        this.existencias=0;
    }
    //Metodos
    /**
     * Le asigna un valor a la cantidad de existencia almacenada 
     * @param existencias cuyos valores pueden ser enteros positivos o negativos.
     */
    public void setExistencias(int existencias){
        this.existencias=existencias;
    }
    /**
     * Obtiene la cantidad de existencias de productos en la tienda
     * @return la cantidad de existencias del producto
     */
    public int getExistencias(){
        return this.existencias;
    }
}
