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
/*    */ public class BubbleSort
/*    */ {
/*    */   public void bubbleSort(int[] arr) {
/* 15 */     int n = arr.length;
/*    */ 
/*    */     
/* 18 */     for (int i = 0; i < n - 1; i++) {
/* 19 */       boolean swapped = false;
/*    */       
/* 21 */       for (int j = 0; j < n - 1 - i; j++) {
/* 22 */         if (arr[j] > arr[j + 1]) {
/*    */           
/* 24 */           int temp = arr[j];
/* 25 */           arr[j] = arr[j + 1];
/* 26 */           arr[j + 1] = temp;
/* 27 */           swapped = true;
/*    */         } 
/*    */       } 
/*    */ 
/*    */       
/* 32 */       if (!swapped)
/*    */         break; 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\VICTUS\Videos\introduction-0.0.1-SNAPSHOT.jar.zip\\umg\edu\gt\data_structure\array\BubbleSort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */