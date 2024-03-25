import java.util.*;

public class BubbleSort implements Sort {
   public <T extends Comparable<? super T>> T[] sort(T[] input) {
      T[] arr = Arrays.copyOf(input, input.length);
      boolean isSorted;

      for (int i = 0; i < arr.length; i++) {
         isSorted = true;

         for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j + 1].compareTo(arr[j]) < 0) {
               swap(arr, j, j + 1);
               isSorted = false;
            }
         }
         if (isSorted) {
            return arr;
         }
      }

      return arr;
   }

   public <T> void swap(T[] arr, int index1, int index2) {
      T temp = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;
   }
}
