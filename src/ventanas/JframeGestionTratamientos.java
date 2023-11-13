package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JframeGestionTratamientos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text_NombreTratamiento;
	private JLabel lblNewLabel_1;
	private JButton btn_ConsultarTratamientos;
	private JTextField textField;
	private JButton btn_ModificarTratamiento;
	private JButton btn_DarBajaTratamiento;
	private JButton btn_AgregarTratamiento;
	private JLabel lbl_Precio;
	private JTextField text_PrecioTratamiento;
	private JLabel lbl_Euro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframeGestionTratamientos frame = new JframeGestionTratamientos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JframeGestionTratamientos() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(JframeGestionTratamientos.class.getResource("/Iconos/diente.png")));
		setTitle("Tratamientos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 616, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl_Euro = new JLabel("");
		lbl_Euro.setIcon(new ImageIcon(JframeGestionTratamientos.class.getResource("/Iconos/simbolo-del-euro (1).png")));
		lbl_Euro.setBounds(176, 293, 30, 32);
		contentPane.add(lbl_Euro);
		
		text_PrecioTratamiento = new JTextField();
		text_PrecioTratamiento.setBounds(105, 300, 70, 25);
		contentPane.add(text_PrecioTratamiento);
		text_PrecioTratamiento.setColumns(10);
		
		lbl_Precio = new JLabel("Precio :");
		lbl_Precio.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_Precio.setBounds(25, 300, 90, 25);
		contentPane.add(lbl_Precio);
		
		btn_AgregarTratamiento = new JButton("");
		btn_AgregarTratamiento.setIcon(new ImageIcon(JframeGestionTratamientos.class.getResource("/Iconos/agregar.png")));
		btn_AgregarTratamiento.setBounds(344, 385, 70, 40);
		contentPane.add(btn_AgregarTratamiento);
		
		btn_DarBajaTratamiento = new JButton("");
		btn_DarBajaTratamiento.setIcon(new ImageIcon(JframeGestionTratamientos.class.getResource("/Iconos/borrar.png")));
		btn_DarBajaTratamiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_DarBajaTratamiento.setBounds(505, 385, 70, 40);
		contentPane.add(btn_DarBajaTratamiento);
		
		btn_ModificarTratamiento = new JButton("");
		btn_ModificarTratamiento.setIcon(new ImageIcon(JframeGestionTratamientos.class.getResource("/Iconos/boton-editar.png")));
		btn_ModificarTratamiento.setBounds(424, 385, 70, 40);
		contentPane.add(btn_ModificarTratamiento);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(194, 175, 381, 25);
		contentPane.add(textField);
		
		btn_ConsultarTratamientos = new JButton("");
		btn_ConsultarTratamientos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JdialogConsultasTratamientos JdialogTrat=new JdialogConsultasTratamientos();
				JdialogTrat.setVisible(true);
				JdialogTrat.setModal(true);
			}
		});
		btn_ConsultarTratamientos.setIcon(new ImageIcon(JframeGestionTratamientos.class.getResource("/Iconos/filtrar.png")));
		btn_ConsultarTratamientos.setBounds(525, 125, 50, 25);
		contentPane.add(btn_ConsultarTratamientos);
		
		lblNewLabel_1 = new JLabel("Especialidad :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(25, 175, 150, 25);
		contentPane.add(lblNewLabel_1);
		
		text_NombreTratamiento = new JTextField();
		text_NombreTratamiento.setBounds(194, 125, 300, 25);
		contentPane.add(text_NombreTratamiento);
		text_NombreTratamiento.setColumns(10);
		
		JLabel lbl_NombreTratamiento = new JLabel("Tratamiento :");
		lbl_NombreTratamiento.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_NombreTratamiento.setBounds(25, 125, 150, 25);
		contentPane.add(lbl_NombreTratamiento);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon("C:\\Users\\Medac\\eclipse-workspace\\DentiApp\\src\\Iconos\\Fondo 600X450.png"));
		Fondo.setBounds(0, 0, 600, 450);
		contentPane.add(Fondo);
	}

}
