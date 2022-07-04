package states;

import models.Program;

public abstract class ProgramState {
  protected Program program;

  public ProgramState(Program program) {
    this.program = program;
  }

  public abstract boolean isActiveDay();
}
