package ventanas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class IniciarSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_Usuario;
	private JPasswordField txt_Contraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IniciarSesion frame = new IniciarSesion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws SQLException
	 */
	public IniciarSesion() throws SQLException {
		setResizable(false);
		BBDD bbdd = new BBDD();
		bbdd.conectar();
		setIconImage(Toolkit.getDefaultToolkit().getImage(IniciarSesion.class.getResource("/Iconos/diente.png")));
		setFont(new Font("DialogInput", Font.BOLD, 30));
		setTitle("DENTIAPP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btn_Aceptar = new JButton("Aceptar");
		btn_Aceptar.setForeground(new Color(255, 255, 255));
		btn_Aceptar.setBackground(new Color(0, 206, 209));
		btn_Aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = txt_Usuario.getText();
				char[] arrayC = txt_Contraseña.getPassword();
				String pass = new String(arrayC);
				try {
					int i=bbdd.entrar(nombre, pass);
					if(i>1) {
						JOptionPane.showMessageDialog(null, "El usuario y la contraseña no coinciden", "ERROR",JOptionPane.ERROR_MESSAGE);
					} else {
						if(i==1) {
							JOptionPane.showMessageDialog(null, "Has iniciado sesion correctamente como administrador");
							JframePrincipal frameLobby=new JframePrincipal();
							frameLobby.setVisible(true);
							dispose();
						} else {
							JOptionPane.showMessageDialog(null, "Has iniciado sesion correctamente como doctor");
							JframePrincipal frameLobby=new JframePrincipal();
							frameLobby.setVisible(true);
							dispose();
						}
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btn_Aceptar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_Aceptar.setBounds(252, 332, 115, 41);
		contentPane.add(btn_Aceptar);

		txt_Contraseña = new JPasswordField();
		txt_Contraseña.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txt_Contraseña.setBounds(187, 240, 240, 32);
		contentPane.add(txt_Contraseña);

		txt_Usuario = new JTextField();
		txt_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txt_Usuario.setBounds(187, 146, 240, 32);
		contentPane.add(txt_Usuario);
		txt_Usuario.setColumns(10);

		JLabel lbl_InicioSesion = new JLabel("INICIO DE SESIÓN");
		lbl_InicioSesion.setForeground(new Color(255, 255, 255));
		lbl_InicioSesion.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbl_InicioSesion.setBounds(186, 26, 333, 41);
		contentPane.add(lbl_InicioSesion);
		
		JLabel lbl_usuario = new JLabel("");
		lbl_usuario.setIcon(new ImageIcon(IniciarSesion.class.getResource("/Iconos/usuario (1).png")));
		lbl_usuario.setBounds(120, 130, 32, 62);
		contentPane.add(lbl_usuario);
		
		JLabel lbl_contra = new JLabel("");
		lbl_contra.setIcon(new ImageIcon(IniciarSesion.class.getResource("/Iconos/cerrar-con-llave (1).png")));
		lbl_contra.setBounds(120, 240, 32, 32);
		contentPane.add(lbl_contra);

		JLabel fondo_pacientes = new JLabel("");
		fondo_pacientes.setIcon(new ImageIcon(IniciarSesion.class.getResource("/Iconos/Fondo 600X450.png")));
		fondo_pacientes.setBounds(0, 0, 600, 450);
		contentPane.add(fondo_pacientes);
	}
}
