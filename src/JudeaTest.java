import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


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
    public void testVisualizacionMensajeChat() {
        // Prueba: Como deportista quiero visualizar un mensaje enviado en una sala de chat
        String salaChat = "judea";
        String mensajePrueba = "¡Mensaje del Administrador!";
        String mensajeMostrado = App.mostrarMensajeChat(salaChat, mensajePrueba);
        assertEquals("El mensaje debería mostrarse correctamente", mensajePrueba, mensajeMostrado);
    }

   

    @Test
    public void testInicializacionApp() {
        // Prueba: Verificar que la aplicación se inicializa correctamente
        boolean estaInicializada = App.inicializar();
        assertTrue("La aplicación debería inicializarse exitosamente", estaInicializada);
    }
}
