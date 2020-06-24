package observer;

import java.util.ArrayList;
import java.util.List;

/***
 *  Armazena items de compra
 */
public class CarrinhoDeCompras implements Sujeito{
    private List<Observador> observadores = new ArrayList<>();
    private List<Item> listaDeItems = new ArrayList<>();

    /**
     * Adiciona um item e notifica os observadores
     * @param item
     */
    public void adicionar(Item item) {
        this.listaDeItems.add(item);
        observadores.forEach(e -> e.notificar(item));
    }

    public double calcularTotal() {
        return listaDeItems.stream().map(Item::obterValor).reduce(0.0, Double::sum);
    }

    @Override
    public void add(Observador observador) {
        observadores.add(observador);
    }
    @Override
    public void remover(Observador observador) {
        observadores.remove(observador);
    }

}
