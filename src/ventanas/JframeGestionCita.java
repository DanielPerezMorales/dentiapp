package ventanas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class JframeGestionCita extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text_DniPacienteCita;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframeGestionCita frame = new JframeGestionCita();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JframeGestionCita() throws SQLException {
		setResizable(false);
		BBDD bbdd =new BBDD();
		bbdd.conectar();
		setIconImage(Toolkit.getDefaultToolkit().getImage(JframeGestionCita.class.getResource("/Iconos/diente.png")));
		setFont(new Font("DialogInput", Font.BOLD, 30));
		setTitle("Cita");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 616, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		JButton btn_DarBajaCita = new JButton("");
		btn_DarBajaCita.setIcon(new ImageIcon(JframeGestionCita.class.getResource("/Iconos/borrar.png")));
		btn_DarBajaCita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btn_AgregarCita = new JButton("");
		btn_AgregarCita.setIcon(new ImageIcon(JframeGestionCita.class.getResource("/Iconos/agregar.png")));
		btn_AgregarCita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JDateChooser fecha_variable = new JDateChooser();
		fecha_variable.setBounds(442, 50, 133, 25);
		contentPane.add(fecha_variable);
		
		JTextArea text_ObservacionesCita = new JTextArea();
		text_ObservacionesCita.setBackground(new Color(255, 255, 255));
		text_ObservacionesCita.setBounds(25, 250, 550, 100);
		contentPane.add(text_ObservacionesCita);
		
		JComboBox cmb_DoctoresCita = new JComboBox();
		cmb_DoctoresCita.setEnabled(false);
		cmb_DoctoresCita.setBackground(Color.WHITE);
		cmb_DoctoresCita.setBounds(118, 150, 200, 25);
		contentPane.add(cmb_DoctoresCita);
		
		JLabel lbl_FechaCita = new JLabel("Fecha : ");
		lbl_FechaCita.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_FechaCita.setBounds(360, 50, 80, 25);
		contentPane.add(lbl_FechaCita);
		
		JLabel lblNewLabel = new JLabel("Buscar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(495, 150, 80, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lbl_DoctorCita = new JLabel("Doctor : ");
		lbl_DoctorCita.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_DoctorCita.setBounds(25, 150, 90, 25);
		contentPane.add(lbl_DoctorCita);
		
		text_DniPacienteCita = new JTextField();
		text_DniPacienteCita.setFont(new Font("Tahoma", Font.PLAIN, 15));
		text_DniPacienteCita.setBounds(190, 50, 160, 25);
		contentPane.add(text_DniPacienteCita);
		text_DniPacienteCita.setColumns(10);
		
		JComboBox cmb_TratamientoCita = new JComboBox();
		cmb_TratamientoCita.setBackground(new Color(255, 255, 255));
		cmb_TratamientoCita.setBounds(185, 101, 200, 25);
		contentPane.add(cmb_TratamientoCita);
		
		JLabel lbl_DniPacienteCita = new JLabel("DNI Paciente : ");
		lbl_DniPacienteCita.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_DniPacienteCita.setBounds(25, 50, 160, 25);
		contentPane.add(lbl_DniPacienteCita);
		
		JButton btn_ConsultaCita = new JButton();
		btn_ConsultaCita.addActionListener(new ActionListener() {
			int pos = 0;
			public void actionPerformed(ActionEvent e) {
				cmb_DoctoresCita.setEnabled(true);
				String trat = cmb_TratamientoCita.getSelectedItem().toString();
				ArrayList DatosFiltrados;
				try {
					DatosFiltrados = new ArrayList(bbdd.consultaDoctoresFiltrado(trat));
					for(int i=0; i<DatosFiltrados.size(); i++) {
						String valor = (String) DatosFiltrados.get(i);
						cmb_DoctoresCita.addItem(valor);
						DatosFiltrados.clear();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}}
		);
		btn_ConsultaCita.setIcon(new ImageIcon(JframeGestionCita.class.getResource("/Iconos/filtrar.png")));
		btn_ConsultaCita.setBounds(442, 150, 50, 25);
		contentPane.add(btn_ConsultaCita);
		
		JLabel lbl_TratamientoCita = new JLabel("Tratamiento :");
		lbl_TratamientoCita.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_TratamientoCita.setBounds(25, 100, 140, 25);
		contentPane.add(lbl_TratamientoCita);
		
		JLabel lbl_ObservacionesCita = new JLabel("Observaciones:");
		lbl_ObservacionesCita.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_ObservacionesCita.setBounds(25, 200, 165, 25);
		contentPane.add(lbl_ObservacionesCita);
		btn_AgregarCita.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_AgregarCita.setBounds(347, 385, 70, 40);
		contentPane.add(btn_AgregarCita);
		btn_DarBajaCita.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_DarBajaCita.setBounds(505, 385, 70, 40);
		contentPane.add(btn_DarBajaCita);
		
		JButton btn_ModificarCita = new JButton("");
		btn_ModificarCita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_ModificarCita.setIcon(new ImageIcon(JframeGestionCita.class.getResource("/Iconos/boton-editar.png")));
		btn_ModificarCita.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_ModificarCita.setBounds(427, 385, 70, 40);
		contentPane.add(btn_ModificarCita);
		ArrayList Datos2=new ArrayList(bbdd.consultaTratamientos());
		for(int i=0; i<Datos2.size(); i++) {
			String valor2 = (String) Datos2.get(i);
			cmb_TratamientoCita.addItem(valor2);
		}
		
		/*if(cmb_tratamiento.getSelectedItem().toString()==null) {
			ArrayList Datos=new ArrayList(bbdd.consultaDoctores());
			for(int i=0; i<Datos.size(); i++) {
				String valor = (String) Datos.get(i);
				cmb_tratamiento.addItem(valor);
		} */
		
		/*JDateChooser Date_Cita = new JDateChooser();
		Date_Cita.setBounds(235, 255, 261, 20);
		contentPane.add(Date_Cita);*/
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(JframeGestionCita.class.getResource("/Iconos/Fondo 600X450.png")));
		Fondo.setBounds(0, 0, 600, 450);
		contentPane.add(Fondo);
	}
}
