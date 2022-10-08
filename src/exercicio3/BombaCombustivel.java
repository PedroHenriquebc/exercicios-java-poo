package exercicio3;

public class BombaCombustivel {
    private String tipo;
    private Double valorLitro;
    private Double quantidade;

    public double abastecerPorValor(double valor) {
        return valor / valorLitro;
    }

    public double abastecerPorLitro(double litros) {
        return litros * valorLitro;
    }

    public void alterarValorLitro(double novoValor) {
        valorLitro = novoValor;
    }

    public void alterarTipo(String novoTipo) {
        tipo = novoTipo;
    }

    public void alterarQuantidade(double novaQuantidade) {
        quantidade = novaQuantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValorLitro() {
        return valorLitro;
    }

    public void setValorPorLitro(Double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}
