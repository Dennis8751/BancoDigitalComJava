public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;


    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (saldo > 0) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0){
        saldo += valor;}
    }

   // @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfoConta() {
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.printf("Conta: %d\n", this.conta);

    }

    protected void imprimirInfoExtrato() {
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.printf("Conta: %d\n", this.conta);
        System.out.printf("Saldo: R$%.2f\n", this.saldo);
    }
}


