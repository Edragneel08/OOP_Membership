/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edrag
 */
public class DriverTest {
    public static void main(String[] args) {
        Car ObjCar1 = new Car("Persona","Mivec",2019,1500);
        Car ObjCar2 = new Car("Honda","vvti",2020,1360);

        List<Car> listOfCars = new ArrayList<>();
        listOfCars.add(ObjCar1);
        listOfCars.add(ObjCar2);
        
        Driver driver1 = new Driver("Rahman",listOfCars);
        Driver driver2 = new Driver("Ramlah",listOfCars);
        
        for ( Car c : listOfCars) {
            System.out.println(c.getCarType()+c.getEngine().getEngineType()+c.getEngine().getManufactureYear()+c.getEngine());
        }
    }
}
