package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class Principal {
    public static void main(String[] args) {
        Moto moto1 = new Moto("SFA-1052", 80, true);
        Pacote pacote1 = new Pacote("BR999", 35, "Pendente");
        Rota rotaPacote1 = new Rota("Uberlandia",pacote1,moto1);
        rotaPacote1.dadosPedido();
        pacote1.atualizaStatus("Entregue");

        Caminhao caminhao1 = new Caminhao("PSR-3940", 400, 4);
        Pacote pacote2 = new Pacote("CR382", 150, "Enviado");
        Rota rotaPacote2 = new Rota("Seoul", pacote2, caminhao1);

        rotaPacote2.dadosPedido();
    }
}
