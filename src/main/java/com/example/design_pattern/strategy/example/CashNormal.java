package com.example.design_pattern.strategy.example;

public class CashNormal extends CashSuper {

  @Override
  public Double acceptCash(Double money) {
    return money;
  }
}
