package com.generation.drive;

import java.util.HashMap;

public class DriversManager {
    private final HashMap<String, Passenger> passengersMap = new HashMap<>();

    private final HashMap<String, Driver> driversMap = new HashMap<>();

    public void addPassenger( Passenger passenger ) //recibe ojeto de tipo pasajero ._.
    {
        passengersMap.put( passenger.getId(), passenger ); //clave - valor, agrega pasajeros
        //no esta dando retroalimentacion de lo que hizo
    }
    //1 agregar pasajero /conductor
    //2 utilizar get para ver que hay dentro
    public void addDriver( Driver driver )
    {
        driversMap.put( driver.getId(), driver );
    }

    public Driver getDriver( String driverId )
    {
        return driversMap.getOrDefault( driverId, null );
    }

    public Passenger getPassenger( String passengerId )
    {
        return passengersMap.getOrDefault( passengerId, null );
    }

    public void startTrip( String passengerId, String driverId )
    {   //si la llave esta gregada en la coleccion...
        if ( passengersMap.containsKey( passengerId ) && driversMap.containsKey( driverId ) )
        {
            Passenger passenger = passengersMap.get( passengerId );
            passenger.startTrip();
            Driver driver = driversMap.get( driverId );
            driver.startTrip();
        }
    }

    public void endTrip( String passengerId, String driverId )
    {
        if ( passengersMap.containsKey( passengerId ) && driversMap.containsKey( driverId ) )
        {
            Driver driver = driversMap.get( driverId );
            driver.endTrip();
            Passenger passenger = passengersMap.get( passengerId );
            passenger.endTrip( driver.getFee() ); //calcula la tarifa del viaje
        }
    }

    public String findNextAvailableDriver()
    {
        return "driver_id";
    }
}
