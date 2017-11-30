package datos;

import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JPanel;

public class Grafico {
		
	private GraphPanel panel;
	
	private double xScale;
	private double yScale;
	private int sortType;
	private ArrayList<Entrenamiento> datos;
	
	public static final int SORT_BY_DURATION = 0;
	public static final int SORT_BY_DISTANCE = 1;
	public static final int SORT_BY_INTENSITY = 2;
	
	//Tamaño de la ventana
	private static int X_SIZE = 800;
	private static int Y_SIZE = 400;
	
	public Grafico(ArrayList<Entrenamiento> datos, int sortType, int x, int y) {
		this.datos = datos;
		this.panel = new GraphPanel();
		this.panel.setBounds(x, y, X_SIZE, Y_SIZE);
		this.sortType = sortType;
		this.yScale = calculateScale(datos);
		this.xScale = X_SIZE / datos.size();
		drawGraph(generatePoints());		
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
				
		result = Y_SIZE / maxValue;
		
		
		return result;
	}
	
	private void drawGraph(LinkedList<GraphPoint> puntos) {
		this.panel.addPuntos(puntos);
		this.panel.repaint();
	}
	
	private LinkedList<GraphPoint> generatePoints(){
		LinkedList<GraphPoint> puntos = new LinkedList<GraphPoint>();
		switch (sortType) {
		case SORT_BY_DURATION:
			for(int i = 0; i < datos.size(); i++){
				int x = (int) (xScale * i);
				int y = Y_SIZE - ((int) (datos.get(i).getDuracion() / yScale));
				GraphPoint add = new GraphPoint(x, y, datos.get(i));
				puntos.add(add);
			}
			break;
		case SORT_BY_DISTANCE:
			for(int i = 0; i < datos.size(); i++){
				int x = (int) (xScale * i);
				int y = Y_SIZE - ((int) (datos.get(i).getDistancia() * yScale));
				GraphPoint add = new GraphPoint(x, y, datos.get(i));
				puntos.add(add);
			}
			break;
		case SORT_BY_INTENSITY:
			for(int i = 0; i < datos.size(); i++){
				int x = (int) (xScale * i);
				int y = Y_SIZE - ((int) (datos.get(i).getIntensidad() / yScale));
				GraphPoint add = new GraphPoint(x, y, datos.get(i));
				puntos.add(add);
			}
			break;
	}
		return puntos;
	}
	
	public GraphPanel getGraph(){
		return this.panel;
	}
	
}
