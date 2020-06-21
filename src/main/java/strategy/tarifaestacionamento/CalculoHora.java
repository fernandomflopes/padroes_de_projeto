package strategy.tarifaestacionamento;

public class CalculoHora implements Calculo{
    private int valorHora;
    public CalculoHora(int valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public int calcularTarifa(int qtdHora) {
        return this.valorHora * qtdHora;
    }
}
