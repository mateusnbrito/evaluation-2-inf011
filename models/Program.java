package models;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import enums.ProgramCategories;
import enums.WeekDays;
import services.NotificationService;
import states.ProgramState;
import states.week_days_states.FridayProgramState;
import states.week_days_states.MondayProgramState;
import states.week_days_states.SaturdayProgramState;
import states.week_days_states.SundayProgramState;
import states.week_days_states.ThursdayProgramState;
import states.week_days_states.TuesdayProgramState;
import states.week_days_states.WednesdayProgramState;

public class Program {
  private ProgramState currentState;
  private ProgramCategories programCategory;
  private Integer currentSerie = 0;
  private Boolean isActiveDay = false;
  private List<Serie> series = new ArrayList<>();
  private NotificationService notificationService;

  public Program(ProgramCategories programCategory) {
    this.programCategory = programCategory;

    notificationService = new NotificationService();
  }

  public ProgramState getCurrentState() {
    return currentState;
  }

  public void setCurrentState() {
    switch(getCurrentDay()){
      case DOMINGO: {
        this.currentState = new SundayProgramState(this);
        break;
      }
      case SEGUNDA: {
        this.currentState = new MondayProgramState(this);
        break;
      }
      case TERCA: {
        this.currentState = new TuesdayProgramState(this);
        break;
      }
      case QUARTA: {
        this.currentState = new WednesdayProgramState(this);
        break;
      }
      case QUINTA: {
        this.currentState = new ThursdayProgramState(this);
        break;
      }
      case SEXTA: {
        this.currentState = new FridayProgramState(this);
        break;
      }
      case SABADO: {
        this.currentState = new SaturdayProgramState(this);
        break;
      }
    }
  }

  public ProgramCategories getProgramCategory() {
    return programCategory;
  }

  public void setProgramCategory(ProgramCategories programCategory) {
    this.programCategory = programCategory;
  }

  public List<Serie> getSeries() {
    if(this.isActiveDay){
      return this.series;
    }
    else{
      return new ArrayList<>();
    }
  }

  public void setSeries(List<Serie> series) {
    this.series = series;
  }

  public void addSerie(Serie serie) {
    (this.series).add(serie);
  }

  public Integer getCurrentSerie() {
    return currentSerie;
  }

  public void nextSerie() {
    if(isActiveDay){
      if(series.size() > (this.currentSerie)){
        this.currentSerie++;
      }
      else{
        Notification notification = new Notification(getProgramCategory(), new Timestamp(System.currentTimeMillis()));
        notificationService.notifyAllClients(notification);

        this.currentSerie = 0;
      }
    }
    else{
      System.out.println("Hoje é dia de descanso...");
    }
  }

  public Boolean getIsActiveDay() {
    return isActiveDay;
  }

  public void setIsActiveDay(Boolean isActiveDay) {
    this.isActiveDay = isActiveDay;
  }

  public NotificationService getNotificationService() {
    return notificationService;
  }

  public void setNotificationService(NotificationService notificationService) {
    this.notificationService = notificationService;
  }

  public WeekDays getCurrentDay(){
    Calendar calendar = Calendar.getInstance();
    Integer dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); 

    return WeekDays.values()[dayOfWeek-1];
  }

  public void startProgram(){
    System.out.println("O programa foi iniciado...");

    setCurrentState();
    setIsActiveDay((this.currentState).isActiveDay());

    if(isActiveDay){
      if(series.size() > 0){
        series.forEach(serie -> {
          serie.startSerie();

          nextSerie();
        });
      }
      else{
        System.out.println("O programa não possui series...");
      }
    }
    else{
      System.out.println("Hoje é dia de descanso...");
    }
  }
}
