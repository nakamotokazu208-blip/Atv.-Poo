public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: O valor do depósito está inválido. O valor deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Erro: Valor de saque inválido. O valor deve ser maior que zero.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Consulta de Saldo");
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo Atual: R$" + saldo);
    }
}

class main {
    public static void main(String[] args) {
        System.out.println("Criando a primeira conta para Pessoa1...");
        ContaBancaria conta1 = new ContaBancaria("111-4", "Pessoa1", 1800.00);
        
        System.out.println("Criando a segunda conta para Pessoa2...");
        ContaBancaria conta2 = new ContaBancaria("987-1", "Pessoa2", 700.00);

        System.out.println("Operações na conta da Pessoa1:");
        conta1.consultarSaldo();
        conta1.depositar(180.00); 
        conta1.consultarSaldo();
        conta1.sacar(500.00);    
        conta1.consultarSaldo();
        conta1.sacar(1000.00);   
        conta1.consultarSaldo();

        System.out.println("Operações na conta da Pessoa2");
        conta2.consultarSaldo();
        conta2.sacar(90.00);     
        conta2.consultarSaldo();
        conta2.depositar(320.00);
        conta2.consultarSaldo();
    }
}