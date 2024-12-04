/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

/**
 *
 * @author edrag
 */
class Student {
    private String StudentName;
    
    public Student(String name){
        this.StudentName=name;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {  
        this.StudentName = StudentName;
    }
    
}
