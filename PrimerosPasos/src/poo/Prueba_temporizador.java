package poo;

import java.sql.Time;

import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class Prueba_temporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dame_la_hora oyente= new Dame_la_hora();
		
		//ActionListener oyente = new Dame_la_hora();
		
		Timer mi_temporizador = new Timer(5000, oyente);
		
		mi_temporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
		System.exit(0);

	}

}

class Dame_la_hora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora=new Date();
		
		System.out.println("Te pongo la hora cada 5 segundos "+ ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}
}
