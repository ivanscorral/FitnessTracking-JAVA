package datos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.LinkedList;

import javax.swing.JPanel;

public class GraphPanel extends JPanel {
	
	private LinkedList<GraphPoint> puntos;
	private Point p;
	
	private static int POINT_RADIUS = 15;
	
	public GraphPanel() {
		super();
		this.setBackground(Color.WHITE);
		this.puntos = new LinkedList<GraphPoint>();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLACK);
		for(GraphPoint p : puntos){
			g2d.drawOval(p.x, p.y, POINT_RADIUS, POINT_RADIUS);
			System.out.println("Point drawn at: x=" + p.x + ", y="+p.y);
			if(p.y - POINT_RADIUS > 0){
				g2d.drawString(p.getValues(p.DISTANCE), p.x + POINT_RADIUS + 3, p.y - POINT_RADIUS + g2d.getFontMetrics().getHeight());
			}else{
				g2d.drawString(p.getValues(p.DISTANCE), p.x + POINT_RADIUS + 3, p.y + POINT_RADIUS);
			}
		}
		
	}
	
	public void addPunto(GraphPoint p){
		this.puntos.add(p);
	}
	
	public void addPuntos(LinkedList<GraphPoint> puntos){
		this.puntos = puntos;
	}

}
