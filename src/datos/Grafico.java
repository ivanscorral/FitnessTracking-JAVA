package datos;

import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Grafico {
		
	private JPanel panel;
	
	private double xScale;
	private double yScale;
	private int sortType;
	
	public static final int SORT_BY_DURATION = 0;
	public static final int SORT_BY_DISTANCE = 1;
	public static final int SORT_BY_INTENSITY = 2;
	
	//Tamaño de la ventana
	private static int X_SIZE = 800;
	private static int Y_SIZE = 400;
	
	public Grafico(ArrayList<Entrenamiento> datos, int sortType, int x, int y) {
		this.panel = new JPanel();
		this.panel.setBounds(x, y, X_SIZE, Y_SIZE);
		this.sortType = sortType;
		this.yScale = calculateScale(datos);
		this.xScale = X_SIZE / datos.size();
	}
	
	private double calculateScale(ArrayList<Entrenamiento> datos) {
		double result = 1;
		double maxValue = -1;
		switch (sortType) {
		case SORT_BY_DURATION:
			for(Entrenamiento e : datos) {
				if(e.getDuracion() > result) {
					maxValue = e.getDuracion();
				}
			}
			break;
		case SORT_BY_DISTANCE:
			for(Entrenamiento e : datos) {
				if(e.getDistancia() > result) {
					maxValue = e.getDistancia();
				}
			}
			break;
		case SORT_BY_INTENSITY:
			for(Entrenamiento e : datos) {
				if(e.getDistancia() > result) {
					maxValue = e.getDistancia();
				}
			}
			break;
		}
		
		result = X_SIZE / maxValue;
		
		return result;
	}
	
	private void drawGraph() {
		
		Graphics2D g2D = (Graphics2D) g;
		
	}
	
}
