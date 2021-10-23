package com.generation.drive;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DriversManagerTest {
    private final DriversManager driversManager = new DriversManager();

    @BeforeEach
    public void setup() {
        driversManager.addPassenger(new Passenger("Carlos", "44234", 100));
        driversManager.addPassenger(new Passenger("Elise", "533434", 100));
        driversManager.addPassenger(new Passenger("Ian", "5343433", 100));
        driversManager.addPassenger(new Passenger("Debbie", "44555521", 100));
        driversManager.addPassenger(new Passenger("Cleon", "559988", 100));
        driversManager.addPassenger(new Passenger("Santiago", "1203123", 100));

        driversManager.addDriver(new Driver("Emilio", "1234990", 10f));
        driversManager.addDriver(new Driver("Pedro", "12312440", 12f));
        driversManager.addDriver(new Driver("Constanza", "9824990", 11f));
    }

    @Test
    public void passengerAdded() {
        //1 crear objeto tipo pasajero
        //prueba para verificar que el objeto se haya agregado
        //creo el passenger, lo agrego y lo solicito
        //segun passenger hay 2 consttucotrs, con string name - string id
        Passenger passenger = new Passenger("Abby RT", "ABC123");
        driversManager.addPassenger(passenger);
        assertEquals(passenger, driversManager.getPassenger(passenger.getId()));
    }

//prueba para verificar que los conductores hayan sido agregados
    @Test
    public void driverAdded(){
        Driver driver = new Driver("conductor", "123", 9f);
        driversManager.addDriver(driver);
        assertEquals(driver,driversManager.getDriver(driver.getId()));

    }

//    @Test
//    public void startTripTest(){
//
//    }
//
//    @Test
//    public void endTripTest(){
//
//    }
//
//    @Test
//    public void nextAvailableDriverTest(){
//
//    }

}
