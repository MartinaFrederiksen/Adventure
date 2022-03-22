package com.company;

import java.util.Scanner;

public class Adventure {
  GameManager gm = new GameManager();

  public static void main(String[] args) throws InterruptedException {
    Adventure obj = new Adventure();
    obj.gm.execute();
  }
}


