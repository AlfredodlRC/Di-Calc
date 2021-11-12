package Vistas;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.border.Border;


import Manejadores.ManejadorEventos;
import java.awt.Color;
import java.awt.Font;


public class Ventana extends JFrame {


	ManejadorEventos manejador;
	
	JLabel lblNumero1;
	JLabel lblNumero2;
	JLabel iconoNumero1;
	JLabel iconoNumero2;
	JTextField TFNumero1;
	JTextField TFNumero2;
	
	
	JButton btnSuma;
	JButton btnResta;
	JButton btnMultiplicacion;
	JButton btnDivision;
	JButton btnRaizDos;
	JButton btnRaizTres;
	JLabel lblEtqResultado;
	JTextField TFResultado;
	
	/*
	JMenuBar menu;
	JMenu menuBordes;
	JMenuItem AnchoBorde1;
	JMenuItem AnchoBorde10;
	JMenuItem AnchoBorde20;
	JMenuItem AnchoBorde30;
	JMenuItem AnchoBorde40;
	*/
	
	

	public ManejadorEventos getManejador() {
		return manejador;
	}

	public JLabel getLblNumero1() {
		return lblNumero1;
	}

	public JLabel getLblNumero2() {
		return lblNumero2;
	}

	public JLabel getIconoNumero1() {
		return iconoNumero1;
	}

	public JLabel getIconoNumero2() {
		return iconoNumero2;
	}
	
	public JTextField getTFResultado() {
		return TFResultado;
	}
/*
	public JMenuBar getMenu() {
		return menu;
	}

	public JMenuItem getAnchoBorde1() {
		return AnchoBorde1;
	}

	public JMenuItem getAnchoBorde10() {
		return AnchoBorde10;
	}

	public JMenuItem getAnchoBorde20() {
		return AnchoBorde20;
	}

	public JMenuItem getAnchoBorde30() {
		return AnchoBorde30;
	}

	public JMenuItem getAnchoBorde40() {
		return AnchoBorde40;
	}
*/
	public JTextField getTFNumero1() {
		return TFNumero1;
	}

	public JTextField getTFNumero2() {
		return TFNumero2;
	}

	public JButton getBtnSuma() {
		return btnSuma;
	}

	public JButton getBtnResta() {
		return btnResta;
	}

	public JButton getBtnMultiplicacion() {
		return btnMultiplicacion;
	}

	public JButton getBtnDivision() {
		return btnDivision;
	}

	public JButton getBtnRaizDos() {
		return btnRaizDos;
	}

	public JButton getBtnRaizTres() {
		return btnRaizTres;
	}

	public JLabel getLblEtqResultado() {
		return lblEtqResultado;
	}

	public JTextField getLblResultado() {
		return TFResultado;
	}

	public Ventana(ManejadorEventos pManejador) {

		manejador = pManejador;

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(540, 600);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		
		
		ImageIcon imagen = new ImageIcon("E:\\calc.png");
		setIconImage(imagen.getImage());
		
		inicializarComponentes();
		setVisible(true);
		

	}
	
