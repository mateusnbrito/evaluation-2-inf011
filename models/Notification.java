package models;

import java.sql.Timestamp;

import enums.ProgramCategories;

public class Notification {
  private ProgramCategories programCategory;
  private Timestamp timestamp;

  public Notification(ProgramCategories programCategory, Timestamp timestamp) {
    this.programCategory = programCategory;
    this.timestamp = timestamp;
  }

  public ProgramCategories getProgramCategory() {
    return programCategory;
  }

  public void setProgramCategory(ProgramCategories programCategory) {
    this.programCategory = programCategory;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public String toString() {
    return "Notification [programCategory=" + programCategory + ", timestamp=" + timestamp + "]";
  }
}
