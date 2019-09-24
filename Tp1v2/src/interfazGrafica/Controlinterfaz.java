package interfazGrafica;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logicaCalculadora.Logica;

public class Controlinterfaz{
	private Logica logica=new Logica();
	private boolean esPrimerBoton=true;
	
	public void presionarBoton(Button button,InterfazPantalla pantalla) {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(esBotonNumero(button,pantalla)) {
					pantalla.setPantalla(pantalla.getText()+button.getLabel());
				}
				if(esBotonOperaciones(button,pantalla)) {
					pantalla.setPantallaOperacion(button.getLabel());
				}
				if(esBotonIgual(button,pantalla)) {
					pantalla.setPantalla(QuitaCerosSobrantes(logica.getResultado()));
				}
				esBotonesRestantes(button,pantalla);
			}
		}
		);}
	
	private boolean esBotonNumero(Button button,InterfazPantalla pantalla){
		if(esPrimerBoton) {
			for(int i=0;i<10;i++){
				if(button.getLabel().contentEquals(".")&&(!pantalla.getText().contentEquals(""))) {
					esPrimerBoton=false;
					return true;
				}else{
					if((button.getLabel().contentEquals(""+i))||(button.getLabel().contentEquals("-"))){
						pantalla.borrarPantalla();
						esPrimerBoton=false;
						return true;
					}
				}
			}
		}else{
			for(int i=0;i<10;i++){
				if((button.getLabel().contentEquals(""+i))) {
				return true;
				}
			}
		}
		if(button.getLabel().contentEquals(".")&&
				(!pantalla.getText().isEmpty())&&
				(!pantalla.getText().contains("."))&&
				(!pantalla.getText().contentEquals("-"))&&
				(!pantalla.getText().contentEquals("No se puede dividir por 0!"))){
			return true;
		}
		return false;
	}
	
	private boolean esBotonOperaciones(Button button, InterfazPantalla pantalla) {
		if(esBotonOperacion(button,pantalla)) {
			logica.setNumero1(pantalla.getText());
			logica.setOperacion(button.getLabel());
			return true;
		}
		return false;
	}
	
	private boolean esBotonOperacion(Button button, InterfazPantalla pantalla) {
		if(!esBotonNumero(button,pantalla)) {
			if(button.getLabel().contentEquals("+")&&(!pantalla.getText().isEmpty())) {esPrimerBoton=true;return true;}
			if(button.getLabel().contentEquals("-")&&(!pantalla.getText().isEmpty())&&(pantalla.getTextOperacion().contentEquals(""))){esPrimerBoton=true;return true;}
			if(button.getLabel().contentEquals("\u00F7")&&(!pantalla.getText().isEmpty())) {esPrimerBoton=true;return true;}
			if(button.getLabel().contentEquals("X")&&(!pantalla.getText().isEmpty())) {esPrimerBoton=true;return true;}
		}
		return false;
	}
	
	private boolean esBotonIgual(Button button,InterfazPantalla pantalla) {
		if(button.getLabel().contentEquals("=")){
			logica.setNumero2(pantalla.getText());
			esPrimerBoton=true;
			logica.operar();;
			return true;
		}
		return false;
	}
	
	private boolean esBotonesRestantes(Button button, InterfazPantalla pantalla) {
		if(button.getLabel().contentEquals("CE")) {
			pantalla.borrarPantalla();
			return true;
		}
		if(button.getLabel().contentEquals("C")) {
			pantalla.borrarPantallaOperacion();
			pantalla.borrarPantalla();
			logica.setNumero1(0);
			logica.setNumero2(0);
			logica.setClearMemory();
			esPrimerBoton=true;
			return true;
		}
		if(button.getLabel().contentEquals("\u00AB")) {
			if(!pantalla.getText().contentEquals("")) {
			pantalla.setPantalla(pantalla.getText().substring(0,pantalla.getText().length()-1));
			return true;}
		}
		return false;
	}
	
	private String QuitaCerosSobrantes(String numero){
			int x = numero.indexOf('.');
			while((numero.length()>x)&&((numero.charAt(numero.length()-1)=='0')||(numero.charAt(numero.length()-1)=='.'))) {
				numero=numero.substring(0,numero.length()-1);
			}
			return numero;
	}
	
	
	
	
	
	
	
}
