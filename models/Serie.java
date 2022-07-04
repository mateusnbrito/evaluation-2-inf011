package models;

public class Serie {
  private Integer qtyOfSeries;
  private Integer qtyOfRepetitionsPerSerie;
  private Exercise exercise;

  public Serie(Integer qtyOfSeries, Integer qtyOfRepetitionsPerSerie, Exercise exercise) {
    this.qtyOfSeries = qtyOfSeries;
    this.qtyOfRepetitionsPerSerie = qtyOfRepetitionsPerSerie;
    this.exercise = exercise;
  }

  public Integer getQtyOfSeries() {
    return qtyOfSeries;
  }

  public void setQtyOfSeries(Integer qtyOfSeries) {
    this.qtyOfSeries = qtyOfSeries;
  }

  public Integer getQtyOfRepetitionsPerSerie() {
    return qtyOfRepetitionsPerSerie;
  }

  public void setQtyOfRepetitionsPerSerie(Integer qtyOfRepetitionsPerSerie) {
    this.qtyOfRepetitionsPerSerie = qtyOfRepetitionsPerSerie;
  }

  public Exercise getExercise() {
    return exercise;
  }

  public void setExercise(Exercise exercise) {
    this.exercise = exercise;
  }

  public void startSerie(){
    System.out.println("A série foi iniciada...");
  }
}
