package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda>vendas = new ArrayList<>();

    public static Venda cadastrarVenda(String emailCliente, String emailVendedor, double valor, String dataRegistro) throws Exception {
        Cliente cliente = ServicoCliente.encontrarClientePeloEmail(emailCliente);
        Vendedor vendedor = ServicoVendedor.encontrarVendedorPeloEmail(emailVendedor);
        Venda venda = new Venda(cliente, vendedor, valor, dataRegistro);
        vendas.add(venda);
        System.out.println("Venda cadastrada com sucesso: \n "+venda);
        return venda;
    }

    //Método Pesquisar Compra do Cliente
    public static void pesquisarCompras(String cpf){
        List<Venda>compraCliente = new ArrayList<>();
        for (Venda compraReferencia: vendas) {
            if(compraReferencia.getCliente().getCpf().equals(cpf)){
                System.out.println(compraReferencia);
                compraCliente.add(compraReferencia);
            }
        }
    }

    //Método Pesquisar Venda do Venedor
    public static void pesquisarVenda(String email){
        List<Venda> vendaVendedor = new ArrayList<>();
        for (Venda vendaReferencia:vendas) {
           if(vendaReferencia.getVendedor().getEmail().equalsIgnoreCase(email)){
               System.out.println(vendaReferencia);
               vendaVendedor.add(vendaReferencia);
           }
        }
    }

    //Método exibir faturas cadastradas
    public static void exibirVendasCadastrados(){

        System.out.println(vendas);
    }
}
