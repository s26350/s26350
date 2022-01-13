import java.util.Scanner;

class c4z2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Wpisz liczbę: ");
    int liczba = in.nextInt();

    if (liczba % 2 == 0) {
      System.out.println("Liczba " + liczba + " jest podzielna przez 2");
    }

    if (liczba % 3 == 0) {
      System.out.println("Liczba " + liczba + " jest podzielna przez 3");
    }

    if (liczba %5 == 0) {
      System.out.println("Liczba " + liczba + " jest podzielna przez 5");
    }
  }
}