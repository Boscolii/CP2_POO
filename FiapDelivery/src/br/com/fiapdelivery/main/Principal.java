package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class Principal {
    public static void main(String[] args) {
        Caminhao caminhao1 = new Caminhao("SFA-1052", 350, 4);
        Pacote pacote1 = new Pacote("BR999", 25.3, "Pendente");

        Rota rotaPacote1 = new Rota(pacote1,caminhao1);

        rotaPacote1.dadosPedido();

    }
}
