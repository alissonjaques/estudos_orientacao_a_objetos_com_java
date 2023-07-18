/**
 *  A classe ConstanteTrigonometrica é uma biblioteca de campos constantes.
 * 	Seus campos representam o valor do seno, cosseno e tangente de ângulos 
 *  em graus, de 0° a 330°, de 30° em 30°. Todos os seus campos são estáticos
 *  e públicos, isso garante o acesso aos mesmos diretamente pelas outras classes.
 *  
 *  @author Alisson Jaques 
 * 
 * */
public class ConstanteTrigonometrica { // declaração da classe

	/**
	 * 	Declaração dos campos da classe
	 * 
	 * */
	// constantes de seno
	final static public double sin0 = 0;										// O seno de 0°
	final static public double sin30 = 0.5;										// O seno de 30°
	final static public double sin60 = (0.5)*ConstantesMatematicas.raizDe3;		// O seno de 60°
	final static public double sin90 = 1;										// O seno de 90°
	final static public double sin120 = (0.5)*ConstantesMatematicas.raizDe3;	// O seno de 120°
	final static public double sin150 = 0.5;									// O seno de 150°
	final static public double sin180 = 0;										// O seno de 180°
	final static public double sin210 = -(0.5);									// O seno de 210°
	final static public double sin240 = (-0.5)*ConstantesMatematicas.raizDe3; 	// O seno de 240°
	final static public double sin270 = -1;										// O seno de 270°
	final static public double sin300 = (-0.5)*ConstantesMatematicas.raizDe3; 	// O seno de 300°
	final static public double sin330 = -(0.5);									// O seno de 330°
	
	// constantes de cosseno
	final static public double cos0 = 1;										// O cosseno de 0°
	final static public double cos30 = (0.5)*ConstantesMatematicas.raizDe3;		// O cosseno de 30°
	final static public double cos60 = 0.5;										// O cosseno de 60°
	final static public double cos90 = 0;										// O cosseno de 90°
	final static public double cos120 = -(0.5);									// O cosseno de 120°
	final static public double cos150 = (-0.5)*ConstantesMatematicas.raizDe3;	// O cosseno de 150°
	final static public double cos180 = -1;										// O cosseno de 180°
	final static public double cos210 = (-0.5)*ConstantesMatematicas.raizDe3;	// O cosseno de 210°
	final static public double cos240 = -(0.5);									// O cosseno de 240°
	final static public double cos270 = 0;										// O cosseno de 270°
	final static public double cos300 = 0.5;									// O cosseno de 300°
	final static public double cos330 = (0.5)*ConstantesMatematicas.raizDe3;	// O cosseno de 330°
	
	// constantes de tangente
	final static public double tan0 = sin0/cos0;								// A tangente de 0°
	final static public double tan30 = sin30/cos30;								// A tangente de 30°
	final static public double tan60 = sin60/cos60;								// A tangente de 60°
	final static public double tan90 = 0; 										// Sem definição
	final static public double tan120 = sin120/cos120;							// A tangente de 120°
	final static public double tan150 = sin150/cos150;							// A tangente de 150°
	final static public double tan180 = sin180/cos180;							// A tangente de 180°
	final static public double tan210 = sin210/cos210;							// A tangente de 210°
	final static public double tan240 = sin240/cos240;							// A tangente de 240°
	final static public double tan270 = 0;										// Sem definição							
	final static public double tan300 = sin300/cos300;							// A tangente de 300°
	final static public double tan330 = sin330/cos330;							// A tangente de 330°
		
} // fim da classe ConstanteTrigonometrica