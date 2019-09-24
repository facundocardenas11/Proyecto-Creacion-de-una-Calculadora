package interfazGrafica;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;

public class InterfazPantalla{
	private JTextField pantalla = new JTextField();
	private JTextField pantallaOperacion = new JTextField();
	
	InterfazPantalla(){
		pantalla.setHorizontalAlignment(SwingConstants.TRAILING);
		pantalla.setFont(new Font("Tahoma", Font.BOLD, 12));
		pantalla.setEditable(false);
		pantalla.setBounds(10, 10, 186, 27);
		pantalla.setColumns(10);
		pantalla.setText("0");
		pantallaOperacion.setHorizontalAlignment(SwingConstants.CENTER);
		pantallaOperacion.setFont(new Font("Tahoma", Font.BOLD, 12));
		pantallaOperacion.setEditable(false);
		pantallaOperacion.setBounds(10, 38, 20, 20);
		pantallaOperacion.setColumns(10);
		pantallaOperacion.setBackground(SystemColor.activeCaption);
	}
	
	public void bufferPantalla(JPanel contentPane) {
		contentPane.add(pantalla);
		contentPane.add(pantallaOperacion);
	}
	
	public void setPantalla(String text) {
		pantalla.setText(text);
	}
	
	public String getText() {
		return pantalla.getText();
	}
	
	public void borrarPantalla() {
		pantalla.setText("");
	}
	
	public void setPantallaOperacion(String operacion) {
		pantallaOperacion.setText(operacion);
	}
	
	public String getTextOperacion(){
		return pantallaOperacion.getText();
	}
	
	public void borrarPantallaOperacion() {
		pantallaOperacion.setText("");
	}
}
