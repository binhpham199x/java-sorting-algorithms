public interface ISort {
   <T extends Comparable<? super T>> T[] sort(T[] arr);

}
