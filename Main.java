import java.util.ArrayList;
import java.util.List;

import enums.ProgramCategories;
import models.Client;
import models.Exercise;
import models.Program;
import models.Serie;

public class Main {
  public static void main(String[] args) {
    Client newClient = new Client("cliente@email.com", "(71)999999-9999");
    Program newProgram = new Program(ProgramCategories.FULL);
    List<Program> programs = new ArrayList<>();

    // Criação de novas séries
    newProgram.addSerie(new Serie(2, 8, new Exercise("Supino reto")));
    newProgram.addSerie(new Serie(2, 8, new Exercise("Bicicleta Ergométrica")));

    // Inscrição do cliente nas notificações do programa
    newProgram.getNotificationService().subscribeClient(newClient);

    newProgram.startProgram();
    newProgram.nextSerie();

    // Criação de um novo programa de treinamento
    programs.add(newProgram);

    // Iteração do array de programas
    // programs.forEach(program -> {
    //   System.out.println(program.getProgramCategory());
    // });
  }
}