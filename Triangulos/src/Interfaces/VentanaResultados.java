package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
/**
 * Ventana donde se muestra el resultado del promedio.
 * @author Cesar Marquez
 *
 */
public class VentanaResultados extends JFrame implements ActionListener{
	
	private VentanaPrincipal miV;
	private JPanel contentPane, panelSuperior, panelInferior;
	private JLabel lblAreaProm, lblAreaInfo;
	private JButton botonVolver;

	/**
	 * Create the frame.
	 */
	public VentanaResultados(VentanaPrincipal miV) {
		this.miV = miV;
		setBounds(100, 100, 278, 129);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		crearPanelSuperior();
		crearPanelInferior();
		getContentPane().add(panelSuperior);
		getContentPane().add(panelInferior);
		setLocationRelativeTo(null);
	}
	
	/**
	 * Método para crear el panel superior de la ventana.
	 */
	public void crearPanelSuperior()
	{
		panelSuperior = new JPanel();
		panelSuperior.setLayout(new GridLayout(2, 1));
		lblAreaProm = new JLabel("El area promediada de los triangulos es:");
		lblAreaProm.setHorizontalAlignment(SwingConstants.CENTER);
		lblAreaInfo = new JLabel("" + miV.calcularAreaPromedio());
		lblAreaInfo.setHorizontalAlignment(SwingConstants.CENTER);
		panelSuperior.add(lblAreaProm);
		panelSuperior.add(lblAreaInfo);
	}
	
	/**
	 * Método para crear el panel inferior de la ventana.
	 */
	public void crearPanelInferior() 
	{
		panelInferior = new JPanel();
		panelInferior.setLayout(new GridLayout(1, 1));
		botonVolver = new JButton("Volver");
		botonVolver.addActionListener(this);
		panelInferior.add(botonVolver);
	}
	@Override
	/**
	 * Método por defecto para añadir una acción a los botones.
	 */
	public void actionPerformed(ActionEvent arg0) {		
		miV.setVisible(true);
		dispose();
	}

}
