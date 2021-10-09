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
        ServicoCliente.verificarEmailRepetido(email);
        String cpf = capturarDados("Digite o CPF do cliente:").nextLine();
        ServicoCliente.VerificarCpfRepetido(cpf);

        return ServicoCliente.cadastrarCliente(nome, email, cpf);
    }

    //Método Cadastrar vendedor responsavel
    public static Vendedor cadastrarVendedor() throws Exception{
        String nome = capturarDados("Digite o nome do vendedor responsavel: ").nextLine();
        String email = capturarDados("Digite o e-mail do vendedor responsavel: ").nextLine();
        ServicoVendedor.verificarEmailRepetido(email);
        String cpf = capturarDados("Digite o CPF do vendedor responsavel:").nextLine();
        ServicoVendedor.VerificarCpfRepetido(cpf);

        return ServicoVendedor.cadastrarVendedor(nome,email,cpf);
    }

    //Método de cadastrar fatura
    public static Venda cadastrarVenda() throws Exception {
        String emailCliente = capturarDados("Digite e-mail do cliente que deseja ter a fatura vinculada. ").nextLine();
        String emailVendedor = capturarDados("Digite e-mail do vendedor que fez a venda. ").nextLine();
        double valor = capturarDados("Digite o valor da venda: ").nextDouble();
        String dataRegistro = capturarDados("Digite a data de Venda: ").nextLine();


        return ServicoVenda.cadastrarVenda(emailCliente, emailVendedor, valor, dataRegistro);

    }

    //Método Exibir Cliente cadastrados
    public static void exibirClientesCadastrados() {

        ServicoCliente.exibirClientesCadastrados();
    }

    //Método Exibir Vendedor cadastrados
    public static void exibirVendedoresCadastrados() {

       ServicoVendedor.exibirVendedoresCadastrados();
    }

    //Método Exibir Vendas Cadastradas
    public static void exibirVendasCadastradas() {

        ServicoVenda.exibirVendasCadastrados();
    }

    //Método executar

    public static boolean execultar () throws Exception{

        boolean continuarMenu = true;

        do{
            menu();
            int opcaoUsuario = capturarDados("Digite a opção desejada: ").nextInt();

            if(opcaoUsuario == 1){

                Cliente cliente = cadastrarCliente();
                System.out.println(cliente);
                System.out.println("Cliente cadastrado com sucesso!");

            }
            else if (opcaoUsuario == 2){

                Vendedor vendedor = cadastrarVendedor();
                System.out.println(vendedor);
                System.out.println("Vendedor cadastrado com sucesso!");

            }
            else if(opcaoUsuario == 3){

                Venda venda = cadastrarVenda();
                System.out.println("Venda cadastrada com sucesso");

            }
            else if(opcaoUsuario == 4){

                Sistema.exibirVendasCadastradas();

            }
            else if (opcaoUsuario == 5){

                Sistema.exibirVendedoresCadastrados();
            }
            else if (opcaoUsuario == 6){

                Sistema.exibirClientesCadastrados();

            }else {
                continuarMenu = false;
            }

        }while(continuarMenu);

        return continuarMenu;
    }

}
