package br.com.fiapdelivery.model;

public class Rota {
    private String destino;
    private Pacote pacoteEnviado;
    private Veiculo veiculoUtilizado;


    public Rota(String destino,Pacote pacoteEnviado, Veiculo veiculoUtilizado){
        this.pacoteEnviado = pacoteEnviado;
        this.veiculoUtilizado = veiculoUtilizado;
        this.destino = destino;

        if(pacoteEnviado.getPeso() > veiculoUtilizado.getCapacidadeKG()){
            System.out.println("Veiculo nao suporta peso do pacote");
        } else {
            System.out.println("Rota solicitada para pacote: "+ this.pacoteEnviado.getCodigo());
        }


    }


    public void dadosPedido(){
        System.out.println("-------------------------------------------------");
        System.out.println("Pacote: " + pacoteEnviado.getCodigo() + " | " + veiculoUtilizado.getPlaca()
        +" | Destino: " + this.destino + " | Status: " + pacoteEnviado.getStatus());
    }
}
