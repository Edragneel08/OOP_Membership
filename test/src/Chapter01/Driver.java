/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter01;

/**
 *
 * @author edrag
 */
public class Driver {
    public static void main(String[] args) {
        Student std_obj01 = new Student(); //object
        Student std_obj02 = new Student();
        
        std_obj01.name = "Mano";
        std_obj01.height = 1.7;
        std_obj01.weight = 90.5;
        
        std_obj02.name = "sya";
        std_obj02.height = 1.68;
        std_obj02.weight = 76.7;
        
        System.out.println("BMI "+std_obj01.name+": "+std_obj01.cal_BMI());
        System.out.println("BMI "+std_obj02.name+": "+std_obj02.cal_BMI());
    }
}
