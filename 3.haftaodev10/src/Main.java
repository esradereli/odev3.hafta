import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 1, 9, 2, 4, 7, 6};

        // Diziyi küçükten büyüğe sıralama
        Arrays.sort(numbers);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(numbers));

        //Dizide eleman arama
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println("4 sayısının bulunduğu index: " + index);

        //Dizinin belirli bir aralığını kopyalama
        int[] subArray = Arrays.copyOfRange(numbers, 2, 6);
        System.out.println("Kopyalanan alt dizi: " + Arrays.toString(subArray));

        // İki dizinin eşit olup olmadığını kontrol etme
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean isEqual = Arrays.equals(numbers, numbers2);
        System.out.println("Diziler eşit mi? " + isEqual);

        //Diziyi belirli bir değerle doldurma
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Doldurulmuş dizi: " + Arrays.toString(filledArray));
    }
}