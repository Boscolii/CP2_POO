package br.com.fiapdelivery.model;

public class Moto extends Veiculo{
    private Boolean isBau;


    public Moto(String placa, double capacidadeKG, boolean isBau){
        super(placa,capacidadeKG);
        this.isBau = isBau;
    }


    public boolean isBau() {
        return this.isBau;
    }


}
