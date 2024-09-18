public interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada();
    void encerrarChamada();
    void enviarMensagem(String numero, String mensagem);
}
