package models;

import exercicios.exercicio.interfaces.Exercicio;

public class Serie {
  private Integer qtyOfSeries;
  private Integer qtyOfRepetitionsPerSerie;
  private Exercicio exercise;

  public Serie(Integer qtyOfSeries, Integer qtyOfRepetitionsPerSerie, Exercicio exercise) {
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

  public Exercicio getExercise() {
    return exercise;
  }

  public void setExercise(Exercicio exercise) {
    this.exercise = exercise;
  }

  public void startSerie(){
    System.out.println(this.exercise.getNome());
    System.out.println(this.qtyOfSeries);
    System.out.println(this.qtyOfRepetitionsPerSerie);
    System.out.println(this.exercise.getVideo());
  }
}
