package Exemplo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.lang.Thread.State;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import java.awt.Label;

public class View extends JFrame {

	private JPanel contentPane;
	private static Servidor s;
	private static Cliente c;
	
	JProgressBar progressBar = new JProgressBar();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {			
					
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	 
	public View() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel ThredA = new JPanel();
		ThredA.setBackground(new Color(0, 102, 153));
		ThredA.setBounds(75, 109, 89, 131);
		contentPane.add(ThredA);
		ThredA.setLayout(null);
		
		JLabel lblThreadA = new JLabel("Thread A");
		lblThreadA.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblThreadA.setForeground(Color.WHITE);
		lblThreadA.setBounds(0, 0, 90, 48);
		ThredA.add(lblThreadA);
		
		JPanel ThreedB = new JPanel();
		ThreedB.setBackground(new Color(0, 102, 51));
		ThreedB.setBounds(469, 109, 89, 131);
		contentPane.add(ThreedB);
		ThreedB.setLayout(null);
		
		JLabel lblThreadB = new JLabel("Thread B\r\n");
		lblThreadB.setForeground(Color.WHITE);
		lblThreadB.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblThreadB.setBounds(0, 0, 90, 48);
		ThreedB.add(lblThreadB);
		
		
		
		JLabel lblComunicaoComPipes = new JLabel("Comunica\u00E7\u00E3o com Pipes");
		lblComunicaoComPipes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblComunicaoComPipes.setBounds(238, 11, 194, 23);
		contentPane.add(lblComunicaoComPipes);
		progressBar.setMaximum(10);
		progressBar.setStringPainted(true);
		progressBar.setForeground(new Color(0, 102, 204));
		
		
		progressBar.setBounds(174, 170, 285, 14);
		contentPane.add(progressBar);
		
		Label label = new Label("Pipe");
		label.setFont(new Font("Dialog", Font.PLAIN, 19));
		label.setBounds(289, 142, 62, 22);
		contentPane.add(label);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setStringPainted(true);
		progressBar_1.setMaximum(10);
		progressBar_1.setForeground(new Color(0, 102, 204));
		progressBar_1.setBounds(174, 195, 285, 14);
		contentPane.add(progressBar_1);
		
		JLabel lb_NumeroGerado = new JLabel("New label");
		lb_NumeroGerado.setBounds(75, 252, 46, 14);
		contentPane.add(lb_NumeroGerado);
		
		
		
				
	}
	
	public void caregar() {
		
		new Thread() {
			
			public void run() {
							
							for(int i = 0 ; i<11 ; i++) {
								
								try {
									sleep(50);
									progressBar.setValue(i);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
							}
						}
			
			
		}.start();
	}
}
