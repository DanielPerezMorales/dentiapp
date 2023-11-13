package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class JframeGestionProveedores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text_NombreProveedor;
	private JTextField text_TelefonoProveedor;
	private JLabel lbl_EmailProveedores;
	private JTextField text_EmailProveedor;
	private JLabel lbl_Buscar;
	private JTextField text_CifProveedor;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframeGestionProveedores frame = new JframeGestionProveedores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JframeGestionProveedores() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(JframeGestionProveedores.class.getResource("/Iconos/diente.png")));
		setTitle("Proveedores");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 616, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_ModificarProveedor = new JButton("");
		btn_ModificarProveedor.setIcon(new ImageIcon(JframeGestionProveedores.class.getResource("/Iconos/boton-editar.png")));
		btn_ModificarProveedor.setBounds(425, 385, 70, 40);
		contentPane.add(btn_ModificarProveedor);
		
		JButton btn_DarBajaProveedor = new JButton("");
		btn_DarBajaProveedor.setIcon(new ImageIcon(JframeGestionProveedores.class.getResource("/Iconos/borrar.png")));
		btn_DarBajaProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_DarBajaProveedor.setBounds(505, 385, 70, 40);
		contentPane.add(btn_DarBajaProveedor);
		
		JButton btn_AgregarProveedor = new JButton("");
		btn_AgregarProveedor.setIcon(new ImageIcon(JframeGestionProveedores.class.getResource("/Iconos/agregar.png")));
		btn_AgregarProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_AgregarProveedor.setBounds(345, 385, 70, 40);
		contentPane.add(btn_AgregarProveedor);
		
		text_EmailProveedor = new JTextField();
		text_EmailProveedor.setBounds(105, 199, 470, 25);
		contentPane.add(text_EmailProveedor);
		text_EmailProveedor.setColumns(10);
		
		text_CifProveedor = new JTextField();
		text_CifProveedor.setBounds(390, 150, 185, 25);
		contentPane.add(text_CifProveedor);
		text_CifProveedor.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cif :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(340, 150, 50, 25);
		contentPane.add(lblNewLabel_1);
		
		JButton btn_ConsultaProveedor = new JButton("");
		btn_ConsultaProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JdialogConsultaProveedores dialog_proveedores=new JdialogConsultaProveedores();
				dialog_proveedores.setVisible(true);
				dialog_proveedores.setModal(true);
			}
		});
		btn_ConsultaProveedor.setIcon(new ImageIcon(JframeGestionProveedores.class.getResource("/Iconos/filtrar.png")));
		btn_ConsultaProveedor.setBounds(415, 100, 50, 25);
		contentPane.add(btn_ConsultaProveedor);
		
		lbl_Buscar = new JLabel("Buscar");
		lbl_Buscar.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_Buscar.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Buscar.setBounds(495, 100, 80, 25);
		contentPane.add(lbl_Buscar);
		
		JLabel lbl_TelefonoProveedor = new JLabel("Teléfono :");
		lbl_TelefonoProveedor.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_TelefonoProveedor.setBounds(25, 150, 110, 25);
		contentPane.add(lbl_TelefonoProveedor);
		
		JLabel lbl_NombreProveedor = new JLabel("Nombre :");
		lbl_NombreProveedor.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_NombreProveedor.setBounds(25, 100, 105, 25);
		contentPane.add(lbl_NombreProveedor);
		
		text_NombreProveedor = new JTextField();
		text_NombreProveedor.setFont(new Font("Tahoma", Font.BOLD, 20));
		text_NombreProveedor.setBounds(140, 100, 250, 25);
		contentPane.add(text_NombreProveedor);
		text_NombreProveedor.setColumns(10);
		
		text_TelefonoProveedor = new JTextField();
		text_TelefonoProveedor.setBounds(140, 150, 170, 25);
		contentPane.add(text_TelefonoProveedor);
		text_TelefonoProveedor.setColumns(10);
		
		lbl_EmailProveedores = new JLabel("Email :");
		lbl_EmailProveedores.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_EmailProveedores.setBounds(25, 200, 80, 25);
		contentPane.add(lbl_EmailProveedores);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon("C:\\Users\\Medac\\eclipse-workspace\\DentiApp\\src\\Iconos\\Fondo 600X450.png"));
		Fondo.setBounds(0, 0, 600, 450);
		contentPane.add(Fondo);
	}
}
