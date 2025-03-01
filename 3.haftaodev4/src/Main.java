//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ArrayList<Integer> numbers= new ArrayList<>();

        System.out.println("10 adet sayı giriniz: ");
        for(int i=0;i<10;i++){
            numbers.add(scanner.nextInt());
        }

        Collections.sort(numbers);
        System.out.println("Sıralı liste: "+numbers);

    }
}