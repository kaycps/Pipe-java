package Exemplo;

import java.awt.Frame;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.Random;

public class Servidor extends Thread{
	
	private DataOutputStream dos;
	private Random rand = new Random(); 
	private static View v;
	
	public Servidor(PipedOutputStream os) {
		
		dos = new DataOutputStream(os);
	}
	
	public static synchronized View getInstance() {
		if(v==null) {
			return v = new View();
		}else {
			return v;
		}
	}
	
	
	public void run() {
		
		View v = getInstance();
		
		try {
			
			while(true) {
					
				int num = rand.nextInt(9999);
				System.out.println("Numero gerado: "+num);
				dos.writeInt(num);
				
				dos.flush();
				
				v.setVisible(true);
				v.caregar();
				
				sleep(rand.nextInt(2000));
				
				
				
			
			}
			
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
