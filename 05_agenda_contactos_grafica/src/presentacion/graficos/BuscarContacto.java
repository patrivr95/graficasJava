package presentacion.graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Contacto;
import service.ContactosService;

public class BuscarContacto extends JFrame {

	private JPanel contentPane;
	private JTextField telefono;

	

	/**
	 * Create the frame.
	 */
	public BuscarContacto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Teléfono:");
		lblNewLabel.setBounds(80, 85, 85, 14);
		contentPane.add(lblNewLabel);
		
		telefono = new JTextField();
		telefono.setBounds(161, 82, 86, 20);
		contentPane.add(telefono);
		telefono.setColumns(10);
		
		JButton jbBuscar = new JButton("Buscar");
		jbBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactosService service = new ContactosService();
				Contacto contacto = service.buscarContacto(Integer.parseInt(telefono.getText()));
				if(contacto!=null) {
					String datos="Nombre: " + contacto.getNombre()+"\n";
					datos+="Email: " + contacto.getEmail()+"\n";
					JOptionPane.showMessageDialog(jbBuscar, datos);
				} else {
					JOptionPane.showMessageDialog(jbBuscar, "El contacto no existe");
				}
				
			}
		});
		jbBuscar.setBounds(302, 81, 89, 23);
		contentPane.add(jbBuscar);
		this.setVisible(true);
	}

}
