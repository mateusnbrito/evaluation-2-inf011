package exercicios.equipamento.interfaces;

public abstract class Equipamento {
  String identificador;
  Integer quantidade;

  public String getIdentificador() {
    return identificador;
  }

  public Integer getQuantidade() {
    return quantidade;
  }

  @Override
  public String toString() {
    return "Equipamento [identificador=" + identificador + ", quantidade=" + quantidade + "]";
  }
}