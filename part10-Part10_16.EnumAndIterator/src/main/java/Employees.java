
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author isaac
 */
public class Employees {

    List<Person> employees;

    public Employees() {

        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        //adds the given person to the employees list

        this.employees.add(personToAdd);

    }

    public void add(List<Person> peopleToAdd) {
        //adds the given list of people to the employees list

        this.employees.stream()
                .forEach(employee -> this.employees.add(employee));

//        Iterator<Person> iterator = employees.iterator();
//
//        while (iterator.hasNext()) {
//            this.employees.add(iterator.next());
//        }
    }

    public void print() {
        //prints all employees

        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        this.employees.stream()
//                .forEach(employee -> System.out.println(employee));
    }

    public void print(Education education) {
        //prints the employees whose education matches 
        //the education given as a parameter.

//        this.employees.stream()
//                .filter(employee -> employee.getEducation().equals(education))
//                .forEach(employee -> this.employees.add(employee));
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person employee = iterator.next();
            if (employee.getEducation() == education) {
                System.out.println(employee);
            }
        }

    }

    public void fire(Education education) {

        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person employee = iterator.next();
            if (employee.getEducation() == education) {
                iterator.remove();
            }
        }

    }

}
