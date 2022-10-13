package exercicio9;

import exercicio8.Data;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.construtor("19/11/2022");
        Voo voo = new Voo("1422", data);

        System.out.println(voo.proximoLivre());
        System.out.println(voo.verifica(5));
        System.out.println(voo.ocupa(5));
        System.out.println(voo.verifica(5));
        System.out.println(voo.vagas());
    }
}
