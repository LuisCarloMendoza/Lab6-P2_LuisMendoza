/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_luismendoza;

import java.util.Date;

/**
 *
 * @author luiscarlomendoza
 */
public class Single extends Lanzamiento {
    
    private Cancion cancion;

    public Single() {
        super();
        cancion = new Cancion();
        
    }

    public Single(Cancion cancion, String titulo, Date fecha, int likes) {
        super(titulo, fecha, likes);
        this.cancion = cancion;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
    
    
    
}
