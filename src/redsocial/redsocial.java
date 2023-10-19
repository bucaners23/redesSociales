package redsocial;


import javax.swing.JFrame;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

/**
 * 
 */
public class redsocial {

	private JFrame frmPaginaPrincipal;
	private JButton btnPub;
	private JButton btnUsu;
	private JButton btnCom;

	public static void main(String[] args) {
		redsocial x = new redsocial();
		x.frmPaginaPrincipal.setVisible(true);
	}

	public redsocial() {
		initialize();
	}

	private void initialize() {
		frmPaginaPrincipal = new JFrame();
		frmPaginaPrincipal.setBackground(Color.DARK_GRAY);
		frmPaginaPrincipal.getContentPane().setBackground(new Color(0, 255, 255));
		frmPaginaPrincipal.setTitle("Pagina principal");
		frmPaginaPrincipal.setBounds(100, 100, 443, 300);
		frmPaginaPrincipal.setLocationRelativeTo(null);
		frmPaginaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPaginaPrincipal.getContentPane().setLayout(null);
		
		btnPub = new JButton("Publicacion");
		btnPub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crudPublicacion crudP=new crudPublicacion();
				crudP.frmPublicacion.setVisible(true);
				
			}
		});
		btnPub.setBounds(33, 65, 125, 44);
		frmPaginaPrincipal.getContentPane().add(btnPub);
		
		btnUsu = new JButton("Usuario");
		btnUsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crudUsuario crudU=new crudUsuario();
				crudU.frmCrudUsuario.setVisible(true);
	
			}
		});
		btnUsu.setBounds(249, 65, 118, 44);
		frmPaginaPrincipal.getContentPane().add(btnUsu);
		
		btnCom = new JButton("Comentario");
		btnCom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crudComentario crudC=new crudComentario();
				crudC.frmComentario.setVisible(true);
			}
		});
		btnCom.setBounds(145, 151, 118, 51);
		frmPaginaPrincipal.getContentPane().add(btnCom);
	}
}
