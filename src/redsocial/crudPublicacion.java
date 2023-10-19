package redsocial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class crudPublicacion {

	public JFrame frmPublicacion;

	public crudPublicacion() {
		initialize();
	}

	private void initialize() {
		frmPublicacion = new JFrame();
		frmPublicacion.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmPublicacion.setTitle("Publicacion");
		frmPublicacion.setBounds(100, 100, 634, 368);
		frmPublicacion.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID USER :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 22, 119, 25);
		frmPublicacion.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(139, 22, 135, 25);
		frmPublicacion.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Id Publicacion :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 79, 181, 25);
		frmPublicacion.getContentPane().add(lblNewLabel_2);
	}

}
