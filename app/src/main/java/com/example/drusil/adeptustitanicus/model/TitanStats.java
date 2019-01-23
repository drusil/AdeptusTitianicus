package com.example.drusil.adeptustitanicus.model;

public class TitanStats {
  private int command;
  private int ballisticSkill;
  private int weaponSkill;
  private int[] manoeuvre;
  private int servitorClade;
  private int[] speed;
  private int scale;

  public TitanStats() {
    manoeuvre = new int[2];
    speed = new int[2];
  }

  public TitanStats addComandValue(int comandValue) {
    this.command = comandValue;
    return this;
  }

  public TitanStats addBalisticSkill(int ballisticSkill) {
    this.ballisticSkill = ballisticSkill;
    return this;
  }

  public TitanStats addWeaponSkill(int weaponSkill) {
    this.weaponSkill = weaponSkill;
    return this;
  }

  public TitanStats addManoeuvre(int normalManoeuvre, int overchargeManoeuvre) {
    manoeuvre[0] = normalManoeuvre;
    manoeuvre[1] = overchargeManoeuvre;
    return this;
  }

  public TitanStats addSpeed(int normalSpeed, int overchargeSpeed) {
    speed[0] = normalSpeed;
    speed[1] = overchargeSpeed;
    return this;
  }

  public TitanStats addServitorClade(int servitorClade) {
    this.servitorClade = servitorClade;
    return this;
  }

  public String getCommand() {
    return command + "+";
  }

  public String getBallisticSkill() {
    return ballisticSkill + "+";
  }

  public String getWeaponSkill() {
    return weaponSkill + "+";
  }

  public String getManoeuvre() {
    return manoeuvre[0] + "/" + manoeuvre[1];
  }

  public String getServitorClade() {
    return servitorClade + "";
  }

  public String getSpeed() {
    return speed[0] + "\"/\"" + speed[1] + "\"";
  }

  public TitanStats addScale(int scale) {
    this.scale = scale;
    return this;
  }


}
