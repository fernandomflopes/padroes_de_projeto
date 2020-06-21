package staticfactorymethods;

/***
 *  Static factory methods resolve o problema da falta da
 * intenção dos construtores
 *
 */

public class GeradorIntAleatorio {
    private int min;
    private int max;

    private GeradorIntAleatorio(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static GeradorIntAleatorio entre(int min, int max) {
        return new GeradorIntAleatorio(min, max);
    }

    public static GeradorIntAleatorio maiorQue(int min) {
        return new GeradorIntAleatorio(min, Integer.MAX_VALUE);
    }

    public static GeradorIntAleatorio menorQue(int max) {
        return new GeradorIntAleatorio(Integer.MIN_VALUE, max);
    }
}
