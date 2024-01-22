import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário para inserir o tamanho desejado da sequência de
        // Fibonacci
        System.out.print("Digite o tamanho desejado da sequência de Fibonacci: ");
        int x = scanner.nextInt();

        // Imprimindo a sequência de Fibonacci
        System.out.println("Sequência de Fibonacci de tamanho " + x + ":");
        for (int i = 0; i < x; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }

        // Fechando o Scanner
        scanner.close();
    }

    // Função para calcular o número de Fibonacci para uma posição dada
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
