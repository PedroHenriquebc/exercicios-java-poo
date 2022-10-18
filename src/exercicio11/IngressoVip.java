package exercicio11;

public class IngressoVip extends Ingresso{
    private Double adicional;

    @Override
    public double imprimirValor() {
        return super.imprimirValor() + adicional;
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }
}
