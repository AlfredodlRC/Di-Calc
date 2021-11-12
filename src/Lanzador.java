import java.util.Scanner;

import Manejadores.ManejadorEventos;
import Vistas.Ventana;

public class Lanzador {

	public static void main(String[] args) {
		Ventana window;
		ManejadorEventos manejador= new ManejadorEventos();
		
		window = new Ventana(manejador);		
		manejador.establecerVentana(window);
		
	}

}
