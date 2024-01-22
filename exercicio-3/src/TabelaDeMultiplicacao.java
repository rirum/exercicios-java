import java.util.Scanner;

public class TabelaDeMultiplicacao {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário para inserir o número a ser multiplicado
        System.out.print("Digite um número para a tabela de multiplicação: ");
        int numero = scanner.nextInt();

        // Imprimindo o cabeçalho
        System.out.println("Tabela de multiplicação de " + numero + ":");

        // Imprimindo a tabela de multiplicação
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Fechando o Scanner
        scanner.close();
    }
}
