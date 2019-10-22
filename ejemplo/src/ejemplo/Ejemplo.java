package ejemplo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejemplo extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	boolean stop = false;
	int i = 0;
	
	public Ejemplo() {
		
		JPanel bPanel = new JPanel();
		add(bPanel, BorderLayout.SOUTH);
		
		JButton button = new JButton("Click");
		bPanel.add(button);
		
		JProgressBar progressBar = new JProgressBar(0, 10000000);
		add(progressBar, BorderLayout.NORTH);
		
		progressBar.setValue(75);
		
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread t = new Thread(new Runnable() {
					
					@Override
					public void run() {
						//boolean stop = false; // ?
						//for (long i = 0; i< Long.MAX_VALUE && !stop; i++) {
						
						for (i = 0; i <= 10000000 && !stop; i++) {
							System.out.println(i);
							
							SwingUtilities.invokeLater(new Runnable() {
								
								@Override
								public void run() {
									progressBar.setValue(i);
									
								}
							});
							

						}
						
					}
				});
				
				t.start();
			}
		});
		
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				
				stop = true;
			}
			
			
		});
		
		this.setTitle("Ventana 2");
		this.setSize(640, 480);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Ejemplo ejemplo = new Ejemplo();
		ejemplo.setVisible(true);

		//System.out.println("Hola mundo desde Java"); fdgdfg
		
	}
	
}
