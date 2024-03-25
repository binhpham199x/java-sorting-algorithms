import java.util.*;

public class InsertionSort extends Sort {
   public <T extends Comparable<? super T>> T[] sort(T[] input) {
      T[] arr = Arrays.copyOf(input, input.length);

      for (int i = 1; i < arr.length; i++) {
         T current = arr[i];
         int j = i - 1;

         while (j >= 0 && arr[j].compareTo(current) > 0){
            arr[j + 1] = arr[j];
            j--;
         }
         arr[j + 1] = current;
      }

      return arr;
   }

}
