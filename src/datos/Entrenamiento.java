package datos;

import java.util.Date;

public class Entrenamiento {
	
	private int id;
	private double duracion;
	private int distancia;
	private int intensidad;
	private Date fecha;
	private Actividad actividad;
	
	public Entrenamiento(int id, double duracion, int distancia, int intensidad, Actividad actividad) {
		this.id = id;
		this.duracion = duracion;
		this.distancia = distancia;
		this.intensidad = intensidad;
		this.actividad = actividad;
	}

	public int getId() {
		return id;
	}

	public double getDuracion() {
		return duracion;
	}

	public int getDistancia() {
		return distancia;
	}

	public int getIntensidad() {
		return intensidad;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public void setIntensidad(int intensidad) {
		this.intensidad = intensidad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}
	
	
	
	
	

}
