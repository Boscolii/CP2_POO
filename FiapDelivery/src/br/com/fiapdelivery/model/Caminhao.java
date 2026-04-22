package br.com.fiapdelivery.model;

import java.util.concurrent.CancellationException;

public class Caminhao extends Veiculo{

    private int qntEixos;


    public Caminhao(String placa, double capacidadeKG, int qntEixos){
        super(placa,capacidadeKG);
        this.setQntEixos(qntEixos);
    }

    private void setQntEixos(int qntEixos){
        if (qntEixos > 0){
            this.qntEixos = qntEixos;
        }else {
            System.out.println("A quantidade de eixos deve ser maior que 0");
        }
    }

    public int getQntEixos(){
        return this.qntEixos;
    }

}
