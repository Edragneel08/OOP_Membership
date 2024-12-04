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
public class Driver {

    public static void main(String[] args) {
        Person p1 = new Person("Muhammad ");
        Person p2 = new Person("Irman ");
        Person p3 = new Person("Syakir");
        Person p4 = new Person("Dragneel");

        List<Person> listperson = new ArrayList<>();
        listperson.add(p1);
        listperson.add(p2);
        listperson.add(p3);

        List<Person> listpersonJapan = new ArrayList<>();
        listpersonJapan.add(p4);

        Country c1 = new Country("Malaysia");
        Country c2 = new Country("Japan");

        c1.setPersons(listperson);
        c2.setPersons(listpersonJapan);

        System.out.println("The citizen of " + c1.getCountryName() + " are : ");
        for (Person p : c1.getPersons()) {
            System.out.println(p.getPersonName());
        }

        System.out.println();
        System.out.println("The citizen of " + c2.getCountryName() + " are : ");
        for (Person p : c2.getPersons()) {
            System.out.println(p.getPersonName());
        }

        University umt = new University("Universiti Malaysia Terengganu");
        Student s1 = new Student("Natsu");
        Student s2 = new Student("Dragneel");

        List<Student> listStudent = new ArrayList<>();
        listStudent.add(s1);
        listStudent.add(s2);

        umt.setListStudent(listStudent);
        System.out.println();
        System.out.println("The student of " + umt.getUniName() + " are :");

        for (Student s : umt.getListStudent()) {
            System.out.println(s.getStudentName());
        }
    }
}
