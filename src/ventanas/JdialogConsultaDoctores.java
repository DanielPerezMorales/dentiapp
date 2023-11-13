package ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class JdialogConsultaDoctores extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField text_FlitrarDoctor;
	private JTable table_Doctores;

	public static void main(String[] args) {
		try {
			JdialogConsultaDoctores dialog = new JdialogConsultaDoctores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JdialogConsultaDoctores() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Iconos/Icono.png"));
		setResizable(false);
		setBounds(100, 100, 616, 489);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lbl_IdFiltrarDoctor = new JLabel("DNI Doctor :");
		lbl_IdFiltrarDoctor.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_IdFiltrarDoctor.setBounds(25, 25, 140, 25);
		contentPanel.add(lbl_IdFiltrarDoctor);
		
		table_Doctores = new JTable();
		table_Doctores.setBounds(25, 75, 550, 320);
		contentPanel.add(table_Doctores);
		
		JButton btn_FiltrarMaterial = new JButton("");
		btn_FiltrarMaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_FiltrarMaterial.setBounds(525, 25, 49, 23);
		btn_FiltrarMaterial.setIcon(new ImageIcon(JdialogConsultaDoctores.class.getResource("/Iconos/filtrar.png")));
		contentPanel.add(btn_FiltrarMaterial);
		
		text_FlitrarDoctor = new JTextField();
		text_FlitrarDoctor.setFont(new Font("Tahoma", Font.BOLD, 20));
		text_FlitrarDoctor.setColumns(10);
		text_FlitrarDoctor.setBounds(159, 25, 356, 25);
		contentPanel.add(text_FlitrarDoctor);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 415, 600, 35);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JframeGestionDoctores frame_anterior=new JframeGestionDoctores();
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
			Fondo.setIcon(new ImageIcon(JdialogConsultaDoctores.class.getResource("/Iconos/Fondo 600X450.png")));
			Fondo.setBounds(1, 1, 600, 449);
			contentPanel.add(Fondo);
		}
	}
}
