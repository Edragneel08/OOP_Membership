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
public class Student {
    //state, data fields, data members, properties
    String name, matricNo;
    int age;
    char gender;
    double weight, height;
    
    
    //behaviour, METHODS - verbs
    public String subProject(){
        return "OOP PROJECT";
    }
    
    public void fill_attend(){
    }
    
    public double cal_BMI(){
        return weight/(height*height);
    }
}
