public class Relogio{
	
	private double segundos;
	
	/**Relogio(double tempo){
		
		segundos = tempo;
				
	}
	
	Relogio(){
		
		segundos = 0.0;
		
	}*/
	
	public static String relogio(int segundos){
				
		int restoHora, restoMinutos, minutos, segundo, horaInteira, minutosInteiros;
		String h, m, s;
		
		restoHora = segundos % 3600;
		minutos = restoHora;
		restoMinutos = minutos % 60;
		segundo = restoMinutos;
		
		horaInteira = (segundos - restoHora)/3600;
		minutosInteiros = (minutos - restoMinutos)/60;
		
		if(horaInteira>=0 && horaInteira<=9) {
			
			h = "0"+horaInteira;
			
		}
		else {
			
			
			h = ""+horaInteira;
			
		}
		
		if(minutosInteiros>=0 && minutosInteiros<=9) {
			
			m = "0"+minutosInteiros;
			
		}
		else {
			
			
			m = ""+minutosInteiros;
			
		}
		
		if(segundo>=0 && segundo<=9) {
	
			s = "0"+segundo;
	
		}
		else {
	
	
			s = ""+segundo;
	
		}
		String relogio = h + ":" + m + ":" + s;
		
		return relogio;
		
		
	}
		
}