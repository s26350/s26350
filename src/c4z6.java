import java.util.Scanner;

class c4z6 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Wpisz liczbę: ");
    int liczba = in.nextInt();

    System.out.println("Signnum dla " + liczba + " to " + znakLiczby(liczba));
  
  }

  public static int znakLiczby(double d) {
    if (d == 0) return 0;
    if (d < 0) return -1;
    return 1;
  }
}