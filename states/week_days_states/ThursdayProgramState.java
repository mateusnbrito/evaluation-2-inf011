package states.week_days_states;

import models.Program;
import states.ProgramState;

public class ThursdayProgramState extends ProgramState{
  public ThursdayProgramState(Program program) {
    super(program);
  }

  @Override
  public boolean isActiveDay() {
    Boolean returnStatement = false;

    switch(program.getProgramCategory()){
      case FULL:{
        returnStatement = false;
        break;
      }
      case ABDC:{
        returnStatement = true;
        break;
      }
      case CARDIO:{
        returnStatement = false;
        break;
      }
    }

    return returnStatement;
  }
}
