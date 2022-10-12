package exercicio7;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Paulo", "Souza", 2300.0);
        Funcionario funcionario2 = new Funcionario("Ana", "Costa", 4100.0);
        double aumento1;
        double aumento2;

        System.out.printf("O salario anual de %s %s e de R$%.2f \n", funcionario1.getNome(), funcionario1.getSobrenome(), funcionario1.getSalario() * 12);
        System.out.printf("O salario anual de %s %s e de R$%.2f \n", funcionario2.getNome(), funcionario2.getSobrenome(), funcionario2.getSalario() * 12);

        aumento1 = funcionario1.getSalario() * 0.1;
        aumento2 = funcionario2.getSalario() * 0.1;

        System.out.println("Com aumento de 10%: ");
        System.out.printf("Novo salario anual de %s %s: R$%.2f \n", funcionario1.getNome(), funcionario1.getSobrenome(),
                (funcionario1.getSalario() + aumento1) * 12);
        System.out.printf("Novo salario anual de %s %s: R$%.2f \n", funcionario2.getNome(), funcionario2.getSobrenome(),
                (funcionario2.getSalario() + aumento2) * 12);
    }
}
