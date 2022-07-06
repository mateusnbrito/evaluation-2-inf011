package exercicios.equipamento.interfaces;

public class EquipamentoAcessorios extends Equipamento{
  String descricao;

  private static EquipamentoAcessorios instance;

  private EquipamentoAcessorios(String descricao, String identificador, Integer quantidade){
    this.identificador = identificador;
    this.quantidade = quantidade;
    this.descricao = descricao;
  }

  public static EquipamentoAcessorios getInstance(String descricao, String identificador, Integer quantidade){
    if(instance == null){
      instance = new EquipamentoAcessorios(descricao, identificador, quantidade);
    }
    else{
      instance.quantidade+=quantidade;
    }

    return instance;
  }

  public String getDescricao() {
    return descricao;
  }

  @Override
  public String toString() {
    return "\nIdentificador: " + identificador + "\nQuantidade: " + quantidade + "\nDescricao: " + descricao;
  }
}
