package redsocial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Publicacion {
	Connection cx;
	public Publicacion() {
		
	}
	public Connection insertarAlumno() {
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/redes_sociales", "root", "");
			System.out.println("CONEXION EXITOSA");
		} catch (SQLException e) {
			System.out.println("FALLO DE CONEXION");
			e.printStackTrace();
		}
		return cx;
	}
		
	}
	
	

