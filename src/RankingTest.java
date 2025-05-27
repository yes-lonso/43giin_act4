import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import modelo.Rank;
import modelo.Usuario;

public class RankingTest {
    static ArrayList<Rank> ranking;
    static Rank rank;

    @BeforeClass    
    public static void beforeClass() {
        // Inicializar datos de prueba  
        ranking = new ArrayList<>();

        ranking.add(new Rank("2025", "bicicleta",new Usuario("JuanRomero"),"2.397,35"));
        ranking.add(new Rank("2025", "bicicleta",new Usuario("Fernando"),"1.646"));
        ranking.add(new Rank("2025", "bicicleta",new Usuario("Mapmens"),"1.314"));
        ranking.add(new Rank("2025", "bicicleta",new Usuario("Fernando"),"1.646"));
        ranking.add(new Rank("2025", "senderismo",new Usuario("Laura"),"1.276,36"));
        ranking.add(new Rank("2025", "bicicleta",new Usuario("Diego García"),"1.188,60"));      
        ranking.add(new Rank("2025", "bicicleta",new Usuario("Manuel"),"1.1160,11"));
        ranking.add(new Rank("2025", "senderismo",new Usuario("Diego"),"1.098,00"));
        ranking.add(new Rank("2025", "bicicleta",new Usuario("Litri"),"1.077,05"));
        ranking.add(new Rank("2025", "senderismo",new Usuario("Eduardo"),"1.066,63"));
    }
        
    @Test
    public void testRankingBicicleta() {
        // Prueba: Como deportista quiero ver la clasificación general del año en curso para "Ranking de kilómetros" en la modalidad de "bicicleta"
        String anio = "2025";
        String modalidad = "bicicleta";
        ArrayList<Rank> clasificacion = Rank.obtenerRanking(ranking,anio, modalidad);
        assertNotNull("La clasificación no debería ser nula", clasificacion);
        assertTrue("La clasificación debería tener entradas", clasificacion.size() > 0);
    }


}
