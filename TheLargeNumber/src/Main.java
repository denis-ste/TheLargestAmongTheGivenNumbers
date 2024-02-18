import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Program cyfry oraz wyswietla je posortowane");
        System.out.println("Podaj ilość liczb: ");
        ArraySizeController.setSize();

        System.out.println("Podaj liczby całkowite, zostaną posortowane a nastepnie wyświetlone: ");

        for (int i=0; i<ArraySizeController.getSize(); i++) {
            IntegerInputHandler.setNumber();
            numbers.add(IntegerInputHandler.getNumber());
        }

        Collections.sort(numbers);

        for (Integer number: numbers) System.out.println(number);
    }
}

