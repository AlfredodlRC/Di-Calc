package Manejadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

import Vistas.Ventana;

public class ManejadorEventos implements ActionListener {

	private Ventana ventana;

	private String mensajeError = "";
	
	public void establecerVentana(Ventana ventana) {
		this.ventana = ventana;
		System.out.print("manejador inicializado");

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

//		if (e.getSource() == ventana.getAnchoBorde1()) { ponerBorder(1); }
//		if (e.getSource() == ventana.getAnchoBorde10()) { ponerBorder(10); }
//		if (e.getSource() == ventana.getAnchoBorde20()) { ponerBorder(20); }
//		if (e.getSource() == ventana.getAnchoBorde30()) { ponerBorder(30); }
//		if (e.getSource() == ventana.getAnchoBorde40()) { ponerBorder(40); }
		//-------------------------------------------------------------------------------------------
		if (e.getSource() == ventana.getBtnSuma()) { suma(); }		
		if (e.getSource() == ventana.getBtnResta()) { resta(); }
		if (e.getSource() == ventana.getBtnMultiplicacion()) { multiplicacion(); }
		if (e.getSource() == ventana.getBtnDivision()) { division(); }
		if (e.getSource() == ventana.getBtnRaizTres()) { raizCubica(); }
		if (e.getSource() == ventana.getBtnRaizDos()) {
			JOptionPane.showMessageDialog(null,"Funcionabilidad no disponible","Raiz cuadrada", JOptionPane.INFORMATION_MESSAGE);
		}
		//-------------------------------------------------------------------------------------------
		if (this.mensajeError.isEmpty() == false) {
			JOptionPane.showMessageDialog(null,this.mensajeError,"mensaje de error", JOptionPane.ERROR_MESSAGE);

		}
			
		
	}
	
	private void suma() {
		
		String cadenaNumero1;
		String cadenaNumero2;
		Double numero1;
		Double numero2;
		Double resultado;
		String cadenaError = "";
		
		cadenaNumero1 = ventana.getTFNumero1().getText();
		cadenaNumero2 = ventana.getTFNumero2().getText();
		this.mensajeError = "";
		
		if (comprobarEntrada(cadenaNumero1) == false) {
			ventana.getIconoNumero1().setIcon(new ImageIcon("E:\\dislike.png"));
			ventana.getTFNumero1().requestFocusInWindow();
			cadenaError = "El numero 1 " + this.mensajeError;
		} else {
			ventana.getIconoNumero1().setIcon(new ImageIcon("E:\\like.png"));			
		}
		
		if (comprobarEntrada(cadenaNumero2) == false) {
			ventana.getIconoNumero2().setIcon(new ImageIcon("E:\\dislike.png"));
			ventana.getTFNumero2().requestFocusInWindow();
			if (this.mensajeError.isEmpty() == false) {
				cadenaError += "\n" + "El numero 2 " + this.mensajeError;
			} else {
				cadenaError = "El numero 2 " + this.mensajeError;				
			}
		} else {
			ventana.getIconoNumero2().setIcon(new ImageIcon("E:\\like.png"));			
		}
		
		if (cadenaError.isEmpty() == false) {
			this.mensajeError = cadenaError;
			return;
		}
		
		
		
		
		numero1 = Double.parseDouble(cadenaNumero1);
		numero2 = Double.parseDouble(cadenaNumero2);

		resultado = numero1 + numero2;

		ventana.getLblResultado().setText(resultado.toString());
	}
	
	private void resta() {
		
		String cadenaNumero1;
		String cadenaNumero2;
		Double numero1;
		Double numero2;
		Double resultado;
		String cadenaError = "";
		
		cadenaNumero1 = ventana.getTFNumero1().getText();
		cadenaNumero2 = ventana.getTFNumero2().getText();
		this.mensajeError = "";
		
		if (comprobarEntrada(cadenaNumero1) == false) {
			ventana.getTFNumero1().requestFocusInWindow();
			cadenaError = "El numero 1 " + this.mensajeError;
		}
		
		if (comprobarEntrada(cadenaNumero2) == false) {
			ventana.getTFNumero1().requestFocusInWindow();
			if (this.mensajeError.isEmpty() == false) {
				cadenaError += "\n" + "El numero 2 " + this.mensajeError;
			} else {
				cadenaError = "El numero 2 " + this.mensajeError;				
			}
		}
		
		if (cadenaError.isEmpty() == false) {
			this.mensajeError = cadenaError;
			return;
		}
		
		numero1 = Double.parseDouble(cadenaNumero1);
		numero2 = Double.parseDouble(cadenaNumero2);

		resultado = numero1 - numero2;
	
		ventana.getLblResultado().setText(resultado.toString());
		
	}
	
