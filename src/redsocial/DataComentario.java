package redsocial;

public class DataComentario {
	int idCom;
	int idPub;
	int idUser;
	String texto;
	String fecha;
	public DataComentario() {
		
	}
	public int getIdCom() {
		return idCom;
	}
	public void setIdCom(int idCom) {
		this.idCom = idCom;
	}
	public int getIdPub() {
		return idPub;
	}
	public void setIdPub(int idPub) {
		this.idPub = idPub;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	

}
