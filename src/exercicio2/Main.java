package exercicio2;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("155897", "Pedro");

        System.out.println("Numero da conta: " + cc.getNumero());
        System.out.println("Nome do titular: " + cc.getNomeTitular());
        System.out.println("Saldo: " + cc.getSaldo());

        cc.alterarNome("Joao");
        cc.deposito(1000);
        cc.saque(600);

        System.out.println("Novo nome do titular: " + cc.getNomeTitular());
        System.out.println("Novo saldo: " + cc.getSaldo());
    }
}
