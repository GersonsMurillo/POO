package automovil;

/**
 *
 * @author Gerson Murillo
 */
public class Motor {
    Fabricante marca;
    int cilindros;
    int marchas;
    int caballos;
    int maximasRevoluciones;
    String tipo;
    String combustible;

    public Motor(Fabricante marca, int cilindros, int marchas, int caballos, int maximasRevoluciones, String tipo, String combustible) {
        this.marca = marca;
        this.cilindros = cilindros;
        this.marchas = marchas;
        this.caballos = caballos;
        this.maximasRevoluciones = maximasRevoluciones;
        this.tipo = tipo;
        this.combustible = combustible;
    }
    
}
