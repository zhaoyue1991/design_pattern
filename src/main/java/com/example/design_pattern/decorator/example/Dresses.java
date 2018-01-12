package com.example.design_pattern.decorator.example;

public class Dresses extends Finery{

  @Override
  public void show() {
    System.out.println("裙子");
    super.show();
  }
}
