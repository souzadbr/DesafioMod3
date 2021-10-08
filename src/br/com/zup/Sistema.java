package br.com.zup;

import java.util.Scanner;

public class Sistema {
    //Método que recebe dados
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Método que exibi as opções do usuario para serem implementadas
    public static void menu() {
        System.out.println("Digite 1 - para cadastrar cliente. ");
        System.out.println("Digite 2 - para cadastrar Vendedor. ");
        System.out.println("Digite 3 - para cadastrar Venda. ");
        System.out.println("Digite 4 - para listar Vendas Cadastradas. ");
        System.out.println("Digite 5 - para listar Vendedores Cadastrados. ");
        System.out.println("Digite 6 - para listas Clientes Cadastrados. ");
        System.out.println("digite 7 - para SAIR. ");
    }

    //Método Cadastrar cliente
    public static Cliente cadastrarCliente() throws Exception {
        String nome = capturarDados("Digite o nome do Cliente: ").nextLine();
        String email = capturarDados("Digite o e-mail do cliente: ").nextLine();
        String cpf = capturarDados("Digite o CPF do cliente:").nextLine();

        return ServicoCliente.cadastrarCliente(nome, email, cpf);
    }

}
