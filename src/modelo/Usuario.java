package modelo;


public class Usuario {
    private String nombre;
    private Actividad[] actividades;
    
    // Constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Actividad[] getActividades() {
        return actividades;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public void setActividades(Actividad[] actividades) {
        this.actividades = actividades;
    }
    
}
