package services;

import java.util.ArrayList;
import java.util.List;

import models.Client;
import models.Notification;

public class NotificationService {
  private List<Client> clients;

  public NotificationService() {
    this.clients = new ArrayList<>();
  }

  public void subscribeClient(Client client){
    clients.add(client);
  }

  public void unsubscribeClient(Client client){
    clients.remove(client);
  }

  public void notifyAllClients(Notification notification){
    clients.forEach(client -> {
      client.sendNotification(notification);
    });
  }
}