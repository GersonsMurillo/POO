package PersonajeMMORPG;

import java.util.LinkedList;

/**
 *  Define un personaje
 * @author Gerson Murillo
 *  @since 02/23/2023
 */
public class Personaje {
    public String nombrePersonaje;
    public String genero;
    public String tipoPersonaje;
    public int hpMax;
    private int hp;
    public int mpMax;
    private int mp;
    public LinkedList<Artefacto> equipamiento;
    public  Magia [] hechizos;
    
    /**
     *  Crea un objeto de la clase personaje
     * @param nombrePersonaje   Nombre que recibe el personaje del juego
     * @param genero            Genero que recibe el personaje, ya sea masculino o femenino
     * @param tipoPersonaje     Tipo de personaje (Guerrrero, medico, de reconocimiento, etc...)
     * @param hpMax             Salud maxima que podra obtener el personaje
     * @param mpMax             Magia maxima que podra obtener el personaje
     */
    public Personaje(String nombrePersonaje, String genero, String tipoPersonaje, int hpMax, int mpMax){
        this.nombrePersonaje=nombrePersonaje;
        this.genero=genero;
        this.tipoPersonaje=tipoPersonaje;
        this.hpMax=hpMax;
        this.hp=hpMax;
        this.mpMax=mpMax;
        this.mp=mpMax;
    }

    /**
     *  Aumenta la salud actual del personaje
     * @param hp sera la cantidad la cual se le sumara a la salud actual del personaje
     */
    public void aumentarHp(int hp) {
        if(hp>this.hpMax){
            this.hp=this.hpMax;
        }else{
            int vida= this.hp+hp;
            if(vida>=this.hpMax){
                this.hp=this.hpMax;
            }else{
                this.hp=vida;
            }
        } 
    }
    
    /**
     *  Disminuye la salud actual del personaje
     * @param hp    sera la cantidad la cual se le restara a la salud actual del personaje
     */
    public void disminuirHp(int hp) {
        int vida =this.hp-hp;
        if(vida<=0){
           this.hp=0;
        }else{
            this.hp=vida;
        }
        
    }

    /**
     *  Aumenta la magia actual del personaje
     * @param mp sera la cantidad la cual se le sumara a la magia actual del personaje
     */
    public void aumentarMp(int mp) {
        int magia =this.mp+mp;
         if(magia>this.mpMax){
            this.mp=this.mpMax;
        }
        this.hp=hp+this.hp;
    }
    
    /**
     *  Disminuye la magia actual del personaje
     * @param mp    sera la cantidad la cual se le restara a la magia actual
     */
    public void disminuirMp(int mp) {
        int magia = this.mp-mp;
        if(magia<=0){
            System.out.println("Tu personaje se ha quedado sin magia \n");
            this.mp=0;
        }else{
            this.mp=this.mp-mp;
        }
        
    }
    
    /**
     *  Imprime el Status actual del personaje (Inventario, hechizos, puntos de salud)
     */
    public void imprimir(){
        System.out.println("*****STATUS DE PERSONAJE********\n********************************");
        System.out.println("Nombre: " + this.nombrePersonaje);
        System.out.println("Genero: " + this.genero);
        System.out.println("Tipo: " + this.tipoPersonaje);
        System.out.println("HpMax: " + this.hpMax);
        System.out.println("hp actual: " + this.hp);
        System.out.println("\n \n Inventario \n **********");
        if(this.equipamiento==null){
            System.out.println("No cuenta con artefactos en el inventario");
        }else{
            for(int i=0; i<equipamiento.size();i++){
                System.out.println(this.equipamiento.get(i).nombreArctefacto + " \t [" + this.equipamiento.get(i).tipoArtefacto+ "] (Ataque: "
                + this.equipamiento.get(i).ataqueArtefacto + ", Defensa: " + this.equipamiento.get(i).defensaArtefacto+")");
                
            }
            System.out.println("\n  \n");
        }
        System.out.println(" Hechizos \n ********");
        if(this.hechizos==null){
            System.out.println("Tu personaje no saber usar ningun hechizo.");
            System.out.println("\n ");
        }else{
            for(int i=0; i< this.hechizos.length;i++){
                System.out.println(this.hechizos[i].nombreMagia + "\t [" + this.hechizos[i].elementoMagia+"] "
                        + "(Ataque: " + this.hechizos[i].poderHechizo+")");
            }
            System.out.println("\n ");
        }
    }
}
