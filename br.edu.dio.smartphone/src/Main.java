import NovoSmartPhone.NovoSmartPhone;

public class Main {
    public static void main(String[] args) {
        NovoSmartPhone smartphone = new NovoSmartPhone();

        smartphone.selecionarMusica("Enter Sandman");

        smartphone.iniciarReproducao();

        smartphone.acessarPagina(true,"www.google.com.br");

        smartphone.verListaTelefonica();
    }
}