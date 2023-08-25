package com.mycompany.carros;


public class Toyota implements IVehicleMaker {
    
    public IVehicle makeVehicle(String modelo){
        if(modelo.equals("Etios")){
            return new Etios();
        }
        else if(modelo.equals("Corolla")){
            return new Corolla();
        }
        else if(modelo.equals("Hillux")){
            return new Hillux();
        }
        return null;
    }
}
