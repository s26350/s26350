package com.company;

import java.util.Scanner;

class c3z2 {
  public static void main(String[] args) {
    int miesiac, rok;
    System.out.println("Podaj miesiac: ");
    Scanner in = new Scanner(System.in);
    miesiac = in.nextInt();
    System.out.println("Podaj rok:");
    rok = in.nextInt();

    switch (miesiac) {
        case 1:
        case 2:
        case 3:
          System.out.println(miesiac + "." + rok + " to I kwartal  " + rok + " roku");
          break;
        case 4:
        case 5:
        case 6:
          System.out.println(miesiac + "." + rok + " to II kwartal  " + rok + " roku");
          break;
        case 7:
        case 8:
        case 9:
          System.out.println(miesiac + "." + rok + " to III kwartal  " + rok + " roku");
          break;
        case 10:
        case 11:
        case 12:
          System.out.println(miesiac + "." + rok + " to IV kwartal  " + rok + " roku");
          break;
    }
  }
}