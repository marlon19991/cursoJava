package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import javax.imageio.*;
import java.io.*;
import java.awt.event.*;


public class EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoVentana mimarco = new MarcoVentana();
		MarcoVentana mimarco2=new MarcoVentana();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		mimarco.setTitle("Ventana 1");
		mimarco2.setTitle("Ventana 2");
		
		mimarco.setBounds(100, 300, 500, 350);

		mimarco2.setBounds(700, 300, 500, 350);
	}

}

class MarcoVentana extends JFrame {
	
	public MarcoVentana(){
	
	//setTitle ("Respodiendo");
	//setBounds (300,300,500,350);
	setVisible(true);	
	
	//M_Ventana oyenteVentana=new M_Ventana();
	//addWindowListener(oyenteVentana);
	
	addWindowListener(new M_Ventana());
	}
}

class M_Ventana extends WindowAdapter{
	
	/*public void windowActivated(WindowEvent e) {
		
		System.out.println("Ventana activada");
	}
	
	public void windowClosed(WindowEvent e) {
		
		System.out.println("La ventana ha sido cerrada");
	}
	
	public void windowClosing(WindowEvent e) {
		
		System.out.println("Cerrando ventana");
	}
	
	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("Ventana desactivada");
	}
	
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana restaurada");
	}
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");
	}
	
	public void windowOpened(WindowEvent e) {
		
		System.out.println("Ventana abierta");
	}*/
	
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}

}