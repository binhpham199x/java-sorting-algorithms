import java.util.*;

public class BubbleSort extends Sort {
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


}
