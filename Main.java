package com.capgemini.programowanie.obiektowe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        WarehouseConfigure warehouseConfigure = new WarehouseConfigure();
        String metal1 = warehouseConfigure.addMetalIngot("4565", SupportedMetalType.COPPER, 10.01);

        ClientConfigure clientConfigure = new ClientConfigure();
        //Tworzenie przykładowych klientów
        String client1 = clientConfigure.createNewClient("Jan", "Kowalski");
        String client2 = clientConfigure.createNewClient("Mateusz", "Nowak");
        String client3 = clientConfigure.createNewClient("Janina", "Kowalczyk");

        //Aktywowanie premium dla klienta 1
        clientConfigure.activatePremiumAccount(client1);

        //Wywoływanie pełnego imienia i nazwiska klienta 1
        String fullName = clientConfigure.getClientFullName(client1);
        System.out.println(fullName);

        //Wywoływanie daty utworzenia klienta 2
        LocalDate creationDate = clientConfigure.getClientCreationDate(client2);
        System.out.println(creationDate);

        //Wywoływanie statusu premium klienta 1
        boolean isPremium = clientConfigure.isPremiumClient(client1);
        System.out.println(client1 + " is premium? " + isPremium);

        //Wywoływanie liczby klientów
        int numberOfClients = clientConfigure.getNumberOfClients();
        System.out.println("Total number of clients: " + numberOfClients);

        //Wywoływanie liczby klientów premium
        int numberOfPremiumClients = clientConfigure.getNumberOfPremiumClients();
        System.out.println("Total number of premium clients: " + numberOfPremiumClients);
    }
}
