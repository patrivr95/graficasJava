package presentacion.graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiVentana extends JFrame {
	public MiVentana() {
		//título ventana. Esta instrucción tiene que ser la primera
		super("Primera ventana");
		// modificar el comportamiento del botón de cierre
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// tamaño y posición
		this.setBounds(120, 50, 800, 500);
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
		// instanciamos JLabel
		JLabel jl1 = new JLabel();
		// tamaño y posición
		jb1.setBounds(150, 80, 150, 30);
		jl1.setBounds(400, 80, 200, 30);
		// añadimos el botón a la ventana
		this.add(jb1);
		this.add(jl1);
		// eventos
		/*ActionListener action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl1.setText("Primer evento");
			}
		};*/
		// evento con expresion lambda
		ActionListener action = e->jl1.setText("Primer evento");
	}
}
