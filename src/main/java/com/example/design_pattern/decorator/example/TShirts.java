package com.example.design_pattern.decorator.example;

public class TShirts extends Finery {

  @Override
  public void show() {
    System.out.println("T恤");
    super.show();
  }
}
