package ejemplo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejemplo extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Ejemplo() {
		
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Ventana");
		this.setSize(500, 500);
		
	}
	
	public static void main(String[] args) {
		Ejemplo ejemplo = new Ejemplo();
		ejemplo.setVisible(true);
		
	}
	
}
