import java.util.Scanner;

public class PrincipalComputador {

	public static void main(String[] argumentos) {
		
		byte tamanhoTela, hd, tamanhoTela1, hd1;
		short memoriaPC, processadorPC, memoriaPC1, processadorPC1;
		
		System.out.println("Informe os dados para o primeiro computador:");
		System.out.println("Escolha uma frequência para o processador (600 Mhz, 800 Mhz ou 933 Mhz):");
		Scanner processador1 = new Scanner(System.in);
		processadorPC = processador1.nextShort();
		
		while((processadorPC != 600)&&(processadorPC != 800)&&(processadorPC != 933)) {
			
			System.out.println("Informe uma frequência válida!");
			processadorPC = processador1.nextShort();			
			
		}
		System.out.println("Escolha uma capacidade de memória principal (128 Mb, 256 Mb, 384 Mb ou 512Mb):");
		Scanner memoria1 = new Scanner(System.in);
		memoriaPC = memoria1.nextShort();
		while((memoriaPC != 128)&&(memoriaPC != 256)&&(memoriaPC != 384)&&(memoriaPC != 512)) {
			
			System.out.println("Informe uma capacidade válida!");
			memoriaPC = memoria1.nextShort();			
			
		}
		System.out.println("Informe a capacidade do disco rígido (20 Gb, 40 Gb ou 60 Gb):");
		Scanner disco1 = new Scanner(System.in);
		hd = disco1.nextByte();
		while((hd != 20)&&(hd != 40)&&(hd != 60)) {
			
			System.out.println("Informe uma capacidade válida!");
			hd = disco1.nextByte();			
			
		}
		System.out.println("Informe o tamanho da tela (15 polegadas ou 17 polegadas):");
		Scanner tamanho1 = new Scanner(System.in);
		tamanhoTela = tamanho1.nextByte();
		while((tamanhoTela != 15)&&(tamanhoTela != 17)) {
			
			System.out.println("Informe um tamanho válido!");
			tamanhoTela = tamanho1.nextByte();		
			
		}
		
		System.out.println();
		System.out.println("Informe os dados para o segundo computador:");
		System.out.println("Escolha uma frequência para o processador (600 Mhz, 800 Mhz ou 933 Mhz):");
		Scanner processador2 = new Scanner(System.in);
		processadorPC1 = processador2.nextShort();
		
		while((processadorPC1 != 600)&&(processadorPC1 != 800)&&(processadorPC1 != 933)) {
			
			System.out.println("Informe uma frequência válida!");
			processadorPC1 = processador2.nextShort();			
			
		}
		System.out.println("Escolha uma capacidade de memória principal (128 Mb, 256 Mb, 384 Mb ou 512Mb):");
		Scanner memoria2 = new Scanner(System.in);
		memoriaPC1 = memoria2.nextShort();
		while((memoriaPC1 != 128)&&(memoriaPC1 != 256)&&(memoriaPC1 != 384)&&(memoriaPC1 != 512)) {
			
			System.out.println("Informe uma capacidade válida!");
			memoriaPC1 = memoria2.nextShort();			
			
		}
		System.out.println("Informe a capacidade do disco rígido (20 Gb, 40 Gb ou 60 Gb):");
		Scanner disco2 = new Scanner(System.in);
		hd1 = disco2.nextByte();
		while((hd1 != 20)&&(hd1 != 40)&&(hd1 != 60)) {
			
			System.out.println("Informe uma capacidade válida!");
			hd1 = disco2.nextByte();			
			
		}
		System.out.println("Informe o tamanho da tela (15 polegadas ou 17 polegadas):");
		Scanner tamanho2 = new Scanner(System.in);
		tamanhoTela1 = tamanho2.nextByte();
		while((tamanhoTela1 != 15)&&(tamanhoTela1 != 17)) {
			
			System.out.println("Informe um tamanho válido!");
			tamanhoTela1 = tamanho2.nextByte();		
			
		}
		
		ModeloDeComputador asus = new ModeloDeComputador();
		ModeloDeComputador acer = new ModeloDeComputador();
		ModeloDeComputador samsung = new ModeloDeComputador();
		
		asus.inicializaComputador(hd, tamanhoTela, processadorPC, memoriaPC);
		acer.inicializaComputador(hd1, tamanhoTela1, processadorPC1, memoriaPC1);
		samsung.inicializaComputador((byte)60, (byte)17, (short)933, (short)384);
		
		if(acer.éIgual(asus)==true) {
			
			System.out.println("Os computadores, informados por você, são iguais!");
			
		}
		else {
			
			System.out.println("Os computadores, informados por você, são diferentes!");
			
		}
		
		System.out.println(asus);
		System.out.println(acer);
		System.out.println(samsung);
		
	}
			
}
