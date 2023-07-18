
public class PrincipalSite {

	public static void main(String[] argumentos) {
		
		
		SiteNaInternet google = new SiteNaInternet("Google","www.google.com");
		SiteNaInternet alura = new SiteNaInternet("Alura","www.alura.com.br");
		SiteNaInternet amazon = new SiteNaInternet("Amazon");
		SiteNaInternet mercadoLivre = new SiteNaInternet();
		
		google.acessa();
		google.acessa();
		
		alura.acessa();
		alura.acessa();
		alura.acessa();
		
		amazon.acessa();
		
		System.out.println(google);
		System.out.println(alura);
		System.out.println(amazon);
		System.out.println(mercadoLivre);
		
	}
	
	
}
