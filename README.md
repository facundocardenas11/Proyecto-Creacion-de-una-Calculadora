# proyectoCalculadora
Proyecto de una aplicacion que tenga la funcion de la Calculadora. Se adjunta documentacion del codigo en formato DOCX.
-++


Informe Trabajo Práctico
Programación III
					


Integrantes:

	Martin Velazquez (legajo) 39963713/2015
	Facundo Cardenas (legajo 42054625/2016)


Profesores:
●	Patricia Bagnes - pbagnes@ungs.edu.ar
●	Javier Marenco - jmarenco@ungs.edu.ar


Trabajo Práctico “ Calculadora”

Introducción y desarrollo del proyecto:

El trabajo propuesto por los docentes fue realizar la calculadora normal que podemos visualizar, con la interfaz de windows, que disponga de una lógica de producción como la que contiene el sistema operativo. La misma fue realizada con los requerimientos indicados en primera instancia. En este caso vamos a detallar la división de clases entre el diseño de Interfaces, Codigo de Negocio y control de Interfaz para que puedan visualizar en detalle el funcionamiento del código y el comportamiento del mismo.

				Clases correspondiente a la Interfaz

Calculadora:  Esta clase se encarga de inicializar la InterfazPantalla(Otra clase) y que la vista de la Ventana pueda verse.

InterfazPantalla: Clase encargada de cargar e inicializar los componentes de la pantalla en la aplicación.
bufferPantalla(JPanel contentPane): Agrega al panel donde se encuentra la pantalla su contenido, es decir, los datos definidos anteriormente.

SetPantalla(String text): Reinicia el contenido de la pantalla con lo que tenga el String pasado por parámetro.

 	getText(): Obtener el texto de la pantalla.

borrarPantalla(): Reinicia el texto de la pantalla dejándolo sin texto.

setPantallaOperacion(String operacion): Reinicio el texto de la pantalla con la operación que es enviada por parámetro.

getTextOperacion(): Obtener el texto de la operación.

borrarPantallaOperacion(): Borró el texto de la operación.


InterfazBotones: Clase encargada de cargar e inicializar los botones que vamos a visualizar en la interfaz.

bufferBotones(JPanel contentPane,InterfazPantalla pantalla):  Agrega al Panel de la aplicación y a la Pantalla, todos los botones anteriormente inicializados.

			Clase correspondiente al Control de la Interfaz


ControlInterfaz: Clase encargada de controlar los componentes de la interfaz y a raiz de esta, darle funcionalidad a la aplicación.

presionarBoton(Button button,InterfazPantalla pantalla): Método encargado de verificar que boton presiono el usuario y comprobar si es un Número, un Signo, igual o “CE, C, Backspace”.

esBotonNumero(Button button,InterfazPantalla pantalla): verifica si el botón presionado es un Número.

esBotonOperaciones(Button button, InterfazPantalla pantalla): Verifica si el botón presionado es un operador como por ejemplo: +,-,/.. y  en ese caso agrega el operador en la pantalla.
esBotonOperacion(Button button, InterfazPantalla pantalla): Se encarga de preguntar si  el botón que presionas es un Operador de cualquier signo.
esBotonIgual(Button button,InterfazPantalla pantalla): Verifica si el botón presionado es el igual ( = )

esBotonesRestantes(Button button, InterfazPantalla pantalla): Se encarga de verficar si se presiono los siguientes botones “CE, C, Backspace señalado de la siguiente manera: <<”;

QuitaCerosSobrantes(String numero): Se encarga de quitar el 0 para no agrandar el tamaño del double en la interfaz.

			Clase de la lógica del negocio

Lógica: Clase encarga de elaborar el código de producción de la aplicación, la lógica contenida hace referencia a cómo debe operar la calculadora.
	

	setOperacion(String operacion): Método encargado de validar la operación como activa y reiniciarla con el String pasado por parámetro.

	setNumero1(double numero1): Este método reinicia el numero1 (primer Operador en la calculadora) con el número pasado por parámetro.

	setNumero1(String numero1):  Este método reinicia el numero1 parseando a Double el String pasado por parámetro.

	setNumero2(double numero2): Este método reinicia el numero2 (segundo Operador en la calculadora) con el numero pasado por parametro

	setNumero2(String numero2): Este método reinicia el numero2 parseando a Double el String pasado por parámetro. 

	getResultado(): Se encarga Obtengo el resultado de operar

	operar(): Método encargado de operar en la calculadora

	setOperacionActiva(): Este método se encarga de reiniciar la variable OperacionActiva en false, esta variable es utilizada para consultar si es posible operar.

	getOperacionActiva(): Método encargado de Obtener valor booleano de OperacionActiva para determinar si es posible operar.

Problemática y Conclusiones:

Tuvimos inconvenientes al enfrentarnos al desafío de utilizar nuevos conceptos para innovar en la manera de programar y resolver algoritmos. No pudimos dividir las clases en una primera instancia para resolver la problemática. Luego utilizamos el concepto MVC (Model - VIew - Controller) y con este pudimos resolver la división de clases y responsabilidades , contar con un concepto fuertemente aplicado de  este patrón de diseño ayuda a no solo resolver algoritmos, sino también a diseñar soluciones antes de ejecutar una idea. 
