package ventanas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import com.toedter.calendar.JCalendar;

public class JframeGestionPedidos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static JframeGestionPedidos frame = new JframeGestionPedidos();
	private JTextField tf_cantidad;
	private JTextField tf_material;
	private JTextField tf_proveedor;
	private JTextField textPrecioTotal;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframeGestionPedidos frame = new JframeGestionPedidos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JframeGestionPedidos() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(JframeGestionPedidos.class.getResource("/Iconos/diente.png")));
		setFont(new Font("DialogInput", Font.BOLD, 30));
		setTitle("Pedidos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 616, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCalendar calendario_Pedidos = new JCalendar();
		calendario_Pedidos.setBounds(25, 156, 250, 199);
		contentPane.add(calendario_Pedidos);
		
		textPrecioTotal = new JTextField();
		textPrecioTotal.setBounds(165, 399, 60, 25);
		contentPane.add(textPrecioTotal);
		textPrecioTotal.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Buscar");
		lblNewLabel_1.setBounds(515, 50, 60, 25);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1);
		
		JButton btn_busqueda_materiales = new JButton("");
		btn_busqueda_materiales.setBounds(475, 50, 30, 25);
		btn_busqueda_materiales.addActionListener(new ActionListener() {
			int pos = 0;
			public void actionPerformed(ActionEvent e) {
				JdialogConsultasPedidos buscarPedido = new JdialogConsultasPedidos();
				buscarPedido.setVisible(true);
				buscarPedido.setModal(true);
				//kjfhilgerafihgegihrcgvipersgiugiupfewagifcgipegiargvhièrgivcwegvihgd ciuewg3cfiwgñpcygui83qf83pic8fipgqew3c
				//dewkiñjdbhliq3hbih<icf3q wiñp3hc ñd wpfwra vñpiwb4gv
				//wlekjdkxhbqixl	ckhd23wcdbf3lu2ev clhgeq3vculgv <ulshgcxvoylwevcuohw3
			}
		});
		btn_busqueda_materiales.setIcon(new ImageIcon(JframeGestionPedidos.class.getResource("/Iconos/filtrar.png")));
		contentPane.add(btn_busqueda_materiales);
		

		JLabel lbl_txtPrecio = new JLabel("Precio Tota l:");
		lbl_txtPrecio.setBounds(25, 399, 135, 25);
		lbl_txtPrecio.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lbl_txtPrecio);
		
		JLabel lbl_precio = new JLabel("€");
		lbl_precio.setBounds(225, 400, 20, 25);
		lbl_precio.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_precio.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lbl_precio);
		
		JButton btn_realizar_compra = new JButton("");
		btn_realizar_compra.setIcon(new ImageIcon(JframeGestionPedidos.class.getResource("/Iconos/carrito-de-compras.png")));
		btn_realizar_compra.setBounds(505, 385, 70, 39);
		btn_realizar_compra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String material= tf_material.getText();
				String cantidad= tf_cantidad.getText();
				String proveedor = tf_proveedor.getText();
				String precio = lbl_precio.getText();				
				String mensaje1 = "Tu pedido contiene "+cantidad+" ud(s) de "+material+", de "+proveedor+". Precio:"+precio+". ¿Confirma su compra?";
				String mensaje2 = "Compra realizada con éxito.";
				int respuesta= JOptionPane.showConfirmDialog(null, mensaje1, "Confirmar Compra",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (respuesta==0) {
					JOptionPane.showMessageDialog(null, mensaje2,"Compra", JOptionPane.INFORMATION_MESSAGE);
					tf_material.setText("");
					tf_proveedor.setText("");
					tf_cantidad.setText("");
					lbl_precio.setText("€");			
				}
			}
		});
		btn_realizar_compra.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(btn_realizar_compra);
		
		JButton btn_modificar_pedido = new JButton("");
		btn_modificar_pedido.setIcon(new ImageIcon(JframeGestionPedidos.class.getResource("/Iconos/anadir-a-la-cesta.png")));
		btn_modificar_pedido.setBounds(425, 385, 70, 40);
		btn_modificar_pedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				String mensaje1 = "¿Desea modificar este pedido?";
				String mensaje2 = "Pedido modificado con éxito.";
				int respuesta= JOptionPane.showConfirmDialog(null, mensaje1, "Confirmar Compra",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (respuesta==0) {
					JOptionPane.showMessageDialog(null, mensaje2,"Compra", JOptionPane.INFORMATION_MESSAGE);
					tf_material.setText("");
					tf_proveedor.setText("");
					tf_cantidad.setText("");
					lbl_precio.setText("€");			
				}
			}
		});
		btn_modificar_pedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(btn_modificar_pedido);
		
		JLabel lbl_material = new JLabel("Id Material :");
		lbl_material.setBounds(25, 51, 135, 25);
		lbl_material.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lbl_material);
		
		JLabel lbl_proveedor = new JLabel("Proveedor :");
		lbl_proveedor.setBounds(25, 100, 117, 25);
		lbl_proveedor.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lbl_proveedor);
		
		JLabel lbl_cantidad = new JLabel("Cantidad :");
		lbl_cantidad.setBounds(395, 100, 104, 25);
		lbl_cantidad.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lbl_cantidad);
		
		tf_cantidad = new JTextField();
		tf_cantidad.setBounds(505, 100, 70, 25);
		tf_cantidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_cantidad.setColumns(10);
		contentPane.add(tf_cantidad);
		
		tf_material = new JTextField();
		tf_material.setBounds(178, 50, 230, 25);
		tf_material.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_material.setColumns(10);
		contentPane.add(tf_material);
		
		tf_proveedor = new JTextField();
		tf_proveedor.setBounds(150, 100, 160, 25);
		tf_proveedor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_proveedor.setColumns(10);
		contentPane.add(tf_proveedor);
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 0, 600, 450);
		Fondo.setIcon(new ImageIcon("C:\\Users\\Medac\\eclipse-workspace\\DentiApp\\src\\Iconos\\Fondo 600X450.png"));
		contentPane.add(Fondo);
	}
}
