package br.com.dvl.integraSankhya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class EscutaPorta {

	private static ServerSocket server;
	private static int port = 9876;

	public void iniciar() throws IOException, ClassNotFoundException {
		server = new ServerSocket(port);
		while (true) {
			Socket socket = server.accept();
			System.out.println(socket.getInputStream());
			BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
            	System.out.println(line);
            }
//			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
//			String message = (String) ois.readObject();
//			System.out.println("Message Received: " + message);
//			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
//			oos.writeObject("Hi Client " + message);
//			ois.close();
//			oos.close();
//			socket.close();
			if (/*message.equalsIgnoreCase("exit")*/"".equals("a")) {
				break;
			}
		}
//		System.out.println("Shutting down Socket server!!");
		// close the ServerSocket object
		server.close();
	}

}
//https://www.programcreek.com/java-api-examples/?class=java.net.Socket&method=getInputStream