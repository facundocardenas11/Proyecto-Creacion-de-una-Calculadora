package logicaCalculadora;
import java.awt.EventQueue;
import interfazGrafica.InterfazGrafica;

public class Calculadora {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGrafica frame=new InterfazGrafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
