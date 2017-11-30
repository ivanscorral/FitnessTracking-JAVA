package datos;

import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;

import javax.swing.JPanel;

public class GraphPanel extends JPanel {
	
	private LinkedList<Point> puntos;
	
	private static int POINT_RADIUS = 5;
	
	public GraphPanel() {
		super();
		this.puntos = new LinkedList<Point>();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		while(!this.puntos.isEmpty()) {
			Point p = puntos.pop();
			g.drawOval(p.x, p.y, POINT_RADIUS, POINT_RADIUS);
		}
		
	}

}
