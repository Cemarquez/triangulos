package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Mundo.Triangulo;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
/**
 * Ventana en la cual se le asignarán las bases y altura a los dos triángulos.
 * @author Cesar Marquez
 *
 */
public class VentanaTriangulo extends JFrame implements ActionListener{
	
	private VentanaPrincipal miV;
	private JPanel contentPane, panelMedio, panelSuperior, panelInferior;
	private JLabel lblInfo, lblBase, lblAltura, lblNumTriangulo;
	private JTextField textFieldBase, textFieldAltura;
	private JComboBox<String> comboBox;
	private JButton botonAceptar;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaTriangulo(VentanaPrincipal miV) {
		this.miV = miV;
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		construyePanelSuperior();
		construyePanelMedio();
		construyePanelInferior();
		getContentPane().add(panelSuperior);
		getContentPane().add(panelMedio);
		getContentPane().add(panelInferior);
		setLocationRelativeTo(null);
	}
	
	/**
	 * Método para crear el panel superior de la ventana.
	 */
	public void construyePanelSuperior() {
		panelSuperior = new JPanel();
		lblInfo = new JLabel("Agregar triangulo");
		panelSuperior.setLayout(new BoxLayout(panelSuperior, BoxLayout.X_AXIS));
		panelSuperior.add(lblInfo);
	}
	/**
	 * Método para crear el panel medio de la ventana.
	 */
	public void construyePanelMedio(){
		 panelMedio=new JPanel();
		 panelMedio.setLayout(new GridLayout(3, 2));
		 lblBase= new JLabel("Base");
		 textFieldBase= new JTextField();
		 lblAltura= new JLabel("Altura");
		 textFieldAltura= new JTextField();
		 panelMedio.add( lblBase);
		 panelMedio.add( textFieldBase);
		 panelMedio.add( lblAltura);
		 panelMedio.add( textFieldAltura);
		 lblNumTriangulo = new JLabel("Numero de triangulo");
		 panelMedio.add(lblNumTriangulo);
		 comboBox = new JComboBox<String>();
		comboBox.addItem("1");
		comboBox.addItem("2");
		panelMedio.add(comboBox);
	}
	
	/**
	 * Método para crear el panel inferior de la ventana.
	 */
	public void construyePanelInferior(){
		panelInferior = new JPanel();
		botonAceptar = new JButton("aceptar");
		panelInferior.setLayout(new BoxLayout(panelInferior, BoxLayout.X_AXIS));
		botonAceptar.addActionListener(this);
		panelInferior.add(botonAceptar);
	}

	@Override
	/**
	 * Método por defecto para añadir una acción a los botones.
	 */
	public void actionPerformed(ActionEvent e) {
		double base = Double.parseDouble(textFieldBase.getText());
		double altura = Double.parseDouble(textFieldAltura.getText());
		String num = (String) comboBox.getSelectedItem();
		
		Triangulo miT = new Triangulo(base, altura);
		if(num.equals("1"))
		{
			miV.setMiT1(miT);
			miV.setVisible(true);
			dispose();
		}
		if(num.equals("2"))
		{
			miV.setMiT2(miT);
			miV.setVisible(true);
			dispose();
		}
	}

	

}
