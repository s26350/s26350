import java.util.Scanner;

class c4z3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Wpisz liczbę: ");
    int liczba = in.nextInt();

    if (liczba > 0 && liczba < 10) {
      System.out.println("Liczba " + liczba + " jest jednocyfrowa");
    }

    if (liczba > 10 && liczba < 100) {
      System.out.println("Liczba " + liczba + " jest dwuocyfrowa");
    }

    if (liczba > 100 && liczba < 1000) {
      System.out.println("Liczba " + liczba + " jest trzycyfrowa");
    }

    if (liczba > 1000 && liczba < 10000) {
      System.out.println("Liczba " + liczba + " jest czterocyfrowa");
    }
  }
}