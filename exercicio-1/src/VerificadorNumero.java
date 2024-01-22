import java.util.Scanner;

public class VerificadorNumero {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário para inserir um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificando se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        // Verificando se o número é positivo, negativo ou zero
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        // Fechando o Scanner
        scanner.close();
    }
}
