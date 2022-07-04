package models;

import java.util.UUID;

public class Client {
  private UUID id;
  private String email;
  private String phoneNumber;

  public Client(String email, String phoneNumber) {
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void sendNotification(Notification notification){
    System.out.println(notification);
  }
}
