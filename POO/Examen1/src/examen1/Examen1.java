package examen1;

/**
 *
 * @author Gerson Murillo
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Gerson", "Cocinero");
        
        Categoria categoria1 = new Categoria("Asado", persona1);
        
        Complemento complemento1 = new Complemento("Papa al horno", false, true, 30f);
        
        Complemento complemento2 = new Complemento("Papas fritas", false, true, 0);
        
        Ensalada ensalada1 = new Ensalada("Ensalada de lechuga", false, 20f);
        
        Carne carne1 = new Carne("Lomo de res", true, 90f);
        
        Platillo churrasco = new Platillo("Churrasco de lomo", categoria1, carne1, ensalada1, complemento1, null);
        
        churrasco.imprimir();
    }
    
}
