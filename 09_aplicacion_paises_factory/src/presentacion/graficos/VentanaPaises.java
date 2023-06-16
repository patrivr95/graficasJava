package presentacion.graficos;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import presentacion.adaptadores.AdaptadorListaPaises;

public class VentanaPaises extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPaises frame = new VentanaPaises();
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
	public VentanaPaises() {
		JComboBox cbContinente = new JComboBox();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				cbContinente.setModel(new AdaptadorListaPaises());
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione el continente");
		lblNewLabel.setBounds(137, 30, 161, 14);
		contentPane.add(lblNewLabel);
		
		
		cbContinente.setBounds(123, 56, 145, 22);
		contentPane.add(cbContinente);
		
		JButton jButton = new JButton("Ver paises");
		jButton.setBounds(147, 89, 89, 23);
		contentPane.add(jButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 123, 338, 103);
		contentPane.add(scrollPane);
	}
}
