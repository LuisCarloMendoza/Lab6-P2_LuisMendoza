/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_luismendoza;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author luiscarlomendoza
 */
public class Album extends Lanzamiento {
   
    private ArrayList <Cancion> canciones = new ArrayList();
    private int numeroCanciones = canciones.size();

    public Album() {
        super();
    }

    public Album(String titulo, Date fecha, int likes) {
        super(titulo, fecha, likes);
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
    
}
