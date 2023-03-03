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
public class adminOyente {
    
    private ArrayList<Oyente> oyentes = new ArrayList();
    private File file = null;
    
    public adminOyente(String path) {
        file = new File(path);
    }

    public ArrayList<Oyente> getOyentes() {
        return oyentes;
    }

    public void setOyentes(ArrayList<Oyente> oyentes) {
        this.oyentes = oyentes;
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

            for (Oyente c : oyentes) {
                bw.write(c.getUsername()+ ";");
                bw.write(c.getPassword() + ";");
                bw.write(c.getEdad() + ";");
                bw.write(c.getListaDeReproduccion() + ";");
                bw.write(c.getListaDeReproduccion() + ";");
               
            }

            bw.flush();

        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        oyentes = new ArrayList();
        if (file.exists()) {
            try {
                sc = new Scanner(file);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    oyentes.add(new Oyente(sc.next(), sc.next(), sc.nextInt()));
                }

            } catch (Exception e) {
            }

            sc.close();
        }

    }

    
    
    
}
