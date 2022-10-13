package exercicio9;

import exercicio8.Data;

public class Voo {
    private String numero;
    private Data data;

    private String[] assentos = new String[100];


    public Voo(String numero, Data data) {
        this.numero = numero;
        this.data = data;
    }

    public int proximoLivre() {
        for (int i = 0; i < 100; i++) {
            if (assentos[i] == null) {
                return i;
            } else {
                continue;
            }
        }
        return -1;
    }

    public boolean verifica(int numeroCadeira) {
        if (assentos[numeroCadeira] == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean ocupa(int numeroCadeira) {
        if (assentos[numeroCadeira] == null) {
            assentos[numeroCadeira] = "x";
            return true;
        } else {
            return false;
        }
    }

    public int vagas() {
        int cont = 0;
        for (int i = 0; i < 100; i++) {
            if (assentos[i] == null) {
                cont++;
            }
        }
        return cont;
    }

    public String getNumero() {
        return numero;
    }
}
