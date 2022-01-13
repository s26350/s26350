import java.util.Scanner;

class c4z4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Wpisz liczbę: ");

    int liczba = in.nextInt();

    System.out.println("Miesiąc dla podanej liczby to: ");
    switch(liczba){
      case 1: System.out.println("Styczen"); break;
      case 2: System.out.println("Luty"); break;
      case 3: System.out.println("Marzec"); break;
      case 4: System.out.println("Kwiecien"); break;
      case 5: System.out.println("Maj"); break;
      case 6: System.out.println("Czerwiec"); break;
      case 7: System.out.println("Lipiec"); break;
      case 8: System.out.println("Sierpien"); break;
      case 9: System.out.println("Wrzesien"); break;
      case 10: System.out.println("Pazdziernik"); break;
      case 11: System.out.println("Listopad"); break;
      case 12: System.out.println("Grudzien"); break;


    }
  }
}