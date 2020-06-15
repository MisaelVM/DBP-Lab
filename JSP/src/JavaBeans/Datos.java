package JavaBeans;

import java.util.Date;
import java.io.Serializable;

public class Datos implements Serializable {
	private static final long serialVersionUID = 1L;
	Date fecha;
	//public int fecha;
	//public static int contador;
	int contador;
	String mensaje;
	
	public Datos() {
		this.mensaje = "Esto es una expresion";
		this.fecha = new Date();
		this.contador = 7;
	}
	
	public void setMensaje(String m) {
		this.mensaje = m;
	}
	
	public void setContador(int x) {
		this.contador = x;
	}
	
	public void setFecha(int d) {
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public int getContador() {
		return contador;
	}
	
	public Date getFecha() {
		return fecha;
	}
}