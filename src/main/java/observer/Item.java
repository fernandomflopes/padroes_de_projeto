package observer;

public class Item implements Precificavel {
    private String codigo;
    private double preco;
    private String nome;

    public Item(String codigo, double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
        this.codigo = codigo;
    }

    @Override
    public String obterCodigo() {
        return codigo;
    }

    @Override
    public double obterValor() {
        return this.preco;
    }

    public String getNome() {
        return nome;
    }
}
