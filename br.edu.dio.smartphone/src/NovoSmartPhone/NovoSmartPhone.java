package NovoSmartPhone;

import ChamadasTelefonicas.ChamadasTelefonicas;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusicas.ReprodutorMusicas;

public class NovoSmartPhone implements ReprodutorMusicas, ChamadasTelefonicas, NavegadorInternet {

    @Override
    public void realizarChamada(String numeroTelefone) {
        System.out.println("Discando para " + numeroTelefone);
    }

    @Override
    public void finalizarChamada() {
        System.out.println("Chamada finalizada");
    }

    @Override
    public void verListaTelefonica() {
        System.out.println("Exibindo lista");
    }

    @Override
    public void acessarPagina(Boolean conexao, String destino) {
        if (conexao) {
            System.out.println("Acessando: " + destino);
        } else {
            System.out.println("Dispositivo offline");
        }
    }

    @Override
    public void atualizar() {
        if (conexao) {
            System.out.println("Atualizando página");
        } else {
            System.out.println("Dispositivo offline");
        }
    }

    @Override
    public void fechar() {
        System.out.println("Fechando navegador");
    }

    @Override
    public void iniciarReproducao() {
        System.out.println("Iniciando reprodução");
    }

    @Override
    public void pausarReproducao() {
        System.out.println("Pausando reprodução");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("A música " + nomeMusica + " foi selecionada");
    }
}
