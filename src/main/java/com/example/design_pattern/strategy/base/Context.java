package com.example.design_pattern.strategy.base;

public class Context {

  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public void ContextInterface() {
    this.strategy.AlgorithmInterface();
  }
}
