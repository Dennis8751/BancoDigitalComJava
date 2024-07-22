import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Banco banco = new Banco();

        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        boolean loop = true;

        while (loop) {
            System.out.println("Bem Vindo ao DigilBank!!!");
            System.out.println("1 - Entrar\n" +
                    "2 - Criar Conta\n" +
                    "3 - Sair");

            int escolha = 0;

            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Nome: ");
                    String nomeCliente = sc.next();

                    if (banco.clienteCadastrado(nomeCliente)) {
                        System.out.println("\nBem Vindo, " + nomeCliente.toUpperCase() + ".");

                        boolean loopFuncionario = true;

                        while (loopFuncionario) {
                            System.out.println("\n1 - Sacar\n" +
                                    "2 - Depositar\n" +
                                    "3 - Transferir\n" +
                                    "4 - Imprimir Extrato\n" +
                                    "5 - Retornar ao menu anterior");
                            int esc = sc.nextInt();

                            switch (esc) {
                                case 1:
                                    double valorSaque = 0;
                                    System.out.println("Sacar da conta Corrente ou Poupança?");
                                    String esclherTipoSaque = sc.next();
                                    if (esclherTipoSaque.equalsIgnoreCase("Poupança")) {
                                        System.out.print("Valor que deseja sacar: R$");
                                        contaPoupanca.sacar(valorSaque = sc.nextDouble());
                                    } else {
                                        System.out.print("Valor que deseja sacar: R$");
                                        contaCorrente.sacar(valorSaque = sc.nextDouble());
                                    }
                                    break;

                                case 2:
                                    double valorDeposito = 0;

                                    System.out.println("Deseja depositar na conta Corrente ou Poupança?");
                                    String escolherTipoDeposito = sc.next();

                                    if (escolherTipoDeposito.equalsIgnoreCase("Poupança")) {
                                        System.out.print("Valor que deseja depositar: R$");
                                        contaPoupanca.depositar(valorDeposito = sc.nextDouble());
                                    } else if (escolherTipoDeposito.equalsIgnoreCase("Corrente")) {
                                        System.out.print("Valor que deseja depositar: R$");
                                        contaCorrente.depositar(valorDeposito = sc.nextDouble());
                                    } else {
                                        System.out.println("Conta inválida!");
                                    }
                                    break;

                                case 3:
                                    double valorTransferencia = 0;

                                    System.out.println("Deseja transferir para conta Corrente ou Poupança?");
                                    String esclherTipoTransferencia = sc.next();
                                    System.out.print("Valor que deseja Transferir: R$");
                                    valorTransferencia = sc.nextDouble();

                                    if (esclherTipoTransferencia.equalsIgnoreCase("Poupança")) {
                                        contaCorrente.transferir(valorTransferencia, contaPoupanca);
                                    } else {
                                        contaPoupanca.transferir(valorTransferencia, contaCorrente);
                                    }
                                    break;

                                case 4:
                                    contaPoupanca.imprimirExtrato();
                                    contaCorrente.imprimirExtrato();
                                    break;

                                case 5:
                                    loopFuncionario = false;
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Usuário não cadastrado!");
                    }
                    break;

                case 2:
                    int e = 0;
                    boolean loop2 = true;

                    while (loop2) {
                        System.out.println("1 - Nova conta\n" +
                                "2 - Remover conta\n" +
                                "3 - Exibir contas\n" +
                                "4 - Retornar ao menu anterior");
                        e = sc.nextInt();

                        switch (e) {
                            case 1:
                                System.out.println("Nome: ");
                                String nome = sc.next();
                                System.out.println("Idade: ");
                                int idadeCliente = sc.nextInt();

                                Cliente novoCLiente = new Cliente(nome, idadeCliente);

                                banco.adicionarCliente(novoCLiente);
                                break;

                            case 2:
                                System.out.println("Nome do usuário: ");
                                String removerCliente = sc.next();
                                banco.removerCliente(removerCliente);
                                break;

                            case 3:
                                banco.exibirCliente();
                                break;

                            case 4:
                                loop2 = false;
                                break;

                            default:
                                System.out.println("Opção inválida!");
                        }
                    }
                    break;
                case 3:
                    loop = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
