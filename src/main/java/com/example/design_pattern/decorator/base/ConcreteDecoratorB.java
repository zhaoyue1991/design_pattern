package com.example.design_pattern.decorator.base;

public class ConcreteDecoratorB extends Decorator {

  @Override
  public void operation() {
    super.operation();
    this.addedBehavior();
    System.out.println("装饰B对象的操作");
  }

  private void addedBehavior(){
    System.out.println("特例");
  }
}
