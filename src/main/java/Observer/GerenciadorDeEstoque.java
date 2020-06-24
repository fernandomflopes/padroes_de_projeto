package Observer;

public class GerenciadorDeEstoque implements Observador{

    @Override
    public void notificar(Precificavel item) {
        System.out.println("Baixa no produto " + item.obterCodigo());
    }
}
