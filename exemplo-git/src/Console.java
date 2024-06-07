public class Console {
    private static Scanner scaner = new Scanner(System.in);

    public static int lerInt() {
        int valor = scaner.nextInt();
        scaner.nextLine();
        return valor;
    }
}
