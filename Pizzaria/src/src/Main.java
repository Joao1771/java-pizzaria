package src;

public class Main {
	public static void main(String[] args) {
        EnderecoPizzaria enderecoPizzaria = new EnderecoPizzaria("Rua A", "Centro", "São Paulo", "SP", "00000-000");
        EnderecoPedido enderecoCliente = new EnderecoPedido("Rua B", "Bairro X", "São Paulo", "SP", "11111-111");

        Cliente cliente = new Cliente("123.456.789-00", "João", enderecoCliente);
        Pizza pizza = new Pizza("Calabresa", 40, "Salgada");
        Bebida bebida = new Bebida("Coca-Cola", 10, "2L");

        Pedido pedido = new Pedido(1, 101, cliente, true);

        Pizzaiolo pizzaiolo = new Pizzaiolo("001", "Carlos");
        pizzaiolo.fazerPizza(pizza);

        Entregador entregador = new Entregador("002", "Marcos", enderecoPizzaria);

        cliente.realizarPedido(pedido);
        entregador.entrega(enderecoCliente);
    }
}
