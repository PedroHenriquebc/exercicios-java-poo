package exercicio1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Pedro");
        pessoa.setAltura(1.75);
        pessoa.setDataNascimento("30/07/1996");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Data de nascimento: " + pessoa.getDataNascimento());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Idade: " + pessoa.calcularIdade(2022));
    }
}
