package com.campusdual.classroom;

public class FuelTank {

  protected int actualFuel = 10;

  public void setActualFuel(int actualFuel) {
    if (actualFuel >= 0) {
      this.actualFuel = actualFuel;
    } else {
      System.out.println("La capacidad no puede ser negativa");
    }
  }
  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.getActualFuel() + " litros.");
  }

  public int getActualFuel() {
    return this.actualFuel;
  }
}
