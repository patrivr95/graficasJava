package presentacion.graficos;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MiVentana extends JFrame {
	public MiVentana() {
		//título ventana. Esta instrucción tiene que ser la primera
		super("Primera ventana");
		// modificar el comportamiento del botón de cierre
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// tamaño y posición
		this.setBounds(120, 50, 400, 300);
		// proceso de creación de controles gráficos
		inicializarComponentes();
		// visualizar ventana. Esta tiene que ser la última
		this.setVisible(true);
	}
	
	private void inicializarComponentes() {
		// lo hacemos antes siempre que vayamos a añadir el elemento gráfico, desactivando el gestor de organización
		this.setLayout(null);
		// creamos el botón y le damos texto
		JButton jb1=new JButton("Pulsar aquí");
		// tamaño y posición
		jb1.setBounds(150, 80, 150, 30);
		// añadimos el botón a la ventana
		this.add(jb1);
		
	}
}
