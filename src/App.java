import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URI;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        inicializar();
        System.out.println("¡Bienvenido a la aplicación Judea!");
    }

    // Método para decir "Hola, Java"
    public static Object decirHola() {
        return "Hola, Java";
    }

    public static boolean validarAccesoWeb(String urlWeb) {
        // Validar que la URL no sea nula o vacía
        if (urlWeb == null || urlWeb.isEmpty()) {
            System.err.println("URL no válida");
            return false;
        }
        try {
            URI uri = new URI(urlWeb);
            URL url = uri.toURL();
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.setConnectTimeout(5000);
            conexion.setReadTimeout(5000);
            
            int codigoRespuesta = conexion.getResponseCode();
            conexion.disconnect();
            
            // Retorna true si la respuesta es exitosa 200
            return codigoRespuesta == 200;
        } catch (Exception e) {
            System.err.println("Error al validar acceso web: " + e.getMessage());
            return false;
        }
    }

   

    // Método para obtener las actividades deportivas del mes actual
    public static String[] obtenerActividadesMensuales(String mesActual, String usuario) {
        // Validar que el mes y el usuario no sean nulos o vacíos
        if (mesActual == null || mesActual.isEmpty() || usuario == null || usuario.isEmpty()) {
            System.err.println("Mes o usuario no válido");
            return new String[0]; // Retorna un array vacío si el mes o el usuario no son válidos
        }
        // Simulación de actividades deportivas para el mes actual
        List<String> actividades = new ArrayList<>();
        
        if (mesActual.equals("05") && usuario.equals("javier")) {
            actividades.add("Ruta en bicicleta - 75 km - 1/05/2025");
            actividades.add("Carrera a pie - 10 km - 8/05/2025");
            actividades.add("Senderismo - 12 km - 15/05/2025");
            actividades.add("Ruta en bicicleta - 80 km - 22/05/2025");
            actividades.add("Senderismo - 13 km - 29/05/2025");
        } else {
            // Actividades para otros meses
            actividades.add("Ruta en bicicleta - 65 km");
            actividades.add("Senderismo - 13 km");
        }
        System.out.println("Actividades del mes " + mesActual + ": " + actividades);
        return actividades.toArray(new String[0]);
    }

    // Método para mostrar un mensaje en una sala de chat
    public static String mostrarMensajeChat(String salaChat, String mensajePrueba) {
        // Validar que la sala de chat y el mensaje no sean nulos o vacíos
        if (salaChat == null || mensajePrueba == null) {
            return "Error: Sala de chat o mensaje no válido";
        }
        
        // Simulación de visualización de mensaje en chat
        String marcaTiempo = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        String mensajeFormateado = String.format("[%s] %s: %s", marcaTiempo, salaChat, mensajePrueba);
        
        System.out.println(mensajeFormateado);
        
        return mensajePrueba; // Retorna el mensaje original para validación en tests
    }

    // Método para obtener el ranking de kilómetros en bicicleta
    public static String[] obtenerRankingBicicleta(String anio, String categoria, String modalidad) {
        // Validar que el año, categoría y modalidad no sean nulos
        if (anio == null || categoria == null || modalidad == null) {
            return new String[0];
        }
        
        // Simulación de ranking de kilómetros en bicicleta para 2025
        if (anio.equals("2025") && categoria.equals("kilómetros") && modalidad.equals("bicicleta")) {
            
            // crear una variable para almacenar el ranking
            String[] ranking = {
                "1. JuanRomero - 2.397,35 km totales - 64,79 media",
                "2. Fernando - 1.646 km totales - 54,87 km media", 
                "3. Mapmens - 1.314 km totales - 69,20 km media",
                "4. Fernando - 1.646 km totales - 54,87 km media",
                "5. Laura - 1.276,36 km totales - 70,91 km media",
                "6. Diego García - 1.188,60 km totales - 47,54 km media",
                "7. Manuel - 1.1160,11 km totales - 52,73 km media",
                "8. Diego - 1.098,00 km totales - 73,20 km media",
                "9. Litri - 1.077,05 km totales - 53,85 km media",
                "9. Eduardo - 1.066,63 km totales - 50,79 km media"
            };
            
            System.out.println("Ranking de kilómetros en bicicleta para el año " + anio + ":");
            for (String entry : ranking) {
                System.out.println(entry);
            }
            return ranking; // Retorna el ranking simulado
        }
        // Si no es el año: 2025, categoría: kilómetros o modalidad bicicleta, retorna un ranking vacío
        return new String[0];

    }

    // Método para inicializar la aplicación
    public static boolean inicializar() {    
        // Usar la función validarAccesoWeb para simular la conexión con el backend
        boolean conexionBackend = validarAccesoWeb("https://judea.yeslo.es");

        // Simulación de login de usuario
        String usuario = "javier"; // Usuario de prueba
        String password = "admin123"; // Contraseña de prueba
        boolean loginExitoso = "javier".equals(usuario) && "admin123".equals(password);

        if (!conexionBackend) {
            System.err.println("No se pudo conectar con el backend.");
            return false;
        }
        if (!loginExitoso) {
            System.err.println("Error de autenticación de usuario.");
            return false;
        }
        
        try {
            // Simulación de inicialización de la aplicación
            System.out.println("Inicializando aplicación Judea...");
            System.out.println("Aplicación inicializada correctamente");
            return true;
            
        } catch (Exception e) {
            System.err.println("Error durante la inicialización: " + e.getMessage());
            return false;
        }
    } 
}
