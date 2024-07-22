public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("\n----Extrato Conta Corrente----");
        super.imprimirInfoExtrato();
    }

    @Override
    public void imprimirConta() {
        System.out.println("\n----Informações da Conta Corrente----");
        super.imprimirInfoConta();
    }
}
