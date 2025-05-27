package modelo;

import java.util.ArrayList;

public class Rank {
    private String anio;
    private String modalidad;
    private Usuario usuario;
    private String kms;
 
    // Constructor
    public Rank(String anio, String modalidad, Usuario usuario, String kms) {
        this.anio = anio;
        this.modalidad = modalidad;
        this.usuario = usuario;
        this.kms = kms;
    }    
    


    @Override
    public String toString() {
        return "Ranking [anio=" + anio + "modalidad=" + modalidad + ", usuario=" + usuario + ", kms=" + kms + "]";
    }


    // Método para obtener el ranking de kilómetros en bicicleta
    public static ArrayList<Rank> obtenerRanking(ArrayList<Rank> ranking,String anio, String modalidad) {
        // Validar que el año y la modalidad no sean nulos
        if (anio == null || modalidad == null) {
            return new ArrayList<>(); // Retorna un array vacío si el año o la modalidad son nulos
        }
        
        // Filtrar el ranking por año y modalidad
        ArrayList<Rank> rankingFiltrado = new ArrayList<>();
        for (Rank rank : ranking) {
            if (rank.anio.equals(anio) && rank.modalidad.equals(modalidad)) {
                rankingFiltrado.add(rank);
            }
        }
        
        return rankingFiltrado; // Retorna el ranking filtrado
        
    }
    
}
