package datos;


public class Actividad {
	
	private int id;
	private String nombre;
	private boolean hasIntensidad;
	
	public Actividad(int id, String nombre, boolean hasIntensidad) {
		this.id = id;
		this.nombre = nombre;
		this.hasIntensidad = hasIntensidad;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isHasIntensidad() {
		return hasIntensidad;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setHasIntensidad(boolean hasIntensidad) {
		this.hasIntensidad = hasIntensidad;
	}

}
