package redsocial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

public class crudUsuario {

	public JFrame frmCrudUsuario;
	private JLabel lblUser;
	private JTextField txtCorreo;
	private JTextField txtTel;
	private JTextField txtContra;
	private JTextField txtNom;
	private JButton btnAgregar;
	private JTable table;
	DefaultTableModel model = new DefaultTableModel();

	public crudUsuario() {
		initialize();
	}

	private void initialize() {
		frmCrudUsuario = new JFrame();
		frmCrudUsuario.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmCrudUsuario.setTitle("Crud Usuario");
		frmCrudUsuario.setBounds(100, 100, 821, 658);
		frmCrudUsuario.setLocationRelativeTo(null);
		frmCrudUsuario.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("ID USERS:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(35, 53, 117, 18);
		frmCrudUsuario.getContentPane().add(lblNewLabel);

		lblUser = new JLabel("");
		lblUser.setBackground(Color.WHITE);
		lblUser.setForeground(Color.WHITE);
		lblUser.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblUser.setBounds(162, 53, 128, 18);
		frmCrudUsuario.getContentPane().add(lblUser);

		JLabel lblCorreo = new JLabel("Correo     :");
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCorreo.setBounds(35, 82, 108, 18);
		frmCrudUsuario.getContentPane().add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtCorreo.getText().length()>=50) {
					e.consume();
				}
			}
		});
		txtCorreo.setBounds(194, 85, 245, 20);
		frmCrudUsuario.getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Telefono :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(35, 111, 117, 18);
		frmCrudUsuario.getContentPane().add(lblNewLabel_1_1);

		txtTel = new JTextField();
		txtTel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtTel.getText().length()>=50) {
					e.consume();
				}
			}
		});
		txtTel.setColumns(10);
		txtTel.setBounds(194, 114, 245, 20);
		frmCrudUsuario.getContentPane().add(txtTel);

		JLabel lblNewLabel_1_2 = new JLabel("Contraseña :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(35, 137, 132, 18);
		frmCrudUsuario.getContentPane().add(lblNewLabel_1_2);

		txtContra = new JTextField();
		txtContra.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtContra.getText().length()>=50) {
					e.consume();
				}
			}
		});
		txtContra.setColumns(10);
		txtContra.setBounds(194, 142, 245, 20);
		frmCrudUsuario.getContentPane().add(txtContra);

		JLabel lblNewLabel_1_3 = new JLabel("Nombre :");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(35, 170, 117, 18);
		frmCrudUsuario.getContentPane().add(lblNewLabel_1_3);

		txtNom = new JTextField();
		txtNom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtNom.getText().length()>=50) {
					e.consume();
				}
			}
		});
		txtNom.setColumns(10);
		txtNom.setBounds(194, 171, 245, 20);
		frmCrudUsuario.getContentPane().add(txtNom);

		btnAgregar = new JButton("Agegar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DataUsuario x=new DataUsuario();
					x.setCorreo(txtCorreo.getText());
					x.setTelefono(txtTel.getText());
					x.setCorreo(txtContra.getText());
					x.setNombre(txtNom.getText());
					if(x.insertarDataUsusario()) {
						JOptionPane.showMessageDialog(null,"Se inserto correctamente");
					}else {
						JOptionPane.showMessageDialog(null, "ERROR 404 ;(");
					}
				}catch(Exception e2){
					JOptionPane.showMessageDialog(null,"ERROR 404" );
				}
			}
		});
		btnAgregar.setBounds(525, 42, 108, 29);
		frmCrudUsuario.getContentPane().add(btnAgregar);

		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setBounds(671, 43, 108, 26);
		frmCrudUsuario.getContentPane().add(btnActualizar);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setBounds(525, 81, 108, 29);
		frmCrudUsuario.getContentPane().add(btnEliminar);

		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(671, 82, 108, 27);
		frmCrudUsuario.getContentPane().add(btnBorrar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 212, 743, 390);
		frmCrudUsuario.getContentPane().add(scrollPane);

		table = new JTable();
		model.addColumn("Id");
		model.addColumn("Correo");
		model.addColumn("Contraseña");
		model.addColumn("Nombre");
		table.setModel(model);
		scrollPane.setViewportView(table);
	}
}
