package presentacion.graficos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import model.Ciudad;
import presentacion.adaptadores.AdaptadorJComboCiudades;
import presentacion.adaptadores.AdaptadorListaCiudades;

public class VentanaCiudades extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCiudades frame = new VentanaCiudades();
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
	public VentanaCiudades() {
		JList<Ciudad> lstCiudades = new JList();
		JComboBox<Ciudad> cbCiudades = new JComboBox();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				// asocia a la lista su adaptador
				lstCiudades.setModel(new AdaptadorListaCiudades());
				cbCiudades.setModel(new AdaptadorJComboCiudades());
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de ciudades");
		lblNewLabel.setBounds(56, 29, 119, 14);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(66, 54, 65, 52);
		contentPane.add(scrollPane);
		
		scrollPane.setColumnHeaderView(lstCiudades);
		
		JButton btnNewButton = new JButton("Ver datos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ciudad ciudad=lstCiudades.getSelectedValue();
				JOptionPane.showMessageDialog(btnNewButton, "Ciudad: " + ciudad.getNombre() + "\n Temperatura: " + ciudad.getTemperatura());
			}
		});
		btnNewButton.setBounds(56, 117, 89, 23);
		contentPane.add(btnNewButton);
		
		
		cbCiudades.setBounds(287, 64, 106, 22);
		contentPane.add(cbCiudades);
		
		JButton btnNewButton_1 = new JButton("Ver datos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// conversion a Object
				Ciudad ciudad = (Ciudad)cbCiudades.getSelectedItem();
				JOptionPane.showMessageDialog(btnNewButton_1, "Ciudad: " + ciudad.getNombre() + "\n Temperatura: " + ciudad.getTemperatura());
			}
		});
		btnNewButton_1.setBounds(297, 97, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
