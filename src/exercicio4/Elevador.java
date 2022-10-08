package exercicio4;

public class Elevador {
    private Integer andarAtual = 0;
    private Integer totalAndares;
    private Integer capacidade;
    private Integer pessoasPresentes = 0;

    public void inicializa(int capacidade, int totalAndares) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
    }

    public void entra() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes += 1;
        } else {
            System.out.println("Elevador cheio!");
        }
    }

    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes -= 1;
        } else {
            System.out.println("Elevador vazio!");
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual += 1;
        } else {
            System.out.println("Elevador ja esta no ultimo andar!");
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual -= 1;
        } else {
            System.out.println("Elevador ja esta no terreo!");
        }
    }

    public Integer getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(Integer andarAtual) {
        this.andarAtual = andarAtual;
    }

    public Integer getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(Integer totalAndares) {
        this.totalAndares = totalAndares;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Integer getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(Integer pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
}
