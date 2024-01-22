package com.capgemini.programowanie.obiektowe;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClientConfigure implements Clients {
    public List <Client> Clients = new ArrayList<>();
    @Override
    public String createNewClient(String firstName, String lastName) {
        String clientID = String.valueOf(randomNumberForId());
        Client newClient = new Client(firstName, lastName, clientID);
        Clients.add(newClient);
        return newClient.getClientId();
    }
    private int randomNumberForId() {
        //Losowanie ID
        int randomNumber;
        //Zakres losowanego ID
        int min = 1;
        int max = 9999;
        do {
            randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        } while (isClientIdTaken(randomNumber));

        return randomNumber;
    }

    private boolean isClientIdTaken(int clientId) {
        //Sprawdzanie czy wylosowane ID nie jest już używane
        for (Client client : Clients) {
            if (Objects.equals(client.getClientId(), String.valueOf(clientId))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String activatePremiumAccount(String clientID) {
        //Aktywowanie statusu premium dla wybranego klienta
        String commentActivatePremiumAccount = null;
        for (Client client : Clients) {
            if (Objects.equals(client.getClientId(), clientID)) {
                client.setPremium(true);
                commentActivatePremiumAccount = clientID + " is now a premium user.";
                break;
            } else {
                commentActivatePremiumAccount = "Error - can't find this user";
            }
        }
        return commentActivatePremiumAccount;
    }

    @Override
    public String getClientFullName (String clientID) {
        //Wywoływanie pełnego imienia i nazwiska klienta
        String commentGetClientFullName = null;
        for (Client client : Clients) {
            if (Objects.equals(client.getClientId(), clientID)) {
                String firstName = client.getFirstName();
                String lastName = client.getLastName();
                commentGetClientFullName = clientID + " full name is " + firstName + " " + lastName;
                break;
            }
            else {
                commentGetClientFullName = "Error - can't find this user";
            }
        }
        return commentGetClientFullName;
    }

    @Override
    public LocalDate getClientCreationDate(String clientID) {
        //Wywoływanie daty utworzenia klienta
        LocalDate commentGetClientCreationDate = null;
        for (Client client : Clients) {
            if (Objects.equals(client.getClientId(), clientID)) {
                commentGetClientCreationDate = client.getClientCreationDate();
                break;
            } else {
                commentGetClientCreationDate = LocalDate.now();
            }
        }
        return commentGetClientCreationDate;
    }
            @Override
            public int getNumberOfPremiumClients(){
                //Wywoływanie liczby klientów premium
                int numberOfPremiumClients = 0;
                if (this.Clients.isEmpty()){ return 0; }
                for (Client client : Clients) {
                    if(client.getIsPremium()){
                        numberOfPremiumClients ++;
                    }
                }
                return numberOfPremiumClients;
            }
            @Override
            public boolean isPremiumClient(String clientId) {
                //Sprawdzanie statusu premium klienta
                boolean isPremiumCheck = false;
                if (this.Clients.isEmpty()) {
                    return false;
                }
                for (Client client : Clients) {
                    if (Objects.equals(client.getClientId(), clientId) && client.getIsPremium()) {
                        isPremiumCheck = true;
                        break;
                    }
                }
                return isPremiumCheck;
            }
            @Override
            public int getNumberOfClients(){
            //Wywołanie liczby klientów
                int numberOfClients = 0;
                if (this.Clients.isEmpty()){ return 0; }
                for (Client client : Clients) {
                    numberOfClients ++;
                }
                return numberOfClients;
            }
        }



