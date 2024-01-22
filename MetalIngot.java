package com.capgemini.programowanie.obiektowe;

public class MetalIngot {
    private final String clientId;
    private final SupportedMetalType metalType;
    private final double mass;

    public MetalIngot(String clientId, SupportedMetalType metalType, double mass) {
        this.clientId = clientId;
        this.metalType = metalType;
        this.mass = mass;
    }
    public String getClientId() { return clientId;}
    public SupportedMetalType  getMetalType() { return metalType;}
    public double getMass() { return mass;}
}
