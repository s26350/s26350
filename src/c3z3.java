package com.company;

import java.util.Scanner;

class c3z3 {
  public static void main(String[] args) {
    System.out.println("Podaj rok: ");
    int rok;
    Scanner in = new Scanner(System.in);
    rok = in.nextInt();

    if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 4 == 0 && rok % 400 == 0)) {
      System.out.println("Rok przestepny");
    } else {
      System.out.println("Rok nie przestepny");
    }
  }
}