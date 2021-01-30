package csv.tabla;
import java.io.*;
import java.util.*;
import javax.swing.table.*;
/**
 *
 * @author Alumno Tarde
 */

public class Modelo extends AbstractTableModel{
    private List<Persona> listaPersonas;
    
    public Modelo(List<Persona> listaPersonas){
        this.listaPersonas = listaPersonas;
    }
    

    @Override
    public int getRowCount() {
        return listaPersonas.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
        
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listaPersonas.get(rowIndex).getDni();
            case 1:
                return listaPersonas.get(rowIndex).getNombre();
            case 2:
                return listaPersonas.get(rowIndex).getApellidos();
            case 3:
                return listaPersonas.get(rowIndex).getEmail();
            case 4: 
                return listaPersonas.get(rowIndex).getTelefono();
            case 5:
                return listaPersonas.get(rowIndex).getEdad();
        }
        return null;
    }
    
        public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "DNI";
            case 1:
                return "Nombre";
            case 2:
                return "Apelidos";
            case 3:
                return "Email";
            case 4:
                return "Telefono";
            case 5:
                return "Edad";
            }
        return null;
        }
}
