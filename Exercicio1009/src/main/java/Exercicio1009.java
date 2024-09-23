import java.util.Scanner;

public class Exercicio1009 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            double salarioFixo = scanner.nextDouble();
            double totalVendas = scanner.nextDouble();
            
            double comissao = totalVendas * 0.15;
            
            double totalReceber = salarioFixo + comissao;
            
            System.out.printf("TOTAL = R$ %.2f%n", totalReceber);
        }
    }
}
