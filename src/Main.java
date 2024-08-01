public class Main {
    public static void main(String[] args) {
        Cliente thay = new Cliente();
        thay.setNome("Thay");

        Conta cc = new ContaCorrente(thay);
        Conta poupanca = new ContaPoupanca(thay);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.sacar(100);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
