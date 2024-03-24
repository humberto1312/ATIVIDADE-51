import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para a série: ");
        int n = scanner.nextInt();

        double somaSerie = calcularSerie(n);

        System.out.println("Série:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "/" + (2 * i - 1));
            if (i < n) {
                System.out.print(" + ");
            }
        }

        System.out.println("\n\nSoma da série: " + somaSerie);

        scanner.close();
    }

    public static double calcularSerie(int n) {
        double soma = 0.0;
        for (int i = 1; i <= n; i++) {
            soma += (double) i / (2 * i - 1);
        }
        return soma;
    }
}
