//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kaç sayılık dizi: ");
        int n= scanner.nextInt();
        int[] arr= new int[n];
        int positiveSum=0;
        int negativeSum=0;

        System.out.println("Sayı giriniz: ");
        for (int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
            if(arr[i]>0){
                positiveSum+=arr[i];
            }
            else {
                negativeSum+=arr[i];
            }
        }
        System.out.println("Pozitif sayıların toplamı: "+positiveSum);
        System.out.println("Negatif sayıların toplamı: "+negativeSum);
    }
}