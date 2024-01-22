public class ElementosComunsArrays {
    public static void main(String[] args) {
        String[] array1 = { "Morango", "Banana", "Maçã", "Uva", "Caqui" };
        String[] array2 = { "Manga", "Caqui", "Morango", "Amora" };

        System.out.println("Elementos em comum:");

        for (String elemento1 : array1) {
            for (String elemento2 : array2) {
                if (elemento1 == elemento2) {
                    System.out.println(elemento1);
                    break;
                }
            }
        }
    }
}
