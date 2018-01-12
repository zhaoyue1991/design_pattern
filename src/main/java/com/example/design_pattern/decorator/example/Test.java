package com.example.design_pattern.decorator.example;

public class Test {
  public static void main(String[] args) {
    Person person = new Person("AAA");
    TShirts tShirts = new TShirts();
    Dresses dresses = new Dresses();
    tShirts.Decorate(person);
    dresses.Decorate(tShirts);
    dresses.show();
  }
}
