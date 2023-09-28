public class InsertionSort {
  public static void main(String[] args) {
    int[] a = {4, -1, 6, 5, 8, 3, 7, 2, 1, 0};
    for (int i = 1; i < a.length; i++) {
      int value = a[i];
      int j;
      for (j = i - 1; j >= 0 && a[j] > value; j--) {
        a[j + 1] = a[j];
      }
      a[j + 1] = value;
    }
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] +" ");
    }
  }
}
