package strategy.tarifaestacionamento;

public class TarifaEstacionamento{

    private int qtdHora;
    private Calculo calculo;

    public TarifaEstacionamento(int qtdHoras, Calculo calculo) {
        this.qtdHora = qtdHoras;
        this.calculo = calculo;
    }

    public int valor() {
        return calculo.calcularTarifa(qtdHora);
    }
}
