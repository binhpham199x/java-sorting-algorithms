import java.util.*;

public class MergeSort implements Sort {
   @Override
   public <T extends Comparable<? super T>> T[] sort(T[] arr) {
      int mid = arr.length / 2;

      if (arr.length < 2)
         return arr;

      T[] left = Arrays.copyOfRange(arr, 0, mid);
      T[] right = Arrays.copyOfRange(arr, mid, arr.length);

      T[] sortedLeft = sort(left);
      T[] sortedRight = sort(right);

      return merge(sortedLeft, sortedRight);
   }


   @SuppressWarnings("unchecked")
   private <T extends Comparable<? super T>> T[] merge(T[] left, T[] right) {
      T[] res = (T[]) new Comparable[left.length + right.length];
//      if (left[0].compareTo(right[0]) > 0)
      int leftI = 0;
      int rightI = 0;
      int i = 0;

      while (leftI < left.length && rightI < right.length) {
         if (left[leftI].compareTo(right[rightI]) < 0) {
            res[i] = left[leftI];
            leftI++;
         } else {
            res[i] = right[rightI];
            rightI++;
         }
         i++;
      }

      while (leftI < left.length) {
         res[i] = left[leftI];
         leftI++;
         i++;
      }

      while (rightI < right.length) {
         res[i] = right[rightI];
         rightI++;
         i++;
      }

      return res;
   }
}
