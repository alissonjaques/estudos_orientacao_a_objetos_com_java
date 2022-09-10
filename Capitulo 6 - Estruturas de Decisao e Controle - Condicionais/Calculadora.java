public class Calculadora {
    
    private double numero1;
    private double numero2;
    private String simbolo;

    Calculadora(double umNumero1, double umNumero2, String umSimbolo){

        numero1 = umNumero1;
        numero2 = umNumero2;
        simbolo = umSimbolo;

    }

    Calculadora(double umNumero1, double umNumero2){

        this(umNumero1,umNumero2,"+");

    }
    
    Calculadora(double umNumero1, String umSimbolo){

        this(umNumero1,(double)1.0,umSimbolo);

    }

    Calculadora(double umNumero1){

        this(umNumero1,(double)1.0);

    }

    Calculadora(String umSimbolo){

        this((double)1.0,umSimbolo);

    }

    Calculadora(){

        this((double)1.0);

    }

}
