package presentacion.graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiVentana extends JFrame{
	
	public MiVentana() {
	super("Ventana calculadora");
	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	this.setBounds(120, 50, 800, 500);
	iniciarCalculadora();
	this.setVisible(true);
	}
	
	private void iniciarCalculadora() {
		this.setLayout(null);
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		
		JButton jb1 = new JButton("Sumar");
		JButton jb2 = new JButton("Multiplicar");
		
		JLabel jl1 = new JLabel("Numero 1: " );
		JLabel jl2 = new JLabel("Numero 2: ");
		JLabel jresult = new JLabel();
		
		t1.setBounds(20,100, 150, 30);
		t2.setBounds(500, 100, 150, 30);
		jb1.setBounds(20, 300, 150, 30);
		jb2.setBounds(500, 300, 150, 30);
		jl1.setBounds(200, 50, 300, 30);
		jl2.setBounds(400, 50, 300, 30);
		jresult.setBounds(300, 200, 200, 30);
		
		this.add(t1);this.add(t2);
		this.add(jb1);this.add(jb2);
		this.add(jl1);this.add(jl2);
		this.add(jresult);
		
		ActionListener actionSumar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jresult.setText("Suma: " + (Integer.parseInt(t1.getText()) + (Integer.parseInt(t2.getText()))));
			}
		};
		
		ActionListener actionMultiplicar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jresult.setText("Multiplicación: " + (Integer.parseInt(t1.getText()) * (Integer.parseInt(t2.getText()))));
			}
		};
		
		jb1.addActionListener(actionSumar);
		jb2.addActionListener(actionMultiplicar);
	}

	
}
