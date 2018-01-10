package com.example.design_pattern.chapter2.base;

public class Context {

  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public void ContextInterface() {
    this.strategy.AlgorithmInterface();
  }
}
