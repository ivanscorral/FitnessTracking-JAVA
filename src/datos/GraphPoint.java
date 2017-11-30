package datos;

import java.awt.Point;

public class GraphPoint extends Point {
	
	private Entrenamiento entrenamiento;
	
	public static final int DURATION = 0;
	public static final int DISTANCE = 1;
	public static final int INTENSITY = 2;
	
	public GraphPoint(int x, int y, Entrenamiento entrenamiento){
		super(x, y);
		this.entrenamiento = entrenamiento;
	}
	
	public String getActividad(){
		return this.entrenamiento.getActividad().getNombre();
	}
	
	public String getValues(int option){
		String result = "Error.";
		switch (option) {
		case DURATION:
			result = "Duracion: " + entrenamiento.getDuracion();
			break;
		case DISTANCE:
			result = "Distancia: " + entrenamiento.getDistancia() + "m";
			break;
		case INTENSITY:
			result = "Intensidad: " + entrenamiento.getIntensidad();
			break;
		}
		return result;
	}

}
