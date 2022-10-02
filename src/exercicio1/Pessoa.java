package exercicio1;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Double altura;

    public int calcularIdade(int anoAtual) {
        return anoAtual - Integer.parseInt(dataNascimento.substring(6,10));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
