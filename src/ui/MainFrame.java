package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datos.Actividad;
import datos.Entrenamiento;
import datos.Grafico;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		ArrayList<Entrenamiento> entrenamientos = new ArrayList<Entrenamiento>();
		Actividad bici = new Actividad(1, "Bici", true);
		entrenamientos.add(new Entrenamiento(5, 50, 200, 1, bici));
		entrenamientos.add(new Entrenamiento(5, 50, 400, 1, bici));
		entrenamientos.add(new Entrenamiento(5, 50, 600, 1, bici));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		Grafico duracion = new Grafico(entrenamientos, Grafico.SORT_BY_DISTANCE, 0, 0);
		System.out.println(duracion.getGraph().getBounds());
		contentPane.add(duracion.getGraph());
	}

}
