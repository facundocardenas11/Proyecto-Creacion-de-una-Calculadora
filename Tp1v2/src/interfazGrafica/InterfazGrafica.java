package interfazGrafica;
import java.awt.SystemColor;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class InterfazGrafica extends JFrame{
	private JPanel contentPane;
	private InterfazPantalla pantalla;
	private InterfazBotones botones;
	private Controlinterfaz control;
	
	public InterfazGrafica() {
		control = new Controlinterfaz();
		setForeground(SystemColor.activeCaption);
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 212, 280);
		bufferInterfaz();
	}
	
	private void bufferInterfaz(){
		contentPane=new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		pantalla=new InterfazPantalla();
		pantalla.bufferPantalla(contentPane);
		botones=new InterfazBotones();
		botones.bufferBotones(contentPane,pantalla);
	}
	
}
