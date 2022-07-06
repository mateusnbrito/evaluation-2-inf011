package exercicios.equipamento.factories;

import exercicios.equipamento.interfaces.Equipamento;
import exercicios.equipamento.interfaces.EquipamentoHalteres;

public class FactoryEquipamentoHalteres extends FactoryEquipamento {

  public Equipamento createEquipamento(Double peso, String identificador, Integer quantidade) {
    return EquipamentoHalteres.getInstance(peso, identificador, quantidade);
  }

  @Override
  public Equipamento createEquipamento() {
    return null;
  }
}
