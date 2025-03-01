//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] numbers= new int[10];
        int total=0;
        System.out.println("10 Sayı giriniz: ");
        for(int i=0; i<10;i++){
             numbers[i] = scanner.nextInt();
            total+=numbers[i];
        }

        double avg= total/10;

        System.out.println("Dizinin ortalaması: "+avg);

        for(int i=0; i<10;i++){
            if(numbers[i]>50){
                System.out.println("50den büyük olan sayılar: "+numbers[i]);
            }
        }
    }
}