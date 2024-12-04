/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

/**
 *
 * @author edrag
 */
public class Car {
    private String carType;
    private Engine engine;
    
    public Car (String carType, String engineType, int engineYear, float cc){
        setCarType(carType);
        engine = new Engine (engineType,engineYear,cc);
//        setEngineType(engineType);
//        setEngineYear(engineYear);
//        setCC(cc);
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    
}
