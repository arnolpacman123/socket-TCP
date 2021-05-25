package com.mycompany.sockettcp;

import java.io.*;
import java.net.*;

public class Cliente {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 4999);

        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println("Hola desde el cliente");
        printWriter.flush();
        
        
        InputStreamReader input = new InputStreamReader(socket.getInputStream());
        BufferedReader buffer = new BufferedReader(input);

        String texto = buffer.readLine();
        System.out.println("Servidor: " + texto);
        
    }
}
