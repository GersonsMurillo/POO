package PersonajeMMORPG;

/**
 *  Define una magia
 * @author Gerson Murillo
 * @since 02/23/2023
 */
public class Magia {
    public String nombreMagia;
    public String elementoMagia;
    public int poderHechizo;

    /**
     *  Crea un objeto de la clase magia
     * @param nombreMagia   Nombre que recibe la magia o hechizo
     * @param elementoMagia Define el tipo o elemento natural de la magia o hechizo
     * @param poderHechizo  Define los puntos de ataque del hechizo
     */
    public Magia(String nombreMagia, String elementoMagia, int poderHechizo) {
        this.nombreMagia = nombreMagia;
        this.elementoMagia = elementoMagia;
        this.poderHechizo = poderHechizo;
    }
  
}
