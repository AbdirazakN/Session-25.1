import student.classes.Person;
import student.enums.Gender;
import student.interfaces.impl.PersonInterfaceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person(123, "Alisher", LocalDate.of(2000, 12, 20), Gender.MALE, new BigDecimal(12000));
        Person person2 = new Person(321, "Beka", LocalDate.of(1999, 8, 15), Gender.MALE, new BigDecimal(10000));
        Person person3 = new Person(456, "Bakyt", LocalDate.of(2005, 5, 3), Gender.MALE, new BigDecimal(2000));
        Person person4 = new Person(789, "Bolot", LocalDate.of(2003, 2, 27), Gender.MALE, new BigDecimal(5000));
        Person person5 = new Person(122, "Nurkyz", LocalDate.of(2004, 8, 4), Gender.FEMALE, new BigDecimal(4000));

        ArrayList<Person> personList = new ArrayList<>(List.of(person1, person2, person3, person4, person5));
        PersonInterfaceImpl personInterface = new PersonInterfaceImpl();
        while (true) {
            System.out.println("""
                    1 --- Адамдардын тизмесин тузуу
                    2 --- Аты менен издоо
                    3 --- Адамдардын ID си менен издоо
                    4 --- Адамдардын жашын алуу
                    5 --- Адамдардын тизмесин коруу
                    6 --- Тизмедеги адамдан карызга акча алуу
                    (0) ----- Программаны жыйынтыктоо""");

            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in);
            Scanner scanner4 = new Scanner(System.in);
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println(personInterface.createPerson(personList));
                    break;
                case 2:
                    System.out.println("Адамдын атын жазыныз:  ");
                    System.out.println(personInterface.findByName(scanner1.nextLine(), personList));
                    break;
                case 3:
                    System.out.println("Адамдын ID син жазыныз:  ");
                    System.out.println(personInterface.findByID(scanner2.nextLong(), personList));
                    break;
                case 4:
                    System.out.println(personInterface.getAge(personList));
                    break;
                case 5:
                    System.out.println(personInterface.getAll(personList));
                    break;
                case 6:
                    System.out.println("    Кимге кайсы адамдан карыз алып бергиниз келет жана канча суммада?");
                    System.out.println(personInterface.getMoney(scanner3.nextLine(), scanner3.nextLine(), scanner4.nextInt(), personList, personList));
                    break;
            }
            if (num == 0) {
                System.out.println("                        PROGRAM FINISHED!");
                break;
            }
        }
    }
}