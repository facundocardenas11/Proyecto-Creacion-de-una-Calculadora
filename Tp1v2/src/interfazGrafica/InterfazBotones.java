package interfazGrafica;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Button;
import java.util.ArrayList;

public class InterfazBotones extends Controlinterfaz{
	private ArrayList<Button> botones=new ArrayList<Button>();
	private Button bCE			= new Button("CE");
	private Button bC			= new Button("C");
	private Button bBackspace 	= new Button("\u00AB");
	private Button bDividir 	= new Button("\u00F7");
	private Button bComa 		= new Button(".");
	private Button bIgual 		= new Button("=");
	private Button bSumar 		= new Button("+");
	private Button bRestar		= new Button("-");
	private Button bMultiplicar	= new Button("X");
	private Button b0=new Button("0");
	private Button b1=new Button("1");
	private Button b2=new Button("2");
	private Button b3=new Button("3");
	private Button b4=new Button("4");
	private Button b5=new Button("5");
	private Button b6=new Button("6");
	private Button b7=new Button("7");
	private Button b8=new Button("8");
	private Button b9=new Button("9");
	private int alto =27;
	private int ancho=39;
	
	InterfazBotones(){
		bCE.setBounds			(10 , 61 , ancho, alto);
		bC.setBounds			(59 , 61 , ancho, alto);
		bBackspace.setBounds	(108, 61 , ancho, alto);
		bDividir.setBounds		(157, 61 , ancho, alto);
		bRestar.setBounds		(157, 137, ancho, alto);
		bMultiplicar.setBounds	(157, 99 , ancho, alto);
		bSumar.setBounds		(157, 175, ancho, alto);
		bIgual.setBounds		(108, 213, 88   , alto);
		bComa.setBounds			(10	, 213, ancho, alto);
		b0.setBounds			(59	, 213, ancho, alto);
		b1.setBounds			(10	, 175, ancho, alto);
		b2.setBounds			(59	, 175, ancho, alto);
		b3.setBounds			(108, 175, ancho, alto);
		b4.setBounds			(10	, 137, ancho, alto);
		b5.setBounds			(59	, 137, ancho, alto);
		b6.setBounds			(108, 137, ancho, alto);
		b7.setBounds			(10	, 99 , ancho, alto);
		b8.setBounds			(59	, 99 , ancho, alto);
		b9.setBounds			(108, 99 , ancho, alto);
		botones.add(bCE);
		botones.add(bC);
		botones.add(bBackspace);
		botones.add(bDividir);
		botones.add(bRestar);
		botones.add(bMultiplicar);
		botones.add(bSumar);
		botones.add(bIgual);
		botones.add(bComa);
		botones.add(b0);
		botones.add(b1);
		botones.add(b2);
		botones.add(b3);
		botones.add(b4);
		botones.add(b5);
		botones.add(b6);
		botones.add(b7);
		botones.add(b8);
		botones.add(b9);
	}
	
	public void bufferBotones(JPanel contentPane,InterfazPantalla pantalla) {
		for (Button button : botones) {
			button.setFont(new Font("Tahoma", Font.BOLD, 12));
			contentPane.add(button);
			presionarBoton(button, pantalla);
		}
	}
	
	





}
