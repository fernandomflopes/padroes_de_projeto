package strategy.tarifaestacionamento;

public class CalculoHoraValorInicial implements Calculo {
    private int valorInicial;
    private int limiteHorasValorInicial;
    private int valorHoraExcedente;

    public CalculoHoraValorInicial(int valorInicial, int limiteHorasValorInicial, int valorHoraExcedente) {
        this.valorInicial = valorInicial;
        this.limiteHorasValorInicial = limiteHorasValorInicial;
        this.valorHoraExcedente = valorHoraExcedente;
    }

    @Override
    public int calcularTarifa(int qtdHora) {
        int valor = this.valorInicial;
        if(qtdHora > limiteHorasValorInicial)
            valor += (qtdHora - limiteHorasValorInicial) * valorHoraExcedente;
        return valor;
    }
}
