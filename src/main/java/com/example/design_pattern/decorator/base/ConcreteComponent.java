package com.example.design_pattern.decorator.base;

public class ConcreteComponent extends Component {

  @Override
  public void operation() {
    System.out.println("具体对象操作");
  }
}
