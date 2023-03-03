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
public class Playlist {
    private String nombre;
    private int likes;
    private ArrayList <Cancion> playlist = new ArrayList();

    public Playlist() {
    }

    
    public Playlist(String nombre, int likes) {
        this.nombre = nombre;
        this.likes = likes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Cancion> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Cancion> playlist) {
        this.playlist = playlist;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
