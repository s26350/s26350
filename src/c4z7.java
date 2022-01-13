import java.util.Scanner;

class c4z7 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Podaj liczbe a:");
    int a = in.nextInt();
    System.out.println("Podaj liczbe b:");
    int b = in.nextInt();
    System.out.println("Podaj liczbe n:");
    int n = in.nextInt();

    if (a % n == 0 && b % n == 0) {
      System.out.println("Liczby " + a + " i " + b + " nie przystaja do siebie modulo " + n);
    } else {
    System.out.println("Liczby " + a + " i " + b + " przystaja do siebie modulo " + n);
    }

  }
}