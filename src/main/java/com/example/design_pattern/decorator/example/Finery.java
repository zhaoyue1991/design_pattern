package com.example.design_pattern.decorator.example;

public class Finery extends Person {

  private Person person;

  public void Decorate(Person person) {
    this.person = person;
  }

  @Override
  public void show() {
    if (null != person) {
      person.show();
    }
  }
}
