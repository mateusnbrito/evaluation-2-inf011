package states.week_days_states;

import models.Program;
import states.ProgramState;

public class FridayProgramState extends ProgramState{
  public FridayProgramState(Program program) {
    super(program);
  }

  @Override
  public boolean isActiveDay() {
    Boolean returnStatement = false;

    switch(program.getProgramCategory()){
      case FULL:{
        returnStatement = true;
        break;
      }
      case ABDC:{
        returnStatement = false;
        break;
      }
      case CARDIO:{
        returnStatement = true;
        break;
      }
    }

    return returnStatement;
  }
}
