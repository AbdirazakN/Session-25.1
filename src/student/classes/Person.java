package student.classes;

import student.enums.Gender;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Person {
    private long id;
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
    private BigDecimal money;

    public Person(long id, String name, LocalDate dateOfBirth, Gender gender, BigDecimal money) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.money = money;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "    Person >>>>>>>>" +
                "\nID:  " + id +
                "\nName:  " + name +
                "\nDate Of Birth:  " + dateOfBirth +
                "\nGender:  " + gender +
                "\nMoney:  " + money +
                "\n\n";
    }
}
