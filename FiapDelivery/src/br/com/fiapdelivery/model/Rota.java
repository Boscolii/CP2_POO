package br.com.fiapdelivery.model;

public class Rota {
    private Pacote pacoteEnviado;
    private Caminhao caminhaoUtilizado;

    public Rota(Pacote pacoteEnviado, Caminhao caminhaoUtilizado){
        this.pacoteEnviado = pacoteEnviado;
        this.caminhaoUtilizado = caminhaoUtilizado;

        System.out.println("Rota solicidade para pacote: "+ this.pacoteEnviado.getCodigo());
    }


    public void dadosPedido(){
        System.out.println("Levando pacote: " + pacoteEnviado.getCodigo() + " no veiculo " + caminhaoUtilizado.getPlaca()
        + "| Status: " + pacoteEnviado.getStatus());
    }
}
