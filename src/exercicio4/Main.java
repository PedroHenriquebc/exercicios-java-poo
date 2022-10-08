package exercicio4;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.inicializa(10, 15);

        elevador.sobe();
        elevador.desce();
        System.out.println(elevador.getAndarAtual());

        System.out.println("-");

        elevador.desce();
        elevador.setAndarAtual(15);
        elevador.sobe();

        System.out.println("-");

        elevador.entra();
        elevador.sai();
        System.out.println(elevador.getPessoasPresentes());

        System.out.println("-");

        elevador.sai();
        elevador.setPessoasPresentes(10);
        elevador.entra();
    }
}
