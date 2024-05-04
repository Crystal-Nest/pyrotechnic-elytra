package it.crystalnest.pyrotechnic_elytra.platform.model;

/**
 * Environment.
 */
public enum Environment {
  /**
   * Development environment identifier.
   */
  DEV("development"),
  /**
   * Production environment identifier.
   */
  PROD("production");

  /**
   * Platform name.
   */
  private final String name;

  /**
   * @param name This {@link #name}.
   */
  Environment(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}