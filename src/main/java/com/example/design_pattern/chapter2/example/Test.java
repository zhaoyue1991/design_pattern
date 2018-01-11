package com.example.design_pattern.chapter2.example;

public class Test {
  public static void main(String[] args) {
    CashContext cashContext = new CashContext(CashType.CASH_NORMAL);
    System.out.println(cashContext.getResult(1000D));
    cashContext = new CashContext(CashType.CASH_REBATE);
    System.out.println(cashContext.getResult(1000D));
    cashContext = new CashContext(CashType.CASH_RETURN);
    System.out.println(cashContext.getResult(1000D));
  }
}
