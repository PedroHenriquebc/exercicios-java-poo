package exercicio8;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data();

        data1.construtor("30/07/2022");
        data2.construtor("09/10/2022");

        System.out.println("Data corrente: " + data1.getValorData());
        System.out.println("Data a ser comparada: " + data2.getValorData());
        System.out.println("Resultado da comparacao: " + data1.compara(data2));
        System.out.println("Dia: " + data1.getDia());
        System.out.println("Mes: " + data1.getMes());
        System.out.println("Mes por extenso: " + data1.getMesExtenso());
        System.out.println("Ano: " + data1.getAno());
        System.out.println("Ano Bissexto? " + data1.isBissexto());

        Data dataClonada = data1.clone();
        System.out.println("Data corrente clonada: " + dataClonada.getValorData());
    }
}
