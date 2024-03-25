import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

   @Test
   void testSort() {
//      int min = 0;
//      int max = 50;
//      int size = 20;
//
//      Integer[] numbers = Main.generateIntArr(size, min, max);
//
//      Sort mergeSort = new MergeSort();
//      Integer[] res = mergeSort.sort(numbers);
//
//      for (int i = 1; i < res.length; i++)
//         assertTrue(res[i - 1] <= res[i]);
      testArrSorting(40);
   }

   @ParameterizedTest
   @ValueSource(ints = {15, 30, 45, 60, 75, 900})
   void testArrSorting(int input) {
      int min = 0;
      int max = 100;
      int size = input;

      Integer[] numbers = Main.generateDistinctiveIntArr(size, min, max);

      Sort mergeSort = new MergeSort();
      Integer[] res = mergeSort.sort(numbers);
      System.out.println(Arrays.toString(res));

      for (int i = 1; i < res.length; i++)
         assertTrue(res[i - 1] <= res[i]);
   }
}