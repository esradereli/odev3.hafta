import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("İlk eleman: " + numbers.get(0));
        numbers.set(1, 50);
        System.out.println("2. eleman değiştirildi: " + numbers);
        numbers.remove(0);
        System.out.println("İlk eleman kaldırıldı: " + numbers);
        System.out.println("Liste boyutu: " + numbers.size());
        numbers.clear();
        System.out.println("Liste temizlendi, boyut: " + numbers.size());
    }
}

