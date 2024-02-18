import java.util.Scanner;

public class ArraySizeController {
    private static final Scanner scanner = new Scanner(System.in);
    private static int size;

    public static void setSize() {
        size = scanner.nextInt();
        scanner.nextLine();
    }
    public static int getSize() {
        return size;
    }
}
