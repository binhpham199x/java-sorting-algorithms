import java.util.*;

public class BubbleSort {
   public <T extends Comparable<? super T>> void sort(T[] arr) {


      for (int i = 0; i < arr.length; i++) {
         boolean isSorted;
         for (int j = 0; j < arr.length - i - 1; j++) {
            isSorted = true;
            if (arr[j].compareTo(arr[j + 1]) > 0) {
               swap(arr, j, j + 1);
               isSorted = false;
            }
            if (isSorted) {
               return;
            }
         }
      }
   }

   private <T> void swap(T[] arr, int index, int index2) {
      T temp = arr[index];
      arr[index] = arr[index2];
      arr[index2] = temp;
   }
}
