package exercio3;

public class Main {
    public static void main(String[] args) {
        BombaCombustivel bombaCombustivel = new BombaCombustivel();

        bombaCombustivel.setQuantidade(500.0);
        System.out.println("Quantidade: " + bombaCombustivel.getQuantidade());
        bombaCombustivel.setTipo("Diesel");
        System.out.println("Tipo: " + bombaCombustivel.getTipo());
        bombaCombustivel.setValorPorLitro(4.40);
        System.out.println("Valor: " + bombaCombustivel.getValorLitro());

        System.out.printf("Valor pago para abastecer 20 litros: R$%.2f \n", bombaCombustivel.abastecerPorLitro(20));
        System.out.printf("Quantidade de Litros abastecidos com R$50: %.2f litros \n", bombaCombustivel.abastecerPorValor(50));

        bombaCombustivel.alterarQuantidade(600);
        System.out.println("Nova quantidade: " + bombaCombustivel.getQuantidade());
        bombaCombustivel.alterarTipo("Gasolina");
        System.out.println("Novo tipo: " + bombaCombustivel.getTipo());
        bombaCombustivel.alterarValorLitro(5.70);
        System.out.println("Novo valor: " + bombaCombustivel.getValorLitro());

        System.out.printf("Novo valor pago para abastecer 20 litros: R$%.2f \n", bombaCombustivel.abastecerPorLitro(20));
        System.out.printf("Nova quantidade de Litros abastecidos com R$50: %.2f litros \n", bombaCombustivel.abastecerPorValor(50));

    }
}
