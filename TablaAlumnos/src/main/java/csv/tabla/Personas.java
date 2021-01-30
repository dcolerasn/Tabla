package csv.tabla;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Personas {
    public List <Persona> listaPersonas = new ArrayList<>();    
    private BufferedReader fichero;
    private File archivo;
    

    public Personas(File a){
        listaPersonas = new ArrayList<>();
        try {
            fichero = new BufferedReader(new InputStreamReader(new FileInputStream(a), "utf-8"));  
            String linea;
            while((linea = fichero.readLine()) != null){
                String [] campos = linea.split(";");
                String dni =(campos[0]);
                String nombre = (campos[1]);
                String apellidos = (campos[2]);
                String email = campos[3];
                String telefono = campos[4];
                String edad = campos[5];                
                listaPersonas.add(new Persona(dni,nombre,apellidos,email,telefono,edad));
            }
        } catch (IOException ex) {
           System.out.println("Error");
        }
    }
    
    public List<Persona> getListaPersonas(){
        return listaPersonas;
    }
}
