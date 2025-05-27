package modelo;


public class Actividad {
    private String mes;
    private String detalle;

    public Actividad(String mes, String detalle) {
        this.mes = mes;
        this.detalle = detalle;
    } 
    public String getMes() {
        return mes;
    }

    public String getDetalle() {
        return detalle;
    }   
   
    @Override
    public String toString() {
        return "Actividad [mes=" + mes + ", detalle=" + detalle + "]";
    }
}   
