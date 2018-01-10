package com.example.design_pattern.chapter2.base.example;

public class CashContext {

  private CashSuper cashSuper;

  public CashContext(CashType cashType) {
    switch (cashType) {
      case CASH_NORMAL:
        cashSuper = new CashNormal();
        break;
      case CASH_REBATE:
        cashSuper = new CashRebate(0.9D);
        break;
      case CASH_RETURN:
        cashSuper = new CashReturn(300D, 100D);
        break;
      default:
        break;
    }
  }

  public Double getResult(Double money) {
    return cashSuper.acceptCash(money);
  }
}
