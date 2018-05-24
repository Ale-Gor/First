public class FirstLoop {

  public static void main(String[] args) {

    String[] names = {"Marcin", "Mateusz", "Mateusz", "Bartek", "Jacek"};
    String toFind = "Mateusz";

    System.out.println(counter(names, toFind));
  }

  public static int counter(String[] y, String toFind) {
    int count = 0;
    for (int i = 0; i < 5; i++) {
      if (y[i].equals(toFind)) {
        count++;
      }
    }
    return count;
  }
}
