package PersonajeMMORPG;

/**
 *  Define un artefacto
 * @author Gerson Murillo
 * @since 02/23/2023
 */
public class Artefacto {
    public String nombreArctefacto;
    public String tipoArtefacto;
    public int ataqueArtefacto;
    public int defensaArtefacto;
    /**
     *  Crea un objeto de la clase artefacto
     * @param nombreArctefacto  Nombre que recibe el artefacto
     * @param tipoArtefacto     Tipo que define si el artefacto es un arma o armadura
     * @param ataqueArtefacto   Define la cantidad de puntos de ataque del artefacto
     * @param defensaArtefacto  Define la cantidad de puntos de defensa del artefacto
     */
    public Artefacto(String nombreArctefacto, String tipoArtefacto, int ataqueArtefacto, int defensaArtefacto) {
        this.nombreArctefacto = nombreArctefacto;
        this.tipoArtefacto = tipoArtefacto;
        this.ataqueArtefacto = ataqueArtefacto;
        this.defensaArtefacto = defensaArtefacto;
    }
    
    
}
