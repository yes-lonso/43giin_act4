import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import modelo.Actividad;
import modelo.Usuario;

public class ActividadTest {
    static Usuario usuario;
    static Actividad[] actividades;

    @BeforeClass
    public static void beforeClass() {
        // Inicializar datos de prueba
        usuario = new Usuario("javier");
        
        // Agregar actividades al usuario - Sintaxis corregida
        actividades = new Actividad[] {
            new Actividad("05", "Ruta en bicicleta - 75 km - 1/05/2025"),
            new Actividad("05", "Carrera a pie - 10 km - 8/05/2025"),
            new Actividad("05", "Senderismo - 12 km - 15/05/2025"),
            new Actividad("04", "Ruta en bicicleta - 80 km - 22/04/2025"),
            new Actividad("03", "Senderismo - 13 km - 29/03/2025")
        };

        usuario.setActividades(actividades);
    }

   // crear test para las actividades

    @Test
    public void testActividadesDelUsuario() {
        // Verificar que existe un usuario y que tiene 5 actividades
        assertNotNull("El usuario no debería ser nulo", usuario);
        assertNotNull("Las actividades del usuario no deberían ser nulas", usuario.getActividades());  
        assertEquals("El usuario tiene 5 actividades",5, usuario.getActividades().length);
    }

   
    @Test
    public void testActividadesMensuales() {
        // Prueba: Como deportista quiero ver todas mis actividades deportivas durante el mes actual
        assertNotNull("Las actividades no deberían ser nulas", actividades);
        assertTrue("Debería tener al menos una actividad", actividades.length > 0);
        
        // Verificar que hay actividades del mes 05
        int actividadesMayo = 0;
        for (Actividad actividad : actividades) {
            if ("05".equals(actividad.getMes())) {
                actividadesMayo++;
            }
        }
        assertTrue("Debería tener actividades del mes 05", actividadesMayo > 0);
    }
}
