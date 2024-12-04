/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

import java.util.List;

/**
 *
 * @author edrag
 */
public class Driver {
    private String driverName;
    private List<Car> listOfCars; //arraylist
    
    public Driver(String driverName,  List<Car> listOfCars){
        setDriverName(driverName);
        setListOfCars(listOfCars);
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public List<Car> getListOfCars() {
        return listOfCars;
    }

    public void setListOfCars(List<Car> listOfCars) {
        this.listOfCars = listOfCars;
    }    
}
