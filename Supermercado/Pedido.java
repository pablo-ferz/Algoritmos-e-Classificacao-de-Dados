import java.util.ArrayList;
import java.util.List;

public class Pedido{
    private Cliente cliente;
    private TipoPagamento pagamento;
    private List<Item> itens;

    public Pedido(Cliente cliente){
        this.cliente = cliente;
        this.itens = new ArrayList<>();    
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.getCalculo();
        }

        return total;
    }

    public void setPagamento(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public TipoPagamento getPagamento() {
        return pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void mostrarPedido() {
        System.out.println("\n=== PEDIDO ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());

        System.out.println("\nItens:");

        for (Item item : itens) {
            System.out.println(item);
        }

        System.out.println("\nTotal: R$ " + calcularTotal());
        System.out.println("Pagamento: " + pagamento);
    }
}