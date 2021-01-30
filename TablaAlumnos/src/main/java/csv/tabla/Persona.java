package csv.tabla;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String edad;
    
    public Persona(String d,String n,String a,String e,String t,String ed){
        this.dni=d;
        this.nombre=n;
        this.apellidos=a;
        this.email=e;
        this.telefono=t;
        this.edad=ed;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
