package exercicio6;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1522", "Smartphone Samsung", 2, 1599.99);
        System.out.printf("Preço total: R$%.2f", invoice.getInvoiceAmount());
    }
}
