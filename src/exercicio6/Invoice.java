package exercicio6;

public class Invoice {
    private String numero;
    private String descricao;
    private Integer quantidade;
    private Double precoUnit;

    public Invoice(String numero, String descricao, Integer quantidade, Double precoUnit) {
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
        if (precoUnit < 0) {
            this.precoUnit = 0.0;
        } else {
            this.precoUnit = precoUnit;
        }
        this.numero = numero;
        this.descricao = descricao;
    }

    public double getInvoiceAmount () {
        return quantidade * precoUnit;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(Double precoUnit) {
        this.precoUnit = precoUnit;
    }
}
