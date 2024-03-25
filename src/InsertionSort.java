public class InsertionSort implements Sort {
   public <T extends Comparable<? super T>> void sort(T[] arr) {
      for (int i = 1; i < arr.length; i++) {
         T current = arr[i];
         int j = i - 1;

         while (j >= 0 && arr[j].compareTo(current) > 0){
            arr[j + 1] = arr[j];
            j--;
         }
         arr[j + 1] = current;
      }
   }

}
