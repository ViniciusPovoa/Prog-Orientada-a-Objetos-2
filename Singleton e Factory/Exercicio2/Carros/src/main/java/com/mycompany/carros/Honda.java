package com.mycompany.carros;


public class Honda implements IVehicleMaker {
    
    @Override
    public IVehicle makeVehicle(String modelo){
        if(modelo.equals("City")){
            return new City();
        }
        else if(modelo.equals("Civic")){
            return new Civic();
        }
        else if(modelo.equals("Fit")){
            return new Fit();
        }
        return null;
    }
    
}
