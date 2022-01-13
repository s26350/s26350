package com.company;

import java.util.Scanner;

class c3z4 {
  public static void main(String[] args) {
    int ileSztuk = 0;
    boolean promocja = true;
    Scanner in = new Scanner(System.in);
    System.out.println("Podaj ilość sztuk: ");
    ileSztuk = in.nextInt();
    double cena = 10;

    if (promocja) {
      if (ileSztuk > 10) {
        cena = cena / 2.0;
      }
    } else {
      cena *= 1.1;
    }
    System.out.println("Cena równa się: "+cena);
  }
}