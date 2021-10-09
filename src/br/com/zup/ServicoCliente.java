package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {

    private static List<Cliente> clientes = new ArrayList<>();

    //Método Cadastrar cliente
    public static Cliente cadastrarCliente(String nome, String email, String cpf) throws Exception {
        validarEmail(email);
        Cliente cliente = new Cliente(nome, email, cpf);

        clientes.add(cliente);
        return cliente;
    }

    //Método que encontra cliente via email e validar para cadastrar venda para ele
    public static Cliente encontrarClientePeloEmail(String email) throws Exception {
        for (Cliente clienteReferencia : clientes) {
            if (clienteReferencia.getEmail().equalsIgnoreCase(email)) {
                return clienteReferencia;
            }
        }
        throw new Exception("Não temos cliente ligado a esse e-mail!");
    }

    //Validar email Cliente verificando se contem @
    public static void validarEmail(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Email inválido. Verifique email digitado!");
        }
    }

    //Metodo de verificar duplicidade de e-mail
    public static void verificarEmailRepetido (String email) throws Exception {
        for (Cliente clienterReferencia:clientes) {
            if(clienterReferencia.getEmail().equalsIgnoreCase(email)){
                throw new Exception("Já existe cliente vinculado a esse e-mail em nosso Sistema! ");
            }
        }
    }

    //Metodo de verificar duplicidade de CPF
    public static void VerificarCpfRepetido (String cpf) throws Exception {
        for (Cliente clienteReferencia:clientes) {
            if(clienteReferencia.getCpf().equalsIgnoreCase(cpf))
                throw new Exception("Já existe cliente vinculado a esse CPF em nosso Sistema! ");
        }
    }



    //Método que mostra clientees cadastrados
    public static void exibirClientesCadastrados() {

        System.out.println(clientes);
    }
}
