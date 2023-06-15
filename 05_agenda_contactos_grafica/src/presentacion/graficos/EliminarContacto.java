package presentacion.graficos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import service.ContactosService;

public class EliminarContacto extends JFrame {

	private JPanel contentPane;
	private JTextField telefono;


	/**
	 * Create the frame.
	 */
	public EliminarContacto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Teléfono");
		lblNewLabel.setBounds(38, 49, 90, 14);
		contentPane.add(lblNewLabel);
		
		telefono = new JTextField();
		telefono.setBounds(138, 46, 86, 20);
		contentPane.add(telefono);
		telefono.setColumns(10);
		
		JButton jbEliminar = new JButton("Eliminar");
		jbEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactosService service = new ContactosService();
				service.eliminarContacto(Integer.parseInt(telefono.getText()));
				JOptionPane.showMessageDialog(jbEliminar, "Contacto eliminado");
				
			}
		});
		jbEliminar.setBounds(138, 106, 89, 23);
		contentPane.add(jbEliminar);
		this.setVisible(true);
	}

}
