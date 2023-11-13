package ventanas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;




public class JframeGestionFacturacion extends JFrame {
	private JPanel contentPane;
	private JTextField text_NombrePacienteFacturacion;
	private JTextField text_FechaFacturacion;
	private JTextField text_TipoPagoFacturacion;
	private JTextField text_TratamientoFacturacion;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					JframeGestionFacturacion frame = new JframeGestionFacturacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			private File getResourceAssStream(String string) {
				
				return null;
			}
		});
	}

	public JframeGestionFacturacion() {
		setResizable(false);
		setTitle("Facturación");
		setIconImage(Toolkit.getDefaultToolkit().getImage(JframeGestionFacturacion.class.getResource("/Iconos/diente.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 616, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_ActualizarFactura = new JButton("");
		btn_ActualizarFactura.setIcon(new ImageIcon(JframeGestionFacturacion.class.getResource("/Iconos/boton-editar.png")));
		btn_ActualizarFactura.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_ActualizarFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
			}
		});
		
		JButton btn_DarBajaFactura = new JButton("");
		btn_DarBajaFactura.setIcon(new ImageIcon(JframeGestionFacturacion.class.getResource("/Iconos/borrar.png")));
		btn_DarBajaFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		JButton btn_AgregarFactura = new JButton("");
		btn_AgregarFactura.setIcon(new ImageIcon(JframeGestionFacturacion.class.getResource("/Iconos/agregar.png")));
		btn_AgregarFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		text_TratamientoFacturacion = new JTextField();
		text_TratamientoFacturacion.setColumns(10);
		text_TratamientoFacturacion.setBounds(171, 150, 400, 25);
		contentPane.add(text_TratamientoFacturacion);
		
		JLabel lbl_TratamientoFacturacion = new JLabel("Tratamiento :");
		lbl_TratamientoFacturacion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_TratamientoFacturacion.setBounds(26, 150, 148, 25);
		contentPane.add(lbl_TratamientoFacturacion);
		
		JLabel lbl_Buscar = new JLabel("Buscar");
		lbl_Buscar.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Buscar.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_Buscar.setBounds(496, 100, 70, 25);
		contentPane.add(lbl_Buscar);
		
		JLabel lbl_FechaFacturacion = new JLabel("Fecha :");
		lbl_FechaFacturacion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_FechaFacturacion.setBounds(25, 200, 75, 25);
		getContentPane().add(lbl_FechaFacturacion);
		
		text_NombrePacienteFacturacion = new JTextField();
		text_NombrePacienteFacturacion.setBounds(126, 100, 320, 25);
		getContentPane().add(text_NombrePacienteFacturacion);
		text_NombrePacienteFacturacion.setColumns(10);
		
		JLabel lbl_TipoPagoFacturacion = new JLabel("Tipo de Pago :");
		lbl_TipoPagoFacturacion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_TipoPagoFacturacion.setBounds(259, 200, 155, 25);
		getContentPane().add(lbl_TipoPagoFacturacion);
		
		JLabel lbl_NombrePacienteFacturacion = new JLabel("Nombre :");
		lbl_NombrePacienteFacturacion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_NombrePacienteFacturacion.setBounds(26, 100, 96, 25);
		getContentPane().add(lbl_NombrePacienteFacturacion);
		
		text_TipoPagoFacturacion = new JTextField();
		text_TipoPagoFacturacion.setBounds(421, 200, 150, 25);
		getContentPane().add(text_TipoPagoFacturacion);
		text_TipoPagoFacturacion.setColumns(10);
		
		JButton btn_ConsultaFacturacion = new JButton("");
		btn_ConsultaFacturacion.addActionListener(new ActionListener() {
			int pos = 0;
			public void actionPerformed(ActionEvent e) {
				JdialogConsultaFacturacion buscarFactura = new JdialogConsultaFacturacion();
				buscarFactura.setVisible(true);
				buscarFactura.setModal(true);
			}
		});
		btn_ConsultaFacturacion.setIcon(new ImageIcon(JframeGestionFacturacion.class.getResource("/Iconos/filtrar.png")));
		btn_ConsultaFacturacion.setBounds(456, 100, 30, 25);
		contentPane.add(btn_ConsultaFacturacion);
		
		text_FechaFacturacion = new JTextField();
		text_FechaFacturacion.setBounds(111, 200, 130, 25);
		getContentPane().add(text_FechaFacturacion);
		text_FechaFacturacion.setColumns(10);
		btn_AgregarFactura.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_AgregarFactura.setBounds(341, 385, 70, 40);
		getContentPane().add(btn_AgregarFactura);
		btn_DarBajaFactura.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_DarBajaFactura.setBounds(500, 385, 70, 40);
		getContentPane().add(btn_DarBajaFactura);
		btn_ActualizarFactura.setBounds(421, 385, 69, 40);
		getContentPane().add(btn_ActualizarFactura);
		setBounds(100, 100, 541, 521);
		setSize(616,489);
		Container contentPane1 = new JPanel();
		
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(JframeGestionFacturacion.class.getResource("/Iconos/Fondo 600X450.png")));
		Fondo.setBounds(0, 0, 600, 450);
		contentPane.add(Fondo);
	}
}
