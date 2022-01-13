package com.company;

import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class


class c3z5 {
  public static void main(String[] args) {
    ArrayList<String> nazwy = new ArrayList<String>();
    ArrayList<Integer> minuty = new ArrayList<Integer>();
    ArrayList<Integer> sekundy = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);
    for (int i = 0; i < 2; i++) {
      System.out.println("Podaj tytul:");
      nazwy.add(in.next());
      System.out.println("Podaj minuty:");
      minuty.add(in.nextInt());
      System.out.println("Podaj sekundy:");
      sekundy.add(in.nextInt());

    }
    int min = 0;
    int sek = 0;
    for (int i = 0; i < 2; i++) {
      min += minuty.get(i);
      sek += sekundy.get(i);
    } if (min >= 60) {
      min += sek / 60;
      sek -= 60;
    }

    System.out.println("Utwory:");
    for (int i = 0; i < 2; i++) {
      System.out.println(i + 1 + ". " + nazwy.get(i) + " " + minuty.get(i) + ":" + sekundy.get(i));

    }
    System.out.println("Laczny czas trwania: " + min + ":" + sek);
  }
}