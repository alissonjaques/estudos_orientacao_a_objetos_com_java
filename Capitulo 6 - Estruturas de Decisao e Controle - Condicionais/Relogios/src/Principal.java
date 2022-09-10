
public class Principal {

	public static void main(String[] args) {
		
		Relogio digital1 = new Relogio((byte)13,(byte)54,(byte)55);
		Relogio digital2 = new Relogio((byte)13,(byte)54,(byte)55);
		Relogio digital3 = new Relogio();
		Relogio digital4 = new Relogio((byte)15,(byte)20);
		Relogio digital5 = Relogio.fabricaDeRelogios((byte)23,(byte)24,(byte)43);
		Relogio digital6 = Relogio.fabricaDeRelogios();
		digital6 = digital1;
		
		System.out.println(digital1);
		digital2.setaHorario();
		System.out.println(digital2);
		System.out.println(digital3);
		System.out.println(digital4);
		System.out.println(digital5);
		System.out.println(digital6);
		
		System.out.println(digital1.retornaHoras());
		System.out.println(digital4.retornaMinutos());
		System.out.println(digital1.retornaSegundos());		
	
	}	
	
}
