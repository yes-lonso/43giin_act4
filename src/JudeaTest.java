import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class JudeaTest {
    @Test
    public void testHola() {
        assertEquals("Hola, Java", App.decirHola());
    }

    @Test
    public void testValidacionAccesoWeb() {
        // Prueba: Como usuario quiero validar el acceso correcto a la web https://judea.yeslo.es
        String urlWeb = "https://judea.yeslo.es";
        boolean resultadoAcceso = App.validarAccesoWeb(urlWeb);
        assertTrue("El acceso web debería ser exitoso", resultadoAcceso);
    }

    @Test
    public void testActividadesMensuales() {
        // Prueba: Como deportista quiero ver todas mis actividades deportivas durante el mes actual
        String mesActual = "05";
        String usuario = "javier";
        String[] actividades = App.obtenerActividadesMensuales(mesActual, usuario);
        assertNotNull("Las actividades no deberían ser nulas", actividades);
        assertTrue("Debería tener al menos una actividad", actividades.length > 0);
    }

    @Test
    public void testVisualizacionMensajeChat() {
        // Prueba: Como deportista quiero visualizar un mensaje enviado en una sala de chat
        String salaChat = "judea";
        String mensajePrueba = "¡Mensaje del Administrador!";
        String mensajeMostrado = App.mostrarMensajeChat(salaChat, mensajePrueba);
        assertEquals("El mensaje debería mostrarse correctamente", mensajePrueba, mensajeMostrado);
    }

    @Test
    public void testRankingBicicleta() {
        // Prueba: Como deportista quiero ver la clasificación general del año en curso para "Ranking de kilómetros" en la modalidad de "bicicleta"
        String anio = "2025";
        String categoria = "kilómetros";
        String modalidad = "bicicleta";
        String[] clasificacion = App.obtenerRankingBicicleta(anio, categoria, modalidad);
        assertNotNull("La clasificación no debería ser nula", clasificacion);
        assertTrue("La clasificación debería tener entradas", clasificacion.length > 0);
    }

    @Test
    public void testInicializacionApp() {
        // Prueba: Verificar que la aplicación se inicializa correctamente
        boolean estaInicializada = App.inicializar();
        assertTrue("La aplicación debería inicializarse exitosamente", estaInicializada);
    }
}
