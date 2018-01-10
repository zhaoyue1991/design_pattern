package com.example.design_pattern.chapter2.base.example;

public class CashRebate extends CashSuper {

  private Double moneyRebate = 1D;

  public CashRebate(Double moneyRebate) {
    this.moneyRebate = moneyRebate;
  }

  @Override
  public Double acceptCash(Double money) {
    return money * moneyRebate;
  }
}
