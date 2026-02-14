/*    */ package umg.edu.gt.data_structure.array;
/*    */ 
/*    */ import java.util.Arrays;
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
/*    */ public class MergeSortDemo
/*    */ {
/*    */   public void mergeSort(int[] a) {
/* 18 */     if (a.length <= 1)
/*    */       return; 
/* 20 */     int mid = a.length / 2;
/* 21 */     int[] left = Arrays.copyOfRange(a, 0, mid);
/* 22 */     int[] right = Arrays.copyOfRange(a, mid, a.length);
/* 23 */     mergeSort(left);
/* 24 */     mergeSort(right);
/* 25 */     merge(a, left, right);
/*    */   }
/*    */   
/*    */   private void merge(int[] a, int[] left, int[] right) {
/* 29 */     int i = 0, j = 0, k = 0;
/* 30 */     while (i < left.length && j < right.length) {
/* 31 */       if (left[i] <= right[j]) {
/* 32 */         a[k++] = left[i++]; continue;
/*    */       } 
/* 34 */       a[k++] = right[j++];
/*    */     } 
/*    */     
/* 37 */     while (i < left.length)
/* 38 */       a[k++] = left[i++]; 
/* 39 */     while (j < right.length)
/* 40 */       a[k++] = right[j++]; 
/*    */   }
/*    */ }


/* Location:              C:\Users\VICTUS\Videos\introduction-0.0.1-SNAPSHOT.jar.zip\\umg\edu\gt\data_structure\array\MergeSortDemo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */