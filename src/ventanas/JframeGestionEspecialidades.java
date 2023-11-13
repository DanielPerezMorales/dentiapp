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

public class JframeGestionEspecialidades extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text_NombreDoctor;
	private JTextField text_Especialidad;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframeGestionEspecialidades frame = new JframeGestionEspecialidades();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JframeGestionEspecialidades() {
		setResizable(false);
		setTitle("Especialidades");
		setIconImage(Toolkit.getDefaultToolkit().getImage(JframeGestionEspecialidades.class.getResource("/Iconos/diente.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 616, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_AgregarEspecialidad = new JButton("");
		btn_AgregarEspecialidad.setIcon(new ImageIcon(JframeGestionEspecialidades.class.getResource("/Iconos/agregar.png")));
		btn_AgregarEspecialidad.setBounds(345, 385, 70, 40);
		contentPane.add(btn_AgregarEspecialidad);
		
		JButton btn_DarBajaEspecialidad = new JButton("");
		btn_DarBajaEspecialidad.setIcon(new ImageIcon(JframeGestionEspecialidades.class.getResource("/Iconos/borrar.png")));
		btn_DarBajaEspecialidad.setBounds(505, 385, 70, 40);
		contentPane.add(btn_DarBajaEspecialidad);
		
		JButton btn_ModificarEspecialidad = new JButton("");
		btn_ModificarEspecialidad.setIcon(new ImageIcon(JframeGestionEspecialidades.class.getResource("/Iconos/boton-editar.png")));
		btn_ModificarEspecialidad.setBounds(425, 385, 70, 40);
		contentPane.add(btn_ModificarEspecialidad);
		
		JButton btn_ConsultarEspecialidades = new JButton("");
		btn_ConsultarEspecialidades.setIcon(new ImageIcon(JframeGestionEspecialidades.class.getResource("/Iconos/filtrar.png")));
		btn_ConsultarEspecialidades.setBounds(525, 175, 50, 25);
		contentPane.add(btn_ConsultarEspecialidades);
		
		text_Especialidad = new JTextField();
		text_Especialidad.setColumns(10);
		text_Especialidad.setBounds(183, 175, 330, 25);
		contentPane.add(text_Especialidad);
		
		text_NombreDoctor = new JTextField();
		text_NombreDoctor.setBounds(225, 125, 350, 25);
		contentPane.add(text_NombreDoctor);
		text_NombreDoctor.setColumns(10);
		
		JLabel lbl_Especialidad = new JLabel("Especilidad :");
		lbl_Especialidad.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_Especialidad.setBounds(25, 175, 140, 25);
		contentPane.add(lbl_Especialidad);
		
		JLabel lbl_NombreDoctor = new JLabel("Nombre Doctor :");
		lbl_NombreDoctor.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_NombreDoctor.setBounds(25, 125, 180, 25);
		contentPane.add(lbl_NombreDoctor);
		
		JLabel lbl_Fondo = new JLabel("");
		lbl_Fondo.setIcon(new ImageIcon(JframeGestionEspecialidades.class.getResource("/Iconos/Fondo 600X450.png")));
		lbl_Fondo.setBounds(0, 0, 600, 450);
		contentPane.add(lbl_Fondo);
	}
}
