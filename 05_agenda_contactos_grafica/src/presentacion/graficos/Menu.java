package presentacion.graficos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("Agenda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton jbNuevo = new JButton("Nuevo contacto");
		jbNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AltaContactos();
			}
		});
		jbNuevo.setBounds(144, 55, 143, 23);
		contentPane.add(jbNuevo);
		
		JButton jbEliminar = new JButton("Eliminar contacto");
		jbEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EliminarContacto();
			}
		});
		jbEliminar.setBounds(144, 89, 143, 23);
		contentPane.add(jbEliminar);
		
		JButton jbBuscar = new JButton("Buscar contacto");
		jbBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BuscarContacto();
			}
		});
		jbBuscar.setBounds(144, 123, 143, 23);
		contentPane.add(jbBuscar);
		
		JButton jbListado = new JButton("Lista contactos");
		jbListado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ListaContactos();
			}
		});
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// para cerrar una ventana, método dispose() de la clase ventana
				Menu.this.dispose();
			}
		});
		jbListado.setBounds(144, 157, 143, 23);
		contentPane.add(jbListado);
	}
}
