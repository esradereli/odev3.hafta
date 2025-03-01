//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
HashSet<Integer> numbers = new HashSet<>();
HashSet<Integer> duplicatenumbers = new HashSet<>();

System.out.print("Kaç sayılık dizi: ");
int n= scanner.nextInt();
int[] arr= new int[n];

System.out.println("Sayı giriniz: ");
for (int i=0;i<n;i++){
    arr[i]= scanner.nextInt();
    if(!numbers.add(arr[i])){
        duplicatenumbers.add(arr[i]);
    }
        }
if(duplicatenumbers.isEmpty()){
    System.out.println("Tekrar eden sayı yok.");
}
else {
    System.out.println("Tekrar eden sayılar: " + duplicatenumbers);
    scanner.close();
}

    }
}