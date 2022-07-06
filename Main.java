import java.util.ArrayList;
import java.util.List;

import exercicios.enums.TiposDeEquipamentos;
import exercicios.enums.TiposDeExercicios;
import exercicios.enums.TiposDeGruposMusculares;
import exercicios.equipamento.factories.FactoryEquipamentoAcessorios;
import exercicios.equipamento.factories.FactoryEquipamentoHalteres;
import exercicios.equipamento.factories.FactoryEquipamentoMaquinas;
import exercicios.equipamento.interfaces.Equipamento;
import exercicios.exercicio.interfaces.Exercicio;
import exercicios.exercicio.interfaces.Exercicio.ExercicioBuilder;
import enums.ProgramCategories;
import models.Client;
import models.Program;
import models.Serie;

public class Main {
  public static void main(String[] args) {
    TiposDeEquipamentos equipamentoTipoDeEquipamento;
    String equipamentoDescricao = "";
    String equipamentoMarca = "";
    Double equipamentoPeso = null;
    String equipamentoIdentificador = "";
    Integer equipamentoQuantidade = null;
    String exercicioNome = "";
    ArrayList<TiposDeExercicios> exercicioCategorias = new ArrayList<>();
    ArrayList<TiposDeGruposMusculares> exercicioGruposMusculares = new ArrayList<>();
    ArrayList<TiposDeEquipamentos> exercicioEquipamentos = new ArrayList<>();
    ArrayList<Equipamento> equipamentos = new ArrayList<>();

    // Esquema de Criação de Equipamentos
    equipamentoTipoDeEquipamento = TiposDeEquipamentos.MAQUINAS;
    equipamentoDescricao = "Esteira Ergométrica";
    equipamentoMarca = "Life Fitness";
    equipamentoPeso = 10.0;
    equipamentoIdentificador = "1";
    equipamentoQuantidade = 1;

    // novoEquipamento1
    Equipamento novoEquipamento1 = criarEquipamento(equipamentoTipoDeEquipamento, equipamentoDescricao, equipamentoMarca, equipamentoPeso, equipamentoIdentificador, equipamentoQuantidade);

    exercicioNome = "Caminhada na Esteira";
    exercicioCategorias.add(TiposDeExercicios.CARDIOVASCULAR);
    exercicioCategorias.add(TiposDeExercicios.MOBILIDADE);
    exercicioGruposMusculares.add(TiposDeGruposMusculares.COXAS);
    exercicioGruposMusculares.add(TiposDeGruposMusculares.PANTURRILHAS);
    exercicioEquipamentos.add(TiposDeEquipamentos.MAQUINAS);
    equipamentos.add(novoEquipamento1);

    // novoExercicio1
    Exercicio novoExercicio1 = ExercicioBuilder.exercicioBuilder()
      .nome(exercicioNome)
      .categorias(exercicioCategorias)
      .gruposMusculares(exercicioGruposMusculares)
      .equipamentos(equipamentos)
      .build();

    Client newClient = new Client("cliente@email.com", "(71)999999-9999");
    Program newProgram = new Program(ProgramCategories.ABDC);
    List<Program> programs = new ArrayList<>();

    // Criação de novas séries
    newProgram.addSerie(new Serie(2, 8, novoExercicio1));

    // Inscrição do cliente nas notificações do programa
    newProgram.getNotificationService().subscribeClient(newClient);

    newProgram.startProgram();
    // newProgram.startProgram();
    newProgram.nextSerie();

    // Criação de um novo programa de treinamento
    programs.add(newProgram);

    // Iteração do array de programas
    // programs.forEach(program -> {
    //   System.out.println(program.getProgramCategory());
    // });
  }

  private static Equipamento criarEquipamento(TiposDeEquipamentos tiposDeEquipamentos, String descricao, String marca, Double peso, String identificador, Integer quantidade) {
    Equipamento equipamento = null;

    switch(tiposDeEquipamentos){
      case ACESSORIOS: {
        equipamento = new FactoryEquipamentoAcessorios().createEquipamento(descricao, identificador, quantidade);
        break;
      }
      case HALTERES: {
        equipamento = new FactoryEquipamentoHalteres().createEquipamento(peso, identificador, quantidade);
        break;
      }
      case MAQUINAS: {
        equipamento = new FactoryEquipamentoMaquinas().createEquipamento(descricao, marca, identificador, quantidade);
        break;
      }
      default:
        break;
    }

    return equipamento;
  }
}