//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> cities= new ArrayList<>();

        System.out.println("5 şehir giriniz: ");
        for (int i = 0; i < 5; i++) {
            cities.add(scanner.next());
        }

        System.out.println("Kontrol etmek istediğiniz şehri giriniz:");
        String city = scanner.next();

        if (cities.contains(city)) {
            System.out.println(city + " şehir listede mevcut. İndeksi: " + cities.indexOf(city));
        } else {
            System.out.println(city + " şehir listede yok.");
        }

    }
}