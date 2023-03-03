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
public class adminArtista {

    private ArrayList<Artista> artistas = new ArrayList();
    private File file = null;

    public adminArtista(String path) {
        file = new File(path);
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
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

            for (Artista c : artistas) {
                bw.write(c.getName() + ";");
                bw.write(c.getUsername() + ";");
                bw.write(c.getPassword() + ";");
                bw.write(c.getEdad() + ";");
                bw.write(c.getCancionesPublicadas() + ";");
                bw.write(c.getLanzamientos() + ";");

            }

            bw.flush();

        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        artistas = new ArrayList();
        if (file.exists()) {
            try {
                sc = new Scanner(file);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    
                    artistas.add(new Artista(sc.next(), sc.next(), sc.next(), sc.nextInt()));
                }

            } catch (Exception e) {
            }

            sc.close();
        }

    }

}
