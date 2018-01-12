package com.example.design_pattern.strategy.example;

public enum CashType {

  CASH_NORMAL("CashNormal"),
  CASH_REBATE("CashRebate"),
  CASH_RETURN("CashReturn");

  private String name;

  CashType(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
