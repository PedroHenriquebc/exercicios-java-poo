package exercicio5;

public class Aluno {
    private String matricula;
    private String nome;
    private Double notaProva1;
    private Double notaProva2;
    private Double notaTrabalho;

    public Aluno() {
    }

    public Aluno(String matricula, String nome, Double notaProva1, Double notaProva2, Double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public double media () {
        double novaNota1 = notaProva1 * 2.5;
        double novaNota2 = notaProva2 * 2.5;
        double novaNotaTrabalho = notaTrabalho * 2;
        double pesoTotal = 7;
        return (notaProva1 + notaProva2 + novaNotaTrabalho) / pesoTotal;
    }

    public double recuperacao (double media) {
        if (media < 7) {
            return (7 - media) + media;
        } else {
            return 0;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(Double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public Double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(Double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public Double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(Double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
}
