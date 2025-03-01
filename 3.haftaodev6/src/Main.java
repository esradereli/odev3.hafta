//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        ArrayList<Integer> evennumbers= new ArrayList<>();
        Random random= new Random();

        for(int i=0; i<20;i++){
            int num= random.nextInt(100);
            numbers.add(num);
            if(num%2==0){
                evennumbers.add(num);
            }
        }
        System.out.println("Rastgele sayılar: "+numbers);
        System.out.println("Çift sayılar: "+evennumbers);

    }
}