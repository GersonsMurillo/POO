package ejercicio3;

/**
 *
 * @author Gerson Murillo
 */
public class Rectangulo {
    public float coordenada_X_Inicial;
    public float coordenada_X_Final;
    public float coordenada_Y_Inicial;
    public float coordenada_Y_Final;
    
    //Constructores
    public Rectangulo(){
        this.coordenada_X_Inicial = 0;
        this.coordenada_Y_Inicial = 0;
        this.coordenada_X_Final = 0;
        this.coordenada_Y_Final = 0;
    }
    public Rectangulo(float coordenada_X_Inicial, float coordenada_X_Final, float coordenada_Y_Inicial, float coordenada_Y_Final) {
        this.coordenada_X_Inicial = coordenada_X_Inicial;
        this.coordenada_Y_Inicial = coordenada_Y_Inicial;
        this.coordenada_X_Final = coordenada_X_Final;
        this.coordenada_Y_Final = coordenada_Y_Final;
    }
    //Funciones
    /**
     * Esta se utiliza para obtener el area de un rectangulo utilizando 2 puntos en el plano
     * @param rectangulo    recibe un objeto de tipo Rectangulo
     * @return El area del rectangulo
     */
    public double areaRectangulo(Rectangulo rectangulo){
        double largo=rectangulo.coordenada_X_Final-rectangulo.coordenada_X_Inicial;
        double ancho=rectangulo.coordenada_Y_Final-rectangulo.coordenada_Y_Inicial;
        if(largo<0)largo=largo*-1;
        if(ancho<0)ancho=ancho*-1;
        return largo*ancho;
    }
    /**
     * Se utiliza para obtener el valor del perimetro del rectangulo
     * @param rectangulo recibe un objeto de tipo Rectangulo
     * @return el perimetro del rectangulo
     */
    public double perimetroRectangulo(Rectangulo rectangulo){
        double largo=rectangulo.coordenada_X_Final-rectangulo.coordenada_X_Inicial;
        double ancho=rectangulo.coordenada_Y_Final-rectangulo.coordenada_Y_Inicial;
        if(largo<0)largo=largo*-1;
        if(ancho<0)ancho=ancho*-1;
        largo=largo*2;
        ancho=ancho*2;
        return largo+ancho;
    }
    /**
     * Se utiliza para obtener el valor de la diagonal del rectangulo usando el teorema de pitagoras
     * @param rectangulo recibe un objeto de tipo Rectangulo
     * @return El valor de la diagonal (Hipotenusa) del rectangulo
     */
    public double diagonalRectangulo(Rectangulo rectangulo){
        double catetoOpuesto=rectangulo.coordenada_Y_Final-rectangulo.coordenada_Y_Inicial;
        double catetoAdyacente=rectangulo.coordenada_X_Final-rectangulo.coordenada_X_Inicial;
        double hipotenusa=Math.sqrt(Math.pow(catetoOpuesto, 2)+Math.pow(catetoAdyacente, 2));
        return hipotenusa;
    }
}
