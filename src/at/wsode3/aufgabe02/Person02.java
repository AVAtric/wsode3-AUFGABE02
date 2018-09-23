package at.wsode3.aufgabe02;

import java.util.Date;

/**
 * Klasse mit Informationen einer Person
 */
public class Person02 {
    /**
     * Enum für das Geschlecht
     */
    public enum Gender {
        MALE, FEMALE
    }

    /**
     * Geschlecht
     */
    private Gender gender;

    /**
     * Name
     */
    private String name;

    /**
     * Geburtstag
     */
    private Date birthday;

    /**
     * Einkommen
     */
    private double income;

    /**
     * Erstellt eine Person mit default-Werten.
     */
    Person02() {
        this(Gender.MALE, "John Doe", new Date(), 999.99);
    }

    /**
     * Erstellt eine Person mit übergebenen Werten
     *
     * @param gender Geschlecht
     * @param name Name
     * @param birthday Geburtsdatum
     * @param income Einkommen
     */
    Person02(Gender gender, String name, Date birthday, double income){
        this.gender = gender;
        this.name = name;
        this.birthday = birthday;
        this.income = income;
    }
}
