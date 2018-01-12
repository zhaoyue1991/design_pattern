package com.example.design_pattern.decorator.base;

public class ConcreteDecoratorA extends Decorator {

  @Override
  public void operation() {
    super.operation();
    System.out.println("装饰A对象的操作");
  }
}
