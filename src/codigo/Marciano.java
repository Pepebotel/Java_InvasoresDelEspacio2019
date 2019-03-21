/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author jorge
 */
public class Marciano {
    public Image imagen, imagen2, imagen3, imagen4 = null;
    public int x = 0;
    public int y = 0;
    private int vX=1;

public Marciano() {
        try {
            imagen = ImageIO.read(getClass().getResource("/imagenes/naveTie.png"));
            imagen2 = ImageIO.read(getClass().getResource("/imagenes/naveImperio.png"));
            imagen3 = ImageIO.read(getClass().getResource("/imagenes/starDestroyer.png"));
            imagen4 = ImageIO.read(getClass().getResource("/imagenes/naveTie2.png"));
        } catch (IOException ex) {
        }
    }
public void  mueve() {
    x += vX;
}

    public void setvX(int vX) {
        this.vX = vX;
    }

    public int getvX() {
        return vX;
    }
}
