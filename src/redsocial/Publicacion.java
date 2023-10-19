package redsocial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Publicacion {
	Connection cx;
	public Publicacion() {
		
	}
	public Connection conectar() {
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/redes_sociales", "root", "");
			System.out.println("CONEXION EXITOSA");
		} catch (SQLException e) {
			System.out.println("FALLO DE CONEXION");
			e.printStackTrace();
		}
		return cx;
	}
	public boolean insertarDataUsusario(DataUsuario u) {
		PreparedStatement ps;
		try {
			ps=conectar().prepareStatement("INSERT INTO DataUsuario VALUES(null,?,?,?,?)");
			ps.setString(1,u.getCorreo());
			ps.setString(2,u.getTelefono());
			ps.setString(3,u.getContraseña());
			ps.setString(4,u.getNombre());
			ps.execute();
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		
		return false;
		}
		
	}
		
	}
	
	

