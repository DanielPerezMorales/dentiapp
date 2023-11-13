package ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Toolkit;

public class JdialogConsultasTratamientos extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField text_Tratamiento;
	private JTable table_Tratamientos;

	public static void main(String[] args) {
		try {
			JdialogConsultasTratamientos dialog = new JdialogConsultasTratamientos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JdialogConsultasTratamientos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JdialogConsultasTratamientos.class.getResource("/Iconos/diente.png")));
		setResizable(false);
		setTitle("Consulta Tratamientos");
		setBounds(100, 100, 616, 489);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			table_Tratamientos = new JTable();
			table_Tratamientos.setBounds(25, 75, 550, 320);
			contentPanel.add(table_Tratamientos);
		}
		{
			text_Tratamiento = new JTextField();
			text_Tratamiento.setFont(new Font("Tahoma", Font.BOLD, 20));
			text_Tratamiento.setColumns(10);
			text_Tratamiento.setBounds(175, 25, 340, 25);
			contentPanel.add(text_Tratamiento);
		}
		{
			JButton btn_FiltrarTratamiento = new JButton("");
			btn_FiltrarTratamiento.setIcon(new ImageIcon(JdialogConsultasTratamientos.class.getResource("/Iconos/filtrar.png")));
			btn_FiltrarTratamiento.setBounds(525, 25, 49, 23);
			contentPanel.add(btn_FiltrarTratamiento);
		}
		{
			JLabel lbl_Tratamiento = new JLabel("Tratamiento :");
			lbl_Tratamiento.setFont(new Font("Tahoma", Font.BOLD, 20));
			lbl_Tratamiento.setBounds(25, 25, 140, 25);
			contentPanel.add(lbl_Tratamiento);
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
					}
				});
				okButton.setBounds(430, 5, 60, 25);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBounds(500, 4, 80, 25);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JLabel Fondo = new JLabel("");
			Fondo.setIcon(new ImageIcon(JdialogConsultasTratamientos.class.getResource("/Iconos/Fondo 600X450.png")));
			Fondo.setBounds(0, 0, 600, 450);
			contentPanel.add(Fondo);
		}
	}

}
