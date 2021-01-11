package entregable3;
import java.util.Date;
public class Tareas {
	
	private Date fecha;
	private String titulo;
	private String estado;
	
	public void Tareas ( Date Fecha, String Titulo, String Estado) {
		 
		 this.fecha=Fecha;
		 this.titulo=Titulo;
		 this.estado=Estado;
		 
	}
	
	public Date getFecha() {
		return fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getEstado() {
		return estado;
	}
	
	public void setFecha(Date Fecha) {
		this.fecha=Fecha;
		
	}
	public void setTitulo(String Titulo) {
		this.titulo=Titulo;
		
	}
	public void setEstado(String Estado) {
		this.estado=Estado;
		
	}
	
	public String toString () {
		return titulo + " " + fecha + " " + estado;
	}
	

}
