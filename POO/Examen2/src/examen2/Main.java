package examen2;

/**
 *
 * @author Gerson Murillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Nombre: Gerson Adalid Murillo Palma");
        System.out.println("No Cuenta: 20181001777");
        System.out.println("\n\n");
        
        Ingrediente i1 = new Ingrediente("Jamon", 20);
        PizzaSencilla ps1 = new PizzaSencilla(i1);
        ps1.imprimir();
        
        System.out.println("\n-------------------------------------------------------------\n");
        
        Ingrediente i2 = new Ingrediente("Pinia", 25);
        PizzaEspecialidad pe1 = new PizzaEspecialidad(i1, i2);
        pe1.imprimir();
        
        System.out.println("\n-------------------------------------------------------------\n");
        
        Ingrediente i3 = new Ingrediente("Extra queso", 35);
        Ingrediente i4 = new Ingrediente("Hongos", 30);
        PizzaDeluxe pd1 = new PizzaDeluxe(i1, i2, i3, i4);
        pd1.imprimir();
    }
    
}
