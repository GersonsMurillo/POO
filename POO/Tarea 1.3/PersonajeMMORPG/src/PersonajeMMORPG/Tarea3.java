package PersonajeMMORPG;

import java.util.LinkedList;

/**
 *
 * @author Gerson Murillo
 */
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Combate
        Artefacto item1 = new Artefacto("Espadas del caos", "Arma", 70, 5);
        Artefacto item2 = new Artefacto("Punios de nemea", "Arma", 50, 10);
        Artefacto item3 = new Artefacto("Hacha de leviatan", "Arma", 80, 0);
        Artefacto item4 = new Artefacto("Pocima de resistencia", "Pocion", 5, 40);
        Artefacto item5 = new Artefacto("Pocima de fuerza", "Pocion", 30, 5);
        //Defensa
        Artefacto item6 = new Artefacto("Escudo vikingo", "Escudo", 10, 80);
        Artefacto item7 = new Artefacto("Casco de melenia", "Armadura", 5, 65);
        Artefacto item8 = new Artefacto("Pechera hechizada", "Armadura", 0, 100);
        //Hechizos
        Magia hechizo1 = new Magia("Invocacion de almas", "Divino", 30);
        Magia hechizo2 = new Magia("Llamas eternas", "Fuego", 70);
        Magia hechizo3 = new Magia("rayo de hielo", "Hielo", 60);
        Magia hechizo4 = new Magia("punio trueno", "Rayo", 60);
        Magia hechizo5 = new Magia("Pulso umbrio", "oscuro", 40);
        
        LinkedList<Artefacto> artefactos = new LinkedList();
        artefactos.add(item1);
        artefactos.add(item2);
        artefactos.add(item3);
        artefactos.add(item4);
        artefactos.add(item5);
        artefactos.add(item6);
        artefactos.add(item7);
        artefactos.add(item8);
        artefactos.add(new Artefacto("botas de cuero", "Armadura", 0, 50));
        
        Magia [] hechizos = {hechizo1, hechizo2, hechizo3, hechizo4, hechizo5,
                            new Magia("Garra dragon", "Naturaleza", 50)};
        Personaje personaje1 = new Personaje("Kronox", "Masculino", "Vikingo", 470, 500);
        
        personaje1.imprimir();
        
        personaje1.disminuirHp(300);
        personaje1.disminuirMp(400);
        
        personaje1.imprimir();
        
        personaje1.disminuirHp(200);
        personaje1.disminuirMp(250);
        
        personaje1.imprimir();
        
        personaje1.aumentarHp(300);
        personaje1.aumentarHp(700);
        
        personaje1.imprimir();
        
        personaje1.equipamiento=artefactos;
        personaje1.hechizos=hechizos;
        
        personaje1.aumentarHp(500);
        personaje1.disminuirHp(200);
        
        personaje1.imprimir();
        
    }
    
}
