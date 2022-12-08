package student.interfaces.impl;

import student.classes.Person;
import student.interfaces.PersonInterface;

import java.time.LocalDate;
import java.util.*;

public class PersonInterfaceImpl implements PersonInterface {

    List<Person> creatPerson = new ArrayList<>();
    @Override
    public String createPerson(List<Person> people) {
        creatPerson.addAll(people);
        return "                                     People SAVE successfully!!!";
    }

    @Override
    public List<Person> getAll(List<Person> people1) {
        return this.creatPerson;
    }

    @Override
    public Map<Integer, Person> getAge(List<Person> people) {
        Map<Integer,Person> ageMap = new TreeMap<>();
        for (Person person : people) {
            int age = LocalDate.now().getYear() -person.getDateOfBirth().getYear();
            ageMap.put(age,person);
        }
        return ageMap;
    }


    @Override
    public List<Person> findByName(String name, List<Person> people) {
        List<Person> resulSearch = new ArrayList<>();
        for (Person person : creatPerson) {
            if (person.getName().equals(name)) {
                resulSearch.add(person);
            }
        }
        return resulSearch;
    }

    @Override
    public List<Person> findByID(long id, List<Person> people) {
        List<Person> resulSearch = new ArrayList<>();
        for (Person person : creatPerson) {
            if (id == person.getId()) {
                resulSearch.add(person);
            }
        }
        return resulSearch;
    }
}
