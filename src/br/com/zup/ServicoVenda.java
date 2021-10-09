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

    //Método exibir faturas cadastradas
    public static void exibirVendasCadastrados(){

        System.out.println(vendas);
    }
}
