/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_luismendoza;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luiscarlomendoza
 */
public class adminAlbum {
    private ArrayList<Album> albums = new ArrayList();
    private File file = null;

    public adminAlbum(String path) {
        file = new File(path);
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    
  public void EscribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(file, false);
            bw = new BufferedWriter(fw);

            for (Album c : albums) {
                bw.write(c.getTitulo()+ ";");
                bw.write(c.getFecha() + ";");
                bw.write(c.getLikes() + ";");
                bw.write(c.getCanciones() + ";");
                bw.write(c.getNumeroCanciones() + ";");
               
            }

            bw.flush();

        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        albums = new ArrayList();
        if (file.exists()) {
            try {
                sc = new Scanner(file);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
//                    albums.add(new Album(sc.next(),  ;
                }

            } catch (Exception e) {
            }

            sc.close();
        }

    }
  
    
    
}
