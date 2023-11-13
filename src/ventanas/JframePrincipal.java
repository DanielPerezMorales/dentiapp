package ventanas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;

public class JframePrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframePrincipal frame = new JframePrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JframePrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JframePrincipal.class.getResource("/Iconos/diente.png")));
		setFont(new Font("Dialog", Font.BOLD, 20));
		setTitle("DENTIAPP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1017, 641);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		menuBar.setBounds(0, 0, 1025, 50);
		contentPanel.add(menuBar);
		
		
		JMenu mnNewMenu_pacientes = new JMenu("Pacientes");
		mnNewMenu_pacientes.setForeground(new Color(0, 0, 0));
		mnNewMenu_pacientes.setBackground(new Color(255, 255, 255));
		mnNewMenu_pacientes.setFont(new Font("Segoe UI", Font.BOLD, 24));
		mnNewMenu_pacientes.setHorizontalAlignment(SwingConstants.TRAILING);
		menuBar.add(mnNewMenu_pacientes);
		
		JMenuItem mnNewMenu_gestion = new JMenuItem("Gestión");
		mnNewMenu_gestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JframeGestionPacientes gestionpacientes=new JframeGestionPacientes();
				gestionpacientes.setVisible(true);
			}
		});
		mnNewMenu_pacientes.add(mnNewMenu_gestion);
		
		JMenu mnNewMenu_doctores = new JMenu("Doctores");
		mnNewMenu_doctores.setForeground(new Color(0, 0, 0));
		mnNewMenu_doctores.setFont(new Font("Segoe UI", Font.BOLD, 24));
		menuBar.add(mnNewMenu_doctores);
		
		JMenuItem mn_gestion_Doctores = new JMenuItem("Gestión");
		mn_gestion_Doctores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JframeGestionDoctores gestionDoctores=new JframeGestionDoctores();
				gestionDoctores.setVisible(true);
			}
		});
		mnNewMenu_doctores.add(mn_gestion_Doctores);
		
		JMenu mnNewMenu_tratamientos = new JMenu("Tratamientos");
		mnNewMenu_tratamientos.setForeground(new Color(0, 0, 0));
		mnNewMenu_tratamientos.setFont(new Font("Segoe UI", Font.BOLD, 24));
		menuBar.add(mnNewMenu_tratamientos);
		
		JMenuItem mn_gestion_tratamientos = new JMenuItem("Gestion");
		mn_gestion_tratamientos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JframeGestionTratamientos gestionTratamientos=new JframeGestionTratamientos();
				gestionTratamientos.setVisible(true);
			}
		});
		mnNewMenu_tratamientos.add(mn_gestion_tratamientos);
		
		JMenu mnNewMenu_especialidades = new JMenu("Especialidades");
		mnNewMenu_especialidades.setForeground(new Color(0, 0, 0));
		mnNewMenu_especialidades.setFont(new Font("Segoe UI", Font.BOLD, 24));
		menuBar.add(mnNewMenu_especialidades);
		
		JMenuItem mn_gestion_especilidades = new JMenuItem("Gestion");
		mn_gestion_especilidades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JframeGestionEspecialidades gestionEspecialidades =new JframeGestionEspecialidades();
				gestionEspecialidades .setVisible(true);
			}
		});
		mnNewMenu_especialidades.add(mn_gestion_especilidades);
		
		JMenu mnNewMenu_materiales = new JMenu("Materiales");
		mnNewMenu_materiales.setForeground(new Color(0, 0, 0));
		mnNewMenu_materiales.setFont(new Font("Segoe UI", Font.BOLD, 24));
		menuBar.add(mnNewMenu_materiales);
		
		JMenuItem mn_gestion_materiales = new JMenuItem("Gestión Materiales");
		mn_gestion_materiales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JframeGestionMateriales gestionMateriales =new JframeGestionMateriales();
				gestionMateriales .setVisible(true);
			}
		});
		mnNewMenu_materiales.add(mn_gestion_materiales);
		
		JMenuItem mn_materiales = new JMenuItem("Gestión Pedidos");
		mn_materiales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JframeGestionPedidos gestionPedidos =new JframeGestionPedidos();
				gestionPedidos .setVisible(true);
			}
		});
		mnNewMenu_materiales.add(mn_materiales);
		
		JMenuItem mn_proveedores = new JMenuItem("Gestión Proveedores");
		mn_proveedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JframeGestionProveedores gestionProveedores =new JframeGestionProveedores();
				gestionProveedores .setVisible(true);
			}
		});
		mnNewMenu_materiales.add(mn_proveedores);
		
		JMenu mnNewMenu_cita = new JMenu("Cita");
		mnNewMenu_cita.setForeground(new Color(0, 0, 0));
		mnNewMenu_cita.setFont(new Font("Segoe UI", Font.BOLD, 24));
		menuBar.add(mnNewMenu_cita);
		
		JMenuItem mn_gestion_cita = new JMenuItem("Gestión");
		mn_gestion_cita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JframeGestionCita gestionCita = null;
				try {
					gestionCita = new JframeGestionCita();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				gestionCita .setVisible(true);
			}
		});
		mnNewMenu_cita.add(mn_gestion_cita);
		
		JMenu mnNewMenu_facturacion = new JMenu("Facturación");
		mnNewMenu_facturacion.setForeground(new Color(0, 0, 0));
		mnNewMenu_facturacion.setFont(new Font("Segoe UI", Font.BOLD, 24));
		menuBar.add(mnNewMenu_facturacion);
		
		JMenuItem Gestion_MenuItem = new JMenuItem("Gestión");
		Gestion_MenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JframeGestionFacturacion GestionFacturacion= new JframeGestionFacturacion();
				GestionFacturacion.setVisible(true);
			}
		});
		mnNewMenu_facturacion.add(Gestion_MenuItem);
		
		JMenu mnNewMenu_ayuda = new JMenu("Ayuda");
		mnNewMenu_ayuda.setForeground(new Color(0, 0, 0));
		mnNewMenu_ayuda.setFont(new Font("Segoe UI", Font.BOLD, 24));
		menuBar.add(mnNewMenu_ayuda);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(JframePrincipal.class.getResource("/Iconos/Fondo 1000X600.png")));
		fondo.setBounds(0, 0, 1000, 600);
		contentPanel.add(fondo);
	}
}
