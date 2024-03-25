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

//      Sort bubbleSort = new BubbleSort();
//      useSortingAlgo(bubbleSort, numbers);
//
//      Sort insertionSort = new InsertionSort();
//      useSortingAlgo(insertionSort, numbers);
//
//      Sort mergeSort = new MergeSort();
//      useSortingAlgo(mergeSort, numbers);

      Sort quickSort = new QuickSort();

      useSortingAlgo(quickSort, numbers);
   }

   public static Integer[] generateIntArr(int size, int min, int max) {
      Integer[] res = new Integer[size];

      for (int i = 0; i < size; i++) {
         res[i] = (int) (Math.random() * (max - min + 1) + min);
      }

      return res;
   }

   public static Integer[] generateDistinctiveIntArr(int size, int min, int max) {
      Integer[] res = new Integer[size];
      Set<Integer> validNumbers = new HashSet<>();


      for (int i = 0; i < size; i++) {
         boolean isValid = false;
         int num = 0;
         while (!isValid) {
            num = (int) (Math.random() * (max - min + 1) + min);
            if (!validNumbers.contains(num)) {
               validNumbers.add(num);
               res[i] = num;
               isValid = true;
            }
         }

         if (i % max == 0)
            validNumbers.clear();
      }

      return res;
   }

   public static <T extends Comparable<? super T>> void useSortingAlgo(Sort sortingAlgo, T[] arr) {

      T[] result = sortingAlgo.sort(arr);
      System.out.println("--------------------------");
      System.out.println(sortingAlgo.getClass().getName() + ":");

      System.out.println(Arrays.toString(result));
   }
}