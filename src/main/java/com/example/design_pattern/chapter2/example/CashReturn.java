package com.example.design_pattern.chapter2.example;

public class CashReturn extends CashSuper {

  private Double moneyCondition = 0D;
  private Double moneyReturn = 0D;

  public CashReturn(Double moneyRebate, Double moneyReturn) {
    this.moneyCondition = moneyRebate;
    this.moneyReturn = moneyReturn;
  }

  @Override
  public Double acceptCash(Double money) {
    if (money > moneyCondition) {
      return money - Math.floor(money / moneyCondition) * moneyReturn;
    }
    return money;
  }
}
