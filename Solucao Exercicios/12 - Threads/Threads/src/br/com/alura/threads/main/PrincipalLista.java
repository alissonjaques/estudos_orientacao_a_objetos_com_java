package br.com.alura.threads.main;

import br.com.alura.threads.classes.TarefaAdicionarElemento;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class PrincipalLista {
    public static void main(String[] args) throws InterruptedException {
         // List<String> lista = new ArrayList<>();
         List<String> lista = new Vector<>();

        for (int i = 0; i < 100; i++) {
            new Thread(new TarefaAdicionarElemento(lista, i)).start();
        }

        Thread.sleep(2000);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i)); //utilizando get(i)
        }
    }
}