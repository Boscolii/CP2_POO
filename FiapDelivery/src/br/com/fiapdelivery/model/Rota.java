package br.com.fiapdelivery.model;

public class Rota {
    private Pacote pacoteEnviado;
    private Veiculo veiculoUtilizado;

    public Rota(Pacote pacoteEnviado, Veiculo veiculoUtilizado){
        this.pacoteEnviado = pacoteEnviado;
        this.veiculoUtilizado = veiculoUtilizado;

        System.out.println("Rota solicidade para pacote: "+ this.pacoteEnviado.getCodigo());
    }


    public void dadosPedido(){
        System.out.println("Levando pacote: " + pacoteEnviado.getCodigo() + " no veiculo " + veiculoUtilizado.getPlaca()
        + "| Status: " + pacoteEnviado.getStatus());
    }
}
