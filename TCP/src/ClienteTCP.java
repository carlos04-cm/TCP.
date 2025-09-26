import java.io.*;
import java.net.*;

public class ClienteTCP {
    public static void main(String[] args) throws IOException {
        // Conectar el cliente al servidor en localhost y puerto 5000
        Socket socket = new Socket("localhost", 5000);

        // Preparar canales de comunicación con el servidor
        PrintWriter salida = new PrintWriter(socket.getOutputStream(), true); // Enviar datos
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(socket.getInputStream())); // Recibir datos

        // Enviar mensaje al servidor
        salida.println("Hola servidor, soy Carlos");

        // Recibir la respuesta del servidor
        String respuesta = entrada.readLine();
        System.out.println("Servidor dice: " + respuesta);

        // Cerrar la conexión
        socket.close();
    }
}

