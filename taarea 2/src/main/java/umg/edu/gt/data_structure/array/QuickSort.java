/*    */ package umg.edu.gt.data_structure.array;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class QuickSort
/*    */ {
/*    */   public void quickSort(int[] arr, int low, int high) {
/* 16 */     if (low < high) {
/* 17 */       int pivotIndex = partition(arr, low, high);
/*    */       
/* 19 */       quickSort(arr, low, pivotIndex - 1);
/* 20 */       quickSort(arr, pivotIndex + 1, high);
/*    */     } 
/*    */   }
/*    */   
/*    */   private int partition(int[] arr, int low, int high) {
/* 25 */     int pivot = arr[high];
/* 26 */     int i = low - 1;
/*    */     
/* 28 */     for (int j = low; j < high; j++) {
/* 29 */       if (arr[j] <= pivot) {
/* 30 */         i++;
/* 31 */         int k = arr[i];
/* 32 */         arr[i] = arr[j];
/* 33 */         arr[j] = k;
/*    */       } 
/*    */     } 
/*    */     
/* 37 */     int temp = arr[i + 1];
/* 38 */     arr[i + 1] = arr[high];
/* 39 */     arr[high] = temp;
/*    */     
/* 41 */     return i + 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\VICTUS\Videos\introduction-0.0.1-SNAPSHOT.jar.zip\\umg\edu\gt\data_structure\array\QuickSort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */