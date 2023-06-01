package examen1;

/**
 *
 * @author Gerson Murillo
 */
public class Platillo {
    public String nombrePlatillo;
    public Categoria tipo;
    public Carne carne;
    public Ensalada ensalada;
    public Complemento complemento1;
    public Complemento complemento2;
    
    public Platillo(String nombrePlatillo, Categoria tipo, Carne carne, Ensalada ensalada, Complemento complemento1, Complemento complemento2) {
        this.nombrePlatillo = nombrePlatillo;
        this.tipo = tipo;
        this.carne = carne;
        this.ensalada = ensalada;
        this.complemento1 = complemento1;
        this.complemento2 = complemento2;
    }
    public void imprimir(){
        System.out.println("");
        System.out.println(" Platillo \n ********");
        if(this.nombrePlatillo!=null){  //Nombre Platillo
            System.out.println("Nombre: " + this.nombrePlatillo);  
        }
        if(this.tipo.nombreCategoria!=null){
            System.out.println("Tipo: "+ this.tipo.nombreCategoria + " [Encargado: "+ this.tipo.encargado.nombrePersona+ "].");
        }
        if(this.carne.nombreCarne!=null){
            if(this.carne.importada==true){
                System.out.println("Carne: " + this.carne.nombreCarne + " [Importada: Si]");
            }else{
                System.out.println("Carne: " + this.carne.nombreCarne + " [Importada: No]");
            }
        }
        try{
        if(this.complemento1.nombreComplemento!=null){
            if(this.complemento1.picante==true){
                System.out.println("Complemento 1: " + this.complemento1.nombreComplemento + " [ Condimentada: Si]");
            }else{
                System.out.println("Complemento 1: " + this.complemento1.nombreComplemento + " [ Condimentada: No]");
            }
        }
        }catch(Exception e){
            System.out.println("Complemento 1: No tiene");
        }
        try{
        if(this.complemento2.nombreComplemento!=null){
            if(this.complemento2.picante==true){
                System.out.println("Complemento 2: " + this.complemento2.nombreComplemento + " [ Condimentada: Si]");
            }else{
                System.out.println("Complemento 2: " + this.complemento2.nombreComplemento + " [ Condimentada: No]");
            }
        }
        }catch(Exception e){
            System.out.println("Complemento 2: No tiene");
        }
        float costo=0f;
        if(this.complemento1==null){
            costo=this.complemento2.costoPorcion+this.ensalada.costoPorcion+this.carne.costoPorcion;
        }
        if(this.complemento2==null){
            costo=this.complemento1.costoPorcion+this.ensalada.costoPorcion+this.carne.costoPorcion;
        }
        if(this.carne==null){
            costo=this.complemento1.costoPorcion+this.complemento2.costoPorcion+this.ensalada.costoPorcion;
        }
        if(this.ensalada==null){
            costo=this.complemento1.costoPorcion+this.complemento2.costoPorcion+this.carne.costoPorcion;
        }
        
        System.out.println("Costo: " + costo);
        System.out.println("Precio de venta sugerido: "+ costo*1.5);
    }
}
