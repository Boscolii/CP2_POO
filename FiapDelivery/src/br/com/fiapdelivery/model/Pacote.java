package br.com.fiapdelivery.model;

public class Pacote {
    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigoEstrada, double peso, String status) {
        this.codigo = codigoEstrada;
        this.peso = peso;
        this.status = status;
    }

    public String getCodigo() { return codigo; }
    public double getPeso() { return peso; }
    public String getStatus() { return status; }
}
