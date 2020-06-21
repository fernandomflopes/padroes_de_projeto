package strategy.tarifaestacionamento;

public class CalculoDiaria implements Calculo {
    private int valorDiaria;

    public CalculoDiaria(int valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    @Override
    public int calcularTarifa(int qtdHora) {

        return valorDiaria * ((int) Math.ceil(qtdHora / 24.0));
    }
}
