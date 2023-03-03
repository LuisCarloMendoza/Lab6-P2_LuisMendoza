/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_luismendoza;

import java.util.ArrayList;

/**
 *
 * @author luiscarlomendoza
 */
public class Artista extends Usuario {
    private String name;
    private ArrayList <Cancion> cancionesPublicadas = new ArrayList();
    private ArrayList <Lanzamiento> lanzamientos = new ArrayList();

    public Artista() {
        super();
    }

    public Artista(String name, String username, String password, int edad) {
        super(username, password, edad);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Cancion> getCancionesPublicadas() {
        return cancionesPublicadas;
    }

    public void setCancionesPublicadas(ArrayList<Cancion> cancionesPublicadas) {
        this.cancionesPublicadas = cancionesPublicadas;
    }

    public ArrayList<Lanzamiento> getLanzamientos() {
        return lanzamientos;
    }

    public void setLanzamientos(ArrayList<Lanzamiento> lanzamientos) {
        this.lanzamientos = lanzamientos;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
    
    
    
    
    
}
