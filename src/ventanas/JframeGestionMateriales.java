package ventanas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class JframeGestionMateriales extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_nombre;
	private JTextField tf_codigo;
	private JTextField tf_precio;
	private JTextField tf_proveedor;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframeGestionMateriales frame = new JframeGestionMateriales();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JframeGestionMateriales() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(JframeGestionMateriales.class.getResource("/Iconos/diente.png")));
		setFont(new Font("DialogInput", Font.BOLD, 30));
		setTitle("Materiales");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 616, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_€ = new JLabel("€");
		lbl_€.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_€.setBounds(555, 175, 20, 25);
		contentPane.add(lbl_€);
		
		JButton btn_CrearMaterial = new JButton("");
		btn_CrearMaterial.setIcon(new ImageIcon(JframeGestionMateriales.class.getResource("/Iconos/agregar.png")));
		btn_CrearMaterial.setBounds(340, 385, 70, 40);
		contentPane.add(btn_CrearMaterial);
		
		JButton btn_ModificarMaterial = new JButton("");
		btn_ModificarMaterial.setIcon(new ImageIcon(JframeGestionMateriales.class.getResource("/Iconos/boton-editar.png")));
		btn_ModificarMaterial.setBounds(420, 385, 70, 40);
		contentPane.add(btn_ModificarMaterial);
		
		JButton btn_DarBajaMaterial = new JButton("");
		btn_DarBajaMaterial.setIcon(new ImageIcon(JframeGestionMateriales.class.getResource("/Iconos/borrar.png")));
		btn_DarBajaMaterial.setBounds(500, 385, 70, 40);
		contentPane.add(btn_DarBajaMaterial);
		
		JLabel lblNewLabel_1 = new JLabel("Buscar");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(515, 125, 60, 25);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1);
		
		JButton btn_busqueda_materiales = new JButton("");
		btn_busqueda_materiales.setBounds(465, 125, 40, 25);
		btn_busqueda_materiales.addActionListener(new ActionListener() {
			int pos = 0;
			public void actionPerformed(ActionEvent e) {
				JdialogConsultasMateriales buscarMaterial = new JdialogConsultasMateriales();
				buscarMaterial.setVisible(true);
				buscarMaterial.setModal(true);
			}
		});
		btn_busqueda_materiales.setIcon(new ImageIcon(JframeGestionMateriales.class.getResource("/Iconos/filtrar.png")));
		contentPane.add(btn_busqueda_materiales);
		
		JLabel lbl_nombreMaterial = new JLabel("Nombre:");
		lbl_nombreMaterial.setBounds(25, 125, 87, 25);
		lbl_nombreMaterial.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lbl_nombreMaterial);
		
		tf_nombre = new JTextField();
		tf_nombre.setBounds(125, 125, 300, 25);
		tf_nombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_nombre.setColumns(10);
		contentPane.add(tf_nombre);
		
		JLabel lbl_codigoMaterial = new JLabel("Código:");
		lbl_codigoMaterial.setBounds(25, 175, 77, 25);
		lbl_codigoMaterial.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lbl_codigoMaterial);
		
		tf_codigo = new JTextField();
		tf_codigo.setBounds(112, 175, 194, 25);
		tf_codigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_codigo.setColumns(10);
		contentPane.add(tf_codigo);
		
		tf_precio = new JTextField();
		tf_precio.setBounds(468, 175, 77, 25);
		tf_precio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_precio.setColumns(10);
		contentPane.add(tf_precio);
		
		JLabel lbl_precioMaterial = new JLabel("Precio:");
		lbl_precioMaterial.setBounds(381, 175, 77, 25);
		lbl_precioMaterial.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lbl_precioMaterial);
		
		JLabel lbl_proveedorMaterial = new JLabel("Proveedor:");
		lbl_proveedorMaterial.setBounds(25, 225, 116, 25);
		lbl_proveedorMaterial.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lbl_proveedorMaterial);
		
		tf_proveedor = new JTextField();
		tf_proveedor.setBounds(151, 225, 424, 25);
		tf_proveedor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_proveedor.setColumns(10);
		contentPane.add(tf_proveedor);
		
		JLabel lbl_precioMaterial_1 = new JLabel("€");
		lbl_precioMaterial_1.setBounds(609, 167, 20, 25);
		lbl_precioMaterial_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lbl_precioMaterial_1);
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 0, 600, 450);
		Fondo.setIcon(new ImageIcon(JframeGestionMateriales.class.getResource("/Iconos/Fondo 600X450.png")));
		contentPane.add(Fondo);
	}
}
