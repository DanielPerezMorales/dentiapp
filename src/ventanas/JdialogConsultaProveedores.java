package ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class JdialogConsultaProveedores extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JTextField textField;

	public static void main(String[] args) {
		try {
			JdialogConsultaProveedores dialog = new JdialogConsultaProveedores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JdialogConsultaProveedores() {
		setTitle("Pacientes");
		setIconImage(Toolkit.getDefaultToolkit().getImage(JdialogConsultaProveedores.class.getResource("/Iconos/diente.png")));
		setResizable(false);
		setBounds(100, 100, 616, 489);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lbl_DniFiltrarDoctor = new JLabel("Paciente :");
			lbl_DniFiltrarDoctor.setFont(new Font("Tahoma", Font.BOLD, 20));
			lbl_DniFiltrarDoctor.setBounds(25, 25, 105, 25);
			contentPanel.add(lbl_DniFiltrarDoctor);
		}
		{
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.BOLD, 20));
			textField.setColumns(10);
			textField.setBounds(140, 25, 375, 25);
			contentPanel.add(textField);
		}
		{
			table = new JTable();
			table.setBounds(25, 75, 550, 320);
			contentPanel.add(table);
		}
		{
			JButton btn_FiltrarMaterial = new JButton("");
			btn_FiltrarMaterial.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btn_FiltrarMaterial.setIcon(new ImageIcon(JdialogConsultaProveedores.class.getResource("/Iconos/filtrar.png")));
			btn_FiltrarMaterial.setBounds(525, 25, 49, 23);
			contentPanel.add(btn_FiltrarMaterial);
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
						JdialogConsultaProveedores frame_anterior= new JdialogConsultaProveedores();
						frame_anterior.setVisible(true);
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
			Fondo.setIcon(new ImageIcon(JdialogConsultaProveedores.class.getResource("/Iconos/Fondo 600X450.png")));
			Fondo.setBounds(0, 0, 600, 450);
			contentPanel.add(Fondo);
		}
	}

}
