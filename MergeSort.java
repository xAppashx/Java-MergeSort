import java.util.Arrays;
  
public class MergeSort {
      
      // Setting up the parameters
      public static int[] MergeSortStart(int[] ArrayToSort) {
            
            int LenArrayToSort = ArrayToSort.length;
            int[] Array = Arrays.copyOf(ArrayToSort, LenArrayToSort);
            
            int[] SortedArray = MergeSortAlg(Array);
            
            return SortedArray;
      } // MergeSortStart
      
      
      public static int[] MergeSortAlg(int[] Array) {
            
            if (Array.length > 1) {
                  
                  // Separate the Orignial array
                  int r = Array.length / 2;
                  int[] M = Arrays.copyOfRange(Array, r, Array.length);
                  int[] L = Arrays.copyOfRange(Array, 0, r);
                  
                  
                  MergeSortAlg(L);
                  MergeSortAlg(M);
                  
                  // Sorting until L or M is left empty
                  int PositionL = 0;
                  int PositionM = 0;
                  int PositionArray = 0;
                  
                  while (PositionL < L.length && PositionM < M.length) {
                        
                        if (L[PositionL] < M[PositionM]) {
                              Array[PositionArray] = L[PositionL];
                              PositionL = PositionL + 1;
                        } // if
                        
                        else {
                              Array[PositionArray] = M[PositionM];
                              PositionM = PositionM + 1;
                        } // else
                        
                        PositionArray = PositionArray + 1;
                        
                  } // While
                  
                  
                  // Add the leftover values to the array
                  while (PositionL < L.length) {
                        Array[PositionArray] = L[PositionL];
                        PositionArray = PositionArray + 1;
                        PositionL = PositionL + 1;
                  } // while
                  
                  while (PositionM < M.length) {
                        Array[PositionArray] = M[PositionM];
                        PositionArray = PositionArray + 1;
                        PositionM = PositionM + 1;
                  } // while
                  
                  
            } // if Array.length > 1
           
            return Array;
            
      }// MergeSortAlg
      
      
      
      
      public static void main(String[] args) {
            
            int[] OriginalArray = {3, 2, 1, 4, 5, 14, 22, 63, 6, 53, 22, 12, 45, 213, 53, 233, 41, 98};
            
            int[] SortedArray =MergeSortStart(OriginalArray);
            
            System.out.println("Original array: " + Arrays.toString(OriginalArray));
            System.out.println("Sorted array: " + Arrays.toString(SortedArray));
            
      } // public static void main
      
      
} // Public Class MergeSort

































// End.
