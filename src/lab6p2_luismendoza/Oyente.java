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
public class Oyente extends Usuario {

    ArrayList <Cancion> cancionesFav = new ArrayList();
    ArrayList <Playlist> listaDeReproduccion = new ArrayList();
    ArrayList <Playlist> likedPlayList = new ArrayList();
    
    public Oyente() {
        super();
    }

    public Oyente(String username, String password, int edad) {
        super(username, password, edad);
    }
    
    public ArrayList<Cancion> getCancionesFav() {
        return cancionesFav;
    }

    public void setCancionesFav(ArrayList<Cancion> cancionesFav) {
        this.cancionesFav = cancionesFav;
    }

    public ArrayList<Playlist> getListaDeReproduccion() {
        return listaDeReproduccion;
    }

    public void setListaDeReproduccion(ArrayList<Playlist> listaDeReproduccion) {
        this.listaDeReproduccion = listaDeReproduccion;
    }

    public ArrayList<Playlist> getLikedPlayList() {
        return likedPlayList;
    }

    public void setLikedPlayList(ArrayList<Playlist> likedPlayList) {
        this.likedPlayList = likedPlayList;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    

    
    
    
    
    
    
}
