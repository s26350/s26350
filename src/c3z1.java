package com.company;

import java.util.Scanner;

class c3z1 {
  public static void main(String[] args) {
    String imie;
    String nazwisko;
    String plec;
    Scanner in = new Scanner(System.in);
    System.out.println("Podaj imie: ");
    imie = in.nextLine();
    System.out.println("Podaj nazwisko: ");
    nazwisko = in.nextLine();
    System.out.println("Podaj plec (kobieta/mezczyzna): ");
    plec = in.nextLine();

    if (plec.equalsIgnoreCase("kobieta")) {
      System.out.println("Studentka: " + imie + " " + nazwisko);
    } else {
      System.out.println("Student: " + imie + " " + nazwisko);

    }
  }
}