public class Item{
    private int quantidade;
    private Produto produto;

    public Item(int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Produto getProduto(){
        return produto;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double getCalculo(){
        return produto.getPreco() * quantidade;    
    }

    public String toString(){
        return "Produto: " + produto.getDescricao() + " / Quantidade: " +  quantidade + "/ Total: " + getCalculo();
    }
}