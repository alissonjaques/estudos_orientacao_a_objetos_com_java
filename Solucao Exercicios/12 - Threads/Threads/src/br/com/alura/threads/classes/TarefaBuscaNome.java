package br.com.alura.threads.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaNome implements Runnable{
    private String caminhoArquivo;
    private String nome;

    public TarefaBuscaNome(String caminhoArquivo, String nome) {
        this.caminhoArquivo = caminhoArquivo;
        this.nome = nome;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(new File(caminhoArquivo));

            int numeroLinha = 1;

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();

                if (linha.toLowerCase().contains(nome.toLowerCase())) {
                    System.out.println(getNomeArquivo(caminhoArquivo) + " - " + numeroLinha + " - " + linha);
                }

                numeroLinha++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public String getNomeArquivo(String caminhoArquivo){
        String[] diretorios = caminhoArquivo.split("//");
        return diretorios[diretorios.length - 1];
    }
}
