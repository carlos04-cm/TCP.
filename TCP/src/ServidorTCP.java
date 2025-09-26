import java.io.*;
import java.net.*;

public class ServidorTCP {
    public static void main(String[] args) throws IOException {
        // Crear el servidor en el puerto 5000
        ServerSocket servidor = new ServerSocket(5000);
        System.out.println("Servidor iniciado en el puerto 5000...");

        // Esperar y aceptar una conexión del cliente
        Socket socket = servidor.accept();
        System.out.println("Cliente conectado.");

        // Preparar canales de entrada y salida de datos
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(socket.getInputStream())); // Recibir datos del cliente
        PrintWriter salida = new PrintWriter(socket.getOutputStream(), true); // Enviar datos al cliente

        // Leer mensaje enviado por el cliente
        String mensaje = entrada.readLine();
        System.out.println("Cliente dice: " + mensaje);

        // Responder al cliente confirmando la recepción
        salida.println("Mensaje recibido: " + mensaje);

        // Cerrar la conexión
        socket.close();
        servidor.close();
    }
}

