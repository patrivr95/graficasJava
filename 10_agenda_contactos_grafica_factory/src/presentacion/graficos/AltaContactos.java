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

import service.ContactoServiceFactory;
import service.ContactosService;

public class AltaContactos extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField telefono;
	private JTextField email;
	private JTextField edad;

	

	/**
	 * Create the frame.
	 */
	public AltaContactos() {
		
		String url="jdbc:mysql://localhost:3306/agenda";
		String usuario="root";
		String password="Fideguap03021995";
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nombre = new JTextField();
		nombre.setBounds(184, 41, 188, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(37, 44, 149, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Teléfono:");
		lblNewLabel_1.setBounds(37, 72, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setBounds(37, 97, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		telefono = new JTextField();
		telefono.setColumns(10);
		telefono.setBounds(184, 69, 188, 20);
		contentPane.add(telefono);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(184, 94, 188, 20);
		contentPane.add(email);
		
		JLabel lblNewLabel_2_1 = new JLabel("Edad:");
		lblNewLabel_2_1.setBounds(37, 127, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		edad = new JTextField();
		edad.setColumns(10);
		edad.setBounds(184, 124, 188, 20);
		contentPane.add(edad);
		
		JButton jbSave = new JButton("Guardar contacto");
		jbSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactosService service =ContactoServiceFactory.getContactosService();
				if(service.guardarContacto(Integer.parseInt(telefono.getText()), 
						nombre.getText(),
						email.getText(),
						Integer.parseInt(edad.getText())))
				{
					JOptionPane.showMessageDialog(jbSave, "Contacto guardado");
				} else {
					JOptionPane.showMessageDialog(jbSave, "Error al guardar");
				}
			}
		});
		jbSave.setBounds(137, 189, 177, 23);
		contentPane.add(jbSave);
		this.setVisible(true);
	}

}
