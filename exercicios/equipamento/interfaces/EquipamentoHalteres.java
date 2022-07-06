package exercicios.equipamento.interfaces;

public class EquipamentoHalteres extends Equipamento{
  Double peso;

  private static EquipamentoHalteres instance;

  private EquipamentoHalteres(Double peso, String identificador, Integer quantidade){
    this.peso = peso;
    this.identificador = identificador;
    this.quantidade = quantidade;
  }

  public static EquipamentoHalteres getInstance(Double peso, String identificador, Integer quantidade){
    if(instance == null){
      instance = new EquipamentoHalteres(peso, identificador, quantidade);
    }
    else{
      instance.quantidade+=quantidade;
    }

    return instance;
  }

  public Double getPeso() {
    return peso;
  }

  @Override
  public String toString() {
    return "\nIdentificador: " + identificador + "\nQuantidade: " + quantidade + "\nPeso: " + peso;
  }
}
