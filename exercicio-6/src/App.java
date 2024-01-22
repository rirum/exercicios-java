import java.util.Scanner;

public class App {
    private static CalendarioFeriados calendario;

    public static void main(String[] args) {
        calendario = new CalendarioFeriados();

        imprimirListaFeriados();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma data (dd-MM-yyyy): ");
        String dataInserida = scanner.next();

        verificarEImprimirFeriado(dataInserida);

        // Fechando o Scanner
        scanner.close();
    }

    public static void imprimirListaFeriados() {
        System.out.println("📅 Lista de Feriados");
        for (String data : calendario.getFeriados().keySet()) {
            System.out.println(data + " => " + calendario.getFeriados().get(data));
        }
        System.out.println();
    }

    public static void verificarEImprimirFeriado(String dataInserida) {
        String feriado = calendario.verificarFeriado(dataInserida);
        if (feriado != null) {
            System.out.println("Dia " + dataInserida + " é " + feriado + "! 🎉");
        } else {
            System.out.println("Dia " + dataInserida + " não é feriado 🥲");
        }
    }
}
