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

public class JdialogConsultasMateriales extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTable table;

	public static void main(String[] args) {
		try {
			JdialogConsultasMateriales dialog = new JdialogConsultasMateriales();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JdialogConsultasMateriales() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JdialogConsultasMateriales.class.getResource("/Iconos/diente.png")));
		setTitle("Materiales");
		setResizable(false);
		setBounds(100, 100, 616, 489);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btn_FiltrarTratamiento = new JButton("");
			btn_FiltrarTratamiento.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btn_FiltrarTratamiento.setIcon(new ImageIcon(JdialogConsultasMateriales.class.getResource("/Iconos/filtrar.png")));
			btn_FiltrarTratamiento.setBounds(525, 25, 50, 23);
			contentPanel.add(btn_FiltrarTratamiento);
		}
		{
			JLabel lbl_Especialidad = new JLabel("Codigo :");
			lbl_Especialidad.setFont(new Font("Tahoma", Font.BOLD, 20));
			lbl_Especialidad.setBounds(25, 25, 95, 25);
			contentPanel.add(lbl_Especialidad);
		}
		{
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.BOLD, 20));
			textField.setColumns(10);
			textField.setBounds(130, 25, 385, 25);
			contentPanel.add(textField);
		}
		{
			table = new JTable();
			table.setBounds(25, 75, 550, 320);
			contentPanel.add(table);
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
						JframeGestionMateriales frame_anterior=new JframeGestionMateriales();
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
				cancelButton.setBounds(500, 5, 80, 23);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(JdialogConsultasMateriales.class.getResource("/Iconos/Fondo 600X450.png")));
			lblNewLabel.setBounds(0, 0, 600, 450);
			contentPanel.add(lblNewLabel);
		}
	}

}
