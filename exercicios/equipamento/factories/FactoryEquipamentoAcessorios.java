package exercicios.equipamento.factories;

import exercicios.equipamento.interfaces.Equipamento;
import exercicios.equipamento.interfaces.EquipamentoAcessorios;

public class FactoryEquipamentoAcessorios extends FactoryEquipamento{
  public Equipamento createEquipamento(String descricao, String identificador, Integer quantidade) {
    return EquipamentoAcessorios.getInstance(descricao, identificador, quantidade);
  }

  @Override
  public Equipamento createEquipamento() {
    return null;
  }
}
