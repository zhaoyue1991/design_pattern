package com.example.design_pattern.decorator.base;

public class Decorator extends Component {

  private Component component;

  public void setComponent(Component component) {
    this.component = component;
  }

  @Override
  public void operation() {
    if (null != component) {
      component.operation();
    }
  }
}
