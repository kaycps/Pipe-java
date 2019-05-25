package Exemplo;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PipedInputStream;

import javax.swing.SingleSelectionModel;

public class Cliente extends Thread{
	
	private DataInputStream inp;
	

	public Cliente(PipedInputStream is) {
		
		inp = new DataInputStream(is);
		
	}
	
	
	
	
	public void run() {
		
		
		try {
			while(true) {
				
				int num = inp.readInt();
				System.out.println("Numero recebido para calculo ==> "+num );
				System.out.println("Calculo ==> "+num*10);
				
				
				
			
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	
	
	 
	

}
