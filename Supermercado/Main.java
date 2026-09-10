import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Produto arroz = new Produto(Descricao.ARROZ, 10.00, 50);
        Produto feijao = new Produto(Descricao.FEIJAO, 8.00, 30);
        Produto farinha = new Produto(Descricao.FARINHA, 6.00, 40);
        Produto leite = new Produto(Descricao.LEITE, 5.00, 20);

        Pedido pedidoAtual = null;
        int opcao;

        do{
            System.out.println("\n=== SUPERMERCADO ===");
            System.out.println("1 - Novo pedido");
            System.out.println("2 - Realizar pagamento");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("\n=== NOVO PEDIDO ===");

                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    Cliente cliente = new Cliente(nome, cpf);
                    Pedido pedido = new Pedido(cliente);

                    int produtoEscolhido;

                    do{
                        System.out.println("\n=== PRODUTOS ===");
                        System.out.println("1 - " + arroz);
                        System.out.println("2 - " + feijao);
                        System.out.println("3 - " + farinha);
                        System.out.println("4 - " + leite);
                        System.out.println("0 - Finalizar pedido");

                        System.out.print("Escolha o produto: ");
                        produtoEscolhido = scanner.nextInt();

                        if(produtoEscolhido == 0){
                            break;
                        }

                        Produto produto = null;

                        switch (produtoEscolhido){
                            case 1:
                                produto = arroz;
                                break;
                            case 2:
                                produto = feijao;
                                break;
                            case 3:
                                produto = farinha;
                                break;
                            case 4:
                                produto = leite;
                                break;
                            default:
                                System.out.println("Produto inválido.");
                        }

                        if(produto != null){

                            System.out.print("Quantidade: ");
                            int quantidade = scanner.nextInt();

                            if (quantidade <= 0){
                                System.out.println("Quantidade inválida.");

                            } 
                            else if(quantidade > produto.getQuantidadeEstoque()){
                                System.out.println("Estoque insuficiente.");

                            }
                            else{
                                Item item = new Item(quantidade, produto);

                                pedido.adicionarItem(item);
                                produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);

                                System.out.println("Item adicionado ao pedido.");
                            }
                        }
                    }while (produtoEscolhido != 0);

                    pedidoAtual = pedido;

                    System.out.println("\nPedido criado com sucesso");
                    System.out.println("Total: R$ " + pedidoAtual.calcularTotal());

                    break;
                case 2:
                    System.out.println("\n=== PAGAMENTO ===");

                    if (pedidoAtual == null){
                        System.out.println("Nenhum pedido foi criado.");
                    }
                    else{
                        pedidoAtual.mostrarPedido();

                        System.out.println("\nForma de pagamento:");
                        System.out.println("1 - Dinheiro");
                        System.out.println("2 - Cheque");
                        System.out.println("3 - Cartão");
                        System.out.println("4 - PIX");

                        System.out.print("Escolha: ");
                        int pagamento = scanner.nextInt();

                        switch (pagamento){
                            case 1:
                                pedidoAtual.setPagamento(
                                    TipoPagamento.DINHEIRO
                                );
                                break;
                            case 2:
                                pedidoAtual.setPagamento(
                                    TipoPagamento.CHEQUE
                                );
                                break;
                            case 3:
                                pedidoAtual.setPagamento(
                                    TipoPagamento.CARTAO
                                );
                                break;
                            case 4:
                                pedidoAtual.setPagamento(
                                    TipoPagamento.PIX
                                );
                                break;
                            default:
                                System.out.println("Pagamento inválido.");
                        }

                        System.out.println("\nPagamento realizado com sucesso");
                        System.out.println("Forma de pagamento: "+ pedidoAtual.getPagamento());
                        System.out.println("Total pago: R$ "+ pedidoAtual.calcularTotal());
                    }
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while (opcao != 0);

        scanner.close();
    }
}
