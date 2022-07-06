package exercicios.exercicio.interfaces;

import java.util.ArrayList;

import exercicios.enums.TiposDeExercicios;
import exercicios.enums.TiposDeGruposMusculares;
import exercicios.equipamento.interfaces.Equipamento;

public class Exercicio {
  private String nome;
  private String video;
  private ArrayList<TiposDeExercicios> categorias;
  private ArrayList<TiposDeGruposMusculares> gruposMusculares;
  private ArrayList<Equipamento> equipamentos;

  private Exercicio(String nome, String video, ArrayList<TiposDeExercicios> categorias, ArrayList<TiposDeGruposMusculares> gruposMusculares, ArrayList<Equipamento> equipamentos) {
    this.nome = nome;
    this.video = video;
    this.categorias = categorias;
    this.gruposMusculares = gruposMusculares;
    this.equipamentos = equipamentos;
  }

  public static final class ExercicioBuilder{
    private String nome;
    private String video;
    private ArrayList<TiposDeExercicios> categorias;
    private ArrayList<TiposDeGruposMusculares> gruposMusculares;
    private ArrayList<Equipamento> equipamentos;

    public ExercicioBuilder() {}

    public static ExercicioBuilder exercicioBuilder() {
      return new ExercicioBuilder();
    }

    public ExercicioBuilder nome(String nome){
      this.nome = nome;
      return this;
    }

    public ExercicioBuilder video(String video){
      this.video = video;
      return this;
    }

    public ExercicioBuilder categorias(ArrayList<TiposDeExercicios> categorias){
      // categorias.size() > 0
      this.categorias = categorias;
      return this;
    }

    public ExercicioBuilder gruposMusculares(ArrayList<TiposDeGruposMusculares> gruposMusculares){
      this.gruposMusculares = gruposMusculares;
      return this;
    }

    public ExercicioBuilder equipamentos(ArrayList<Equipamento> equipamentos){
      this.equipamentos = equipamentos;
      return this;
    }

    public Exercicio build(){
      return new Exercicio(nome, video, categorias, gruposMusculares, equipamentos);
    }
  }

  public String getNome() {
    return nome;
  }

  public ArrayList<TiposDeExercicios> getCategorias() {
    return categorias;
  }

  public ArrayList<TiposDeGruposMusculares> getGruposMusculares() {
    return gruposMusculares;
  }

  public ArrayList<Equipamento> getEquipamentos() {
    return equipamentos;
  }

  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  @Override
  public String toString() {
    return "\nNome: " + nome + "\nVideo: " + video + "\nCategorias: " + categorias + "\nGrupos Musculares: " + gruposMusculares + "\nEquipamentos:\n" + equipamentos + "\n";
  }
}
