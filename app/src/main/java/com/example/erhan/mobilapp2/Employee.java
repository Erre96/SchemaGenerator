package com.example.erhan.mobilapp2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Erhan on 2018-03-06.
 */

public class Employee {
    public String name;
    public int phoneNumber;
    public int photoId;
    public String email;
    public int hoursWeek;
    public int freeDaysWeek;
    public boolean holliday;

    private List<Employee> persons;

    Employee(String name) {
        this.name = name;
    }

    private void initializeData() {
        persons = new ArrayList<>();
        persons.add(new Employee("Erhan"));
        persons.add(new Employee("Nalan"));
        persons.add(new Employee("Yusuf"));
    }
}
