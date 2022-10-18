package exercicio11;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();
        IngressoVip ingressoVip = new IngressoVip();

        ingresso.setValor(50.0);
        ingressoVip.setValor(50.0);
        ingressoVip.setAdicional(15.0);

        System.out.println(ingresso.imprimirValor());
        System.out.println(ingressoVip.imprimirValor());
    }
}
