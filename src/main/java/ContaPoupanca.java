public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("\n----Extrato Conta Poupança----");
        super.imprimirInfoExtrato();
    }

    @Override
    public void imprimirConta() {
        System.out.println("\n----Informações da Conta Poupança----");
        super.imprimirInfoConta();
    }
}
