package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {

    private static List<Cliente>clientes = new ArrayList<>();

    //Método Cadastrar cliente
    public static Cliente cadastrarCliente(String nome, String email, String cpf) throws Exception {

        Cliente cliente = new Cliente(nome, email, cpf);

        clientes.add(cliente);
        return cliente;
    }


    //Método que mostra clientees cadastrados
    public static void exibirClientesCadastrados() {

        System.out.println(clientes);
    }
}
