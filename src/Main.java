import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
   public static void main(String[] args) {
      int min = 0;
      int max = 50;
      int size = 20;


      Integer[] numbers = generateIntArr(size, min, max);
      System.out.println("Numbers: " + Arrays.toString(numbers));

      Sort bubbleSort = new BubbleSort();
      useSortingAlgo(bubbleSort, numbers);



   }

   public static Integer[] generateIntArr(int size, int min, int max) {
      Integer[] res = new Integer[size];

      for (int i = 0; i < size; i++) {
         res[i] = (int) (Math.random() * (max - min + 1) + min);
      }

      return res;
   }

   public static <T extends Comparable<? super T>> void useSortingAlgo(Sort sortingAlgo, T[] arr) {
      T[] result = Arrays.copyOf(arr, arr.length);

      sortingAlgo.sort(result);

      System.out.println(sortingAlgo.getClass().getName() + ": " + Arrays.toString(result));
   }
}