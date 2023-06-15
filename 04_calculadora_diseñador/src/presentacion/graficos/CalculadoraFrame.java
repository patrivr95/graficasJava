package presentacion.graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraFrame extends JFrame {

	private JPanel contentPane;
	private JTextField jtNum1;
	private JTextField jtNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraFrame frame = new CalculadoraFrame();
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
	public CalculadoraFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número uno:");
		lblNewLabel.setBounds(40, 42, 100, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número dos:");
		lblNewLabel_1.setBounds(40, 86, 100, 33);
		contentPane.add(lblNewLabel_1);
		
		jtNum1 = new JTextField();
		jtNum1.setBounds(125, 48, 86, 20);
		contentPane.add(jtNum1);
		jtNum1.setColumns(10);
		
		jtNum2 = new JTextField();
		jtNum2.setBounds(125, 92, 86, 20);
		contentPane.add(jtNum2);
		jtNum2.setColumns(10);
		
		JButton jbSumar = new JButton("Sumar");
		jbSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(jbSumar, "Suma: " + (Integer.parseInt(jtNum1.getText()) + (Integer.parseInt(jtNum2.getText()))));
			}
		});
		jbSumar.setBounds(72, 170, 89, 23);
		contentPane.add(jbSumar);
		
		JButton jbMulti = new JButton("Multiplicar");
		jbMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(jbMulti, "Multiplicación: " + (Integer.parseInt(jtNum1.getText()) * (Integer.parseInt(jtNum2.getText()))));
			}
		});
		jbMulti.setBounds(278, 170, 89, 23);
		contentPane.add(jbMulti);
	}
}
