package NavegadorInternet;

public interface NavegadorInternet {
    public Boolean conexao = false;
    public String destino = "";

    public void acessarPagina(Boolean conexao, String destino);
    public void atualizar();
    public void fechar();
}
