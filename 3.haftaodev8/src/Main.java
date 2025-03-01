import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("10 sayı giriniz:");
        for (int i = 0; i < 10; i++) {
            numbers.add(scanner.nextInt());
        }

        System.out.println("En büyük sayı: " + Collections.max(numbers));
        System.out.println("En küçük sayı: " + Collections.min(numbers));

    }
}