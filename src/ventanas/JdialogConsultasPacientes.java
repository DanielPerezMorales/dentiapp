package ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.RowFilter;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class JdialogConsultasPacientes extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table_Pacientes;
	private JTextField text_FiltroPacientes;
	private DefaultTableModel model;


	public static void main(String[] args) {
		try {
			JdialogConsultasPacientes dialog = new JdialogConsultasPacientes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JdialogConsultasPacientes() {
		setResizable(false);
		BBDD bbdd=new BBDD();
		setTitle("Consulta Pacientes");
		setIconImage(Toolkit.getDefaultToolkit().getImage(JdialogConsultasPacientes.class.getResource("/Iconos/diente.png")));
		setBounds(100, 100, 616, 489);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lbl_Paciente = new JLabel("DNI Paciente:");
			lbl_Paciente.setFont(new Font("Tahoma", Font.BOLD, 20));
			lbl_Paciente.setBounds(25, 24, 149, 25);
			contentPanel.add(lbl_Paciente);
		}
		{
			text_FiltroPacientes = new JTextField();
			text_FiltroPacientes.setFont(new Font("Tahoma", Font.BOLD, 20));
			text_FiltroPacientes.setColumns(10);
			text_FiltroPacientes.setBounds(171, 24, 344, 25);
			contentPanel.add(text_FiltroPacientes);
		}
		{
			JButton btn_FiltrarPacientes = new JButton("");
			btn_FiltrarPacientes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String DNI = text_FiltroPacientes.getText().toString();
					filtro(DNI, table_Pacientes);
				}

				private void filtro(String consulta, JTable jtableBuscar) {
					DefaultTableModel dm = new DefaultTableModel();
					dm = (DefaultTableModel) jtableBuscar.getModel();
					TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
					String[] colum = new String[6];
					colum[0] = "DNI";
					colum[1] = "Nombre";
					colum[2] = "Direccion";
					colum[3] = "Telefono";
					colum[4] = "Edad";
					colum[5] = "Email";
					dm.addRow(colum);
					jtableBuscar.setModel(dm);
					jtableBuscar.setRowSorter(tr);
					tr.setRowFilter(RowFilter.regexFilter(consulta));
				}
			});
			btn_FiltrarPacientes.setIcon(new ImageIcon(JdialogConsultasPacientes.class.getResource("/Iconos/filtrar.png")));
			btn_FiltrarPacientes.setBounds(525, 24, 50, 23);
			contentPanel.add(btn_FiltrarPacientes);
		}
		{
			table_Pacientes = new JTable();
			table_Pacientes.setBounds(25, 74, 550, 320);
			contentPanel.add(table_Pacientes);
			
			bbdd.conectar();
			String sql = "SELECT * FROM bbdd_dentista.cliente";

			Statement st;

			model = new DefaultTableModel();
			model.addColumn("DNI");
			model.addColumn("Nombre");
			model.addColumn("Direccion");
			model.addColumn("Telefono");
			model.addColumn("Edad");
			model.addColumn("Email");

			table_Pacientes.setModel(model);

			String[] colum = new String[6];
			colum[0] = "DNI";
			colum[1] = "Nombre";
			colum[2] = "Direccion";
			colum[3] = "Telefono";
			colum[4] = "Edad";
			colum[5] = "Email";
			model.addRow(colum);

			try {
				String[] dato = new String[6];
				st = bbdd.cn.createStatement();
				ResultSet res = st.executeQuery(sql);
				while (res.next()) {
					dato[0] = res.getString(1);
					dato[1] = res.getString(2);
					dato[2] = res.getString(3);
					dato[3] = res.getString(4);
					dato[4] = res.getString(5);
					dato[5] = res.getString(6);
					model.addRow(dato);
				}
			} catch (Exception e) {
				e.getMessage();
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 415, 600, 35);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						model = (DefaultTableModel) table_Pacientes.getModel();
						String DNI = String.valueOf(model.getValueAt(table_Pacientes.getSelectedRow(), 0));
						String Nombre = String.valueOf(model.getValueAt(table_Pacientes.getSelectedRow(), 1));
						String Direccion = String.valueOf(model.getValueAt(table_Pacientes.getSelectedRow(), 2));
						String Telefono = String.valueOf(model.getValueAt(table_Pacientes.getSelectedRow(), 3));
						String Edad = String.valueOf(model.getValueAt(table_Pacientes.getSelectedRow(), 4));
						String Email = String.valueOf(model.getValueAt(table_Pacientes.getSelectedRow(), 5));
						JframeGestionPacientes pacienteFiltrado = new JframeGestionPacientes(DNI, Nombre, Direccion, Telefono, Edad, Email);
						pacienteFiltrado.setVisible(true);
						dispose();
					}
				});
				okButton.setBounds(430, 5, 60, 25);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setBounds(500, 5, 80, 25);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JLabel Fondo = new JLabel("");
			Fondo.setIcon(new ImageIcon(JdialogConsultasPacientes.class.getResource("/Iconos/Fondo 600X450.png")));
			Fondo.setBounds(0, 0, 600, 450);
			contentPanel.add(Fondo);
		}
	}

	public JdialogConsultasPacientes(String text_DniPaciente) {
		BBDD bbdd=new BBDD();
		setTitle("Consulta Pacientes");
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Iconos/Icono.png"));
		setBounds(100, 100, 616, 489);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lbl_Paciente = new JLabel("DNI Paciente:");
			lbl_Paciente.setFont(new Font("Tahoma", Font.BOLD, 20));
			lbl_Paciente.setBounds(25, 24, 149, 25);
			contentPanel.add(lbl_Paciente);
		}
		{
			text_FiltroPacientes = new JTextField();
			text_FiltroPacientes.setFont(new Font("Tahoma", Font.BOLD, 20));
			text_FiltroPacientes.setColumns(10);
			text_FiltroPacientes.setText(text_DniPaciente);
			text_FiltroPacientes.setBounds(171, 24, 344, 25);
			contentPanel.add(text_FiltroPacientes);
		}
		{
			JButton btn_FiltrarPacientes = new JButton("");
			btn_FiltrarPacientes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String DNI = text_FiltroPacientes.getText().toString();
					filtro(DNI, table_Pacientes);
				}

				private void filtro(String consulta, JTable jtableBuscar) {
					DefaultTableModel dm = new DefaultTableModel();
					dm = (DefaultTableModel) jtableBuscar.getModel();
					TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
					String[] colum = new String[6];
					colum[0] = "DNI";
					colum[1] = "Nombre";
					colum[2] = "Direccion";
					colum[3] = "Telefono";
					colum[4] = "Edad";
					colum[5] = "Email";
					dm.addRow(colum);
					jtableBuscar.setModel(dm);
					jtableBuscar.setRowSorter(tr);
					tr.setRowFilter(RowFilter.regexFilter(consulta));
				}
			});
			btn_FiltrarPacientes.setIcon(new ImageIcon("/Iconos/filtrar.png"));
			btn_FiltrarPacientes.setBounds(525, 24, 50, 23);
			contentPanel.add(btn_FiltrarPacientes);
		}
		{
			table_Pacientes = new JTable();
			table_Pacientes.setBounds(25, 74, 550, 320);
			contentPanel.add(table_Pacientes);
			
			bbdd.conectar();
			String sql = "SELECT * FROM bbdd_dentista.cliente";

			Statement st;

			model = new DefaultTableModel();
			model.addColumn("DNI");
			model.addColumn("Nombre");
			model.addColumn("Direccion");
			model.addColumn("Telefono");
			model.addColumn("Edad");
			model.addColumn("Email");

			table_Pacientes.setModel(model);

			String[] colum = new String[6];
			colum[0] = "DNI";
			colum[1] = "Nombre";
			colum[2] = "Direccion";
			colum[3] = "Telefono";
			colum[4] = "Edad";
			colum[5] = "Email";
			model.addRow(colum);

			try {
				String[] dato = new String[6];
				st = bbdd.cn.createStatement();
				ResultSet res = st.executeQuery(sql);
				while (res.next()) {
					dato[0] = res.getString(1);
					dato[1] = res.getString(2);
					dato[2] = res.getString(3);
					dato[3] = res.getString(4);
					dato[4] = res.getString(5);
					dato[5] = res.getString(6);
					model.addRow(dato);
				}
			} catch (Exception e) {
				e.getMessage();
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 415, 600, 35);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						model = (DefaultTableModel) table_Pacientes.getModel();
						String DNI = String.valueOf(model.getValueAt(table_Pacientes.getSelectedRow(), 0));
						String Nombre = String.valueOf(model.getValueAt(table_Pacientes.getSelectedRow(), 1));
						String Direccion = String.valueOf(model.getValueAt(table_Pacientes.getSelectedRow(), 2));
						String Telefono = String.valueOf(model.getValueAt(table_Pacientes.getSelectedRow(), 3));
						String Edad = String.valueOf(model.getValueAt(table_Pacientes.getSelectedRow(), 4));
						String Email = String.valueOf(model.getValueAt(table_Pacientes.getSelectedRow(), 5));
						JframeGestionPacientes pacienteFiltrado = new JframeGestionPacientes(DNI, Nombre, Direccion, Telefono, Edad, Email);
						pacienteFiltrado.setVisible(true);
						dispose();
					}
				});
				okButton.setBounds(430, 5, 60, 25);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setBounds(500, 5, 80, 25);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JLabel Fondo = new JLabel("");
			Fondo.setIcon(new ImageIcon("/Iconos/Fondo 600X450.png"));
			Fondo.setBounds(0, 0, 600, 450);
			contentPanel.add(Fondo);
		}
	}

}
