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
public class Engine {
    private  String engineType;
    private int manufactureYear;
    private float cc;
    
    public Engine(String engineType, int manufactureYear, float cc){
        setEngineType(engineType);
        setManufactureYear(manufactureYear);
        setCC(cc);
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public float getCC() {
        return cc;
    }

    public void setCC(float cc) {
        this.cc = cc;
    }
}
