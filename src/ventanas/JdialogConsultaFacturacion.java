package ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class JdialogConsultaFacturacion extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTable table;

	public static void main(String[] args) {
		try {
			JdialogConsultaFacturacion dialog = new JdialogConsultaFacturacion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JdialogConsultaFacturacion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JdialogConsultaFacturacion.class.getResource("/Iconos/diente.png")));
		setTitle("Pacientes");
		setResizable(false);
		setBounds(100, 100, 616, 489);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
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
			JLabel lbl_DniFiltrarDoctor = new JLabel("Paciente :");
			lbl_DniFiltrarDoctor.setFont(new Font("Tahoma", Font.BOLD, 20));
			lbl_DniFiltrarDoctor.setBounds(25, 25, 105, 25);
			contentPanel.add(lbl_DniFiltrarDoctor);
		}
		{
			JButton btn_FiltrarMaterial = new JButton("");
			btn_FiltrarMaterial.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btn_FiltrarMaterial.setIcon(new ImageIcon(JdialogConsultaFacturacion.class.getResource("/Iconos/filtrar.png")));
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
				okButton.setBounds(430, 5, 60, 25);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBounds(500, 5, 80, 25);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(JdialogConsultaFacturacion.class.getResource("/Iconos/Fondo 600X450.png")));
			lblNewLabel.setBounds(0, 0, 600, 450);
			contentPanel.add(lblNewLabel);
		}
	}

}
