package ejemplogetset;

public class Persona {
    private String nombre;
    private int edad;



/*    public Persona(String nombre, int edad) { COnstructor para envio
        this.nombre = nombre;
        this.edad = edad;
    }*/
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
