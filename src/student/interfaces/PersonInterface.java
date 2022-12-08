package student.interfaces;

import student.classes.Person;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface PersonInterface {
    String createPerson(List<Person> people);
    List<Person> getAll(List<Person> people1);
    Map<Integer,Person> getAge(List<Person> people);
    List<Person> findByName(String name, List<Person> people);
    List<Person> findByID(long id, List<Person> people);
    String getMoney(String name,String name2,int money, List<Person> people,List<Person> people2);

}
