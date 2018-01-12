package com.example.design_pattern.decorator.base;

public class Test {

  public static void main(String[] args) {
    ConcreteComponent concreteComponent = new ConcreteComponent();
    ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
    ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
    concreteDecoratorA.setComponent(concreteComponent);
    concreteDecoratorB.setComponent(concreteDecoratorA);
    concreteDecoratorA.operation();
    concreteDecoratorB.operation();
  }
}
