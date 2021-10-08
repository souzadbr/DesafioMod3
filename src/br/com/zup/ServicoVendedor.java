package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {

    private static List<Vendedor> vendedores = new ArrayList<>();

    //Método que cadastra Vendedor Responsavel
    public static Vendedor cadastrarVendedor(String nome, String email, String cpf) {

        Vendedor vendedor = new Vendedor(nome, email, cpf);
        vendedores.add(vendedor);
        return vendedor;
    }

    public static void exibirVendedoresCadastrados() {

        System.out.println(vendedores);
    }
}
