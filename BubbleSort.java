public class BubbleSort {
  public static void main(String[] args) {
    int[] a = {4, -1, 6, 5, 8, 3, 7, 2, 1, 0};
    int tmp;
    boolean bContinue = true;
    while (bContinue == true) {
      bContinue = false;
      for (int i = 0; i < a.length - 1; i++) {
        if (a[i + 1] < a[i]) {
          tmp = a[i];
          a[i] = a[i + 1];
          a[i + 1] = tmp;
          bContinue = true;
        }
      }
    }
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] +" ");
    }
  }
}
