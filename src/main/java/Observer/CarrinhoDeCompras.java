package Observer;

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

    public static void main(String[] args) {
        var carrinho = new CarrinhoDeCompras();
        var gerenciadorEstoque = new GerenciadorDeEstoque();

        carrinho.add(gerenciadorEstoque);
        var item1 = new Item("42",10.0, "...");
        var item2 = new Item("12",11.0, ".x..");

        carrinho.adicionar(item1);
        carrinho.remover(gerenciadorEstoque);
        carrinho.adicionar(item2); // nao notifica

        System.out.println(carrinho.calcularTotal());
    }
}
