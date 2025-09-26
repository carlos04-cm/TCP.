# 📌 README – Ejemplo Cliente-Servidor TCP en Java  

## 📖 Descripción  
Este proyecto implementa un ejemplo simple del **protocolo TCP (Transmission Control Protocol)** en Java.  
Se compone de dos programas:  
- **ServidorTCP** → escucha en el puerto 5000, acepta conexiones de clientes y responde un mensaje de confirmación.  
- **ClienteTCP** → se conecta al servidor en `localhost:5000`, envía un mensaje y recibe la respuesta.  

Este ejemplo muestra cómo funciona la comunicación **cliente-servidor** usando **sockets TCP**, asegurando una transmisión confiable de mensajes.  

---

## ⚙️ Requisitos  
- Tener instalado **Java JDK 8 o superior**.  
- Un sistema operativo con terminal/PowerShell o consola de comandos.  

---

## 📂 Archivos  
- `ServidorTCP.java` → código fuente del servidor.  
- `ClienteTCP.java` → código fuente del cliente.  

---

## ▶️ Ejecución paso a paso  

### 1. Compilar los programas  
En la terminal, escribir:  
```bash
javac ServidorTCP.java
javac ClienteTCP.java
