import java.util.Scanner;

class c4z1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Program służy do obliczenia pola figur:");
    System.out.println("1 – prostokąta");
    System.out.println("2 – kwadratu");
    System.out.println("3 – trójkąta");
    System.out.println("4 – rombu");
    System.out.println("5 – równoległoboku");
    System.out.println("6 – trapezu");
    System.out.println("Powiedz proszę, jaka figura Ciebie interesuje:");
    int choice = in.nextInt();

    switch (choice) {
      case 1: 
        float x,y;
        System.out.println("Wybrales prostokąt");
        System.out.println("Podaj dlugosc: ");
        x = in.nextFloat();
        System.out.println("Podaj szerokosc: ");
        y = in.nextFloat();
        System.out.println("Pole jest równe: " + x*y);
        break;
      case 2: 
        float z;
        System.out.println("Wybrales kwadrat");
        System.out.println("Podaj dlugosc: ");
        z = in.nextFloat();
        System.out.println("Pole jest równe: " + z*z);
        break;
      case 3:
        System.out.println("Wybrales trojkat");
        System.out.println("Podaj dlugosc podstawy: ");
        x = in.nextFloat();
        System.out.println("Podaj wysokosc: ");
        y = in.nextFloat();
        System.out.println("Pole jest równe: " + 0.5*x*y);
        break;
      case 4:
        System.out.println("Wybrales romb");
        System.out.println("Podaj dlugosc podstawy: ");
        x = in.nextFloat();
        System.out.println("Podaj wysokosc: ");
        y = in.nextFloat();
        System.out.println("Pole jest równe: " + x*y);
        break;
      case 5:
        System.out.println("Wybrales rownoleglobok");
        System.out.println("Podaj dlugosc podstawy: ");
        x = in.nextFloat();
        System.out.println("Podaj wysokosc: ");
        y = in.nextFloat();
        System.out.println("Pole jest równe: " + x*y);
      break;      
      case 6:
        System.out.println("Wybrales trapez");
        System.out.println("Podaj dlugosc podstawy a: ");
        x = in.nextFloat();
        System.out.println("Podaj dlugosc podstawy b: ");
        y = in.nextFloat();
        System.out.println("Podaj wysokosc: ");
        z = in.nextFloat();
        System.out.println("Pole jest równe: " + 0.5*(x+y)*z);
        break;   
      default: System.out.println("Invalid choice");
    }
  }
}