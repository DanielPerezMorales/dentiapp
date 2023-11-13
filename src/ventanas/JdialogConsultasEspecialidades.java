package ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JdialogConsultasEspecialidades extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txt_Especialidad;
	private JTable table_Especialidades;

	public static void main(String[] args) {
		try {
			JdialogConsultasEspecialidades dialog = new JdialogConsultasEspecialidades();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JdialogConsultasEspecialidades() {
		setResizable(false);
		setTitle("Especialidades");
		setIconImage(Toolkit.getDefaultToolkit().getImage(JdialogConsultasEspecialidades.class.getResource("/Iconos/diente.png")));
		setBounds(100, 100, 616, 489);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		table_Especialidades = new JTable();
		table_Especialidades.setBounds(25, 75, 550, 320);
		contentPanel.add(table_Especialidades);
		{
			JLabel lbl_Especialidad = new JLabel("Especialidad :");
			lbl_Especialidad.setFont(new Font("Tahoma", Font.BOLD, 20));
			lbl_Especialidad.setBounds(25, 25, 150, 25);
			contentPanel.add(lbl_Especialidad);
		}
		{
			JButton btn_FiltrarEspecialidad = new JButton("");
			btn_FiltrarEspecialidad.setIcon(new ImageIcon(JdialogConsultasEspecialidades.class.getResource("/Iconos/filtrar.png")));
			btn_FiltrarEspecialidad.setBounds(525, 25, 50, 23);
			contentPanel.add(btn_FiltrarEspecialidad);
		}
		{
			txt_Especialidad = new JTextField();
			txt_Especialidad.setFont(new Font("Tahoma", Font.BOLD, 20));
			txt_Especialidad.setBounds(175, 25, 340, 25);
			contentPanel.add(txt_Especialidad);
			txt_Especialidad.setColumns(10);
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
				cancelButton.setBounds(500, 5, 80, 25);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JLabel Fondo = new JLabel("");
			Fondo.setIcon(new ImageIcon(JdialogConsultasEspecialidades.class.getResource("/Iconos/Fondo 600X450.png")));
			Fondo.setBounds(0, 0, 600, 450);
			contentPanel.add(Fondo);
		}
	}
}