	private void multiplicacion() {
		
		String cadenaNumero1;
		String cadenaNumero2;
		Double numero1;
		Double numero2;
		Double resultado;
		String cadenaError = "";
		
		cadenaNumero1 = ventana.getTFNumero1().getText();
		cadenaNumero2 = ventana.getTFNumero2().getText();
		this.mensajeError = "";
		
		if (comprobarEntrada(cadenaNumero1) == false) {
			ventana.getTFNumero1().requestFocusInWindow();
			cadenaError = "El numero 1 " + this.mensajeError;
		}
		
		if (comprobarEntrada(cadenaNumero2) == false) {
			ventana.getTFNumero1().requestFocusInWindow();
			if (this.mensajeError.isEmpty() == false) {
				cadenaError += "\n" + "El numero 2 " + this.mensajeError;
			} else {
				cadenaError = "El numero 2 " + this.mensajeError;				
			}
		}
		
		if (cadenaError.isEmpty() == false) {
			this.mensajeError = cadenaError;
			return;
		}
			
		numero1 = Double.parseDouble(cadenaNumero1);
		numero2 = Double.parseDouble(cadenaNumero2);

		resultado = numero1 * numero2;

		ventana.getLblResultado().setText(resultado.toString());

	}
	
	private void division() {
		
		String cadenaNumero1;
		String cadenaNumero2;
		Double numero1;
		Double numero2;
		Double resultado;
		String cadenaError = "";
		
		cadenaNumero1 = ventana.getTFNumero1().getText();
		cadenaNumero2 = ventana.getTFNumero2().getText();
		this.mensajeError = "";
		
		if (comprobarEntrada(cadenaNumero1) == false) {
			ventana.getTFNumero1().requestFocusInWindow();
			cadenaError = "El numero 1 " + this.mensajeError;
		}
		
		if (comprobarEntrada(cadenaNumero2) == false) {
			ventana.getTFNumero1().requestFocusInWindow();
			if (this.mensajeError.isEmpty() == false) {
				cadenaError += "\n" + "El numero 2 " + this.mensajeError;
			} else {
				cadenaError = "El numero 2 " + this.mensajeError;				
			}
		}
		
		if (cadenaError.isEmpty() == false) {
			this.mensajeError = cadenaError;
			return;
		}
		
		numero1 = Double.parseDouble(cadenaNumero1);
		numero2 = Double.parseDouble(cadenaNumero2);
		
		if (numero2 == 0) {
			JOptionPane.showMessageDialog(null,"No se puede dividir entre 0.","mensaje de error", JOptionPane.ERROR_MESSAGE);
			return;
			
		}
		
		resultado = numero1 / numero2;
		ventana.getLblResultado().setText(resultado.toString());

	}
	
	private void raizCubica() {
		
		String cadenaNumero1;
		Double numero1;
		Double resultado;
		String contrasenya;

		contrasenya = JOptionPane.showInputDialog("Escriba la contraseña");

		cadenaNumero1 = ventana.getTFNumero1().getText();
		this.mensajeError = "";
		
		if (comprobarEntrada(cadenaNumero1) == false) {
			ventana.getTFNumero1().requestFocusInWindow();
			this.mensajeError = "El numero 1 " + this.mensajeError;
			return;
		}
		
		if (contrasenya == null) {
      		this.mensajeError = "";
      		System.out.print("nulo");
      		return;

		}
		if (contrasenya.contentEquals("yo") == false) {
      		this.mensajeError = "";
      		System.out.print(contrasenya);

      		System.out.print("contraseña incorrecta");
      		return;
		}

		cadenaNumero1 = ventana.getTFNumero1().getText();
		
		//if (comprobarEntradas(cadenaNumero1, cadenaNumero2) == false) {
		//	return;
		//}
		
		numero1 = Double.parseDouble(cadenaNumero1);

		resultado = Math.cbrt(numero1);
		ventana.getLblResultado().setText(resultado.toString().substring(0,10));

	}
	
	/*
	 * Funciones auxiliares
	 */
	private boolean comprobarEntrada(String cadena) {
		Double valor;
		valor = null;
		
		this.mensajeError = "";
		
		if (cadena.isEmpty() == true) {
      		this.mensajeError = "está vácio.";
      		return false;
		} else {
			if (cadena.isBlank() == true) {
	      		this.mensajeError = "soló tiene espacios.";
	      		return false;
			}
		}
		
		try {  
        	valor = Double.parseDouble(cadena);
      	} catch(NumberFormatException e){  
      		this.mensajeError = "es un texto no un número.";
      		return false;
      	}
		
		if (valor.isInfinite()) {
      		this.mensajeError = "el número es demasiado grande.";
      		return false;
		}
		
		if (valor.isNaN() == true) {
      		this.mensajeError = "no tiene el formato correcto de un número.";
      		return false;
		}
		
		return true;
	}

	
	private void ponerBorder(int ancho) {
	}
}
	
