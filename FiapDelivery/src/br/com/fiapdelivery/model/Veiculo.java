package br.com.fiapdelivery.model;

public class Veiculo {

    private String placa;
    private double capacidadeKG;


    public Veiculo(String placa, double capacidadeKG){
        this.setPlaca(placa);
        this.setCapacidadeKG(capacidadeKG)
    }

    private void setCapacidadeKG(double capacidadeKG){
        if (capacidadeKG > 0) {
            this.capacidadeKG = capacidadeKG;
        }else {
            System.out.println("A capacidade deve ser maior que 0");
        }
    }


    private void setPlaca(String placa) {
        if (placa != null && !placa.trim().isEmpty()) {
            this.placa = placa;
            System.out.println("✅ Sucesso: A placa agora é " + this.placa);
        } else {
            System.out.println("❌ Erro de Validação: A placa informada é inválida!");
        }
    }

    public String getPlaca(){
        return this.placa;
    }

    public double getCapacidadeKG(){
        return this.capacidadeKG;
    }

    public void atualizarPlaca(String novaPlaca) {
        System.out.println("Solicitada atualização de placa no Detran para o veículo ");
        this.setPlaca(novaPlaca);
    }
}
