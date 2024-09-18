public interface NavegadorInternet {
    void abrirPagina(String url);
    void navegarPara(String url);
    void fecharPagina();
    void salvarFavorito(String url);
}