	private void inicializarComponentes() {

		int tamanyoBoton_Y = 60;
		float radioXY = 2.5f;
		int tamanyoBoton_X = (int) (tamanyoBoton_Y * radioXY);
		int yInicialBotones = 150;
		int yIncrementoBotones = tamanyoBoton_Y + 10;
		int xColumnaA = (int) (getSize().getWidth()/3 - tamanyoBoton_X / 2);
		int xColumnaB = (int) (getSize().getWidth()*2/3 - tamanyoBoton_X / 2);
		int distanciaSuelo = (int) (getSize().getHeight()) - 150;
		Border bordeBotones = BorderFactory.createLineBorder(new Color(50,50,50),1,true);

		lblNumero1 = new JLabel("Numero 1:");
		lblNumero1.setBounds(50, 50, 60, 30);
		add(lblNumero1);

		lblNumero2 = new JLabel("Numero 2:");
		lblNumero2.setBounds(250, 50, 60, 30);
		add(lblNumero2);

		TFNumero1 = new JTextField();
		TFNumero1.setBounds(140, 50, 100, 30);
		add(TFNumero1);

		TFNumero2 = new JTextField();
		TFNumero2.setBounds(340, 50, 100, 30);
		add(TFNumero2);

		
		iconoNumero1 = new JLabel("");
		//iconoNumero1 = new JLabel(new ImageIcon("E:\\like.png"));
		iconoNumero1.setBounds(110, 50, 30, 30);
		add(iconoNumero1);
		iconoNumero2 = new JLabel("");
		//iconoNumero2 = new JLabel(new ImageIcon("E:\\dislike.png"));
		iconoNumero2.setBounds(310, 50, 30, 30);
		add(iconoNumero2);

		
		
		btnSuma = new JButton("Suma");
		btnSuma.setBounds(xColumnaA, yInicialBotones, tamanyoBoton_X, tamanyoBoton_Y);
		btnSuma.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnSuma.setBorder(bordeBotones);
		btnSuma.setBackground(new Color(250,250,250));
		btnSuma.addActionListener(manejador);
		add(btnSuma);

		btnResta = new JButton("Resta");
		btnResta.setBounds(xColumnaB, yInicialBotones, tamanyoBoton_X, tamanyoBoton_Y);
		btnResta.setBorder(bordeBotones);
		btnResta.setBackground(new Color(250,250,250));
		btnResta.addActionListener(manejador);
		add(btnResta);

		btnMultiplicacion = new JButton("Multiplicar");
		btnMultiplicacion.setBounds(xColumnaA, yInicialBotones + yIncrementoBotones, tamanyoBoton_X, tamanyoBoton_Y);
		btnMultiplicacion.setBorder(bordeBotones);
		btnMultiplicacion.setBackground(new Color(250,250,250));
		btnMultiplicacion.addActionListener(manejador);
		add(btnMultiplicacion);

		btnDivision = new JButton("Dividir");
		btnDivision.setBounds(xColumnaB, yInicialBotones + yIncrementoBotones, tamanyoBoton_X, tamanyoBoton_Y);
		btnDivision.setBorder(bordeBotones);
		btnDivision.setBackground(new Color(250,250,250));
		btnDivision.addActionListener(manejador);
		add(btnDivision);

		btnRaizDos = new JButton("Raiz 2");
		btnRaizDos.setBounds(xColumnaA, yInicialBotones + 2 * yIncrementoBotones, tamanyoBoton_X, tamanyoBoton_Y);
		btnRaizDos.setBorder(bordeBotones);
		btnRaizDos.setBackground(new Color(250,250,250));
		btnRaizDos.addActionListener(manejador);
		add(btnRaizDos);

		btnRaizTres = new JButton("Raiz 3");
		btnRaizTres.setBounds(xColumnaB, yInicialBotones + 2 * yIncrementoBotones, tamanyoBoton_X, tamanyoBoton_Y);
		btnRaizTres.setBorder(bordeBotones);
		btnRaizTres.setBackground(new Color(250,250,250));
		btnRaizTres.addActionListener(manejador);
		add(btnRaizTres);

		lblEtqResultado = new JLabel("Resultado");
		lblEtqResultado.setBounds(xColumnaA, distanciaSuelo, 100, 30);
		add(lblEtqResultado);

		TFResultado = new JTextField();
		TFResultado.setBounds(xColumnaB, distanciaSuelo, 100, 30);
		TFResultado.setEditable(false);
		TFResultado.setBorder(null);
		add(TFResultado);


		/*
		menu = new JMenuBar();
		menuBordes = new JMenu("Bordes Botones");
		

		AnchoBorde1 = new JMenuItem("1 pixel");
		AnchoBorde1.addActionListener(manejador);

		AnchoBorde10 = new JMenuItem("10 pixeles");
		AnchoBorde10.addActionListener(manejador);

		AnchoBorde20 = new JMenuItem("20 pixeles");
		AnchoBorde20.addActionListener(manejador);

		AnchoBorde30 = new JMenuItem("30 pixeles");
		AnchoBorde30.addActionListener(manejador);

		AnchoBorde40 = new JMenuItem("40 pixeles");
		AnchoBorde40.addActionListener(manejador);

		JMenu menuAnchoBordes;
		menuAnchoBordes = new JMenu("anchos");
		
		menuAnchoBordes.add(AnchoBorde10);
		menuAnchoBordes.add(AnchoBorde20);
		menuAnchoBordes.add(AnchoBorde30);
		menuAnchoBordes.add(AnchoBorde40);

		menuBordes.add(menuAnchoBordes);
		
		menu.add(menuBordes);
		
		menu.setBounds(0,0,500,20);
		add(menu);
*/		
		
	}

	

	
}
