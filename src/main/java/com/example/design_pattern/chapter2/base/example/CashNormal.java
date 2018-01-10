package com.example.design_pattern.chapter2.base.example;

public class CashNormal extends CashSuper {

  @Override
  public Double acceptCash(Double money) {
    return money;
  }
}
