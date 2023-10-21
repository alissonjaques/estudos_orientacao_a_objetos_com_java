package classes;

import interfaces.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo o número: " + numero);
    }

    @Override
    public void iniciarCorreioDeVoz(String numero) {
        System.out.println("Iniciando correio de voz para o número: " + numero);
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrir a pagina do navegador com a url: " + url);
    }

    @Override
    public void atualizarPagina(String url) {
        System.out.println("Atualizar a pagina do navegador com a url: " + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando nova aba no navegador.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }
}
