package Exemplo;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		try {
			
			PipedOutputStream out = new PipedOutputStream();
			PipedInputStream in = new PipedInputStream();
			
			out.connect(in);
			
			
			Servidor servidor = new Servidor(out);
			Cliente cliente = new Cliente(in);
			
			cliente.start();
			servidor.start();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
