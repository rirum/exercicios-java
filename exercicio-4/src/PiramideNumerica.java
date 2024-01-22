import java.util.Scanner;

public class PiramideNumerica {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário para inserir o número de linhas na pirâmide
        System.out.print("Digite o número de linhas na pirâmide: ");
        int n = scanner.nextInt();

        // Imprimindo a pirâmide de números
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(); // Muda para a próxima linha após cada linha da pirâmide
        }

        // Fechando o Scanner
        scanner.close();
    }
}
