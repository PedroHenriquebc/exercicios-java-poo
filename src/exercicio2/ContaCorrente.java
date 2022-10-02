package exercicio2;

public class ContaCorrente {
    private String Numero;
    private String NomeTitular;
    private Double saldo;

    public ContaCorrente(String numero, String nomeTitular, Double saldo) {
        Numero = numero;
        NomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public ContaCorrente(String numero, String nomeTitular) {
        Numero = numero;
        NomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public void alterarNome(String novoNome) {
        this.NomeTitular = novoNome;
    }

    public void saque(double valorSaque) {
        this.saldo -= valorSaque;
    }

    public void deposito(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getNomeTitular() {
        return NomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        NomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
