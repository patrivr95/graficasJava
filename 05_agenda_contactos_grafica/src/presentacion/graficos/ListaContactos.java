package presentacion.graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import model.Contacto;
import service.ContactosService;

public class ListaContactos extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public ListaContactos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Lista");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactosService service = new ContactosService();
				StringBuilder lista = new StringBuilder();
				List<Contacto> contactos = service.contactos();
				contactos.forEach(c->lista.append("Nombre: " + c.getNombre()+"\n"));
				JOptionPane.showMessageDialog(btnNewButton, lista.toString());
			}
		});
		btnNewButton.setBounds(187,70,121,23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaContactos.this.dispose();
			}
		});
		
		contentPane.add(btnNewButton_1);
		this.setVisible(true);
	}
}
