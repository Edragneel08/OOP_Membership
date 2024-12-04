/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

import java.util.*;

/**
 *
 * @author edrag
 */
public class University {

    private String UniName;
      private List<Student> listStudent;

    public University(String name) {
        this.UniName = name;
    }

    public String getUniName() {
        return UniName;
    }

    public void setUniName(String UniName) {
        this.UniName = UniName;
    }

    public List<Student> getListStudent() {
        Student s1 = new Student("Irman");
        Student s2 = new Student("Syakir");
        listStudent.add(s1);
        listStudent.add(s2);
        return listStudent;
    }

    public  void setListStudent(List<Student> listStudent) {
        
        this.listStudent = listStudent;
    }
}
