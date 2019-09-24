package logicaCalculadora;

public class Logica {
	private double numero1;
	private double numero2;
	private double resultado;
	private String operacion;
	private boolean primerSegundoNumero=true;
	
	public void setOperacion(String operacion) {
		this.operacion=operacion;
	}
	
	public void setNumero1(double numero1) {
		this.numero1=numero1;}
	
	public void setNumero1(String numero1) {
		if(!((numero1.contentEquals("No se puede dividir por 0!"))||(numero1.contentEquals("-"))||
			numero1.contentEquals(""))){
			this.numero1=Double.parseDouble(numero1);
		}
	}
	
	public void setNumero2(double numero2) {
		this.numero2=numero2;
	}
	
	public void setNumero2(String numero2) {
		if(!((numero2.contentEquals("No se puede dividir por 0!"))||(numero2.contentEquals("-"))||
				numero2.contentEquals(""))){
			this.numero2=Double.parseDouble(numero2);
		}
	}
	
	public String getResultado() {
		String basic=""+resultado;
		StringBuilder resultado = new StringBuilder(basic);
			if(resultado.toString().contentEquals("Infinity")||(resultado.toString().contentEquals("-Infinity"))){
				return "No se puede dividir por 0!";
			}
			if(resultado.toString().contentEquals("NaN")) {
				return "No se puede dividir por 0!";
			}
		return resultado.toString();
	}
	
	public void operar() {
			if(operacion=="+") {
				resultado=numero1+numero2;
			}
			if(operacion=="-") {
				if(numero2<0){
					resultado=numero1+numero2;
				}else{
				resultado=numero1-numero2;
				}
			}
			if(operacion=="\u00F7") {
				resultado=numero1/numero2;
			}
			if(operacion=="X") {
				resultado=numero1*numero2;
			}
			if(primerSegundoNumero) {numero1=numero2;primerSegundoNumero=false;}
	}

	public void setClearMemory() {
		numero1=0;
		numero2=0;
		resultado=0;
		operacion=null;
		primerSegundoNumero=false;
	}

}