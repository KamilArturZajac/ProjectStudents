package com.capgemini.programowanie.obiektowe;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WarehouseConfigure {
    public List<MetalIngot> ClientMetalIngots = new ArrayList<>();
    public String addMetalIngot(String clientId, SupportedMetalType metalType, double mass) {
        MetalIngot newMetalIngot = new MetalIngot(clientId, metalType, mass);
        ClientMetalIngots.add(newMetalIngot);
        return "Dodano " + newMetalIngot.getMetalType() + " o masie " + newMetalIngot.getMass();
    }
    public double getTotalVolumeOccupiedByClient(String clientId){
        double volumeOccupiedByClient = 0;
        for (MetalIngot metalIngot : ClientMetalIngots) {
            if (Objects.equals(metalIngot.getClientId(), clientID)) {
                volumeOccupiedByClient ++;
            }
        }
        return volumeOccupiedByClient;
    }
}
