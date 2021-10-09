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

    //Método que encontra vendedor via email e valida para cadastrar venda para ele
    public static Vendedor encontrarVendedorPeloEmail (String email)throws Exception{
        for (Vendedor vendedorReferencia: vendedores) {
            if(vendedorReferencia.getEmail().equalsIgnoreCase(email)){
                return vendedorReferencia;
            }
        }
        throw new Exception("Não temos vendedor ligado a esse e-mail!");
    }

    public static void exibirVendedoresCadastrados() {

        System.out.println(vendedores);
    }
}
