import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ArrayList<String> words= new ArrayList<>();

        System.out.println("10 kelime giriniz: ");
        for(int i=0;i<10;i++){
            words.add(scanner.next());
        }

        Collections.sort(words);
        System.out.println("Alfabetik Sıralı liste: "+words);

    }
}