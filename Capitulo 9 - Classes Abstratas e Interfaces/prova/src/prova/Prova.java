/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author licin
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String argo[] = {"Carlos","da","Costa","Xavier"};
        int[] numeros = {334,568,123,796,225};
        System.out.println(dataFormatada("2018 05 01"));
        System.out.println(concateStrings(argo));
        System.out.println(retornaMaior(numeros));
        StringBuilder txtDados = new StringBuilder();
        txtDados.append("Este é um exemplo de dados para um arquivo");
        String filename = "src\\arquivos\\teste.txt";
        FileWriter writer = new FileWriter(filename);
       
    }

    public static String dataFormatada(String data) {
        int parte1;
        int parte2;
        String semBarra = data.replaceAll("/", "");
        String semBarraEspaco = semBarra.replaceAll(" ", "");
        parte1 = Integer.parseInt(semBarraEspaco.substring(0,4));
        parte2 = Integer.parseInt(semBarraEspaco.substring(4,8));
        if(parte1>parte2){
            return parte1+ " " + semBarraEspaco.substring(4,6);
        }
        else{
            return parte2 + " " + semBarraEspaco.substring(2,4);
        }
    }
    
    public static String concateStrings(String args[]){
        String concatenada = "";
        for(int i=0; i<args.length; i++){
            concatenada += args[i]+" ";
        }
        int tam = concatenada.length();
        return concatenada.substring(0,tam-1);
    }
    
    public static int retornaMaior(int numeros[]){
        int maior = numeros[0];
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]>maior){
                maior = numeros[i];
            }
        }
        return maior;
    }
}
