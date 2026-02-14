/*    */ package umg.edu.gt.data_structure.introduction;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import umg.edu.gt.data_structure.array.BubbleSort;
/*    */ import umg.edu.gt.data_structure.array.MergeSortDemo;
/*    */ import umg.edu.gt.data_structure.array.QuickSort;
/*    */ import umg.edu.gt.data_structure.array.SumArray;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class App
/*    */ {
	
/*    */   public static void main(String[] args) {
/* 17 */     int[] d1 = { 3, 5, 2, 9 };//creacion del Array d1
/* 18 */     SumArray sumArray = new SumArray();// usa la clase SumArray para sumar los que sta guardado en el arreglo d1 
/* 19 */     System.out.println(sumArray.sum(d1));
/*    */ 
/*    */     
/* 22 */     MergeSortDemo mergeSortDemo = new MergeSortDemo();
/* 23 */     int[] d2 = { 8, 3, 7, 4, 9, 2 };//creacion de array d2
/* 24 */     mergeSortDemo.mergeSort(d2); //se utiliza la clase MergeSortDemo que funciona dividiendo el arreglo en partes  y luego las une ordenado
/* 25 */     System.out.println(Arrays.toString(d2));//conviete el arreglo en texto y lo imprime ya ordenado de d2
/*    */ 
/*    */     
/* 28 */     BubbleSort blueSort = new BubbleSort();
/* 29 */     int[] arr = { 5, 1, 4, 2, 8 };
/* 30 */     blueSort.bubbleSort(arr);
/*    */     //compara elemetos dentro del array y los intercambia si esta mal 
             //El for recorre el arreglo e imprime cada nuemro ordenado 
/* 32 */     for (int n : arr) {
/* 33 */       System.out.print(n + " ");
/*    */     }

           System.out.println();
/*    */     
/* 37 */     QuickSort quick = new QuickSort();
/* 38 */     int[] arr1 = { 10, 7, 8, 9, 1, 5 };
/* 39 */     quick.quickSort(arr1, 0, arr1.length - 1);
/*    */     
/* 41 */     for (int n : arr1) {
/* 42 */       System.out.print(n + " ");
/*    */     }
/*    */ 
/*    */     
/* 46 */     int[] arr2 = { 10, 7, 8, 9, 1, 5 };
/* 47 */     Arrays.sort(arr2);
/* 48 */     System.out.println("\nUse sort: " + Arrays.toString(arr2));
/*    */   }
/*    */ }



