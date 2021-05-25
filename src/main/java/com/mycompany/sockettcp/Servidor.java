package com.mycompany.sockettcp;

import java.net.*;
import java.io.*;

public class Servidor {

    public static void main(String[] args) throws IOException {
        ServerSocket servidorSocket = new ServerSocket(4999);
        Socket socket = servidorSocket.accept();

        System.out.println("Cliente conectado");
        
        InputStreamReader input = new InputStreamReader(socket.getInputStream());
        BufferedReader buffer = new BufferedReader(input);

        String texto = buffer.readLine();
        System.out.println("Cliente: " + texto);
        
        
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println("Hola desde el servidor");
        printWriter.flush();
    }
}
