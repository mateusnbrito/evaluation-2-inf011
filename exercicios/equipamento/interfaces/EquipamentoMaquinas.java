package exercicios.equipamento.interfaces;

public class EquipamentoMaquinas extends Equipamento {
  String descricao;
  String marca;

  private static EquipamentoMaquinas instance;

  private EquipamentoMaquinas(String descricao, String marca, String identificador, Integer quantidade){
    this.descricao = descricao;
    this.marca = marca;
    this.identificador = identificador;
    this.quantidade = quantidade;
  }

  public static EquipamentoMaquinas getInstance(String descricao, String marca, String identificador, Integer quantidade){
    if(instance == null){
      instance = new EquipamentoMaquinas(descricao, marca, identificador, quantidade);
    }
    else{
      instance.quantidade+=quantidade;
    }

    return instance;
  }

  public String getDescricao() {
    return descricao;
  }

  public String getMarca() {
    return marca;
  }

  @Override
  public String toString() {
    return "\nIdentificador: " + identificador + "\nQuantidade: " + quantidade + "\nDescricao: " + descricao  + "\nMarca: " + marca;
  }

}
