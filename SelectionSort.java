public class SelectionSort {
  public static void main(String[] args) {
    int[] a = {4, -1, 6, 5, 8, 3, 7, 2, 1, 0};
    for (int i = 0; i < a.length - 1; i++) {
      int minIndex = i;
      int min = a[minIndex];
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] < min) {
          minIndex = j;
          min = a[minIndex];
        }
      }
      int T = a[minIndex];
      a[minIndex] = a[i];
      a[i] = T;
    }
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] +" ");
    }
  }
}