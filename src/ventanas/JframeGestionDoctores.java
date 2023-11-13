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
import javax.swing.JCheckBox;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JframeGestionDoctores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lbl_NombreDoctor;
	private JLabel lbl_EspecialidadDoctor;
	private JTextField text_NombreDoctor;
	private JTextField text_EspecialidadDoctor;
	private JLabel lbl_DniDoctores;
	private JTextField text_DniDoctores;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframeGestionDoctores frame = new JframeGestionDoctores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JframeGestionDoctores() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(JframeGestionDoctores.class.getResource("/Iconos/diente.png")));
		setTitle("Doctores");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 616, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_BuscarDoctores = new JLabel("Buscar");
		lbl_BuscarDoctores.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_BuscarDoctores.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_BuscarDoctores.setBounds(496, 200, 75, 25);
		contentPane.add(lbl_BuscarDoctores);
		
		JButton btn_AgregarDoctor = new JButton("");
		btn_AgregarDoctor.setIcon(new ImageIcon(JframeGestionDoctores.class.getResource("/Iconos/agregar.png")));
		btn_AgregarDoctor.setBounds(328, 385, 76, 40);
		contentPane.add(btn_AgregarDoctor);
		
		JButton btn_ModificarDoctor = new JButton("");
		btn_ModificarDoctor.setIcon(new ImageIcon(JframeGestionDoctores.class.getResource("/Iconos/boton-editar.png")));
		btn_ModificarDoctor.setBounds(414, 385, 76, 40);
		contentPane.add(btn_ModificarDoctor);
		
		JButton btn_DarBajaDoctor = new JButton("");
		btn_DarBajaDoctor.setIcon(new ImageIcon(JframeGestionDoctores.class.getResource("/Iconos/borrar.png")));
		btn_DarBajaDoctor.setBounds(500, 385, 76, 40);
		contentPane.add(btn_DarBajaDoctor);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Pasaporte");
		chckbxNewCheckBox.setBounds(308, 200, 97, 25);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btn_ConsutaDoctores = new JButton("");
		btn_ConsutaDoctores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JdialogConsultaDoctores jdialogDoctores= new JdialogConsultaDoctores();
				jdialogDoctores.setVisible(true);
				jdialogDoctores.setModal(true);
			}
		});
		btn_ConsutaDoctores.setIcon(new ImageIcon(JframeGestionDoctores.class.getResource("/Iconos/filtrar.png")));
		btn_ConsutaDoctores.setBounds(424, 200, 50, 23);
		contentPane.add(btn_ConsutaDoctores);
		
		text_DniDoctores = new JTextField();
		text_DniDoctores.setBounds(85, 200, 200, 25);
		contentPane.add(text_DniDoctores);
		text_DniDoctores.setColumns(10);
		
		lbl_DniDoctores = new JLabel("Dni :");
		lbl_DniDoctores.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_DniDoctores.setBounds(25, 200, 60, 25);
		contentPane.add(lbl_DniDoctores);
		
		text_EspecialidadDoctor = new JTextField();
		text_EspecialidadDoctor.setBounds(184, 150, 391, 25);
		contentPane.add(text_EspecialidadDoctor);
		text_EspecialidadDoctor.setColumns(10);
		
		text_NombreDoctor = new JTextField();
		text_NombreDoctor.setBounds(241, 100, 333, 25);
		contentPane.add(text_NombreDoctor);
		text_NombreDoctor.setColumns(10);
		
		lbl_EspecialidadDoctor = new JLabel("Especialidad :");
		lbl_EspecialidadDoctor.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_EspecialidadDoctor.setBounds(25, 150, 149, 25);
		contentPane.add(lbl_EspecialidadDoctor);
		
		lbl_NombreDoctor = new JLabel("Nombre y Apellido :");
		lbl_NombreDoctor.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_NombreDoctor.setBounds(25, 100, 200, 25);
		contentPane.add(lbl_NombreDoctor);
		
		JLabel Fondo = new JLabel("");
		Fondo.setFont(new Font("Tahoma", Font.BOLD, 20));
		Fondo.setIcon(new ImageIcon(JframeGestionDoctores.class.getResource("/Iconos/Fondo 600X450.png")));
		Fondo.setBounds(0, 0, 600, 450);
		contentPane.add(Fondo);
	}
}
