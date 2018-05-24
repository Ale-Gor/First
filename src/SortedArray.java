
public class SortedArray {

  public static void main(String[] args) {
    int[] a = {-2, 5, 0, 4, -3, 88, 99};
    int[] sorted = sortArray(a);
    for (int z = 0; z < sorted.length; z++) {
      System.out.println(sorted[z]);
    }

  }

  public static int[] sortArray(int[] a) {

    for (int i = a.length - 1; i > 0; i--) {
      for (int x = 0; x < i; x++) {
        if (a[x] > a[x + 1]) {
          int temp = a[x];
          a[x] = a[x + 1];
          a[x + 1] = temp;
        }
      }

    }
    return a;
  }
}


