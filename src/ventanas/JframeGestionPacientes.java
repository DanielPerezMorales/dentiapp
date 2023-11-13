package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;

public class JframeGestionPacientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombrePaciente;
	private JTextField text_CiudadPaciente;
	private JTextField text_DniPaciente;
	private JTextField text_MovilPaciente;
	private JTextField textDireccionPaciente;
	private JTextField text_Edad;
	private JTextField text_EmailPaciente;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframeGestionPacientes frame = new JframeGestionPacientes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JframeGestionPacientes() {
		
		setResizable(false);
		BBDD bbdd=new BBDD();
		bbdd.conectar();
		setIconImage(Toolkit.getDefaultToolkit().getImage(JframeGestionPacientes.class.getResource("/Iconos/diente.png")));
		setTitle("Pacientes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 616, 489);
		setLocation(200, 50);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_AgregarPaciente = new JButton("");
		btn_AgregarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nombre=textNombrePaciente.getText().toString();
				String DNI=text_DniPaciente.getText().toString();
				String Email=text_EmailPaciente.getText().toString();
				String Ciudad=text_CiudadPaciente.getText().toString();
				String Direccion=textDireccionPaciente.getText().toString();
				int Edad=Integer.parseInt(text_Edad.getText().toString());
				int Tel=Integer.parseInt(text_MovilPaciente.getText().toString());
				bbdd.crearCliente(DNI, Nombre, Edad, Email, Direccion, Ciudad, Tel);
			}
		});
		btn_AgregarPaciente.setIcon(new ImageIcon(JframeGestionPacientes.class.getResource("/Iconos/agregar.png")));
		btn_AgregarPaciente.setBounds(330, 385, 70, 40);
		contentPane.add(btn_AgregarPaciente);
		
		JButton btn_DarBajaPaciente = new JButton("");
		btn_DarBajaPaciente.setIcon(new ImageIcon(JframeGestionPacientes.class.getResource("/Iconos/borrar.png")));
		btn_DarBajaPaciente.setBounds(500, 385, 70, 40);
		contentPane.add(btn_DarBajaPaciente);
		
		JButton btn_ModificarPaciente = new JButton("");
		btn_ModificarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nombre=textNombrePaciente.getText().toString();
				String DNI=text_DniPaciente.getText().toString();
				String Email=text_EmailPaciente.getText().toString();
				String Ciudad=text_CiudadPaciente.getText().toString();
				String Direccion=textDireccionPaciente.getText().toString();
				int Edad=Integer.parseInt(text_Edad.getText().toString());
				int Tel=Integer.parseInt(text_MovilPaciente.getText().toString());
				bbdd.modificarCliente(DNI, Nombre, Edad, Email, Direccion, Ciudad, Tel);
			}
		});
		btn_ModificarPaciente.setIcon(new ImageIcon(JframeGestionPacientes.class.getResource("/Iconos/boton-editar.png")));
		btn_ModificarPaciente.setBounds(415, 385, 70, 40);
		contentPane.add(btn_ModificarPaciente);
		
		JButton btn_Odontograma = new JButton("");
		btn_Odontograma.setIcon(new ImageIcon(JframeGestionPacientes.class.getResource("/Iconos/sonrisa.png")));
		btn_Odontograma.setBounds(525, 201, 50, 25);
		contentPane.add(btn_Odontograma);
		
		text_EmailPaciente = new JTextField();
		text_EmailPaciente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_EmailPaciente.setColumns(10);
		text_EmailPaciente.setBounds(110, 301, 465, 25);
		contentPane.add(text_EmailPaciente);
		
		JLabel lbl_EmailPaciente = new JLabel("Email :");
		lbl_EmailPaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_EmailPaciente.setBounds(25, 301, 75, 25);
		contentPane.add(lbl_EmailPaciente);
		
		text_Edad = new JTextField();
		text_Edad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Edad.setBounds(407, 201, 75, 25);
		contentPane.add(text_Edad);
		text_Edad.setColumns(10);
		
		JLabel lbl_EdadPaciente = new JLabel("Edad :");
		lbl_EdadPaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_EdadPaciente.setBounds(325, 201, 65, 25);
		contentPane.add(lbl_EdadPaciente);
		
		textDireccionPaciente = new JTextField();
		textDireccionPaciente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textDireccionPaciente.setColumns(10);
		textDireccionPaciente.setBounds(155, 251, 420, 25);
		contentPane.add(textDireccionPaciente);
		
		text_MovilPaciente = new JTextField();
		text_MovilPaciente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_MovilPaciente.setBounds(410, 151, 165, 25);
		contentPane.add(text_MovilPaciente);
		text_MovilPaciente.setColumns(10);
		
		JLabel lbl_MovilPaciente = new JLabel("Movil :");
		lbl_MovilPaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_MovilPaciente.setBounds(325, 151, 75, 25);
		contentPane.add(lbl_MovilPaciente);
		
		JButton btn_ConsultarPacientes = new JButton("");
		btn_ConsultarPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JdialogConsultasPacientes cons=new JdialogConsultasPacientes(text_DniPaciente.getText());
				cons.setVisible(true);
				cons.setModal(true);
			}
		});
		btn_ConsultarPacientes.setIcon(new ImageIcon(JframeGestionPacientes.class.getResource("/Iconos/filtrar.png")));
		btn_ConsultarPacientes.setBounds(250, 151, 50, 25);
		contentPane.add(btn_ConsultarPacientes);
		
		text_DniPaciente = new JTextField();
		text_DniPaciente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DniPaciente.setColumns(10);
		text_DniPaciente.setBounds(84, 151, 150, 25);
		contentPane.add(text_DniPaciente);
		
		JLabel lbl_DniPaciente = new JLabel("DNI :");
		lbl_DniPaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_DniPaciente.setBounds(25, 151, 60, 25);
		contentPane.add(lbl_DniPaciente);
		
		text_CiudadPaciente = new JTextField();
		text_CiudadPaciente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_CiudadPaciente.setColumns(10);
		text_CiudadPaciente.setBounds(126, 201, 150, 25);
		contentPane.add(text_CiudadPaciente);
		
		textNombrePaciente = new JTextField();
		textNombrePaciente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textNombrePaciente.setBounds(235, 101, 340, 25);
		contentPane.add(textNombrePaciente);
		textNombrePaciente.setColumns(10);
		
		JLabel lbl_DireccionPaciente = new JLabel("Dirección :");
		lbl_DireccionPaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_DireccionPaciente.setBounds(25, 251, 120, 25);
		contentPane.add(lbl_DireccionPaciente);
		
		JLabel lbl_CiudadPaciente = new JLabel("Ciudad :");
		lbl_CiudadPaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_CiudadPaciente.setBounds(26, 201, 90, 25);
		contentPane.add(lbl_CiudadPaciente);
		
		JLabel lbl_NombrePaciente = new JLabel("Nombre y Apellido :");
		lbl_NombrePaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_NombrePaciente.setBounds(25, 100, 200, 25);
		contentPane.add(lbl_NombrePaciente);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon("C:\\Users\\Medac\\eclipse-workspace\\DentiApp\\src\\Iconos\\Fondo 600X450.png"));
		Fondo.setBounds(0, 0, 600, 450);
		contentPane.add(Fondo);
	}

	public JframeGestionPacientes(String dNI, String nombre, String direccion, String telefono, String edad,String email) {
		BBDD bbdd=new BBDD();
		bbdd.conectar();
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Medac\\eclipse-workspace\\DentiApp\\src\\Iconos\\Icono.png"));
		setTitle("Pacientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_AgregarPaciente = new JButton("");
		btn_AgregarPaciente.setIcon(new ImageIcon("C:\\Users\\Medac\\eclipse-workspace\\DentiApp\\src\\Iconos\\agregar.png"));
		btn_AgregarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nombre=textNombrePaciente.getText().toString();
				String DNI=text_DniPaciente.getText().toString();
				String Email=text_EmailPaciente.getText().toString();
				String Ciudad=text_CiudadPaciente.getText().toString();
				String Direccion=textDireccionPaciente.getText().toString();
				int Edad=Integer.parseInt(text_Edad.getText().toString());
				int Tel=Integer.parseInt(text_MovilPaciente.getText().toString());
				bbdd.crearCliente(DNI, Nombre, Edad, Email, Direccion, Ciudad, Tel);
			}
		});
		btn_AgregarPaciente.setBounds(330, 385, 70, 40);
		contentPane.add(btn_AgregarPaciente);
		
		JButton btn_DarBajaPaciente = new JButton("");
		btn_DarBajaPaciente.setIcon(new ImageIcon("C:\\Users\\Medac\\eclipse-workspace\\DentiApp\\src\\Iconos\\borrar.png"));
		btn_DarBajaPaciente.setBounds(500, 385, 70, 40);
		contentPane.add(btn_DarBajaPaciente);
		
		JButton btn_ModificarPaciente = new JButton("");
		btn_ModificarPaciente.setIcon(new ImageIcon("C:\\Users\\Medac\\eclipse-workspace\\DentiApp\\src\\Iconos\\boton-editar.png"));
		btn_ModificarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nombre=textNombrePaciente.getText().toString();
				String DNI=text_DniPaciente.getText().toString();
				String Email=text_EmailPaciente.getText().toString();
				String Ciudad=text_CiudadPaciente.getText().toString();
				String Direccion=textDireccionPaciente.getText().toString();
				int Edad=Integer.parseInt(text_Edad.getText().toString());
				int Tel=Integer.parseInt(text_MovilPaciente.getText().toString());
				bbdd.modificarCliente(DNI, Nombre, Edad, Email, Direccion, Ciudad, Tel);
			}
		});
		btn_ModificarPaciente.setBounds(415, 385, 70, 40);
		contentPane.add(btn_ModificarPaciente);
		
		JButton btn_Odontograma = new JButton("");
		btn_Odontograma.setIcon(new ImageIcon("C:\\Users\\Medac\\eclipse-workspace\\DentiApp\\src\\Iconos\\sonrisa.png"));
		btn_Odontograma.setBounds(525, 201, 50, 25);
		contentPane.add(btn_Odontograma);
		
		text_EmailPaciente = new JTextField();
		text_EmailPaciente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_EmailPaciente.setColumns(10);
		text_EmailPaciente.setText(email);
		text_EmailPaciente.setBounds(110, 301, 465, 25);
		contentPane.add(text_EmailPaciente);
		
		JLabel lbl_EmailPaciente = new JLabel("Email :");
		lbl_EmailPaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_EmailPaciente.setBounds(25, 301, 75, 25);
		contentPane.add(lbl_EmailPaciente);
		
		text_Edad = new JTextField();
		text_Edad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_Edad.setBounds(407, 201, 75, 25);
		text_Edad.setText(edad);
		contentPane.add(text_Edad);
		text_Edad.setColumns(10);
		
		JLabel lbl_EdadPaciente = new JLabel("Edad :");
		lbl_EdadPaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_EdadPaciente.setBounds(325, 201, 65, 25);
		contentPane.add(lbl_EdadPaciente);
		
		String[] DireccionCortada=direccion.split(",");
		
		textDireccionPaciente = new JTextField();
		textDireccionPaciente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textDireccionPaciente.setColumns(10);
		textDireccionPaciente.setText(DireccionCortada[0].toString());
		textDireccionPaciente.setBounds(155, 251, 420, 25);
		contentPane.add(textDireccionPaciente);
		
		text_MovilPaciente = new JTextField();
		text_MovilPaciente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_MovilPaciente.setBounds(410, 151, 165, 25);
		text_MovilPaciente.setText(telefono);
		contentPane.add(text_MovilPaciente);
		text_MovilPaciente.setColumns(10);
		
		JLabel lbl_MovilPaciente = new JLabel("Movil :");
		lbl_MovilPaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_MovilPaciente.setBounds(325, 151, 75, 25);
		contentPane.add(lbl_MovilPaciente);
		
		JButton btn_ConsultarPacientes = new JButton("");
		btn_ConsultarPacientes.setIcon(new ImageIcon("C:\\Users\\Medac\\eclipse-workspace\\DentiApp\\src\\Iconos\\filtrar.png"));
		btn_ConsultarPacientes.setBounds(250, 151, 50, 25);
		contentPane.add(btn_ConsultarPacientes);
		
		text_DniPaciente = new JTextField();
		text_DniPaciente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_DniPaciente.setColumns(10);
		text_DniPaciente.setText(dNI);
		text_DniPaciente.setBounds(84, 151, 150, 25);
		contentPane.add(text_DniPaciente);
		
		JLabel lbl_DniPaciente = new JLabel("DNI :");
		lbl_DniPaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_DniPaciente.setBounds(25, 151, 60, 25);
		contentPane.add(lbl_DniPaciente);
		
		text_CiudadPaciente = new JTextField();
		text_CiudadPaciente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		text_CiudadPaciente.setColumns(10);
		text_CiudadPaciente.setText(DireccionCortada[1].toString());
		text_CiudadPaciente.setBounds(126, 201, 150, 25);
		contentPane.add(text_CiudadPaciente);
		
		textNombrePaciente = new JTextField();
		textNombrePaciente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textNombrePaciente.setBounds(235, 101, 340, 25);
		textNombrePaciente.setText(nombre);
		contentPane.add(textNombrePaciente);
		textNombrePaciente.setColumns(10);
		
		JLabel lbl_DireccionPaciente = new JLabel("Dirección :");
		lbl_DireccionPaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_DireccionPaciente.setBounds(25, 251, 120, 25);
		contentPane.add(lbl_DireccionPaciente);
		
		JLabel lbl_CiudadPaciente = new JLabel("Ciudad :");
		lbl_CiudadPaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_CiudadPaciente.setBounds(26, 201, 90, 25);
		contentPane.add(lbl_CiudadPaciente);
		
		JLabel lbl_NombrePaciente = new JLabel("Nombre y Apellido :");
		lbl_NombrePaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_NombrePaciente.setBounds(25, 100, 200, 25);
		contentPane.add(lbl_NombrePaciente);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon("C:\\Users\\Medac\\eclipse-workspace\\DentiApp\\src\\Iconos\\Fondo 600X450.png"));
		Fondo.setBounds(0, 0, 600, 450);
		contentPane.add(Fondo);
	}

}
