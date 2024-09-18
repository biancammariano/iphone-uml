public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private int armazenamento;
    private String sistemaOperacional;

    public iPhone(String modelo, int armazenamento, String sistemaOperacional) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void pararMusica() {
        System.out.println("Música parada.");
    }

    @Override
    public void adicionarPlaylist(Playlist playlist) {
        System.out.println("Playlist adicionada.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada...");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void navegarPara(String url) {
        System.out.println("Navegando para: " + url);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Página fechada.");
    }

    @Override
    public void salvarFavorito(String url) {
        System.out.println("URL " + url + " salva como favorito.");
    }
}

