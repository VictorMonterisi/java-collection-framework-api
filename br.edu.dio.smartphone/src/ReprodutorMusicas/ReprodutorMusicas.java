package ReprodutorMusicas;

public interface ReprodutorMusicas {
    public String nomeMusica = "";

    public void iniciarReproducao();
    public void pausarReproducao();
    public void selecionarMusica(String nomeMusica);
}
