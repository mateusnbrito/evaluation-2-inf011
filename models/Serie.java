package models;

import java.io.File;

import exercicios.exercicio.interfaces.Exercicio;
import factories.VideoFactory;
import types.VideoType;

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
    VideoType videoType = VideoFactory.getVideoType("[VIDEO DO EXERCÍCIO "+this.exercise.getNome()+"]", new File("C:/video"));
    Video video = new Video(0.50, "MP4", "sports", videoType);

    System.out.println(this.exercise.getNome());
    System.out.println(this.qtyOfSeries);
    System.out.println(this.qtyOfRepetitionsPerSerie);
    System.out.println((video.getVideoType()));
  }
}
