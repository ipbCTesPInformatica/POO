class Conta {
    //atributos da class
    int numeroConta;
    String titularConta;
    double saldo;

    //metodos
    void levantar(double valor){
        //saldo = saldo - valor;
        //ou
        saldo -= valor;
    }

    void depositar(double valor){
        saldo += valor;
    }
//transfer dinheiro de uma conta para outra
    void transferir(Conta contaDestino, double valor){
        saldo -= valor;
        contaDestino.saldo+=valor;
    }


}
class principal{
    public static void main(String[] args){
    Conta conta1 = new Conta();
    conta1.numeroConta = 1;
    conta1.titularConta = " Luis Santos";
    conta1.saldo = 1000.00;

    //invoca o metodo "levantar()"
    conta1.levantar(200.00);

    System.out.println("Saldo: "+conta1.saldo);

    // criação de uma nova instância da
    // classe "conta". o bjeto conta2.
        Conta conta2 = new Conta();
        conta2.numeroConta = 2;
        conta2.titularConta = " João Carvalho";
        conta2.saldo = 700.00;

    // Chamada do método transferir()
        conta1.transferir(conta2, 300);
    //impressão do saldo das contas(conta1 e conta2)
        System.out.println("Saldo: "+conta1.saldo);
        System.out.println("Saldo: "+conta2.saldo);
    }
}

/*

 */