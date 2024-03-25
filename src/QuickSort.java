import java.util.*;

public class QuickSort extends Sort {
   @Override
   public <T extends Comparable<? super T>> T[] sort(T[] arr) {
      T[] res = Arrays.copyOf(arr, arr.length);

      quickSort(res, 0, res.length - 1);

      return res;
   }

   private <T extends Comparable<? super T>> void quickSort(T[] arr, int low, int high) {
      if (low >= high)
         return;

      int pIndex = findCorrectPivotIndex(arr, low, high);
      quickSort(arr, low, pIndex - 1);
      quickSort(arr, pIndex + 1, high);

   }


   private <T extends Comparable<? super T>> int findCorrectPivotIndex(T[] arr, int low, int high) {
      T pivot = arr[high];

      int i = low - 1;
      for (int j = low; j < high + 1; j++) {
         if (arr[j].compareTo(pivot) < 0) {
            i++;
            swap(arr, i, j);
         }
      }

      swap(arr, i + 1, high);

      return i + 1;
   }


}
