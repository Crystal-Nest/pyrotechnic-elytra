package it.crystalnest.pyrotechnic_elytra.platform.model;

/**
 * Environment.
 */
public enum Environment {
  /**
   * Development environment identifier.
   */
  DEVELOPMENT,
  /**
   * Production environment identifier.
   */
  PRODUCTION;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}
