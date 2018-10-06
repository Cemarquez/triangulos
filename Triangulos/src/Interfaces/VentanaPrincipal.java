package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Mundo.GrupoTriangulos;
import Mundo.Triangulo;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Ventana principal de las interfaces, donde se agregan los triángulos.
 * @author Cesar Marquez
 *
 */
public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnAgregarTriangulo, btnAreasPromedio;
	private GrupoTriangulos miGrupo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		miGrupo = new GrupoTriangulos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 138);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 1));
		
		JLabel lblOpciones = new JLabel("OPCIONES");
		lblOpciones.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblOpciones);
		
		btnAgregarTriangulo = new JButton("Agregar triangulo");
		btnAgregarTriangulo.addActionListener(this);
		contentPane.add(btnAgregarTriangulo);
		
		btnAreasPromedio = new JButton("Promediar area");
		btnAreasPromedio.addActionListener(this);
		contentPane.add(btnAreasPromedio);
		setLocationRelativeTo(null);
	}
	
	/**
	 * Método para asignar valores al triángulo uno.
	 * @param miT1
	 */
	public void setMiT1(Triangulo miT1) {
		miGrupo.setMiT1(miT1);
	}
	
	/**
	 * Método para asignar valores al triángulo dos.
	 * @param miT2
	 */
	public void setMiT2(Triangulo miT2) {
		miGrupo.setMiT2(miT2);
	}
	
	/**
	 * Método para calcular el area promedio.
	 * @return Area promedio.
	 */
	public double calcularAreaPromedio() {
		return miGrupo.calcularAreaPromedio();
	}
	
	
	@Override
	/**
	 * Método por defecto para añadir una acción a los botones.
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAgregarTriangulo)
		{	
			VentanaTriangulo miV = new VentanaTriangulo(this);
			miV.setVisible(true);
			dispose();
		}
		if(e.getSource() == btnAreasPromedio)
		{
			VentanaResultados miVr = new VentanaResultados(this);
			miVr.setVisible(true);
			dispose();
		}
		
	}

}
