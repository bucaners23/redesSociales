package redsocial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;

public class crudComentario {

	public JFrame frmComentario;

	public crudComentario() {
		initialize();
	}

	private void initialize() {
		frmComentario = new JFrame();
		frmComentario.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmComentario.setTitle("Comentario");
		frmComentario.setBounds(100, 100, 584, 368);
		frmComentario.getContentPane().setLayout(null);
	}

}
