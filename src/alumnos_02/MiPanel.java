package alumnos_02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class MiPanel extends JFrame {
	
	/*
	 codigo oculto gadgaasgasa gsasgsag
	 
	 setDefaultCloseOperation() {
	 }
	 
	 setBounds() {
	 }
	*/

	

	private JPanel contentPane;
	private JTextField inputRadio;
	private JTextField inputAltura;

	public MiPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botonProcesar = new JButton("Procesar");
		botonProcesar.setBounds(469, 12, 117, 25);
		contentPane.add(botonProcesar);
		
		JButton botonBorrar = new JButton("Borrar");
		botonBorrar.setBounds(469, 49, 117, 25);
		contentPane.add(botonBorrar);
		
		JLabel labelRadio = new JLabel("Radio");
		labelRadio.setBounds(12, 17, 63, 15);
		contentPane.add(labelRadio);
		
		JLabel labelAltura = new JLabel("Altura");
		labelAltura.setBounds(12, 54, 70, 15);
		contentPane.add(labelAltura);
		
		inputRadio = new JTextField();
		inputRadio.setBounds(67, 15, 114, 19);
		contentPane.add(inputRadio);
		inputRadio.setColumns(10);
		
		inputAltura = new JTextField();
		inputAltura.setBounds(67, 52, 114, 19);
		contentPane.add(inputAltura);
		inputAltura.setColumns(10);
		
		JTextArea inputRespuesta = new JTextArea();
		inputRespuesta.setEditable(false);
		inputRespuesta.setBounds(12, 99, 568, 340);
		contentPane.add(inputRespuesta);
		
		botonProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pi = 3.1416;
				double radio = 0;
				double altura = 0;
				
				try {
				 radio = Double.parseDouble(inputRadio.getText());
				 altura = Double.parseDouble(inputAltura.getText());
				} catch (Exception e2) {
					inputRespuesta.setText("los campos deben ser números");
					return;
				}
				
				double areaBase = pi * (radio * radio);
				double areaLateral = 2 * pi * radio * altura;
				double areaTotal = 2 * areaBase + areaLateral;
				
				StringBuilder result = new StringBuilder();
				result.append("PROPIEDADES GEOMETRICAS DEL CILINDRO\n");
				result.append("AREA BASE: " + areaBase + "\n");
				result.append("AREA LATERAL: " + areaLateral + "\n");
				result.append("AREA TOTAL: " + areaTotal);
				
				inputRespuesta.setText(result.toString());
				System.out.println("hiciste click en procesar");
			}
		});
		
		botonBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputRadio.setText("");
				inputAltura.setText("");
				inputRespuesta.setText("");
				System.out.println("hiciste click en borrar");
			}
		});
	}
}
