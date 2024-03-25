import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
   public static void main(String[] args) {
      int min = 0;
      int max = 50;
      int size = 20;


      int[] numbers = generateIntArr(size, min, max);

      int[] BSOut = Arrays.copyOf(numbers, numbers.length);
      System.out.println("numbers: " + Arrays.toString(BSOut));


   }

   public static int[] generateIntArr(int size, int min, int max) {
      int[] res = new int[size];

      for (int i = 0; i < size; i++) {
         res[i] = (int) (Math.random() * (max - min + 1) + min);
      }

      return res;
   }
}