public interface Sort {
   <T extends Comparable<? super T>> T[] sort(T[] arr);

}
