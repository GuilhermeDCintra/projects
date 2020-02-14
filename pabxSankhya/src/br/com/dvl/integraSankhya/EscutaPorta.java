package br.com.dvl.integraSankhya;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EscutaPorta {

	private static ServerSocket server;
	private static int port = 9876;

	public void iniciar() throws IOException, ClassNotFoundException {
		server = new ServerSocket(port);
		while (true) {
			Socket socket = server.accept();
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			String message = (String) ois.readObject();
			System.out.println("Message Received: " + message);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject("Hi Client " + message);
			ois.close();
			oos.close();
			socket.close();
			if (message.equalsIgnoreCase("exit"))
				break;
		}
		System.out.println("Shutting down Socket server!!");
		// close the ServerSocket object
		server.close();
	}

}
