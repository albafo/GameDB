package vistas;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaPrincipal extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public VistaPrincipal() {
		
		setLayout(null);
		
		columnaIzquierda();
		
		columnaDerecha();
		

	}
	
	public void columnaIzquierda() {
		/*
		 * Imagen avatar
		 */
		JLabel lblImgUser = new JLabel("Imagen");
		lblImgUser.setBounds(40, 30, 150, 150);
		lblImgUser.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/default-user-image.png")));
		Border border=LineBorder.createGrayLineBorder();
		lblImgUser.setBorder(border);
		add(lblImgUser);
		
		/*
		 * Listado Usuarios
		 */
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(42, 192, 61, 16);
		add(lblUsuario);
		
		JComboBox comboUsuarios = new JComboBox();
		comboUsuarios.setBounds(40, 211, 150, 27);
		add(comboUsuarios);
		
		/*
		 * Contraseña
		 */
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(42, 250, 79, 16);
		add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(40, 266, 150, 28);
		add(textField);
		textField.setColumns(10);
		
		/*
		 * Botón Login
		 */
		JButton btnLogIn = new JButton("LogIn");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogIn.setBounds(40, 314, 150, 29);
		add(btnLogIn);
		
		/*
		 * Botón Registrar
		 */
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setBounds(40, 355, 150, 29);
		add(btnRegistrar);
	}
	
	public void columnaDerecha() {
		
		/*
		 * Botón Pantalla Juegos
		 */
		JButton btnJuegos = new JButton("Juegos >");
		btnJuegos.setBounds(260, 30, 150, 29);
		add(btnJuegos);
		
		/*
		 * Botón Pantalla Perfil
		 */
		JButton btnPerfil = new JButton("Perfil >");
		btnPerfil.setBounds(260, 71, 150, 29);
		add(btnPerfil);
	}
}
