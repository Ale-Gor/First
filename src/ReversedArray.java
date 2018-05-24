public class ReversedArray {

  public static void main(String[] args) {
    int[] a = {-2, 5, 0, 4, -3, 88, 99};
    int[] reversed = reverse(a);
    print(reversed);
  }

  public static int[] reverse(int[] a) {
    for (int i = 0; i <= a.length / 2; i++) {
      int tempx = a[i];
      a[i] = a[a.length - i - 1];
      a[a.length - i - 1] = tempx;
    }
    return a;
  }

  public static void print(int[] b) {
    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i]);
    }
  }
}