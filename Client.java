package com.capgemini.programowanie.obiektowe;

import java.time.LocalDate;

public class Client {
    private final String firstName;
    private final String lastName;
    private final String clientId;
    private final LocalDate clientCreationDate;
    private boolean isPremium;

    public Client(String firstName, String lastName, String clientId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientId = clientId;
        this.clientCreationDate = LocalDate.now();
        this.isPremium = false;
    }

    public String  getFirstName() { return firstName;}
    public String getLastName() { return lastName;}
    public String  getClientId() { return clientId;}
    public LocalDate getClientCreationDate() { return clientCreationDate;}
    public boolean getIsPremium() { return isPremium;}


    public void setPremium(boolean isPremium) {this.isPremium = isPremium;}
}
