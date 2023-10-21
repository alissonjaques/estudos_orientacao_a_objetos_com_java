package interfaces;

public interface AparelhoTelefonico extends NavegadorDeInternet, ReprodutorMusical {
    public void ligar(String numero);
    public void atender(String numero);
    public void iniciarCorreioDeVoz(String numero);
}
